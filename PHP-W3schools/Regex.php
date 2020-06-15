<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Regular Expression -->
    <?php
        // $str = "Visit W3Schools";
        // $pattern = "/w3schools/i";
        // echo preg_match($pattern, $str); // Outputs 1

        $str = "The rain in SPAIN falls mainly on the plains.";
        $pattern = "/ain/i";
        echo preg_match_all($pattern, $str); // output 4;
    ?>
</body>
</html>