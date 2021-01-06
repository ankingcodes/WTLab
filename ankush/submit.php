<?php
$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];
echo $name, $email, $password;
$conn = mysqli_connect('localhost','root','','btech7');
if(!$conn){
  die('could not connect to db');
}
$query = "INSERT INTO btech7 (Name, Email, Password) values ('$name', '$email', '$password')";
if(mysqli_query($conn, $query)){
  echo 'Account created successfully';
}
?>
