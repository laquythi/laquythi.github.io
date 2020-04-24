<#ftl strip_whitespace=true strip_text=true>
<@compress single_line=true>
    <!doctype html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="msapplication-tap-highlight" content="no">
            <title>Login.....</title>
            <script type="text/javascript">
                function redirect() {
                    if(window.opener) {
                        window.close();
                    }else {
                        window.location = window.location.href.replace(window.location.search, '').replace('login', '');
                    }
                    return false;
                }
//                alert(window.location.href);
//                alert('ok')
            </script>
        </head>
        <body onload="redirect()" onunload="">

        </body>
    </html>
</@compress>
