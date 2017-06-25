app.controller('trafficCtrl',['$scope','$resource','$location',function($scope,$resource,$location){

    var username = getCookie("username");
    console.log("cookies...",username);
    if(username=='undefined'){
        $location.path("/signin");
    }
    $scope.showTraffics = function() {
        var trafficResource = $resource('traffic/show', {}, {query:{method:'GET',isArray:false}});
        trafficResource.query({},function(res){
            $scope.trafficList = res.data;

        }, function (res) {
            console.log("error");
        });
    };

    $scope.showTraffics();


}]);