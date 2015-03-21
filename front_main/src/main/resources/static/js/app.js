angular.module('networkMap', [ 'uiGmapgoogle-maps' ]).controller(
		'networkMapCtrl', function($scope) {
			$scope.map = {
				center : {
					latitude : 59.30601,
					longitude : 18.029238
				},
				zoom : 14
			};
			$scope.marker = {
				id : 0,
				coords : {
					latitude : 59.30601,
					longitude : 18.029238
				},
				options: { 
					draggable: true,
					icon : "server11.png"
			    },
			};
			$scope.options = {
				scrollwheel : false
			};
			$scope.polylines = [ {
				id : 1,
				path : [ { 
					latitude : 59.4, longitude : 18.0
				}, {
					latitude : 59.3, longitude : 18.1
				}, {
					latitude : 59.1, longitude : 18.0
				} ],
				stroke : {
					color : '#6060FB',
					weight : 3
				},
				editable : true,
				draggable : true,
				geodesic : true,
				visible : true
			}, {
				id : 2,
				path : [ {
					latitude : 59.4, longitude : 18.1
				}, {
					latitude : 59.3, longitude : 18.2
				}, {
					latitude : 59.3, longitude : 18.1
				}, {
					latitude : 59.2, longitude : 18.2
				} ],
				stroke : {
					color : '#6060FB',
					weight : 3
				},
				editable : true,
				draggable : true,
				geodesic : true,
				visible : true
			} ];
		});
