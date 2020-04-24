var app = angular.module('mainApp',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl: 'index.html',
    }).when('/dashboard',{
        templateUrl: 'dashboard.html',
    }).when('/page2.html',{
        templateUrl:'page2.html',
    }).when('/loggin.html',{
        templateUrl:'loggin.html',
    }).otherwise({
        redirectTo: '/'
    })
});

app.controller('logginCtrl',function($scope,$location){
    $scope.submit = function(){
        var uname = $scope.username;
        var password = $scope.password;
        if($scope.username == 'admin' && $scope.password == 'admin'){
            $location.path('/dashboard');
        }
    }
});