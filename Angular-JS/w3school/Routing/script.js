var app = angular.module('myApp',['ngRoute']);

app.config(['$routeProvider',function($routeProvider){
    $routeProvider.when('/first-msg',{
        template : '<span>this is first message</span>'
    })
}])