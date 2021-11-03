$("span").each(function(){ 
    so_classes = $(this).attr("class"); 
    so_value = $(this).html(); 
    so_newLabel = $("<label></label>").html(so_value); 
    if (so_classes.length > 0) { 
        $(so_newLabel).attr("class",so_classes); 
    } 
    $(this).replaceWith(so_newLabel); 
}); 
