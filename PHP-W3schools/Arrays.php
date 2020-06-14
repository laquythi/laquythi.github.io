<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Arrays -->
    <?php
        // $names = array("anh","trang","thi","phong","nhung");
        // // echo ($names[2]);
        // for($i=0;$i<=count($names);$i++){
        //     echo ($names[$i]);
        //     echo "<br/>";
        // }

        // multimensional arrays
        $names = array(
            array("thi",1991,29),
            array("anh",2007,13),
            array("trang",1996,24),
            array("phong",2012,8)
        );
        
        for ($row = 0; $row < count($names); $row++) {
            echo "<p><b>Row number $row</b></p>";
            echo "<ul>";
            for ($col = 0; $col < 3; $col++) {
              echo "<li>".$names[$row][$col]."</li>";
            }
            echo "</ul>";
          }
    ?>
</body>
</html>