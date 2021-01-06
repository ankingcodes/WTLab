<?php
session_start();
$error='';
if (isset($_POST['submit'])){
  if (empty($_POST['email']) || empty($_POST["password"])){
    $error="EMAIL OR PASSWORD IS EMPTY";

  }
  else
 {
    $email=$_POST['email'];
    $password=$_POST['password'];

    $connection=mysqli_connect("localhost","root","");

    $email=stripslashes($email);
    $password=stripslashes($password);
    // $email=mysql_real_escape_string($email);
    // $password=mysql_real_escape_string($password);


    $db=mysqli_select_db($connection, "sample_website");

    $query=mysqli_query($connection, "select * from sample_website where password='$password' AND email='$email'");
    $rows=mysqli_num_rows($query);

    if ($rows == 1){
      $_SESSION['login_user']=$email;
      header("location:profile.php");

    }else{
      $error= " email or password is invalid";

    }
    mysql_close($connection);
  }
}?>
