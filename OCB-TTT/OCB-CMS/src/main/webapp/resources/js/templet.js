/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){
    
    "use strict";
    $("script[type='template']").each(function(i,element){
        var templateText=element.text;
        def("template/"+element.getAttribute("name")).as({
            render:function(view){
                return Mustache.render(templateText,view);
            } 
        });
    });
})

