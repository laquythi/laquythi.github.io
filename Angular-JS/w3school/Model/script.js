var myApp = angular.module('myApp',[]);

myApp.controller('myCtrl',function($scope){
    $scope.name = "la quy thi";
    $scope.changeName = function(){
        $scope.name = "thi la quy";
    }
});