///* 
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//async function AjaxCall(url, type, data)
//{
//    var rest = await $.ajax({
//        url: url,
//        type: type,
//        data: data,
//        cache: false,
//        async: true
//    });
//    return rest;
//}
//async function GetAllChinhSach()
//{
//    var data = await AjaxCall('getchinhsach', 'POST', {MachinhSach: ''});
//    return data;
//}
//async function UpdateCS()
//{
//    var source_Application_No = $('input[name=source_Application_No]').val();
//    var CSID = $('select[name=machinhsachtd]').val();
//    var contractname = $('select[name=contract_name]').val();
//    var contractnumber = $('select[name=contract_number]').val();
//    var data = await AjaxCall
//            (
//                    'updatechinhsach',
//                    'POST',
//                    {
//                        sourceNo: source_Application_No,
//                        MachinhSach: CSID,
//                        contractNumber: contractnumber,
//                        ContractName: contractname
//                    }
//            );
//    if (data != null)
//    {
//        Swal.fire
//        (
//            'Thành công',
//            '',
//            'Ok'
//        );
//    }
//    else
//    {
//        Swal.fire
//        (
//            {
//                type: 'Lỗi',
//                title: 'Có lỗi xảy ra'
//            }
//        );
//    }
//}
//
//async function SearchCard() {
//    var valueSearch = $('input[name=inputcardnumber]').val();
//    var data = await AjaxCall('searchcardinfo', 'POST', {batch_id: valueSearch});
//    if (data != null && data != undefined && data.length > 0)
//    {
//        var $div = $('#div_table');
//        $div.html('');
//        for (var j = 0; j < data.length; j++)
//        {
//            var objCard = data[j];
//            for (var i = 0; i < Object.keys(objCard).length; i++)
//            {
//                var objName = Object.keys(objCard)[i];
//                var html = '';
//                html += '<div class="row col-md-12 form-group">';
//                html += '<div class="col-md-6 left-label">';
//                html += '<label class="pull-right">' + objName + ': </label>';
//                html += '</div>';
//                html += '<div class="col-md-6">';
//                if (objName.toLowerCase() == 'machinhsachtd')
//                {
//                    var datachinhsach = await GetAllChinhSach();
//                    if (datachinhsach != null && datachinhsach.length > 0)
//                    {
//                        html += '<select class="form-control" name="' + objName + '">';
//                        var chinhsach = [];
//                        for (var t = 0; t < datachinhsach.length; t++)
//                        {
//                            if (chinhsach.length == 0)
//                            {
//                                chinhsach.push({MaChinhSach: datachinhsach[t].machinhsach, TenChinhSach: datachinhsach[t].machinhsach});
//                            } else if (chinhsach.filter(x => x.MaChinhSach == datachinhsach[t].machinhsach).length == 0)
//                            {
//                                chinhsach.push({MaChinhSach: datachinhsach[t].machinhsach, TenChinhSach: datachinhsach[t].machinhsach});
//                            }
//                        }
//                        for (var k = 0; k < chinhsach.length; k++)
//                        {
//                            html += '<option value="' + chinhsach[k].MaChinhSach + '" ' + (objCard[objName] == chinhsach[k].MaChinhSach ? 'selected' : '') + '>' + chinhsach[k].TenChinhSach + '</option>';
//                        }
//                    }
//                } else
//                {
//                    html += '<input class="form-control" name="' + objName + '" type="text" value="' + objCard[objName] + '" />';
//                }
//                html += '</div>';
//                html += '</div>';
//                var $label = $(html);
//                $div.append($label);
//            }
//        }
//    }
//}
