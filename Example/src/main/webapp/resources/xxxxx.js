$(document).ready(function() {

	$("#btn").click(function() {
		alert("Handler for .click() called.");
		var search = {
			"name" : $('#name').val(),
			"lastName" : $('#lastname').val()
		};
		$.ajax({
			type : "POST",
			beforeSend : function(xhr) {
				xhr.setRequestHeader("Accept", "application/json");
				xhr.setRequestHeader("Content-Type", "application/json");
			},
			url : "/ajaxCall",
			data : JSON.stringify(search), // Note it is important
			cache:false,
			success : function(result) {
				alert("sale input1 input2 = " +result.returnData + " ajax staus " + result.status);
				
			}
		});
	});

	function searchText() {

	}
});