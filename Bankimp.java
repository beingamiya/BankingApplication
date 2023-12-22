package com.banking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.Banking;
import com.banking.repository.bankingrepo;

@Service
public class Bankimp implements Bank {
	
	@Autowired
	private bankingrepo repo;
//---------------------Account Creation----------------------------------
	@Override
	public Banking saveBanking(Banking banking) {
		return repo.save(banking);
	}

//-----------------------Delete Account----------------------------------------------
	@Override
	public void deleteBanking(long accountno) {
		repo.deleteById(accountno);

	}
//------------------------Add Money----------------------------------------------
	@Override
	public void addMoney(long accountno, double amount,String password) {
		Banking banking=repo.findById(accountno).orElse(null);
		if (banking != null) {
	        double newBalance = banking.getBalance() + amount;
	        banking.setBalance(newBalance);
	        repo.save(banking);
		}
	        else {
	            // Handle the case where the account is not found
	            System.out.println("Account not found for deposit: " + accountno);
	        }
		
	}

	
//-------------------------Withdraw Money-------------------------------------------
	@Override
	public void withdrawMoney(long accountno, double amount) {
		Banking bank = repo.findById(accountno).orElse(null);
	    if (bank != null) {
	        double currentBalance = bank.getBalance();
	        if (currentBalance >= amount) {
	            double newBalance = currentBalance - amount;
	            bank.setBalance(newBalance);
	            repo.save(bank);
	        } 
	        else {
	            System.out.println("Insufficient balance for withdrawal from account " + accountno);
	        }
	    }	

	}
//-------------------------Transfer Money Important Thing-----------------------------
	@Override
	public void transferMoney(long fromaccountno, long toaccountno, double amount) {
		Banking fromAccount = repo.findById(fromaccountno).orElse(null);
	    Banking toAccount = repo.findById(toaccountno).orElse(null);

	    if (fromAccount != null && toAccount != null) {
	        double fromAccountBalance = fromAccount.getBalance();

	        if (fromAccountBalance >= amount) {
	            
	            double newFromAccountBalance = fromAccountBalance - amount;
	            fromAccount.setBalance(newFromAccountBalance);
	            repo.save(fromAccount);

	            
	            double toAccountBalance = toAccount.getBalance();
	            double newToAccountBalance = toAccountBalance + amount;
	            toAccount.setBalance(newToAccountBalance);
	            repo.save(toAccount);
	        } else
	        {
	          
	            System.out.println("Insufficient balance for transfer from account " + fromaccountno);
	        }
	    }

	}
//----------------------------Check Balance------------------------------------------
	@Override
	public double checkBalance(long accountno, String name, String password) {
		 Optional<Banking> optionalBanking = repo.findById(accountno);

		   
		    if (optionalBanking.isPresent()) {
		        Banking banking = optionalBanking.get();
		        if (name.equals(banking.getName()) && password.equals(banking.getPassword())) {
		          
		            return banking.getAmount();
		        }
		    }
		    return 0;
		}
//-------------------------------Withdraw The Money---------------------------------------
	public Object checkbalance(long accountno) {
		
		 Optional<Banking> optionalBanking = repo.findById(accountno);

		 if (optionalBanking.isPresent()) {
		        // Assuming getAmount() is a method in the Banking class
		        return optionalBanking.get().getAmount();
		    }

		    return 0.0; 
	}
//---------------------For Deposit Money-------------------------------------------

	public Object checkamnt(long accountno) {
		
		 Optional<Banking> optionalBanking = repo.findById(accountno);

		 if (optionalBanking.isPresent()) {
		       
		        return optionalBanking.get().getAmount();
		    }

		    return 0.0; 
	}

	public Object checkamount(Long fromaccountno) {
		 Optional<Banking> optionalBanking = repo.findById(fromaccountno);

		 if (optionalBanking.isPresent()) {
		        // Assuming getAmount() is a method in the Banking class
		        return optionalBanking.get().getAmount();
		    }

		    return 0.0; 
	}

	}


