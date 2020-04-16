/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.model;

/**
 *
 * @author toanhv1
 */
public class Codebeautify {
 UFXMsg UFXMsgObject;


 // Getter Methods 

 public UFXMsg getUFXMsg() {
  return UFXMsgObject;
 }

 // Setter Methods 

 public void setUFXMsg(UFXMsg UFXMsgObject) {
  this.UFXMsgObject = UFXMsgObject;
 }
}
class UFXMsg {
 private String MsgId;
 Source SourceObject;
 MsgData MsgDataObject;
 private String _scheme;
 private String _msg_type;
 private String _direction;
 private String _version;
 private String _resp_class;
 private String _resp_code;
 private String _resp_text;


 // Getter Methods 

 public String getMsgId() {
  return MsgId;
 }

 public Source getSource() {
  return SourceObject;
 }

 public MsgData getMsgData() {
  return MsgDataObject;
 }

 public String get_scheme() {
  return _scheme;
 }

 public String get_msg_type() {
  return _msg_type;
 }

 public String get_direction() {
  return _direction;
 }

 public String get_version() {
  return _version;
 }

 public String get_resp_class() {
  return _resp_class;
 }

 public String get_resp_code() {
  return _resp_code;
 }

 public String get_resp_text() {
  return _resp_text;
 }

 // Setter Methods 

 public void setMsgId(String MsgId) {
  this.MsgId = MsgId;
 }

 public void setSource(Source SourceObject) {
  this.SourceObject = SourceObject;
 }

 public void setMsgData(MsgData MsgDataObject) {
  this.MsgDataObject = MsgDataObject;
 }

 public void set_scheme(String _scheme) {
  this._scheme = _scheme;
 }

 public void set_msg_type(String _msg_type) {
  this._msg_type = _msg_type;
 }

 public void set_direction(String _direction) {
  this._direction = _direction;
 }

 public void set_version(String _version) {
  this._version = _version;
 }

 public void set_resp_class(String _resp_class) {
  this._resp_class = _resp_class;
 }

 public void set_resp_code(String _resp_code) {
  this._resp_code = _resp_code;
 }

 public void set_resp_text(String _resp_text) {
  this._resp_text = _resp_text;
 }
}
class MsgData {
 Application ApplicationObject;


 // Getter Methods 

 public Application getApplication() {
  return ApplicationObject;
 }

 // Setter Methods 

 public void setApplication(Application ApplicationObject) {
  this.ApplicationObject = ApplicationObject;
 }
}
class Application {
 private String RegNumber;
 private String ObjectType;
 private String ActionType;
 Status StatusObject;


 // Getter Methods 

 public String getRegNumber() {
  return RegNumber;
 }

 public String getObjectType() {
  return ObjectType;
 }

 public String getActionType() {
  return ActionType;
 }

 public Status getStatus() {
  return StatusObject;
 }

 // Setter Methods 

 public void setRegNumber(String RegNumber) {
  this.RegNumber = RegNumber;
 }

 public void setObjectType(String ObjectType) {
  this.ObjectType = ObjectType;
 }

 public void setActionType(String ActionType) {
  this.ActionType = ActionType;
 }

 public void setStatus(Status StatusObject) {
  this.StatusObject = StatusObject;
 }
}
class Status {
 private String RespClass;
 private String RespCode;
 private String RespText;


 // Getter Methods 

 public String getRespClass() {
  return RespClass;
 }

 public String getRespCode() {
  return RespCode;
 }

 public String getRespText() {
  return RespText;
 }

 // Setter Methods 

 public void setRespClass(String RespClass) {
  this.RespClass = RespClass;
 }

 public void setRespCode(String RespCode) {
  this.RespCode = RespCode;
 }

 public void setRespText(String RespText) {
  this.RespText = RespText;
 }
}
class Source {
 private String _app;


 // Getter Methods 

 public String get_app() {
  return _app;
 }

 // Setter Methods 

 public void set_app(String _app) {
  this._app = _app;
 }
}
