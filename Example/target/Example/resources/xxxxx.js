$(document).ready(function() {

	

	$( "#btn" ).click(function() {
		  alert( "Handler for .click() called." );
			var search = {
					"pName" : $('#name').val() ,
					"lName" : $('#lastname').val()
				};
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					dataType : 'json',
					url : "/ajaxCall",
					data : JSON.stringify(search), // Note it is important
					success : function(result) {
						alert( "success." );
						debugger;
					}
				});
		});
	
	function searchText() {
	
	}
});