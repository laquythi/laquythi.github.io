var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
  $http({
    method: 'GET',
    url: "https://currency-exchange.p.rapidapi.com/listquotes",
    headers: {
      "x-rapidapi-host": "currency-exchange.p.rapidapi.com",
	    "x-rapidapi-key": "79e01d71ecmsh6f08daaff7eb859p1810dajsnc9fc0a98e0ae"
    }
  }).then(function(response) {
    var data = {
      user: 'Quy',
      currencies: response.data
    }

    console.log(data);
  });
});