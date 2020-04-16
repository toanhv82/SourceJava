/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.model.request;

import java.util.Date;

/**
 *
 * @author toanhv1
 */
public class DebitCard extends BaseCard{
    
    private String fee_class="STUDENT";
    private String year_fee_class="MP1NAM";
    private String bank_code="970448";
    private String owner_code="I";
    private String basic_card_flag="0";
    private String marital_status;
    private String nationality_code;
    private String credit_limit;
    private String issuer_client;
    private String empl_country_code;
    private String empl_city_code;
    private String start_val_date;
    private String account1;
    private String status_code;
    private String staff_id;
    private String delivery_flag;
    private String mailing_city_code;
    private String mailing_country_code;
    private String phone_mobile;
    private String phone_no_1;
    private String photo_indicator;
    private String user_create;
    private String date_create;
    private String user_branch;
    private String authorize;
    private String user_authorize;
    private String date_authorize;
    private String sms_flag;
    private String phone_nbr_sms;
    private String extract_flag;
    private String extract_err;
    private String user_extract;
    private String date_extract;
    private String basic_source_app_no;
    private String card_tran_fee_class;
    private String card_yearly_fee_class;
    private String restricted;
    private String process_batch;
    private String is_upload;
    private String sale_code;
    private String employment_status;
    private String account1_currency;
    private String account1_type;
    
    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }
    
    public String getFee_class() {
        return fee_class;
    }

    public void setFee_class(String fee_class) {
        this.fee_class = fee_class;
    }

    public String getYear_fee_class() {
        return year_fee_class;
    }

    public void setYear_fee_class(String year_fee_class) {
        this.year_fee_class = year_fee_class;
    }

    public String getOwner_code() {
        return owner_code;
    }

    public void setOwner_code(String owner_code) {
        this.owner_code = owner_code;
    }

    public String getBasic_card_flag() {
        return basic_card_flag;
    }

    public void setBasic_card_flag(String basic_card_flag) {
        this.basic_card_flag = basic_card_flag;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getNationality_code() {
        return nationality_code;
    }

    public void setNationality_code(String nationality_code) {
        this.nationality_code = nationality_code;
    }

    public String getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(String credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getIssuer_client() {
        return issuer_client;
    }

    public void setIssuer_client(String issuer_client) {
        this.issuer_client = issuer_client;
    }

    public String getEmpl_country_code() {
        return empl_country_code;
    }

    public void setEmpl_country_code(String empl_country_code) {
        this.empl_country_code = empl_country_code;
    }

    public String getStart_val_date() {
        return start_val_date;
    }

    public void setStart_val_date(String start_val_date) {
        this.start_val_date = start_val_date;
    }

    public String getAccount1() {
        return account1;
    }

    public void setAccount1(String account1) {
        this.account1 = account1;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getDelivery_flag() {
        return delivery_flag;
    }

    public void setDelivery_flag(String delivery_flag) {
        this.delivery_flag = delivery_flag;
    }

    public String getMailing_city_code() {
        return mailing_city_code;
    }

    public void setMailing_city_code(String mailing_city_code) {
        this.mailing_city_code = mailing_city_code;
    }

    public String getMailing_country_code() {
        return mailing_country_code;
    }

    public void setMailing_country_code(String mailing_country_code) {
        this.mailing_country_code = mailing_country_code;
    }

    public String getPhone_mobile() {
        return phone_mobile;
    }

    public void setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    public String getPhoto_indicator() {
        return photo_indicator;
    }

    public void setPhoto_indicator(String photo_indicator) {
        this.photo_indicator = photo_indicator;
    }

    public String getUser_create() {
        return user_create;
    }

    public void setUser_create(String user_create) {
        this.user_create = user_create;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public String getUser_branch() {
        return user_branch;
    }

    public void setUser_branch(String user_branch) {
        this.user_branch = user_branch;
    }

    public String getAuthorize() {
        return authorize;
    }

    public void setAuthorize(String authorize) {
        this.authorize = authorize;
    }

    public String getUser_authorize() {
        return user_authorize;
    }

    public void setUser_authorize(String user_authorize) {
        this.user_authorize = user_authorize;
    }

    public String getDate_authorize() {
        return date_authorize;
    }

    public void setDate_authorize(String date_authorize) {
        this.date_authorize = date_authorize;
    }

    public String getSms_flag() {
        return sms_flag;
    }

    public void setSms_flag(String sms_flag) {
        this.sms_flag = sms_flag;
    }

    public String getPhone_nbr_sms() {
        return phone_nbr_sms;
    }

    public void setPhone_nbr_sms(String phone_nbr_sms) {
        this.phone_nbr_sms = phone_nbr_sms;
    }

    public String getExtract_flag() {
        return extract_flag;
    }

    public void setExtract_flag(String extract_flag) {
        this.extract_flag = extract_flag;
    }

    public String getExtract_err() {
        return extract_err;
    }

    public void setExtract_err(String extract_err) {
        this.extract_err = extract_err;
    }

    public String getUser_extract() {
        return user_extract;
    }

    public void setUser_extract(String user_extract) {
        this.user_extract = user_extract;
    }

    public String getDate_extract() {
        return date_extract;
    }

    public void setDate_extract(String date_extract) {
        this.date_extract = date_extract;
    }

    public String getBasic_source_app_no() {
        return basic_source_app_no;
    }

    public void setBasic_source_app_no(String basic_source_app_no) {
        this.basic_source_app_no = basic_source_app_no;
    }

    public String getCard_tran_fee_class() {
        return card_tran_fee_class;
    }

    public void setCard_tran_fee_class(String card_tran_fee_class) {
        this.card_tran_fee_class = card_tran_fee_class;
    }

    public String getCard_yearly_fee_class() {
        return card_yearly_fee_class;
    }

    public void setCard_yearly_fee_class(String card_yearly_fee_class) {
        this.card_yearly_fee_class = card_yearly_fee_class;
    }

    public String getRestricted() {
        return restricted;
    }

    public void setRestricted(String restricted) {
        this.restricted = restricted;
    }

    public String getProcess_batch() {
        return process_batch;
    }

    public void setProcess_batch(String process_batch) {
        this.process_batch = process_batch;
    }

    public String getIs_upload() {
        return is_upload;
    }

    public void setIs_upload(String is_upload) {
        this.is_upload = is_upload;
    }

    public String getSale_code() {
        return sale_code;
    }

    public void setSale_code(String sale_code) {
        this.sale_code = sale_code;
    }

    public String getEmpl_city_code() {
        return empl_city_code;
    }

    public void setEmpl_city_code(String empl_city_code) {
        this.empl_city_code = empl_city_code;
    }

    public String getPhone_no_1() {
        return phone_no_1;
    }

    public void setPhone_no_1(String phone_no_1) {
        this.phone_no_1 = phone_no_1;
    }

    public String getEmployment_status() {
        return employment_status;
    }

    public void setEmployment_status(String employment_status) {
        this.employment_status = employment_status;
    }

    public String getAccount1_currency() {
        return account1_currency;
    }

    public void setAccount1_currency(String account1_currency) {
        this.account1_currency = account1_currency;
    }

    public String getAccount1_type() {
        return account1_type;
    }

    public void setAccount1_type(String account1_type) {
        this.account1_type = account1_type;
    }

    
}
