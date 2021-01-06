<?php
include('session.php');
?>
<?php
session_start();
$connection=mysqli_connect("localhost","root","");
$db=mysqli_select_db($connection, "sample_website");
$new_value='0';
$online_put= mysqli_query($connection ,"UPDATE sample_website SET online='$new_value' WHERE email='$user_check'");
$online_check=mysqli_query($connection, "select online from sample_website where email='$user_check'" );
$rows=mysqli_fetch_assoc($online_check);
$online=$rows['online'];




if(session_destroy())
{
  header("location:login.php");
}
 ?>
