<?php
$connection=mysqli_connect("localhost","root","");
$db=mysqli_select_db($connection, "sample_website");
session_start();
$user_check=$_SESSION['login_user'];
$ses_sql=mysqli_query($connection, "select email from sample_website where email='$user_check'");
$row=mysqli_fetch_assoc($ses_sql);
$login_session=$row['email'];
$new_value='1';
$online_put= mysqli_query($connection, "UPDATE sample_website SET online='$new_value' where email='$user_check' ");

$login_session=$row['email'];
if(!isset($login_session)){
  mysql_close($connection);
  header('location:login.php');

}

 ?>
