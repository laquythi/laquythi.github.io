var app = angular.module('myApp',[]);

// app.controller('myCtrl',function($scope,$location){
//     $scope.myUrl = $location.absUrl();
// });

//get Url your website
// app.controller('myCtrl',function($scope,$location){
//     $scope.myUrl = $location.absUrl();
// });

// set timeout services
// app.controller('myCtrl',function($scope,$timeout){
//     $scope.myHeader = 'first line in set timeout function,plz wait 5s';
//     $timeout(function(){
//         $scope.myHeader = 'SECOND LINE in set timeout function';
//     },5000);
// });

// Interval service
// app.controller('myCtrl',function($scope,$interval){
//     $scope.theTime = new Date().toLocaleTimeString();
//     $interval(function(){
//         $scope.theTime = new Date().toLocaleTimeString();
//     },1000);
// });

//crete your own service;
// app.service('hexafy',function(){
//     this.myFunc = function(x){
//         return x.toString(16);
//     }
// });
// app.controller('myCtrl',function($scope,hexafy){
//     $scope.hex = hexafy.myFunc(255);
// });