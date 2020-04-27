// var app = angular.module('myApp',[]);

// app.controller("myCtrl",function($scope){
//     $scope.name = 'thi la quy';
//     $scope.changeYourName = function(){
//         $scope.name = 'dong hung thai binh';
//     }
// });

// var app = angular.module('myApp',[]);

// app.controller('myCtrl',function($scope){
//     $scope.arrayName = ['trang','nhung','tra','phong','hong anh'];
// });

var app = angular.module('myApp',[]);

app.run(function($rootScope){
    $rootScope.color = 'green';
})

app.controller('myCtrl',function($scope){
    $scope.color = 'yellow';
})
