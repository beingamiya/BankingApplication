# BankingApplication
 
//Overview:
This is a simple banking application implemented in Java using the Spring Framework. The application provides basic banking functionalities such as creating a new account, checking balance, withdrawing money, depositing money, transferring money between accounts, and closing an account. It utilizes the Model-View-Controller (MVC) architectural pattern.
<!------------------------------------------------------------------------------------------------------------------------------------->
Table of Contents
Prerequisites
Getting Started
Project Structure
Usage
Dashboard
New Account Registration
Checking Balance
Withdraw Money
Deposit Money
Transfer Money
Delete Account
About
<!-------------------------------------------------------------------------------------------------------------------------------------->
#Before running the application, make sure you have the following installed:

Java Development Kit (JDK)
Spring Framework
Integrated Development Environment (IDE) like IntelliJ or Eclipse or sts(spring tool suite)(I used Eclipse For Devlopment )
Getting Started
Clone the repository to your local machine.
Import the project into your preferred IDE.
Run the application.
Project Structure
<!------------------------------------------------------------------------------------------------------------------------------------->
The project follows the standard Maven project structure:
src/main/java: Contains Java source code.
com.banking.controller: Controllers for handling web requests.
com.banking.model: Entity classes representing the data model.
com.banking.service: Service classes containing business logic also contaion service interface.
com.banking.repository:contains the repository interface.
src/main/resources: Contains application configuration files.
src/main/webapp: Contains web resources such as HTML, CSS, and JSP files.
<!------------------------------------------------------------------------------------------------------------------------------------->
Usage
Dashboard
Access the dashboard by navigating to the root URL (/). It serves as the main entry point for the application.

New Account Registration
To create a new account, go to /newaccount and fill out the registration form. After submission, you will be redirected to the success page (/register).

Checking Balance
To check the balance, visit /balance and provide the account number, name, and password. If authentication is successful, you will see the account details and balance on the success page (/success2).

Withdraw Money
Initiate a withdrawal by going to /withdraw and providing the necessary details. Successful withdrawals are displayed on the success page (/Success3).

Deposit Money
Deposit money into an account by visiting /deposit and providing the account number, amount, and password.If authentication is successful.You will see the success page (/Success4) shows the updated balance.

Transfer Money
Transfer money between accounts at /transfer. Specify the source and destination account numbers, along with the amount. The success page (/scs) displays the updated balance after the transfer.

Delete Account
To close an account, access /closeacnt and provide the account number. The success page (/sc) confirms the account deletion.

About
Learn more about the banking application by visiting the /about page.

<!--This Is The End------------------------------------------------------------------------------------------------->


