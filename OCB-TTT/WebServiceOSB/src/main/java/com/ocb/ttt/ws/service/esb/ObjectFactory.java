
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ocb.ttt.ws.service.esb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotifyCorrespondenceEmailIn_QNAME = new QName("http://bian.com.vn/Correspondence/", "notifyCorrespondenceEmail_in");
    private final static QName _NotifyCorrespondenceSMSIn_QNAME = new QName("http://bian.com.vn/Correspondence/", "notifyCorrespondenceSMS_in");
    private final static QName _NotifyCorrespondenceSMSOut_QNAME = new QName("http://bian.com.vn/Correspondence/", "notifyCorrespondenceSMS_out");
    private final static QName _RequestClaimCustomerIn_QNAME = new QName("http://bian.com.vn/Correspondence/", "requestClaimCustomer_in");
    private final static QName _RequestClaimCustomerOut_QNAME = new QName("http://bian.com.vn/Correspondence/", "requestClaimCustomer_out");
    private final static QName _NotifyCallCenterOut_QNAME = new QName("http://bian.com.vn/Correspondence/", "notifyCallCenter_out");
    private final static QName _NewElement_QNAME = new QName("bian.com.vn", "NewElement");
    private final static QName _NotifyCorrespondenceEmailOut_QNAME = new QName("http://bian.com.vn/Correspondence/", "notifyCorrespondenceEmail_out");
    private final static QName _NotifyCallCenterIn_QNAME = new QName("http://bian.com.vn/Correspondence/", "notifyCallCenter_in");
    private final static QName _PaymentOrderTypePaymentOrderUpdateTime_QNAME = new QName("", "paymentOrderUpdateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ocb.ttt.ws.service.esb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotifyCallCenterInType }
     * 
     */
    

    /**
     * Create an instance of {@link BankATMType }
     * 
     */
    public BankATMType createBankATMType() {
        return new BankATMType();
    }

    /**
     * Create an instance of {@link DictionaryType }
     * 
     */
    public DictionaryType createDictionaryType() {
        return new DictionaryType();
    }

    /**
     * Create an instance of {@link ServiceProviderForBillPaymentType }
     * 
     */
    public ServiceProviderForBillPaymentType createServiceProviderForBillPaymentType() {
        return new ServiceProviderForBillPaymentType();
    }

    /**
     * Create an instance of {@link CardBlockadeListType }
     * 
     */
    public CardBlockadeListType createCardBlockadeListType() {
        return new CardBlockadeListType();
    }

    /**
     * Create an instance of {@link BankContactListType }
     * 
     */
    public BankContactListType createBankContactListType() {
        return new BankContactListType();
    }

    /**
     * Create an instance of {@link IDInfoType }
     * 
     */
    public IDInfoType createIDInfoType() {
        return new IDInfoType();
    }

    /**
     * Create an instance of {@link StatementFrequencyType }
     * 
     */
    public StatementFrequencyType createStatementFrequencyType() {
        return new StatementFrequencyType();
    }

    /**
     * Create an instance of {@link DictionaryEntryType }
     * 
     */
    public DictionaryEntryType createDictionaryEntryType() {
        return new DictionaryEntryType();
    }

    /**
     * Create an instance of {@link AMLInfoType }
     * 
     */
    public AMLInfoType createAMLInfoType() {
        return new AMLInfoType();
    }

    /**
     * Create an instance of {@link RequestConfirmEmailAPICInfoType }
     * 
     */
    public RequestConfirmEmailAPICInfoType createRequestConfirmEmailAPICInfoType() {
        return new RequestConfirmEmailAPICInfoType();
    }

    /**
     * Create an instance of {@link LimitExposureInfoType }
     * 
     */
    public LimitExposureInfoType createLimitExposureInfoType() {
        return new LimitExposureInfoType();
    }

    /**
     * Create an instance of {@link PaymentInfoType }
     * 
     */
    public PaymentInfoType createPaymentInfoType() {
        return new PaymentInfoType();
    }

    /**
     * Create an instance of {@link ServiceForBillPaymentType }
     * 
     */
    public ServiceForBillPaymentType createServiceForBillPaymentType() {
        return new ServiceForBillPaymentType();
    }

    /**
     * Create an instance of {@link RedemptionType }
     * 
     */
    public RedemptionType createRedemptionType() {
        return new RedemptionType();
    }

    /**
     * Create an instance of {@link SpouseInfoType }
     * 
     */
    public SpouseInfoType createSpouseInfoType() {
        return new SpouseInfoType();
    }

    /**
     * Create an instance of {@link CurrentAccountStatementType }
     * 
     */
   
    /**
     * Create an instance of {@link SMSNotificationType }
     * 
     */
    public SMSNotificationType createSMSNotificationType() {
        return new SMSNotificationType();
    }

    /**
     * Create an instance of {@link DictionaryListType }
     * 
     */
    


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyCorrespondenceEmailInType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bian.com.vn/Correspondence/", name = "notifyCorrespondenceEmail_in")
    public JAXBElement<NotifyCorrespondenceEmailInType> createNotifyCorrespondenceEmailIn(NotifyCorrespondenceEmailInType value) {
        return new JAXBElement<NotifyCorrespondenceEmailInType>(_NotifyCorrespondenceEmailIn_QNAME, NotifyCorrespondenceEmailInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyCorrespondenceSMSInType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bian.com.vn/Correspondence/", name = "notifyCorrespondenceSMS_in")
    public JAXBElement<NotifyCorrespondenceSMSInType> createNotifyCorrespondenceSMSIn(NotifyCorrespondenceSMSInType value) {
        return new JAXBElement<NotifyCorrespondenceSMSInType>(_NotifyCorrespondenceSMSIn_QNAME, NotifyCorrespondenceSMSInType.class, null, value);
    }

  

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestClaimCustomerOutType }{@code >}}
     * 
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "bian.com.vn", name = "NewElement")
    public JAXBElement<String> createNewElement(String value) {
        return new JAXBElement<String>(_NewElement_QNAME, String.class, null, value);
    }

  

}
