'use strict';


var app = angular.module('app', [
'ngRoute',
'ngResource',
]);

app.config(['$routeProvider',function ($routeProvider) {
	$routeProvider.when('/signin',{
		templateUrl:'commonviews/signin.html',
		controller:'signinCtrl'
	})
	.when('/signup',{
		templateUrl:'commonviews/signup.html',
		controller:'signupCtrl'
	})
	.when('/home',{
		templateUrl:'dashboard/home.html',
		controller:'homeCtrl'
	})

        .when('/traffic',{
            templateUrl:'dashboard/traffic.html',
            controller:'trafficCtrl'
        })

        .when('/blog',{
            templateUrl:'dashboard/blog.html',
            controller:'blogCtrl'
        })
        .when('/technology',{
            templateUrl:'dashboard/technology.html',
            controller:'technologyCtrl'
        })


		.otherwise({redirectTo:'/signin'
	})


}]);

app.run(['$rootScope','$resource',function($rootScope,$resource){
	 $rootScope.user={};
}]);