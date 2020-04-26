var app = angular.module('myApp',[]);

app.directive('w3TestDirective',function(){
    return{
        template : "<h4>I'm creating a first directive</h4>"
    }
});