$(function() {
	//Solving the active Menu Problem
	switch(menu)
	{
	case 'About Us':
		  $('#about').addclass('active');
		  break; 
	case 'contact Us':
		  $('#contact').addclass('active');
		  break;
		  
	default:
		$('#home').addClass('active');
	   break;
	}
		
});