<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- function  -->
    <?php
        // function myFriend($name){
        //     echo "$name is my friend <br/>";
        // }

        // myFriend("hoach");
        // myFriend("anh");

        // function myFriendYear($name,$year){
        //     echo "$name was born in $year <br/>";
        // }
        // myFriendYear("hoach",1991);
        // myFriendYear("hong anh",2007);
        // myFriendYear("lich",1990);

    //     function tinhTong(int $a,int $b){
    //         // not use strict mode
    //         echo $a + $b;
    //     }
    //    tinhTong(7,"9 days"); // equal 16 but have a notice !!!
        
        // function tinhTong(int $a,int $b){
        //     return $a + $b;
        // }
        // echo tinhTong(7,9);

        function argumentDefault(String $name = "tran thuy"){
            return $name;
        }
        echo argumentDefault();
    ?>
</body>
</html>