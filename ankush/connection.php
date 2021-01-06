<?php
$servername='localhost';
$username='anking';
$password='anking';
$conn = mysqli_connect($servername, $username, $password);
if($conn->connect_error){
  die("Connection failed: ". $conn->connect_error);
}
echo "Connected successfully\n";
$sql = "CREATE DATABASE btech7";
if ($conn->query($sql) == TRUE){
  echo "Database created successfully";
} else {
  echo "Error creating database";
  $sql = "DROP DATABASE btech7";
  $conn->query($sql);
}
mysqli_close($conn);
?>
