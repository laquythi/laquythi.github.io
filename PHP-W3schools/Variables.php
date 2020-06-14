<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    // case 1 : variable x outside function
        // $x = 5;
        // function test(){
        //     // genarate error because x declare outside function,and only use outside function;
        //     echo "<p>variables x inside function is $x </p>";
        // }
        // test();

        // echo "<p>variables x outside function is $x </p>";

        // case 2 : variable x inside function
        // function test(){
        //     $x = 10;
        //     echo "<p>variables x inside function is $x </p>"; //equal 10;
        // }
        // test();
        // echo "<h4>variables x outside function is $x </h4>"; //generate error;

        // case 3: using global variables
        // $x = 7;
        // $y = 9;
        // function test(){
        //     global $x,$y;
        //     $y = $x + $y;
        //      // error because z is global variables;
        //     echo $y;
        // }
        // test(); // equal 16;

        // case 4 : using static keyword;
        // function test(){
        //    static $x = 0;
        //     echo $x;
        //     $x++;
        // }
        // test();
        // test();
        // test();
    ?>
</body>
</html>