/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var TIME_OUT = 5000;
function validate(id)
{
    var is = this;
    var formGroup = $(id).find("form");

    var checkRegex = function (type, value)
    {
        switch (type)
        {
            case "TEXT":
                return (value.length > 0);
                break;
            case  "EMAIL":
                return isEmail(value);
                break;
            case  "PASSWORD":
                return isPassword(value);
                break;
            case "FILE":
                return (value.length > 0);
                break;
            default:
                return true;
                break;
        }

    }
    var r = true;
    var form = $(formGroup[0]).find(".form-group")
    for (var i = 0; i < form.length; i++)
    {

        var input = $(form[i]).find("input");
        var attr = input.attr('required');
        var div_val = $(form[i]).find(".invalid-feedback");
        if (typeof attr !== typeof undefined && attr !== false)
        {
            var data_c = input.attr('data-regex');
            var type
            var value = input.val();
            type = input.attr('type');
            if (!checkRegex(type.toUpperCase(), value))
            {
                r = false;
                div_val.css("display", "block");
            } else
            {
                div_val.css("display", "none");
            }



        }


    }
    return r;
}
function isPassword(value)
{
    var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
    var mediumRegex = new RegExp("^(((?=.*[a-z])(?=.*[A-Z]))|((?=.*[a-z])(?=.*[0-9]))|((?=.*[A-Z])(?=.*[0-9])))(?=.{6,})");

    return true;
    //return mediumRegex.test(value);

}
function isEmail(email) {
    var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email);
}
var formRequestParamter = new function ()
{

    var is = this;
    this.getdata = function (id)
    {
        var st = "";
        var form = $(id).find(".form-group");
        for (var i = 0; i < form.length; i++)
        {
            var input = $(form[i]).find("input");
            var name = input.attr('name');
            var value = input.val();
            if (name === undefined)
                continue;
            if (i > 0) {
                st = st + "," + "\"" + name + "\"" + ":" + "\"" + value + "\"";
            }
            else
            {
                st = "\"" + name + "\"" + ":" + "\"" + value + "\"";
            }
        }

        st = "{" + st + "}";
        var obj = Object.freeze(jQuery.parseJSON(st));
        return obj;
    };

    return this;

}
function checkResponseMQ(param)
{
    var cf = {
        url: "/payment-security/mq/repply",
        type: "GET",
        data: {key: param.key}
    };
    var max = 3;
    var count = 0;
    var timeOut = function ()
    {
        if (count > max)
        {
            return;
        }
        $.ajax(cf).done(function (result) {
            if (result.status === "OK")
            {
                count = max;
                 param.success();
            } else if (result.status === "FAILED")
            {
                count = max;
                 param.fail();

            } else if (result.status === "PENDING")
            {
                count++;
                setTimeout(function () {
                    timeOut();
                }, TIME_OUT);
            } else
            {
                count = max;
            }
        });
    };

     setTimeout(function () {
         timeOut();
    }, TIME_OUT);

}
