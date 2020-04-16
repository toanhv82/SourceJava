<%-- 
    Document   : cus_register
    Created on : Sep 23, 2019, 6:05:08 PM
    Author     : hiepnp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <script language="javascript" type="text/javascript">
            function heartBeat() {
                $.get("KeepAlive.ashx?", function (data) { });
            }

            (function () {
                setInterval("heartBeat()", 1000 * 30); // 30s gửi request một lần
            });
        </script>
        <title>
            Home Page
        </title>

        <!--<link href="Styles/Site.css" rel="stylesheet" type="text/css" />-->
        <link href="resources/Styles/styles.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="resources/images/ajax_tab_theme.css" type="text/css">
        <link rel="stylesheet" href="resources/App_Themes/Default/Calendar.css" type="text/css">
        <link rel="stylesheet" href="resources/App_Themes/Default/ctr_OKMessageBox.css" type="text/css">
        <link href="resources/images/ModalPopupExtender/ModalPopupExtender.css" rel="stylesheet" type="text/css">
        <link href="resources/images/loadingbox/cssUpdateProgress.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="resources/images/favicon.ico">
        <style>
            .color-text {
                color: blue;
                padding-left: 10px;
            }
            .padding-header{
                padding-left: 10px;
            }
        </style>

        <style type="text/css">
            .header-margin-right {
                margin-right: 25px;
            }
        </style>
    </head>

    <body>
        <form method="post" action="./Default.aspx" id="ctl01" style="text-align: center; vertical-align: top; background-image: none;">
            <div class="aspNetHidden">
                <input name="__EVENTTARGET" id="__EVENTTARGET" value="" type="hidden">
                <input name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="" type="hidden">
                <input name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUKMjEwNzA4NTUxMg8WDB4DUEhUMto5AAEAAAD/////AQAAAAAAAAAMAgAAAE5TeXN0ZW0uRGF0YSwgVmVyc2lvbj00LjAuMC4wLCBDdWx0dXJlPW5ldXRyYWwsIFB1YmxpY0tleVRva2VuPWI3N2E1YzU2MTkzNGUwODkFAQAAABVTeXN0ZW0uRGF0YS5EYXRhVGFibGUDAAAAGURhdGFUYWJsZS5SZW1vdGluZ1ZlcnNpb24JWG1sU2NoZW1hC1htbERpZmZHcmFtAwEBDlN5c3RlbS5WZXJzaW9uAgAAAAkDAAAABgQAAACoBzw/eG1sIHZlcnNpb249IjEuMCIgZW5jb2Rpbmc9InV0Zi0xNiI/Pg0KPHhzOnNjaGVtYSB4bWxucz0iIiB4bWxuczp4cz0iaHR0cDovL3d3dy53My5vcmcvMjAwMS9YTUxTY2hlbWEiIHhtbG5zOm1zZGF0YT0idXJuOnNjaGVtYXMtbWljcm9zb2Z0LWNvbTp4bWwtbXNkYXRhIj4NCiAgPHhzOmVsZW1lbnQgbmFtZT0iVGFibGUxIj4NCiAgICA8eHM6Y29tcGxleFR5cGU+DQogICAgICA8eHM6c2VxdWVuY2U+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9ImJpZXVtYXVfY2F0YWxvZyIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0iYmlldW1hdV9pZCIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0iTWF1QmlldSIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0ibGluayIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgIDwveHM6c2VxdWVuY2U+DQogICAgPC94czpjb21wbGV4VHlwZT4NCiAgPC94czplbGVtZW50Pg0KICA8eHM6ZWxlbWVudCBuYW1lPSJ0bXBEYXRhU2V0IiBtc2RhdGE6SXNEYXRhU2V0PSJ0cnVlIiBtc2RhdGE6TWFpbkRhdGFUYWJsZT0iVGFibGUxIiBtc2RhdGE6VXNlQ3VycmVudExvY2FsZT0idHJ1ZSI+DQogICAgPHhzOmNvbXBsZXhUeXBlPg0KICAgICAgPHhzOmNob2ljZSBtaW5PY2N1cnM9IjAiIG1heE9jY3Vycz0idW5ib3VuZGVkIiAvPg0KICAgIDwveHM6Y29tcGxleFR5cGU+DQogIDwveHM6ZWxlbWVudD4NCjwveHM6c2NoZW1hPgYFAAAAhTA8ZGlmZmdyOmRpZmZncmFtIHhtbG5zOm1zZGF0YT0idXJuOnNjaGVtYXMtbWljcm9zb2Z0LWNvbTp4bWwtbXNkYXRhIiB4bWxuczpkaWZmZ3I9InVybjpzY2hlbWFzLW1pY3Jvc29mdC1jb206eG1sLWRpZmZncmFtLXYxIj4NCiAgPHRtcERhdGFTZXQ+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTEiIG1zZGF0YTpyb3dPcmRlcj0iMCIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+MTwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+TTAxPC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TTAxLUdJQVktREFORy1LWTwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTAxLnBkZjwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxMiIgbXNkYXRhOnJvd09yZGVyPSIxIiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMDI8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMDItR0lBWS1IRU48L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XFBIQVRIQU5IVEhFXE0wMi5kb2N4PC9saW5rPg0KICAgIDwvVGFibGUxPg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTEzIiBtc2RhdGE6cm93T3JkZXI9IjIiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjE8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPk0wMzwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1Pk0wMy1ERS1OR0hJLVBIVDwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTAzLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTQiIG1zZGF0YTpyb3dPcmRlcj0iMyIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+MTwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+TTA0PC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TTA0LVRPTkctSE9QLURTLURFLU5HSEktUEhUPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMDQuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxNSIgbXNkYXRhOnJvd09yZGVyPSI0IiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMDU8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMDUtVEhFLUtITzwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTA1LmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTYiIG1zZGF0YTpyb3dPcmRlcj0iNSIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+MTwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+TTA2PC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TTA2LUJJRU4tQkFOLVhBQy1OSEFOLVRIRS1QSU4tQ0hVQS1EQVAtVFJPTkctTkdBWTwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTA2LmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTciIG1zZGF0YTpyb3dPcmRlcj0iNiIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+MTwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+TTA3PC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TTA3LUJJRU4tQkFOLUdJQU8tTkhBTi1USEUtUElOPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMDcuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxOCIgbXNkYXRhOnJvd09yZGVyPSI3IiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMDg8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMDgtREFOSC1TQUNILUtILUtIT05HLU5IQU4tVEhFPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMDguZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxOSIgbXNkYXRhOnJvd09yZGVyPSI4IiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMDk8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMDktR0lBWS1YQUMtTkhBTi1USEUtSE9BQy1QSU48L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XFBIQVRIQU5IVEhFXE0wOS5kb2N4PC9saW5rPg0KICAgIDwvVGFibGUxPg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTExMCIgbXNkYXRhOnJvd09yZGVyPSI5IiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMTA8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMTAtRFMtS0gtREEtTkhBTi1USEUtSE9BQy1QSU48L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XFBIQVRIQU5IVEhFXE0xMC5kb2N4PC9saW5rPg0KICAgIDwvVGFibGUxPg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTExMSIgbXNkYXRhOnJvd09yZGVyPSIxMCIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+MTwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+TTEyPC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TTEyLUdJQVktWUVVLUNBVS1EQU5ILUNITy1LSDwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTEyLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTEyIiBtc2RhdGE6cm93T3JkZXI9IjExIiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMTM8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMTMtRFMtVEhFLVBIQVQtSEFOSC1IRVQtSEFOLVRIRU8tUVVZPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMTMuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxMTMiIG1zZGF0YTpyb3dPcmRlcj0iMTIiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjE8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPk0xNDwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1Pk0xNC1ERS1OR0hJLUdJQS1IQU4tVEhFPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMTQuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxMTQiIG1zZGF0YTpyb3dPcmRlcj0iMTMiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjE8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPk0xNUE8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMTVBLUdJQVktREUtTkdISS1USEFOSC1MWS1USEU8L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XFBIQVRIQU5IVEhFXE0xNUEuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxMTUiIG1zZGF0YTpyb3dPcmRlcj0iMTQiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjE8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPk0xNUI8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMTVCLVhBQy1OSEFOLVRIQU5ILUxZLVRIRTwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTE1Qi5kb2N4PC9saW5rPg0KICAgIDwvVGFibGUxPg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTExNiIgbXNkYXRhOnJvd09yZGVyPSIxNSIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+MTwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+TTE2PC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TTE2LUdJQVkgSEVOIE5IQU4gTEFJIFRIRSBUVSBNQVkgQVRNPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMTYuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxMTciIG1zZGF0YTpyb3dPcmRlcj0iMTYiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjE8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPk0xNzwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1Pk0xNy1HSUFZIFlFVSBDQVUgTkhBTiBMQUkgVEhFIELhu4ogR0lVIFRBSSBNQVkgQVRNPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxQSEFUSEFOSFRIRVxNMTcuZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxMTgiIG1zZGF0YTpyb3dPcmRlcj0iMTciIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjE8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPk0xODwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1Pk0xOC1CSUVOIEJBTiBHSUFPIE5IQU4gTEFJIFRIRSBC4buKIEdJVSBUQUkgTUFZIEFUTTwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTE4LmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTE5IiBtc2RhdGE6cm93T3JkZXI9IjE4IiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMTk8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMTktREUgTkdISSBHSUEgSEFOIFRIRTwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTE5X2RpZXUgY2hpbmggcXV5IHRyaW5oLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTIwIiBtc2RhdGE6cm93T3JkZXI9IjE5IiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMjA8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMjAtUEhJRVUgWUVVIENBVTwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTIwLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTIxIiBtc2RhdGE6cm93T3JkZXI9IjIwIiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz4xPC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5NMjE8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMjEtR0lBWSBVWSBRVVlFTjwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcUEhBVEhBTkhUSEVcTTIxLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogIDwvdG1wRGF0YVNldD4NCjwvZGlmZmdyOmRpZmZncmFtPgQDAAAADlN5c3RlbS5WZXJzaW9uBAAAAAZfTWFqb3IGX01pbm9yBl9CdWlsZAlfUmV2aXNpb24AAAAACAgICAIAAAAAAAAA//////////8LHgNRTE4y1QoAAQAAAP////8BAAAAAAAAAAwCAAAATlN5c3RlbS5EYXRhLCBWZXJzaW9uPTQuMC4wLjAsIEN1bHR1cmU9bmV1dHJhbCwgUHVibGljS2V5VG9rZW49Yjc3YTVjNTYxOTM0ZTA4OQUBAAAAFVN5c3RlbS5EYXRhLkRhdGFUYWJsZQMAAAAZRGF0YVRhYmxlLlJlbW90aW5nVmVyc2lvbglYbWxTY2hlbWELWG1sRGlmZkdyYW0DAQEOU3lzdGVtLlZlcnNpb24CAAAACQMAAAAGBAAAAKgHPD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTE2Ij8+DQo8eHM6c2NoZW1hIHhtbG5zPSIiIHhtbG5zOnhzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYSIgeG1sbnM6bXNkYXRhPSJ1cm46c2NoZW1hcy1taWNyb3NvZnQtY29tOnhtbC1tc2RhdGEiPg0KICA8eHM6ZWxlbWVudCBuYW1lPSJUYWJsZTEiPg0KICAgIDx4czpjb21wbGV4VHlwZT4NCiAgICAgIDx4czpzZXF1ZW5jZT4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0iYmlldW1hdV9jYXRhbG9nIiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJiaWV1bWF1X2lkIiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJNYXVCaWV1IiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJsaW5rIiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgPC94czpzZXF1ZW5jZT4NCiAgICA8L3hzOmNvbXBsZXhUeXBlPg0KICA8L3hzOmVsZW1lbnQ+DQogIDx4czplbGVtZW50IG5hbWU9InRtcERhdGFTZXQiIG1zZGF0YTpJc0RhdGFTZXQ9InRydWUiIG1zZGF0YTpNYWluRGF0YVRhYmxlPSJUYWJsZTEiIG1zZGF0YTpVc2VDdXJyZW50TG9jYWxlPSJ0cnVlIj4NCiAgICA8eHM6Y29tcGxleFR5cGU+DQogICAgICA8eHM6Y2hvaWNlIG1pbk9jY3Vycz0iMCIgbWF4T2NjdXJzPSJ1bmJvdW5kZWQiIC8+DQogICAgPC94czpjb21wbGV4VHlwZT4NCiAgPC94czplbGVtZW50Pg0KPC94czpzY2hlbWE+BgUAAACAATxkaWZmZ3I6ZGlmZmdyYW0geG1sbnM6bXNkYXRhPSJ1cm46c2NoZW1hcy1taWNyb3NvZnQtY29tOnhtbC1tc2RhdGEiIHhtbG5zOmRpZmZncj0idXJuOnNjaGVtYXMtbWljcm9zb2Z0LWNvbTp4bWwtZGlmZmdyYW0tdjEiIC8+BAMAAAAOU3lzdGVtLlZlcnNpb24EAAAABl9NYWpvcgZfTWlub3IGX0J1aWxkCV9SZXZpc2lvbgAAAAAICAgIAgAAAAAAAAD//////////wseAlREMtUKAAEAAAD/////AQAAAAAAAAAMAgAAAE5TeXN0ZW0uRGF0YSwgVmVyc2lvbj00LjAuMC4wLCBDdWx0dXJlPW5ldXRyYWwsIFB1YmxpY0tleVRva2VuPWI3N2E1YzU2MTkzNGUwODkFAQAAABVTeXN0ZW0uRGF0YS5EYXRhVGFibGUDAAAAGURhdGFUYWJsZS5SZW1vdGluZ1ZlcnNpb24JWG1sU2NoZW1hC1htbERpZmZHcmFtAwEBDlN5c3RlbS5WZXJzaW9uAgAAAAkDAAAABgQAAACoBzw/eG1sIHZlcnNpb249IjEuMCIgZW5jb2Rpbmc9InV0Zi0xNiI/Pg0KPHhzOnNjaGVtYSB4bWxucz0iIiB4bWxuczp4cz0iaHR0cDovL3d3dy53My5vcmcvMjAwMS9YTUxTY2hlbWEiIHhtbG5zOm1zZGF0YT0idXJuOnNjaGVtYXMtbWljcm9zb2Z0LWNvbTp4bWwtbXNkYXRhIj4NCiAgPHhzOmVsZW1lbnQgbmFtZT0iVGFibGUxIj4NCiAgICA8eHM6Y29tcGxleFR5cGU+DQogICAgICA8eHM6c2VxdWVuY2U+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9ImJpZXVtYXVfY2F0YWxvZyIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0iYmlldW1hdV9pZCIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0iTWF1QmlldSIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0ibGluayIgdHlwZT0ieHM6c3RyaW5nIiBtc2RhdGE6dGFyZ2V0TmFtZXNwYWNlPSIiIG1pbk9jY3Vycz0iMCIgLz4NCiAgICAgIDwveHM6c2VxdWVuY2U+DQogICAgPC94czpjb21wbGV4VHlwZT4NCiAgPC94czplbGVtZW50Pg0KICA8eHM6ZWxlbWVudCBuYW1lPSJ0bXBEYXRhU2V0IiBtc2RhdGE6SXNEYXRhU2V0PSJ0cnVlIiBtc2RhdGE6TWFpbkRhdGFUYWJsZT0iVGFibGUxIiBtc2RhdGE6VXNlQ3VycmVudExvY2FsZT0idHJ1ZSI+DQogICAgPHhzOmNvbXBsZXhUeXBlPg0KICAgICAgPHhzOmNob2ljZSBtaW5PY2N1cnM9IjAiIG1heE9jY3Vycz0idW5ib3VuZGVkIiAvPg0KICAgIDwveHM6Y29tcGxleFR5cGU+DQogIDwveHM6ZWxlbWVudD4NCjwveHM6c2NoZW1hPgYFAAAAgAE8ZGlmZmdyOmRpZmZncmFtIHhtbG5zOm1zZGF0YT0idXJuOnNjaGVtYXMtbWljcm9zb2Z0LWNvbTp4bWwtbXNkYXRhIiB4bWxuczpkaWZmZ3I9InVybjpzY2hlbWFzLW1pY3Jvc29mdC1jb206eG1sLWRpZmZncmFtLXYxIiAvPgQDAAAADlN5c3RlbS5WZXJzaW9uBAAAAAZfTWFqb3IGX01pbm9yBl9CdWlsZAlfUmV2aXNpb24AAAAACAgICAIAAAAAAAAA//////////8LHgJLTjKSFgABAAAA/////wEAAAAAAAAADAIAAABOU3lzdGVtLkRhdGEsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5BQEAAAAVU3lzdGVtLkRhdGEuRGF0YVRhYmxlAwAAABlEYXRhVGFibGUuUmVtb3RpbmdWZXJzaW9uCVhtbFNjaGVtYQtYbWxEaWZmR3JhbQMBAQ5TeXN0ZW0uVmVyc2lvbgIAAAAJAwAAAAYEAAAAqAc8P3htbCB2ZXJzaW9uPSIxLjAiIGVuY29kaW5nPSJ1dGYtMTYiPz4NCjx4czpzY2hlbWEgeG1sbnM9IiIgeG1sbnM6eHM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIiB4bWxuczptc2RhdGE9InVybjpzY2hlbWFzLW1pY3Jvc29mdC1jb206eG1sLW1zZGF0YSI+DQogIDx4czplbGVtZW50IG5hbWU9IlRhYmxlMSI+DQogICAgPHhzOmNvbXBsZXhUeXBlPg0KICAgICAgPHhzOnNlcXVlbmNlPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJiaWV1bWF1X2NhdGFsb2ciIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9ImJpZXVtYXVfaWQiIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9Ik1hdUJpZXUiIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9ImxpbmsiIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICA8L3hzOnNlcXVlbmNlPg0KICAgIDwveHM6Y29tcGxleFR5cGU+DQogIDwveHM6ZWxlbWVudD4NCiAgPHhzOmVsZW1lbnQgbmFtZT0idG1wRGF0YVNldCIgbXNkYXRhOklzRGF0YVNldD0idHJ1ZSIgbXNkYXRhOk1haW5EYXRhVGFibGU9IlRhYmxlMSIgbXNkYXRhOlVzZUN1cnJlbnRMb2NhbGU9InRydWUiPg0KICAgIDx4czpjb21wbGV4VHlwZT4NCiAgICAgIDx4czpjaG9pY2UgbWluT2NjdXJzPSIwIiBtYXhPY2N1cnM9InVuYm91bmRlZCIgLz4NCiAgICA8L3hzOmNvbXBsZXhUeXBlPg0KICA8L3hzOmVsZW1lbnQ+DQo8L3hzOnNjaGVtYT4GBQAAAL0MPGRpZmZncjpkaWZmZ3JhbSB4bWxuczptc2RhdGE9InVybjpzY2hlbWFzLW1pY3Jvc29mdC1jb206eG1sLW1zZGF0YSIgeG1sbnM6ZGlmZmdyPSJ1cm46c2NoZW1hcy1taWNyb3NvZnQtY29tOnhtbC1kaWZmZ3JhbS12MSI+DQogIDx0bXBEYXRhU2V0Pg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTExIiBtc2RhdGE6cm93T3JkZXI9IjAiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjQ8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPlRTMDRNMDE8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5USFUgS0hJRVUgTkFJIERBTkggQ0hPIENIVSBUSEUgTk9JIERJQSBOQVBBUzwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcQlAuS1NHRFxUVFQtUVQtMDRNMDEgLSBUSFUgS0hJRVUgTkFJIERBTkggQ0hPIENIVSBUSEUgTk9JIERJQSBOQVBBUy5kb2M8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTIiIG1zZGF0YTpyb3dPcmRlcj0iMSIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+NDwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+VFMwNE0wMjwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1PlRIVSBLSElFVSBOQUkgREFOSCBDSE8gQ0hVIFRIRSBRVU9DIFRFIE1BU1RFUkNBUkQ8L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XEJQLktTR0RcVFRULVFULTA0TTAyIC0gVEhVIEtISUVVIE5BSSBEQU5IIENITyBDSFUgVEhFIFFVT0MgVEUgTUFTVEVSQ0FSRC5kb2M8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTMiIG1zZGF0YTpyb3dPcmRlcj0iMiIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+NDwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+VFMwNE0wMzwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1PlRIVSBZRVUgQ0FVIFRSQSAgU09BVCBWQSBYQUMgTkhBTiBLSElFVSBOQUk8L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XEJQLktTR0RcVFRULVFULTA0TTAzIC0gVEhVIFlFVSBDQVUgVFJBICBTT0FUIFZBIFhBQyBOSEFOIEtISUVVIE5BSS5kb2M8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTQiIG1zZGF0YTpyb3dPcmRlcj0iMyIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+NDwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+VFM0NzA8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5RVVkgVFJJTkggWFUgTFkgVFJBIFNPQVQ8L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XEJQLktTR0RcNDcwIC0gVFQgVGhlIFFEIGJoIGxhaSBRdXkgdHJpbmggeHUgbHkgdHJhIHNvYXQsIHh1IGx5IGtoaWV1IG5haSBob2F0IGRvbmcgdGhlIC5wZGY8L2xpbms+DQogICAgPC9UYWJsZTE+DQogIDwvdG1wRGF0YVNldD4NCjwvZGlmZmdyOmRpZmZncmFtPgQDAAAADlN5c3RlbS5WZXJzaW9uBAAAAAZfTWFqb3IGX01pbm9yBl9CdWlsZAlfUmV2aXNpb24AAAAACAgICAIAAAAAAAAA//////////8LHgNNVEQy1QoAAQAAAP////8BAAAAAAAAAAwCAAAATlN5c3RlbS5EYXRhLCBWZXJzaW9uPTQuMC4wLjAsIEN1bHR1cmU9bmV1dHJhbCwgUHVibGljS2V5VG9rZW49Yjc3YTVjNTYxOTM0ZTA4OQUBAAAAFVN5c3RlbS5EYXRhLkRhdGFUYWJsZQMAAAAZRGF0YVRhYmxlLlJlbW90aW5nVmVyc2lvbglYbWxTY2hlbWELWG1sRGlmZkdyYW0DAQEOU3lzdGVtLlZlcnNpb24CAAAACQMAAAAGBAAAAKgHPD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTE2Ij8+DQo8eHM6c2NoZW1hIHhtbG5zPSIiIHhtbG5zOnhzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYSIgeG1sbnM6bXNkYXRhPSJ1cm46c2NoZW1hcy1taWNyb3NvZnQtY29tOnhtbC1tc2RhdGEiPg0KICA8eHM6ZWxlbWVudCBuYW1lPSJUYWJsZTEiPg0KICAgIDx4czpjb21wbGV4VHlwZT4NCiAgICAgIDx4czpzZXF1ZW5jZT4NCiAgICAgICAgPHhzOmVsZW1lbnQgbmFtZT0iYmlldW1hdV9jYXRhbG9nIiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJiaWV1bWF1X2lkIiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJNYXVCaWV1IiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJsaW5rIiB0eXBlPSJ4czpzdHJpbmciIG1zZGF0YTp0YXJnZXROYW1lc3BhY2U9IiIgbWluT2NjdXJzPSIwIiAvPg0KICAgICAgPC94czpzZXF1ZW5jZT4NCiAgICA8L3hzOmNvbXBsZXhUeXBlPg0KICA8L3hzOmVsZW1lbnQ+DQogIDx4czplbGVtZW50IG5hbWU9InRtcERhdGFTZXQiIG1zZGF0YTpJc0RhdGFTZXQ9InRydWUiIG1zZGF0YTpNYWluRGF0YVRhYmxlPSJUYWJsZTEiIG1zZGF0YTpVc2VDdXJyZW50TG9jYWxlPSJ0cnVlIj4NCiAgICA8eHM6Y29tcGxleFR5cGU+DQogICAgICA8eHM6Y2hvaWNlIG1pbk9jY3Vycz0iMCIgbWF4T2NjdXJzPSJ1bmJvdW5kZWQiIC8+DQogICAgPC94czpjb21wbGV4VHlwZT4NCiAgPC94czplbGVtZW50Pg0KPC94czpzY2hlbWE+BgUAAACAATxkaWZmZ3I6ZGlmZmdyYW0geG1sbnM6bXNkYXRhPSJ1cm46c2NoZW1hcy1taWNyb3NvZnQtY29tOnhtbC1tc2RhdGEiIHhtbG5zOmRpZmZncj0idXJuOnNjaGVtYXMtbWljcm9zb2Z0LWNvbTp4bWwtZGlmZmdyYW0tdjEiIC8+BAMAAAAOU3lzdGVtLlZlcnNpb24EAAAABl9NYWpvcgZfTWlub3IGX0J1aWxkCV9SZXZpc2lvbgAAAAAICAgIAgAAAAAAAAD//////////wseA01ZQzKaGQABAAAA/////wEAAAAAAAAADAIAAABOU3lzdGVtLkRhdGEsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5BQEAAAAVU3lzdGVtLkRhdGEuRGF0YVRhYmxlAwAAABlEYXRhVGFibGUuUmVtb3RpbmdWZXJzaW9uCVhtbFNjaGVtYQtYbWxEaWZmR3JhbQMBAQ5TeXN0ZW0uVmVyc2lvbgIAAAAJAwAAAAYEAAAAqAc8P3htbCB2ZXJzaW9uPSIxLjAiIGVuY29kaW5nPSJ1dGYtMTYiPz4NCjx4czpzY2hlbWEgeG1sbnM9IiIgeG1sbnM6eHM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIiB4bWxuczptc2RhdGE9InVybjpzY2hlbWFzLW1pY3Jvc29mdC1jb206eG1sLW1zZGF0YSI+DQogIDx4czplbGVtZW50IG5hbWU9IlRhYmxlMSI+DQogICAgPHhzOmNvbXBsZXhUeXBlPg0KICAgICAgPHhzOnNlcXVlbmNlPg0KICAgICAgICA8eHM6ZWxlbWVudCBuYW1lPSJiaWV1bWF1X2NhdGFsb2ciIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9ImJpZXVtYXVfaWQiIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9Ik1hdUJpZXUiIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICAgIDx4czplbGVtZW50IG5hbWU9ImxpbmsiIHR5cGU9InhzOnN0cmluZyIgbXNkYXRhOnRhcmdldE5hbWVzcGFjZT0iIiBtaW5PY2N1cnM9IjAiIC8+DQogICAgICA8L3hzOnNlcXVlbmNlPg0KICAgIDwveHM6Y29tcGxleFR5cGU+DQogIDwveHM6ZWxlbWVudD4NCiAgPHhzOmVsZW1lbnQgbmFtZT0idG1wRGF0YVNldCIgbXNkYXRhOklzRGF0YVNldD0idHJ1ZSIgbXNkYXRhOk1haW5EYXRhVGFibGU9IlRhYmxlMSIgbXNkYXRhOlVzZUN1cnJlbnRMb2NhbGU9InRydWUiPg0KICAgIDx4czpjb21wbGV4VHlwZT4NCiAgICAgIDx4czpjaG9pY2UgbWluT2NjdXJzPSIwIiBtYXhPY2N1cnM9InVuYm91bmRlZCIgLz4NCiAgICA8L3hzOmNvbXBsZXhUeXBlPg0KICA8L3hzOmVsZW1lbnQ+DQo8L3hzOnNjaGVtYT4GBQAAAMUPPGRpZmZncjpkaWZmZ3JhbSB4bWxuczptc2RhdGE9InVybjpzY2hlbWFzLW1pY3Jvc29mdC1jb206eG1sLW1zZGF0YSIgeG1sbnM6ZGlmZmdyPSJ1cm46c2NoZW1hcy1taWNyb3NvZnQtY29tOnhtbC1kaWZmZ3JhbS12MSI+DQogIDx0bXBEYXRhU2V0Pg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTExIiBtc2RhdGE6cm93T3JkZXI9IjAiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjY8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPlUxPC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+R0lBWSBYQUMgTkhBTiBVU0VSUzwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcT1RIRVJcR0lBWVhBQ05IQU5VU0VSLUNDVy5kb2N4PC9saW5rPg0KICAgIDwvVGFibGUxPg0KICAgIDxUYWJsZTEgZGlmZmdyOmlkPSJUYWJsZTEyIiBtc2RhdGE6cm93T3JkZXI9IjEiIGRpZmZncjpoYXNDaGFuZ2VzPSJpbnNlcnRlZCI+DQogICAgICA8YmlldW1hdV9jYXRhbG9nPjY8L2JpZXVtYXVfY2F0YWxvZz4NCiAgICAgIDxiaWV1bWF1X2lkPlUyPC9iaWV1bWF1X2lkPg0KICAgICAgPE1hdUJpZXU+TUFVIERLIENBUCBVU0VSIENVU1RPTUVSIENBUkUgV0VCLCBNQSBCQU4gSEFORzwvTWF1QmlldT4NCiAgICAgIDxsaW5rPkJpZXVNYXVcT1RIRVJcTUFVIERBTkcgS1kgQ0FQIFVTRVIsIE1BIEJBTiBIQU5HIFRSRU4gSEUgVEhPTkcgVEhFLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTMiIG1zZGF0YTpyb3dPcmRlcj0iMiIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+NjwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+VTM8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5NMDEtUEhJRVUgWUVVIENBVSBDQVAgTkhBVCwgRElFVSBDSElOSCAoQ0hJIERBTkggQ0hPIFRUVCk8L01hdUJpZXU+DQogICAgICA8bGluaz5CaWV1TWF1XE9USEVSXFBZQyBESUVVIENISU5ILCBDQVAgTkhBVCBUSE9ORyBUSU4uZG9jeDwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgICA8VGFibGUxIGRpZmZncjppZD0iVGFibGUxNCIgbXNkYXRhOnJvd09yZGVyPSIzIiBkaWZmZ3I6aGFzQ2hhbmdlcz0iaW5zZXJ0ZWQiPg0KICAgICAgPGJpZXVtYXVfY2F0YWxvZz42PC9iaWV1bWF1X2NhdGFsb2c+DQogICAgICA8YmlldW1hdV9pZD5VNDwvYmlldW1hdV9pZD4NCiAgICAgIDxNYXVCaWV1PlBZQyBESUVVIENISU5IIERJQ0ggVlUgQ09ORyBOR0hFPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxPVEhFUlxQWUMgRElFVSBDSElOSCBESUNIIFZVIENPTkcgTkdIRS5kb2M8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTUiIG1zZGF0YTpyb3dPcmRlcj0iNCIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+NjwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+VTU8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5CSUVOIEJBTiBOR0hJRU0gVEhVPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxPVEhFUlxCSUVOIEJBTiBOR0hJRU0gVEhVLmRvY3g8L2xpbms+DQogICAgPC9UYWJsZTE+DQogICAgPFRhYmxlMSBkaWZmZ3I6aWQ9IlRhYmxlMTYiIG1zZGF0YTpyb3dPcmRlcj0iNSIgZGlmZmdyOmhhc0NoYW5nZXM9Imluc2VydGVkIj4NCiAgICAgIDxiaWV1bWF1X2NhdGFsb2c+NjwvYmlldW1hdV9jYXRhbG9nPg0KICAgICAgPGJpZXVtYXVfaWQ+VTY8L2JpZXVtYXVfaWQ+DQogICAgICA8TWF1QmlldT5QWUMgR09MSVZFPC9NYXVCaWV1Pg0KICAgICAgPGxpbms+QmlldU1hdVxPVEhFUlxQWUMgR09MSVZFLmRvYzwvbGluaz4NCiAgICA8L1RhYmxlMT4NCiAgPC90bXBEYXRhU2V0Pg0KPC9kaWZmZ3I6ZGlmZmdyYW0+BAMAAAAOU3lzdGVtLlZlcnNpb24EAAAABl9NYWpvcgZfTWlub3IGX0J1aWxkCV9SZXZpc2lvbgAAAAAICAgIAgAAAAAAAAD//////////wsWAmYPZBYCAgUPZBYEAgwPDxYCHgdWaXNpYmxlaGRkAhIPZBYMAgIPPCsACwEADxYIHghEYXRhS2V5cxYAHgtfIUl0ZW1Db3VudAIVHglQYWdlQ291bnQCAR4VXyFEYXRhU291cmNlSXRlbUNvdW50AhVkFgJmD2QWKgIBD2QWBGYPZBYCZg8VAQExZAIBDw8WAh4EVGV4dAUQTTAxLUdJQVktREFORy1LWWRkAgIPZBYEZg9kFgJmDxUBATJkAgEPDxYCHwsFDE0wMi1HSUFZLUhFTmRkAgMPZBYEZg9kFgJmDxUBATNkAgEPDxYCHwsFD00wMy1ERS1OR0hJLVBIVGRkAgQPZBYEZg9kFgJmDxUBATRkAgEPDxYCHwsFG00wNC1UT05HLUhPUC1EUy1ERS1OR0hJLVBIVGRkAgUPZBYEZg9kFgJmDxUBATVkAgEPDxYCHwsFC00wNS1USEUtS0hPZGQCBg9kFgRmD2QWAmYPFQEBNmQCAQ8PFgIfCwUxTTA2LUJJRU4t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" type="hidden">
            </div>

            <script type="text/javascript">
                //<![CDATA[
                var theForm = document.forms['ctl01'];
                if (!theForm) {
                    theForm = document.ctl01;
                }
                function __doPostBack(eventTarget, eventArgument) {
                    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
                        theForm.__EVENTTARGET.value = eventTarget;
                        theForm.__EVENTARGUMENT.value = eventArgument;
                        theForm.submit();
                    }
                }
                //]]>
            </script>


            <script src="/WebResource.axd?d=u056T6VtSPgj53ypM-Y82em7k4CosUKrsSOhD4hIfmVmMMCptPaOtpclYlHtv2fOqzbiwtlFPLooYQROnmVmCHmUXSu0m97cKZ4MVvbiv4o1&amp;t=636686906616834341" type="text/javascript"></script>
            <script src="/ScriptResource.axd?d=d1xvcbZPUd-qyiNVTQM6Jjvsdp0IFziyEiJ0xXYHs4a_86E0MRHLL-b0pUeE1dQIUtE4084ndlqmhAZrQpcTWEAajCHEQ1XU0ZM1CMK4qxTXtaAnX5c-YF6qAqLuKEdio5ioIIPioyRbLCNMevTPuQ2&amp;t=fffffffff7ac47c5" type="text/javascript"></script>
            <script src="/ScriptResource.axd?d=4_HuAT0XMqP_3oJUshqWjBqtIV-xUDHHvoZOJFN9dHCkwb_L9eBmuD63aT87zIjxZV3yQHj6hhSrvyrcfBc2De7yuPVZ9i8aSScq3urmVMEdAFr_8pnpgCUS6hTW0lrxTae8Ng5J6XoR7YQiPz080JfxTd-YeC07vTJ5E8xZfCEM2lzLex4aYFOUb6t2C0y00&amp;t=545ba255" type="text/javascript"></script>
            <script type="text/javascript">
                //<![CDATA[
                if (typeof (Sys) === 'undefined')
                    throw new Error('ASP.NET Ajax client-side framework failed to load.');
                //]]>
            </script>

            <script src="/ScriptResource.axd?d=15CnSiWb5eQ7ogSFXWwfboCq7OmfP582ODkB4qag7QluQ-q9FILSTEEG4t0fYuX4FrdMX5yvyB8voISwdyOiDfVajo2RCftzVIYG81i30AZc7V0XcxqyvlIFNWUVfmOZ7WyJB8DgRAYlMPw_Ddw0JOYehleX_WCWqBASGHpCaeqQixq8yrWwgzI42dv3rDBd0&amp;t=545ba255" type="text/javascript"></script>
            <script src="resources/Scripts/jquery-1.3.2.js" type="text/javascript"></script>
            <script src="resources/Scripts/jquery.blockUI.js" type="text/javascript"></script>
            <script src="resources/Scripts/jquery.searchabledropdown-1.0.8.min.js" type="text/javascript"></script>
            <div class="aspNetHidden">

                <input name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" type="hidden">
                <input name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAEtvPcIi4m39b1E8xtAyO5zLaxPcslMMhAec4qMtVpdv1yBb5dbId/KMXiTbsmEaynQVEt0O0TC2pBIqS1E9lmRsYQGmYky22DbjWsLRAdQVU+PTSSgtnGrvcQJvEqDMeDAVtdmshX7a6sUOLGdTyCCuDWkt6xcp1z5D93kzD6RI3O5kCsXYOqjlO+hHVrEdXY4n7v6WK/6HzmmyNgu48VhtSeDi8poxolMiQgrkTVaS0bBOuAFPxe8wXOGL29zyyH8YjT2Zd9GnQEFZ+/Z6qk7xB4byolWEEXp9i3ZQ+4DQwp9evvmTjvWjtQbWjUQJhmwv6JsEso6ba/IIvKBvkNLTIEd2Hx4RX4eYx5TIRp+cj+LubUNeArLDqdOYx/4kJxfkGz/1yHf8x9QwlcMO+hockZKgW3P2V/2i6TQRP8kdcR/fn9Gm8QmfOW0aD/bd9kKw8Zy+s0mHmxaR46n2fI5dRno0zVe2bPO8yTWmXixQQjz19Wi5FfECBYJ/7if92hXb88HB37Guq+th2UBvJuCAl49PZYs1j6F+1gRJTEvrLjnmScdCkHDq8Icvp3ZkQwUU9+o+mnr68KTj73MeGO6lKvFMyAtthiF7gJpyDm4lnEmdiNEgiDBDQe+xy7K6Q3M9irljoZbBsaD/oQtHbjFueZPKzQJVfTi6Zkx5M8d+rjfHK2EeAnvIQikideqBsAB+Yr1fnCJ1VIg9KMKrLixeLd5ON2sejfF+1JZrm9+tFDaIxfwOV46aIpA5Dp631bMxvYIUqpCrEjjeuW74fi6R/RkCVZLNOMKujw6PnC02GPIsecuoEDWmcNoRx+QqSnI7nTWFM6YD1+/TfWro0moaBm6vqpRweVw1uKLcxLZK7Dv3Eb+nzJOPJisSUBDMya0fTqabnMMqy7YBlwoAmFFuiprxB1TOdwc9S5vhdlhGBzAwuYB5h0t5saGmWl6P3YICMObk+rLvPzi9d1qe8ZzLLq59lWI/hehrA8mY9bZh7jPEdWeRtFBb7y4w2q5UZ6EyMWGjZwiRHwds9XHRVYvYdrwBQsqrNnNFO4tpGtSKYWLDl8IoflBxlXLf4DN7uCxrLCQJoVeGd+//GeHRWLTUdbhl3DH5F4CsCjJTpONFmWQZ8cOJSOcPF4oisKHOZwCiX4WSQ3/9Kam6XdgKOLcay1DS+zb6oTNRlJGlSVqw5IWx4RP+lZB1jBws4gXpwJQb8BnbFGdQy8gCjMpf1Cpn5JwiLkG8M2IByKjocGCTXzjuEI+inpfZ1d49EyUjUN5wmxUU5KF1q3S/vepRM676AT7F9TJbiagpHYQ5LiXDvQPZbqme8SjYBSD07GPsWY9BeOYqS2E4tQAy07Bg4/j/dTJreMBlJY+SP846WRHuIhPNsOuW95X4l71Yyv2++9i79ZCXAxp6do4PpWRH6ZINmNwNQSbZ0rvdHp7slqRRrcCvOijhEPPb3CqjRLYZ0vLs39wBOIZIron8U4aYP01ig7t1KckF9Owam6LcIEmnbjSirK6XZophEE1QId7Gy4Ri6nGSUxg8GkXt+EnY2T4Yw6ZjZBRueLPSJI1c+QIDKK+8xBtICwWSfd0WL7ew/Gdz/7oSK+aEbFJgfv2s0NyRbICmLP1BNZCFmVSC8SoDRQ==" type="hidden">
            </div>
            <script type="text/javascript">
                //<![CDATA[
                Sys.WebForms.PageRequestManager._initialize('ctl00$ScriptManager1', 'ctl01', [], [], [], 90, 'ctl00');
                //]]>
            </script>
            <div id="wrap">
                <div class="page">
                    <div class="header">
                        <div class="title">
                            <table width="100%">
                                <tbody><tr>
                                        <td rowspan="2">
                                            <img alt="logo" class="logo" src="resources/images/logo.png" style="width: 400px;"></td>
                                        <td></td>
                                        <td></td>
                                        <td align="right">

                                        </td>
                                    </tr>
                                    <tr>

                                        <td></td>
                                        <td></td>
                                        <td align="right">
                                            <span id="Label2" class="header-margin-right" style="color:#0071BA;font-size:12pt;font-weight:bold;font-style:italic;">TRUNG TÂM THẺ</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td rowspan="2">
                                            <h1 style="font-family: rockwell; margin-left: 69px; font-size: 35px; font-style: italic; color: darkcyan;">
                                                <b>CUSTOMER CARE </b>
                                            </h1>
                                        </td>
                                        <td></td>
                                        <td></td>
                                        <td align="right">
                                            <span id="Label3" class="header-margin-right" style="color:#044C83;">Hội sở chính: 41 &amp; 45 Lê Duẩn, Q1, Tp.HCM</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td align="right">
                                            <span id="Label4" class="header-margin-right" style="color:#044C83;">Tel: (84-8) 38 220 960 - 38 220 961</span>
                                        </td>
                                        <td align="right"></td>
                                    </tr>
                                    <tr>
                                        <td>


                                        </td>
                                        <td></td>
                                        <td></td>
                                        <td align="right">
                                            <span id="Label5" class="header-margin-right" style="color:#044C83;">Fax: (84-8) 38 220 963</span>
                                        </td>
                                    </tr>
                                </tbody></table>
                        </div>
                        <div class="clear hideSkiplink" style="background-color: #008c44;height: 30px">
                            <a href="#NavigationMenu_SkipLink">
                              
                              
                            </div><div style="clear: left;"></div><a id="NavigationMenu_SkipLink"></a>
                        </div>
                    </div>
                    <div class="main">


                        <div style="margin-left: 50px;">
                           

                            <p>
                            </p>
                            <table style="width: 100%;">
                                <tbody><tr>
                                        <td>
                                           
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <table rules="cols" id="MainContent_dgQLN" style="background-color:White;border-color:#999999;border-width:1px;border-style:None;width:96%;border-collapse:collapse;" cellspacing="0" cellpadding="3">
                                                <tbody><tr style="color:White;background-color:#008C44;font-size:14px;font-weight:bold;" valign="middle" align="left">
                                                        <td style="height:20px;width:40px;" align="center">STT</td><td class="padding-header">Huy The</td><td style="width:85px;" align="center">DownLoad</td>
                                                    </tr><tr style="color:Black;background-color:#CCCCCC;">
                                                        <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
                                                    </tr>
                                                </tbody></table>
                                        </td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td></td>
                                    </tr>
                                  
                                    <tr>
                                        <td>
                                         
                                        </td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td></td>
                                    </tr>
                                  
                                    <tr>
                                        <td>
                                           
                                        </td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td></td>
                                    </tr>
                                </tbody></table>
                            <p></p>
                        </div>

                    </div>
                    <div class="clear">
                    </div>
                </div>
                <div class="footer">TRUNG TÂM THẺ - NGÂN HÀNG PHƯƠNG ĐÔNG</div>
            </div>

            <script type="text/javascript">new Sys.WebForms.Menu({element: 'NavigationMenu', disappearAfter: 500, orientation: 'horizontal', tabIndex: 0, disabled: false});</script>
        </form>
    </body>






</html>
