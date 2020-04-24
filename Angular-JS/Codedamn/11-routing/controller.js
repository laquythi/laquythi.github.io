var app = angular.module('mainApp',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl: 'index.html',
    }).when('/page',{
        templateUrl: 'page.html',
    }).when('/page2.html',{
        templateUrl:'page2.html',
    })
});