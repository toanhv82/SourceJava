/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $.ajaxSetup({
        beforeSend: function (xhr) {
            console.log(xhr);
            BlockUI();
        },
        error: function (err) {
            console.log(err);
            unBlockUI();
        },
        complete: function () {
            unBlockUI();
        }
    });
})


