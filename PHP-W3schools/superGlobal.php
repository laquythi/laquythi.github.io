<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
     <!-- super global variables -->

     <!-- <form method="post" action="<?php echo $_SERVER['PHP_SELF'];?>">
        Name: <input type="text" name="fname">
            <input type="submit">
    </form> -->

     <!-- $_GET -->
     <a href="test_get.php?subject=PHP&web=W3schools.com">Test $GET</a>
     <?php
    //  $GLOBALS
        // $x = 7;
        // $y = 9;
        // function sum(){
        //     $GLOBALS['z'] = $GLOBALS['x'] + $GLOBALS['y'];
        // }
        // sum();
        // echo $z;

        // $_SERVER
        // echo $_SERVER['PHP_SELF']; // equal /PHP-w3schools/superGlobal.php
        // echo "<br>";
        // echo $_SERVER['SERVER_NAME']; // equal localhost
        // echo "<br>";
        // echo $_SERVER['HTTP_HOST']; // equal localhost
        // echo "<br>";
        // echo $_SERVER['HTTP_REFERER']; // equal http://localhost/PHP-w3schools/
        // echo "<br>";
        // echo $_SERVER['HTTP_USER_AGENT']; // equal Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36
        // echo "<br>";
        // echo $_SERVER['SCRIPT_NAME']; // equal /PHP-w3schools/superGlobal.php

        // $_REQUEST
        // if ($_SERVER["REQUEST_METHOD"] == "POST") {
        //     // collect value of input field
        //     $name = $_REQUEST['fname'];
        //     if (empty($name)) {
        //       echo "Name is empty";
        //     } else {
        //       echo $name;
        //     }
        //   }

        // $_POST
        // if ($_SERVER["REQUEST_METHOD"] == "POST") {
        //     // collect value of input field
        //     $name = $_POST['fname'];
        //     if (empty($name)) {
        //       echo "Name is empty";
        //     } else {
        //       echo $name;
        //     }
        //   }

        // $_GET
        echo "Study " . $_GET['subject'] . " at " . $_GET['web'];
     ?>
</body>
</html>