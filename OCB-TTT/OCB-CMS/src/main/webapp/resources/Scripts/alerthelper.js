/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function BlockUI(msg) {
    $('#maskBoxes').show();
    if (typeof msg !== undefined) {
        $('#sgLoading').text(msg);
    }
}

function unBlockUI() {
    $('#maskBoxes').hide();
}