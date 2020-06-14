<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <?php
        $x = "7991";
        echo strlen($x); // equal 4;
        echo "<br/>";

        $name = "la quy thi thai binh";
        echo str_word_count($name); //equal 5
        echo "<br/>";

        echo strrev($name); // equal hnib iaht iht yuq al
        echo "<br/>";
        
        echo strpos($name,"thi"); //equal 7;
        echo "<br/>";

        $nameRev = strrev($name);
        echo $nameRev; // equal hnib iaht iht yuq al
        echo "<br/>";

        $nameReplace = str_replace("thai binh","ha noi",$name);
        echo $nameReplace; // equal la quy thi ha noi;
        echo "<br/>";

        $nameReplace2 = str_replace("la quy thi","thi la quy",$name);
        echo $nameReplace2;

    ?>
</body>
</html>