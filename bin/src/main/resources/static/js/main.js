  $(function() {
			$('.search_div').hide();
            $(".main_search_bar").on("click", function(e) {
               $('.search_div').toggle();

            });
			$(document).click(function(e){
				if((!$(e.target).is('.main_search_bar')) && (!$(e.target).is('.search_div'))  && (!$(e.target).is('.search_div_title'))){
					$('.search_div').hide();
				}
			});
			
        });