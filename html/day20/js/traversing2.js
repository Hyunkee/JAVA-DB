$(document).ready(function(){
	$('tr').click(function(){
		var obj = $(this).find('input');
		var isChecked = obj.prop('checked');
		obj.prop('checked',!isChecked);			
	});
	$(document).ready(function(){
		$('tr').find('input').click(function(){
			var isChecked = $(this).prop('checked');
			$(this).prop('checked',!isChecked);
		});	
	});
});