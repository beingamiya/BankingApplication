<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Site!</title>
<style>
       *{
    margin: 0;
    padding: 0;
    font-family: cursive;
}
#box{
    background-color:teal;
            padding: 30px;
            width: 240px;
            border-radius: 10px;
            margin: 50px 0px 0px 0px;

}
</style>
<script>
        alert("Please Enter Details transfer The Amount!");
    </script>
</head>
<body style="background-color: darkgrey;">
<center>
<h1 style="background-color: darkslategrey;">Transfer Site!</h1>
    	 	<nav style="cursor: pointer; font-size: 20px;">
            <a href="/" style="margin:0 5px; color:black;text-decoration: none;">Dashboard</a>
            <a href="/newaccount" style="margin: 5px;color:black;text-decoration: none;">NewAccount</a>
            <a href="/balance" style="margin: 5px;color:black;text-decoration: none;">CheckBalance</a>
            <a href="/deposit" style="margin: 5px;color:black;text-decoration: none;">Deposit</a>
            <a href="/withdraw" style="margin: 5px;color:black;text-decoration: none;">Withdraw</a>
            <a href="/transfer" style="margin: 5px;color:black;text-decoration: none;">Transfer</a>
            <a href="/closeacnt" style="margin: 5px;color:black;text-decoration: none;">CloseAccount</a>
            <a href="/about" style="margin: 5px;color:black;text-decoration: none;">About</a>
        </nav>
<div id="box">
<h2>Transfer Money</h2>
    <form action="/checked" method="post">
        From Account No: <input type="number" name="fromaccountno"><br>
        To Account No: <input type="number" name="toaccountno"><br>
        Amount: <input type="number" name="amount"><br>
        <input type="submit" value="Transfer Money">
    </form>
    </div>
    </center>
</body>
</html>