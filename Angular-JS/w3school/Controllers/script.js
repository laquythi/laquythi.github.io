 var app = angular.module("myApp",[]);

 app.controller("myCtrl",function($scope){
     $scope.firstname = "thi";
     $scope.lastname = " la quy";
     $scope.fullname = $scope.firstname + $scope.lastname;

     $scope.changeFullName = function(){
         $scope.fullname = "MicroTec Software Center";
     }
 });