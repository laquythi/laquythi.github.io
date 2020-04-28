var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    $http.get("customers.php")
    .then(function (response) {$scope.names = response.data.records;});
});