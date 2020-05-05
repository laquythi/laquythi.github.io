var app = angular.module('myApp',[]);
app.controller('languages',function($scope){
    $scope.java = function(){
        $scope.myFavLanguage = 'java';
    }
    $scope.c = function(){
        $scope.myFavLanguage = 'C++';
    }
    $scope.scala = function(){
        $scope.myFavLanguage = 'Scala';
    }
});