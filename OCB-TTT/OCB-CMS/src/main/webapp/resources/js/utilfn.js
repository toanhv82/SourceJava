/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

jQuery.fn.extend({
  validate: function() {    
    var form=$(this).find("form");
    if(form.length===0) return false;
     form.parsley().validate();
            if (form.parsley().isValid()) {
                console.log('valid');
                return true;
            } else {
                console.log('not valid');
                return false;
            }
    
  },
  render: function() {
    
  }
});
$(document).ready(function(){
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
   
});

$(function(){    
    "use strict";
    var dict={};
   $("script[type='i18n']").each(function(i,element){
       def("i18n/"+element.getAttribute("name")).as(Object.freeze(jQuery.parseJSON(element.text)));          
    });
    
    def('í8n').as(function(){
        
        var ns='default',key;
        if(arguments.length===1)
        {
            key=arguments[0];
        }else if(arguments.length===2)
        {
            ns=arguments[0];key=arguments[1];
        }
        
        if(dict[ns]) return key;
        
        var value=dict[ns][key];
        if(!value) return key;
        return value;
        
    });
})

    
})