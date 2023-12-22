package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.banking.model.Banking;
import com.banking.service.Bankimp;

@Controller
public class bankingcontroller {
//-------------------------------------------------------------------------------------//
	@Autowired
	private Bankimp service;
//----------------------------------------------------------------------------------------
	@RequestMapping("/")
	public String dashpage() {
		return "dashboard";
	}
//----------------------------------------------------------------------------------
	@RequestMapping("/newaccount")
	public String bankreg() {
		return "reg";
	}
	@RequestMapping("/register")
	public String save(Banking banking,ModelMap model) {
		Banking s1= service.saveBanking(banking);
		return "success";
	}
//--------------------------Checking The Balance------------------------------------------------------
	@RequestMapping("/balance")
	public String showBalanceForm() {
	    return "viewbalance";
	}

	@RequestMapping("/check")
	public String showBalance(@RequestParam long accountno, @RequestParam String name, @RequestParam String password, ModelMap model) {
	    double balance = service.checkBalance(accountno, name, password);

	    if (balance > 0) {
	        model.addAttribute("AccountNo", accountno);
	        model.addAttribute("Balance", balance);
	        return "success2";
	    }
	    else {
	      
	        return "authentication-failed";
	    }
	}
//-----------------------------Withdraw the balance-----------------------------------------
	@RequestMapping("/withdraw")
    public String withdrawMoneyFrom(){
        return "withdraw";
    }
	
	@RequestMapping("/with")
	public String showWithdrawSuccessPage(Banking banking, ModelMap model) {
        // Assuming you pass account number and amount as parameters in the form
        long accountno = banking.getAccountno();
        double amount = banking.getBalance();
        service.withdrawMoney(accountno, amount);
        model.addAttribute("balance", service.checkbalance(accountno));
	    return "Success3";
	}
//------------------------------Adding The Money-----------------------------------
	@RequestMapping("/deposit")
	public String addMoneyToAccountPage() {
	    return "deposit";
	}
	
	@RequestMapping("/checking")
	public String addMoney(@RequestParam long accountno, double amount,String password, ModelMap model) {
		 	service.addMoney(accountno, amount,password);
		    model.addAttribute("accountno", accountno);
		    model.addAttribute("password",password);
		    model.addAttribute("balance", service.checkamnt(accountno));
		    return "Success4";
		
	}
//------------------------------Transfer Money--------------------------------------
	 @RequestMapping("/transfer")
	    public String transferMoney() {
	       
	        return "transfer";
	    }
	 @RequestMapping("/checked")
	 public String transferMoneyBetweenAccounts(Long fromaccountno,Long toaccountno, double amount, ModelMap model) {
		 service.transferMoney(fromaccountno, toaccountno, amount);
	        model.addAttribute("balance", service.checkamount(fromaccountno));
	        return "scs";
	 }
//----------------------------------Delete Account----------------------------------
	 @RequestMapping("/closeacnt")
	    public String delete() {   
	        return "delete";
	    }
	 
	 @RequestMapping("/click")
	 public String deleteBanking(@RequestParam("accountno")long accountno) {
	     service.deleteBanking(accountno);
	     return "sc";
	 }

//-----------------------------------About The Banking Application--------------------
	 @RequestMapping("/about")
		public String aboutpage() {
		    return "about";
	 }
}
