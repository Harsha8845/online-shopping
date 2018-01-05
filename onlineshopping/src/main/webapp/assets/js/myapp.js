$(function() {
	// solving the active menu problem
	switch(menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'contact Us':
		$('#contact').addClass('active');
		break;
		  
	default:
		$('#home').addClass('active');
		break;	

		  
		}
		
});
/*
$(function() {
	// solving the active menu problem
	switch(menu) {
	
	
	 {
	//Solving the active Menu Problem
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'contact Us':
			$('#contact').addClass('active');
			break;
	
	default:
		$('#home').addClass('active');
	   break;

	case 'contact Us':
		  $('#contact').addclass('active');
		  break;
	case 'About Us':
		  $('#about').addClass('active');
		  break; 
	
	
	
	}
		*/
	
