var app = angular.module('myApp',[]);

// Toggle
// app.controller('myCtrl',function($scope){
//     $scope.showMe = false;
//     $scope.myFunc = function(){
//         $scope.showMe = !$scope.showMe;
//     }
// });

// $event object
app.controller('myCtrl',function($scope){
    $scope.myFunc = function(myE){
        $scope.x = myE.clientX;
        $scope.y = myE.clientY;
    }
})
