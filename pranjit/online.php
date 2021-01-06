<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <link type ="text/css" rel ="stylesheet" href="style.css"/>
  </head>
  <body>


<div >


    <?php

    echo '<center>'.'<h1>'."online users".'<h1>'.'<center/>';
    $connection=mysqli_connect("localhost","root","");
    $db=mysqli_select_db($connection, "sample_website");
    $online="SELECT firstname FROM sample_website where online='1'";
    $record=mysqli_query($connection, $online);

    while ($anyway=mysqli_fetch_assoc($record)){
    echo '<center>'.'<p>'. '<a href="">'.$anyway['firstname'].'<a/>'.'<br >'.'<p>'.'<center/>';

    }
     ?>
</div>
</body>
</html>
