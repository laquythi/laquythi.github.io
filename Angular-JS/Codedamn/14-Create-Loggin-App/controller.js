var app = angular.module('mainApp',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl: 'loggin.html'
    })
    .when('/dashboard',{
        templateUrl:'dashboard.html'
    }).otherwise({
        redirectTo:'/'
    });
});

app.controller('logginCtrl',function($scope,$location){
    $scope.submit = function(){
        var username = $scope.username;
        var password = $scope.password;
        if($scope.username == 'admin' && $scope.password == 'admin'){
            $location.path('/dashboard');
        }else{
            alert('wrong username or password');
        }
    }
});