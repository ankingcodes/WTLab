<?php
// error_reporting(0);

$fname=$_POST['fname'];
$lname=$_POST['lname'];
$email=$_POST['email'];
$password=$_POST['password'];
$gender=$_POST['gender'];
$country=$_POST['country'];
$phone_number=$_POST['phone_number'];
$con = mysqli_connect("localhost","root","","sample_website");

if(!$con)
{
die('Could not connect:'.mysql_error());
}

$query="INSERT INTO sample_website(firstname,lastname,email,password,country,gender,phonenumber)VALUES('$fname','$lname','$email','$password','$country','$gender','$phone_number')";

if(mysqli_query($con, $query))
{
  echo "Account created." . " Click " . "<a href=\"login.php\">here</a> to log in." ;
}
?>
