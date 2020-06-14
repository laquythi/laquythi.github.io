<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <?php
        // $x = 7991;
        // var_dump(is_int($x));
        // echo "<br/>";
        // $x = "thi la quy";
        // var_dump(is_int($x));

        // infinity
        // $x = 2.6e492;
        // var_dump($x);

        // $x = "7991";
        // var_dump(is_numeric($x)); // true
        // echo "<br/>";

        // $y = "7991" + 48;
        // var_dump(is_numeric($y)); // true
        // echo "<br/>";

        // chuyen kieu du lieu
        $x = 349.934;
        $convert = (int)$x;
        echo $convert; // equal 349
        echo "<br/>";

        $y = "7991.17";
        var_dump($y);
        echo "<br/>";
        $convert2 = (int)$y;
        echo $convert2;


    ?>
</body>
</html>