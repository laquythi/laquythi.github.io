var app = angular.module('myApp',[]);

app.controller('myCtrl',function($scope){
    $scope.name = 'LA QUY THI';
    $scope.name2 = angular.isString($scope.name);
});