var app = angular.module('myApp',[]);

// app.controller('myCtrl',function($scope){
//     $scope.listName = [
//         {name : 'quy khiem',age : 46},
//         {name : 'hong anh', age : 13},
//         {name : 'quoc oai', age : 48},
//         {name : 'phong', age : 8},
//         {name : 'trang lax', age : 24},
//         {name : 'nhung lax', age : 20},
//         {name : 'quy thu', age : 58}
//     ];
// });


// app.controller('myCtrl',function($scope){
//     $scope.cost = 1991;
// });


// app.controller('myCtrl',function($scope){
//     $scope.listName = ['thi','thu','oai','khiem','phong','nhung','trang','tra'];
// });

app.controller('myCtrl',function($scope){
    $scope.objectName = [
        {name : 'thi',age : 29},
        {name : 'phonglq',age : 8},
        {name : 'thulq',age : 58},
        {name : 'mr-oai',age : 48},
        {name : 'nhung lx',age : 20},
        {name : 'hong anh',age : 13}
    ];

    $scope.orderByMe = function(name){
        $scope.orderByMe = name;
    }

});