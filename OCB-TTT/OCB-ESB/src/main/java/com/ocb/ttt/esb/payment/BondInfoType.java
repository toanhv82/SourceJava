
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BondInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BondInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denominations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockedQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altIsinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firtInterestRepayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteListedTypeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceUpdateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numOfPayments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestDayBasic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextIntRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevIntRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ocbOrderDateList" type="{bian.com.vn}OrderDateListType" minOccurs="0"/>
 *         &lt;element name="dealerDesk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterPartyT24RefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmMoneyMarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestBasic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negativeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccualParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liquidationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDescriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmSecuredType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isGuarantee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clrBalSheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crDerivative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterPartyCorrsp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalLiqAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestLiqAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyDealId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyT24RefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondISINCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositoryCompanyCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netTrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondMatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashHoldSettle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secHoldSettle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountingUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirtyPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custTotNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuGrossAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accumulateIntAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grossAccr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRateRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuAccountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuAccountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondParValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yieldInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterPartyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brokerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brTransCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brNoNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brTotNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brGrossAmountSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brIntrAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repoDealId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marginPorfolioRepoPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prinLiqAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prinBenBank1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbParValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbCleanPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbTransAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbInterestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositoryCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbTransAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendSWIFTmessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoRollover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoCapitaliseIntt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brokerAdviceReqd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brGrossAccr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brBrockerComm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brExRateAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brAccountCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brDelivInstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cptyLimitRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custNoNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24SecRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24SecRefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24TransNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24TransStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repoT24RefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repoT24RefContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repoT24RefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24MMNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importT24Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxoRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmLocrefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brBenbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondCouponScheduleList" type="{bian.com.vn}CouponScheduleListType" minOccurs="0"/>
 *         &lt;element name="bondT24SecRefList" type="{bian.com.vn}T24SecRefListType" minOccurs="0"/>
 *         &lt;element name="accumulateIntAmountt24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalOwnedQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownedQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pledgeQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondInfoType", propOrder = {
    "transType",
    "serialNo",
    "bondCode",
    "denominations",
    "buyPrice",
    "interestRate",
    "qty",
    "totalValue",
    "term",
    "maturityDate",
    "holderName",
    "blockedQty",
    "companyName",
    "issuerCode",
    "securityCode",
    "descriptions",
    "altIsinCode",
    "countryCode",
    "currency",
    "priceType",
    "depository",
    "subAssetType",
    "industryCode",
    "parValue",
    "issueDate",
    "firtInterestRepayment",
    "matureDate",
    "quoteListedTypeNo",
    "businessPp",
    "priceUpdateCode",
    "couponTaxCode",
    "numOfPayments",
    "interestDayBasic",
    "stockExchange",
    "shortName",
    "nextIntRepaymentDate",
    "prevIntRepaymentDate",
    "mmContractId",
    "dealDate",
    "ocbOrderDateList",
    "dealerDesk",
    "mmOfficer",
    "t24Category",
    "counterPartyT24RefId",
    "principle",
    "valueDate",
    "limitReference",
    "mmMoneyMarket",
    "intRateType",
    "interestBasic",
    "negativeRate",
    "intAmount",
    "capitalisation",
    "accualParam",
    "liquidationMode",
    "mmReferenceId",
    "transDescriptions",
    "mmSecuredType",
    "isGuarantee",
    "clrBalSheet",
    "crDerivative",
    "createDate",
    "createUser",
    "coCode",
    "deptCode",
    "guaType",
    "creditAccount",
    "counterPartyCorrsp",
    "principalLiqAcct",
    "interestLiqAcct",
    "buyDealId",
    "buyT24RefNo",
    "dealNo",
    "bondCurrency",
    "bondISINCode",
    "calMethod",
    "depositoryCompanyCod",
    "tradeCurrency",
    "stockExchangeCode",
    "netTrade",
    "transDate",
    "effectiveDate",
    "interestDays",
    "currencyExchange",
    "bondIssueDate",
    "bondMatureDate",
    "indexContract",
    "cashHoldSettle",
    "secHoldSettle",
    "customerNo",
    "dealType",
    "accountingUnitCode",
    "dirtyPrice",
    "custTotNom",
    "cuGrossAmount",
    "accumulateIntAmount",
    "grossAccr",
    "exchangeRateRef",
    "cuAccountCurrency",
    "cuAccountDue",
    "bondParValue",
    "yieldInterestRate",
    "counterPartyID",
    "brokerType",
    "transCode",
    "brTransCode",
    "accountNo",
    "brNoNom",
    "brPrice",
    "brTotNom",
    "brGrossAmountSec",
    "brIntrAmount",
    "amountDue",
    "repoDealId",
    "dueDate",
    "transAmount",
    "transAmount1",
    "transAmount2",
    "dealInterestRate",
    "marginPorfolioRepoPrefix",
    "accountingUnitId",
    "accountPayment",
    "prinLiqAcct",
    "prinBenBank1",
    "rxbParValue",
    "rxbCleanPrice",
    "rxbTransAmount1",
    "rxbDirtyPrice",
    "rxbInterestAmount",
    "depositoryCompanyCode",
    "rxbTransAmount2",
    "agreementTypeId",
    "interestStart",
    "interestEnd",
    "sendSWIFTmessage",
    "autoRollover",
    "autoCapitaliseIntt",
    "currentNumber",
    "brokerAdviceReqd",
    "brGrossAccr",
    "brBrockerComm",
    "clCommission",
    "brExRateAcc",
    "brAccountCcy",
    "brDelivInstr",
    "cptyLimitRef",
    "custNoNom",
    "t24SecRef",
    "t24SecRefStatus",
    "dealId",
    "t24TransNo",
    "t24TransStatus",
    "repoT24RefNo",
    "repoT24RefContract",
    "repoT24RefStatus",
    "t24MMNo",
    "importT24Status",
    "fxoRef",
    "mmLocrefName",
    "sendPayment",
    "brBenbank",
    "bondCouponScheduleList",
    "bondT24SecRefList",
    "accumulateIntAmountt24",
    "totalOwnedQty",
    "ownedQty",
    "buyQty",
    "pledgeQty",
    "interestPeriod",
    "idNum",
    "bondInterestRate"
})
public class BondInfoType {

    protected String transType;
    protected String serialNo;
    protected String bondCode;
    protected String denominations;
    protected String buyPrice;
    protected String interestRate;
    protected String qty;
    protected String totalValue;
    protected String term;
    protected String maturityDate;
    protected String holderName;
    protected String blockedQty;
    protected String companyName;
    protected String issuerCode;
    protected String securityCode;
    protected String descriptions;
    protected String altIsinCode;
    protected String countryCode;
    protected String currency;
    protected String priceType;
    protected String depository;
    protected String subAssetType;
    protected String industryCode;
    protected String parValue;
    protected String issueDate;
    protected String firtInterestRepayment;
    protected String matureDate;
    protected String quoteListedTypeNo;
    protected String businessPp;
    protected String priceUpdateCode;
    protected String couponTaxCode;
    protected String numOfPayments;
    protected String interestDayBasic;
    protected String stockExchange;
    protected String shortName;
    protected String nextIntRepaymentDate;
    protected String prevIntRepaymentDate;
    protected String mmContractId;
    protected String dealDate;
    protected OrderDateListType ocbOrderDateList;
    protected String dealerDesk;
    protected String mmOfficer;
    protected String t24Category;
    protected String counterPartyT24RefId;
    protected String principle;
    protected String valueDate;
    protected String limitReference;
    protected String mmMoneyMarket;
    protected String intRateType;
    protected String interestBasic;
    protected String negativeRate;
    protected String intAmount;
    protected String capitalisation;
    @XmlElement(name = "AccualParam")
    protected String accualParam;
    protected String liquidationMode;
    protected String mmReferenceId;
    protected String transDescriptions;
    protected String mmSecuredType;
    protected String isGuarantee;
    protected String clrBalSheet;
    protected String crDerivative;
    protected String createDate;
    protected String createUser;
    protected String coCode;
    protected String deptCode;
    protected String guaType;
    protected String creditAccount;
    protected String counterPartyCorrsp;
    protected String principalLiqAcct;
    protected String interestLiqAcct;
    protected String buyDealId;
    protected String buyT24RefNo;
    protected String dealNo;
    protected String bondCurrency;
    protected String bondISINCode;
    protected String calMethod;
    protected String depositoryCompanyCod;
    protected String tradeCurrency;
    protected String stockExchangeCode;
    protected String netTrade;
    protected String transDate;
    protected String effectiveDate;
    protected String interestDays;
    protected String currencyExchange;
    protected String bondIssueDate;
    protected String bondMatureDate;
    protected String indexContract;
    protected String cashHoldSettle;
    protected String secHoldSettle;
    protected String customerNo;
    protected String dealType;
    protected String accountingUnitCode;
    protected String dirtyPrice;
    protected String custTotNom;
    protected String cuGrossAmount;
    protected String accumulateIntAmount;
    protected String grossAccr;
    protected String exchangeRateRef;
    protected String cuAccountCurrency;
    protected String cuAccountDue;
    protected String bondParValue;
    protected String yieldInterestRate;
    protected String counterPartyID;
    protected String brokerType;
    protected String transCode;
    protected String brTransCode;
    protected String accountNo;
    protected String brNoNom;
    protected String brPrice;
    protected String brTotNom;
    protected String brGrossAmountSec;
    protected String brIntrAmount;
    protected String amountDue;
    protected String repoDealId;
    protected String dueDate;
    protected String transAmount;
    protected String transAmount1;
    protected String transAmount2;
    protected String dealInterestRate;
    protected String marginPorfolioRepoPrefix;
    protected String accountingUnitId;
    protected String accountPayment;
    protected String prinLiqAcct;
    protected String prinBenBank1;
    protected String rxbParValue;
    protected String rxbCleanPrice;
    protected String rxbTransAmount1;
    protected String rxbDirtyPrice;
    protected String rxbInterestAmount;
    protected String depositoryCompanyCode;
    protected String rxbTransAmount2;
    protected String agreementTypeId;
    protected String interestStart;
    protected String interestEnd;
    protected String sendSWIFTmessage;
    protected String autoRollover;
    protected String autoCapitaliseIntt;
    protected String currentNumber;
    protected String brokerAdviceReqd;
    protected String brGrossAccr;
    protected String brBrockerComm;
    protected String clCommission;
    protected String brExRateAcc;
    protected String brAccountCcy;
    protected String brDelivInstr;
    protected String cptyLimitRef;
    protected String custNoNom;
    protected String t24SecRef;
    protected String t24SecRefStatus;
    protected String dealId;
    protected String t24TransNo;
    protected String t24TransStatus;
    protected String repoT24RefNo;
    protected String repoT24RefContract;
    protected String repoT24RefStatus;
    protected String t24MMNo;
    protected String importT24Status;
    protected String fxoRef;
    protected String mmLocrefName;
    protected String sendPayment;
    protected String brBenbank;
    protected CouponScheduleListType bondCouponScheduleList;
    protected T24SecRefListType bondT24SecRefList;
    protected String accumulateIntAmountt24;
    protected String totalOwnedQty;
    protected String ownedQty;
    protected String buyQty;
    protected String pledgeQty;
    protected String interestPeriod;
    protected String idNum;
    protected String bondInterestRate;

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the bondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondCode() {
        return bondCode;
    }

    /**
     * Sets the value of the bondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondCode(String value) {
        this.bondCode = value;
    }

    /**
     * Gets the value of the denominations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominations() {
        return denominations;
    }

    /**
     * Sets the value of the denominations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominations(String value) {
        this.denominations = value;
    }

    /**
     * Gets the value of the buyPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyPrice() {
        return buyPrice;
    }

    /**
     * Sets the value of the buyPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyPrice(String value) {
        this.buyPrice = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRate(String value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalValue(String value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityDate(String value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the holderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderName(String value) {
        this.holderName = value;
    }

    /**
     * Gets the value of the blockedQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedQty() {
        return blockedQty;
    }

    /**
     * Sets the value of the blockedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedQty(String value) {
        this.blockedQty = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the issuerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerCode() {
        return issuerCode;
    }

    /**
     * Sets the value of the issuerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerCode(String value) {
        this.issuerCode = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptions(String value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the altIsinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltIsinCode() {
        return altIsinCode;
    }

    /**
     * Sets the value of the altIsinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltIsinCode(String value) {
        this.altIsinCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the depository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepository() {
        return depository;
    }

    /**
     * Sets the value of the depository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepository(String value) {
        this.depository = value;
    }

    /**
     * Gets the value of the subAssetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAssetType() {
        return subAssetType;
    }

    /**
     * Sets the value of the subAssetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAssetType(String value) {
        this.subAssetType = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCode(String value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the parValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParValue() {
        return parValue;
    }

    /**
     * Sets the value of the parValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParValue(String value) {
        this.parValue = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the firtInterestRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirtInterestRepayment() {
        return firtInterestRepayment;
    }

    /**
     * Sets the value of the firtInterestRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirtInterestRepayment(String value) {
        this.firtInterestRepayment = value;
    }

    /**
     * Gets the value of the matureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatureDate() {
        return matureDate;
    }

    /**
     * Sets the value of the matureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatureDate(String value) {
        this.matureDate = value;
    }

    /**
     * Gets the value of the quoteListedTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteListedTypeNo() {
        return quoteListedTypeNo;
    }

    /**
     * Sets the value of the quoteListedTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteListedTypeNo(String value) {
        this.quoteListedTypeNo = value;
    }

    /**
     * Gets the value of the businessPp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPp() {
        return businessPp;
    }

    /**
     * Sets the value of the businessPp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPp(String value) {
        this.businessPp = value;
    }

    /**
     * Gets the value of the priceUpdateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceUpdateCode() {
        return priceUpdateCode;
    }

    /**
     * Sets the value of the priceUpdateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceUpdateCode(String value) {
        this.priceUpdateCode = value;
    }

    /**
     * Gets the value of the couponTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponTaxCode() {
        return couponTaxCode;
    }

    /**
     * Sets the value of the couponTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponTaxCode(String value) {
        this.couponTaxCode = value;
    }

    /**
     * Gets the value of the numOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfPayments() {
        return numOfPayments;
    }

    /**
     * Sets the value of the numOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfPayments(String value) {
        this.numOfPayments = value;
    }

    /**
     * Gets the value of the interestDayBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestDayBasic() {
        return interestDayBasic;
    }

    /**
     * Sets the value of the interestDayBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestDayBasic(String value) {
        this.interestDayBasic = value;
    }

    /**
     * Gets the value of the stockExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchange() {
        return stockExchange;
    }

    /**
     * Sets the value of the stockExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchange(String value) {
        this.stockExchange = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the nextIntRepaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextIntRepaymentDate() {
        return nextIntRepaymentDate;
    }

    /**
     * Sets the value of the nextIntRepaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextIntRepaymentDate(String value) {
        this.nextIntRepaymentDate = value;
    }

    /**
     * Gets the value of the prevIntRepaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevIntRepaymentDate() {
        return prevIntRepaymentDate;
    }

    /**
     * Sets the value of the prevIntRepaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevIntRepaymentDate(String value) {
        this.prevIntRepaymentDate = value;
    }

    /**
     * Gets the value of the mmContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmContractId() {
        return mmContractId;
    }

    /**
     * Sets the value of the mmContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmContractId(String value) {
        this.mmContractId = value;
    }

    /**
     * Gets the value of the dealDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealDate(String value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the ocbOrderDateList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDateListType }
     *     
     */
    public OrderDateListType getOcbOrderDateList() {
        return ocbOrderDateList;
    }

    /**
     * Sets the value of the ocbOrderDateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDateListType }
     *     
     */
    public void setOcbOrderDateList(OrderDateListType value) {
        this.ocbOrderDateList = value;
    }

    /**
     * Gets the value of the dealerDesk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerDesk() {
        return dealerDesk;
    }

    /**
     * Sets the value of the dealerDesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerDesk(String value) {
        this.dealerDesk = value;
    }

    /**
     * Gets the value of the mmOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmOfficer() {
        return mmOfficer;
    }

    /**
     * Sets the value of the mmOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmOfficer(String value) {
        this.mmOfficer = value;
    }

    /**
     * Gets the value of the t24Category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24Category() {
        return t24Category;
    }

    /**
     * Sets the value of the t24Category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24Category(String value) {
        this.t24Category = value;
    }

    /**
     * Gets the value of the counterPartyT24RefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterPartyT24RefId() {
        return counterPartyT24RefId;
    }

    /**
     * Sets the value of the counterPartyT24RefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterPartyT24RefId(String value) {
        this.counterPartyT24RefId = value;
    }

    /**
     * Gets the value of the principle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinciple() {
        return principle;
    }

    /**
     * Sets the value of the principle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinciple(String value) {
        this.principle = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDate(String value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the limitReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitReference() {
        return limitReference;
    }

    /**
     * Sets the value of the limitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitReference(String value) {
        this.limitReference = value;
    }

    /**
     * Gets the value of the mmMoneyMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmMoneyMarket() {
        return mmMoneyMarket;
    }

    /**
     * Sets the value of the mmMoneyMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmMoneyMarket(String value) {
        this.mmMoneyMarket = value;
    }

    /**
     * Gets the value of the intRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntRateType() {
        return intRateType;
    }

    /**
     * Sets the value of the intRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntRateType(String value) {
        this.intRateType = value;
    }

    /**
     * Gets the value of the interestBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestBasic() {
        return interestBasic;
    }

    /**
     * Sets the value of the interestBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestBasic(String value) {
        this.interestBasic = value;
    }

    /**
     * Gets the value of the negativeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeRate() {
        return negativeRate;
    }

    /**
     * Sets the value of the negativeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeRate(String value) {
        this.negativeRate = value;
    }

    /**
     * Gets the value of the intAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntAmount() {
        return intAmount;
    }

    /**
     * Sets the value of the intAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntAmount(String value) {
        this.intAmount = value;
    }

    /**
     * Gets the value of the capitalisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalisation() {
        return capitalisation;
    }

    /**
     * Sets the value of the capitalisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalisation(String value) {
        this.capitalisation = value;
    }

    /**
     * Gets the value of the accualParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccualParam() {
        return accualParam;
    }

    /**
     * Sets the value of the accualParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccualParam(String value) {
        this.accualParam = value;
    }

    /**
     * Gets the value of the liquidationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidationMode() {
        return liquidationMode;
    }

    /**
     * Sets the value of the liquidationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidationMode(String value) {
        this.liquidationMode = value;
    }

    /**
     * Gets the value of the mmReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmReferenceId() {
        return mmReferenceId;
    }

    /**
     * Sets the value of the mmReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmReferenceId(String value) {
        this.mmReferenceId = value;
    }

    /**
     * Gets the value of the transDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDescriptions() {
        return transDescriptions;
    }

    /**
     * Sets the value of the transDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDescriptions(String value) {
        this.transDescriptions = value;
    }

    /**
     * Gets the value of the mmSecuredType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmSecuredType() {
        return mmSecuredType;
    }

    /**
     * Sets the value of the mmSecuredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmSecuredType(String value) {
        this.mmSecuredType = value;
    }

    /**
     * Gets the value of the isGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGuarantee() {
        return isGuarantee;
    }

    /**
     * Sets the value of the isGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGuarantee(String value) {
        this.isGuarantee = value;
    }

    /**
     * Gets the value of the clrBalSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrBalSheet() {
        return clrBalSheet;
    }

    /**
     * Sets the value of the clrBalSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrBalSheet(String value) {
        this.clrBalSheet = value;
    }

    /**
     * Gets the value of the crDerivative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrDerivative() {
        return crDerivative;
    }

    /**
     * Sets the value of the crDerivative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrDerivative(String value) {
        this.crDerivative = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the coCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoCode() {
        return coCode;
    }

    /**
     * Sets the value of the coCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoCode(String value) {
        this.coCode = value;
    }

    /**
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptCode(String value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the guaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaType() {
        return guaType;
    }

    /**
     * Sets the value of the guaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaType(String value) {
        this.guaType = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccount(String value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the counterPartyCorrsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterPartyCorrsp() {
        return counterPartyCorrsp;
    }

    /**
     * Sets the value of the counterPartyCorrsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterPartyCorrsp(String value) {
        this.counterPartyCorrsp = value;
    }

    /**
     * Gets the value of the principalLiqAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalLiqAcct() {
        return principalLiqAcct;
    }

    /**
     * Sets the value of the principalLiqAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalLiqAcct(String value) {
        this.principalLiqAcct = value;
    }

    /**
     * Gets the value of the interestLiqAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestLiqAcct() {
        return interestLiqAcct;
    }

    /**
     * Sets the value of the interestLiqAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestLiqAcct(String value) {
        this.interestLiqAcct = value;
    }

    /**
     * Gets the value of the buyDealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyDealId() {
        return buyDealId;
    }

    /**
     * Sets the value of the buyDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyDealId(String value) {
        this.buyDealId = value;
    }

    /**
     * Gets the value of the buyT24RefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyT24RefNo() {
        return buyT24RefNo;
    }

    /**
     * Sets the value of the buyT24RefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyT24RefNo(String value) {
        this.buyT24RefNo = value;
    }

    /**
     * Gets the value of the dealNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealNo() {
        return dealNo;
    }

    /**
     * Sets the value of the dealNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealNo(String value) {
        this.dealNo = value;
    }

    /**
     * Gets the value of the bondCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondCurrency() {
        return bondCurrency;
    }

    /**
     * Sets the value of the bondCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondCurrency(String value) {
        this.bondCurrency = value;
    }

    /**
     * Gets the value of the bondISINCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondISINCode() {
        return bondISINCode;
    }

    /**
     * Sets the value of the bondISINCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondISINCode(String value) {
        this.bondISINCode = value;
    }

    /**
     * Gets the value of the calMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalMethod() {
        return calMethod;
    }

    /**
     * Sets the value of the calMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalMethod(String value) {
        this.calMethod = value;
    }

    /**
     * Gets the value of the depositoryCompanyCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositoryCompanyCod() {
        return depositoryCompanyCod;
    }

    /**
     * Sets the value of the depositoryCompanyCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositoryCompanyCod(String value) {
        this.depositoryCompanyCod = value;
    }

    /**
     * Gets the value of the tradeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeCurrency() {
        return tradeCurrency;
    }

    /**
     * Sets the value of the tradeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeCurrency(String value) {
        this.tradeCurrency = value;
    }

    /**
     * Gets the value of the stockExchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchangeCode() {
        return stockExchangeCode;
    }

    /**
     * Sets the value of the stockExchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchangeCode(String value) {
        this.stockExchangeCode = value;
    }

    /**
     * Gets the value of the netTrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetTrade() {
        return netTrade;
    }

    /**
     * Sets the value of the netTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetTrade(String value) {
        this.netTrade = value;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the interestDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestDays() {
        return interestDays;
    }

    /**
     * Sets the value of the interestDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestDays(String value) {
        this.interestDays = value;
    }

    /**
     * Gets the value of the currencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * Sets the value of the currencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyExchange(String value) {
        this.currencyExchange = value;
    }

    /**
     * Gets the value of the bondIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondIssueDate() {
        return bondIssueDate;
    }

    /**
     * Sets the value of the bondIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondIssueDate(String value) {
        this.bondIssueDate = value;
    }

    /**
     * Gets the value of the bondMatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondMatureDate() {
        return bondMatureDate;
    }

    /**
     * Sets the value of the bondMatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondMatureDate(String value) {
        this.bondMatureDate = value;
    }

    /**
     * Gets the value of the indexContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexContract() {
        return indexContract;
    }

    /**
     * Sets the value of the indexContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexContract(String value) {
        this.indexContract = value;
    }

    /**
     * Gets the value of the cashHoldSettle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashHoldSettle() {
        return cashHoldSettle;
    }

    /**
     * Sets the value of the cashHoldSettle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashHoldSettle(String value) {
        this.cashHoldSettle = value;
    }

    /**
     * Gets the value of the secHoldSettle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecHoldSettle() {
        return secHoldSettle;
    }

    /**
     * Sets the value of the secHoldSettle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecHoldSettle(String value) {
        this.secHoldSettle = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the dealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealType() {
        return dealType;
    }

    /**
     * Sets the value of the dealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealType(String value) {
        this.dealType = value;
    }

    /**
     * Gets the value of the accountingUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingUnitCode() {
        return accountingUnitCode;
    }

    /**
     * Sets the value of the accountingUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingUnitCode(String value) {
        this.accountingUnitCode = value;
    }

    /**
     * Gets the value of the dirtyPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirtyPrice() {
        return dirtyPrice;
    }

    /**
     * Sets the value of the dirtyPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirtyPrice(String value) {
        this.dirtyPrice = value;
    }

    /**
     * Gets the value of the custTotNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTotNom() {
        return custTotNom;
    }

    /**
     * Sets the value of the custTotNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTotNom(String value) {
        this.custTotNom = value;
    }

    /**
     * Gets the value of the cuGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuGrossAmount() {
        return cuGrossAmount;
    }

    /**
     * Sets the value of the cuGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuGrossAmount(String value) {
        this.cuGrossAmount = value;
    }

    /**
     * Gets the value of the accumulateIntAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulateIntAmount() {
        return accumulateIntAmount;
    }

    /**
     * Sets the value of the accumulateIntAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulateIntAmount(String value) {
        this.accumulateIntAmount = value;
    }

    /**
     * Gets the value of the grossAccr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossAccr() {
        return grossAccr;
    }

    /**
     * Sets the value of the grossAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossAccr(String value) {
        this.grossAccr = value;
    }

    /**
     * Gets the value of the exchangeRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateRef() {
        return exchangeRateRef;
    }

    /**
     * Sets the value of the exchangeRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateRef(String value) {
        this.exchangeRateRef = value;
    }

    /**
     * Gets the value of the cuAccountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuAccountCurrency() {
        return cuAccountCurrency;
    }

    /**
     * Sets the value of the cuAccountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuAccountCurrency(String value) {
        this.cuAccountCurrency = value;
    }

    /**
     * Gets the value of the cuAccountDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuAccountDue() {
        return cuAccountDue;
    }

    /**
     * Sets the value of the cuAccountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuAccountDue(String value) {
        this.cuAccountDue = value;
    }

    /**
     * Gets the value of the bondParValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondParValue() {
        return bondParValue;
    }

    /**
     * Sets the value of the bondParValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondParValue(String value) {
        this.bondParValue = value;
    }

    /**
     * Gets the value of the yieldInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYieldInterestRate() {
        return yieldInterestRate;
    }

    /**
     * Sets the value of the yieldInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYieldInterestRate(String value) {
        this.yieldInterestRate = value;
    }

    /**
     * Gets the value of the counterPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterPartyID() {
        return counterPartyID;
    }

    /**
     * Sets the value of the counterPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterPartyID(String value) {
        this.counterPartyID = value;
    }

    /**
     * Gets the value of the brokerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerType() {
        return brokerType;
    }

    /**
     * Sets the value of the brokerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerType(String value) {
        this.brokerType = value;
    }

    /**
     * Gets the value of the transCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransCode() {
        return transCode;
    }

    /**
     * Sets the value of the transCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransCode(String value) {
        this.transCode = value;
    }

    /**
     * Gets the value of the brTransCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrTransCode() {
        return brTransCode;
    }

    /**
     * Sets the value of the brTransCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrTransCode(String value) {
        this.brTransCode = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the brNoNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrNoNom() {
        return brNoNom;
    }

    /**
     * Sets the value of the brNoNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrNoNom(String value) {
        this.brNoNom = value;
    }

    /**
     * Gets the value of the brPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrPrice() {
        return brPrice;
    }

    /**
     * Sets the value of the brPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrPrice(String value) {
        this.brPrice = value;
    }

    /**
     * Gets the value of the brTotNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrTotNom() {
        return brTotNom;
    }

    /**
     * Sets the value of the brTotNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrTotNom(String value) {
        this.brTotNom = value;
    }

    /**
     * Gets the value of the brGrossAmountSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrGrossAmountSec() {
        return brGrossAmountSec;
    }

    /**
     * Sets the value of the brGrossAmountSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrGrossAmountSec(String value) {
        this.brGrossAmountSec = value;
    }

    /**
     * Gets the value of the brIntrAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrIntrAmount() {
        return brIntrAmount;
    }

    /**
     * Sets the value of the brIntrAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrIntrAmount(String value) {
        this.brIntrAmount = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountDue(String value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the repoDealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepoDealId() {
        return repoDealId;
    }

    /**
     * Sets the value of the repoDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepoDealId(String value) {
        this.repoDealId = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the transAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransAmount() {
        return transAmount;
    }

    /**
     * Sets the value of the transAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransAmount(String value) {
        this.transAmount = value;
    }

    /**
     * Gets the value of the transAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransAmount1() {
        return transAmount1;
    }

    /**
     * Sets the value of the transAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransAmount1(String value) {
        this.transAmount1 = value;
    }

    /**
     * Gets the value of the transAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransAmount2() {
        return transAmount2;
    }

    /**
     * Sets the value of the transAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransAmount2(String value) {
        this.transAmount2 = value;
    }

    /**
     * Gets the value of the dealInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealInterestRate() {
        return dealInterestRate;
    }

    /**
     * Sets the value of the dealInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealInterestRate(String value) {
        this.dealInterestRate = value;
    }

    /**
     * Gets the value of the marginPorfolioRepoPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginPorfolioRepoPrefix() {
        return marginPorfolioRepoPrefix;
    }

    /**
     * Sets the value of the marginPorfolioRepoPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginPorfolioRepoPrefix(String value) {
        this.marginPorfolioRepoPrefix = value;
    }

    /**
     * Gets the value of the accountingUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingUnitId() {
        return accountingUnitId;
    }

    /**
     * Sets the value of the accountingUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingUnitId(String value) {
        this.accountingUnitId = value;
    }

    /**
     * Gets the value of the accountPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPayment() {
        return accountPayment;
    }

    /**
     * Sets the value of the accountPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPayment(String value) {
        this.accountPayment = value;
    }

    /**
     * Gets the value of the prinLiqAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinLiqAcct() {
        return prinLiqAcct;
    }

    /**
     * Sets the value of the prinLiqAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinLiqAcct(String value) {
        this.prinLiqAcct = value;
    }

    /**
     * Gets the value of the prinBenBank1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinBenBank1() {
        return prinBenBank1;
    }

    /**
     * Sets the value of the prinBenBank1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinBenBank1(String value) {
        this.prinBenBank1 = value;
    }

    /**
     * Gets the value of the rxbParValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbParValue() {
        return rxbParValue;
    }

    /**
     * Sets the value of the rxbParValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbParValue(String value) {
        this.rxbParValue = value;
    }

    /**
     * Gets the value of the rxbCleanPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbCleanPrice() {
        return rxbCleanPrice;
    }

    /**
     * Sets the value of the rxbCleanPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbCleanPrice(String value) {
        this.rxbCleanPrice = value;
    }

    /**
     * Gets the value of the rxbTransAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbTransAmount1() {
        return rxbTransAmount1;
    }

    /**
     * Sets the value of the rxbTransAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbTransAmount1(String value) {
        this.rxbTransAmount1 = value;
    }

    /**
     * Gets the value of the rxbDirtyPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbDirtyPrice() {
        return rxbDirtyPrice;
    }

    /**
     * Sets the value of the rxbDirtyPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbDirtyPrice(String value) {
        this.rxbDirtyPrice = value;
    }

    /**
     * Gets the value of the rxbInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbInterestAmount() {
        return rxbInterestAmount;
    }

    /**
     * Sets the value of the rxbInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbInterestAmount(String value) {
        this.rxbInterestAmount = value;
    }

    /**
     * Gets the value of the depositoryCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositoryCompanyCode() {
        return depositoryCompanyCode;
    }

    /**
     * Sets the value of the depositoryCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositoryCompanyCode(String value) {
        this.depositoryCompanyCode = value;
    }

    /**
     * Gets the value of the rxbTransAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbTransAmount2() {
        return rxbTransAmount2;
    }

    /**
     * Sets the value of the rxbTransAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbTransAmount2(String value) {
        this.rxbTransAmount2 = value;
    }

    /**
     * Gets the value of the agreementTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementTypeId() {
        return agreementTypeId;
    }

    /**
     * Sets the value of the agreementTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementTypeId(String value) {
        this.agreementTypeId = value;
    }

    /**
     * Gets the value of the interestStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestStart() {
        return interestStart;
    }

    /**
     * Sets the value of the interestStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestStart(String value) {
        this.interestStart = value;
    }

    /**
     * Gets the value of the interestEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestEnd() {
        return interestEnd;
    }

    /**
     * Sets the value of the interestEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestEnd(String value) {
        this.interestEnd = value;
    }

    /**
     * Gets the value of the sendSWIFTmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSWIFTmessage() {
        return sendSWIFTmessage;
    }

    /**
     * Sets the value of the sendSWIFTmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendSWIFTmessage(String value) {
        this.sendSWIFTmessage = value;
    }

    /**
     * Gets the value of the autoRollover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoRollover() {
        return autoRollover;
    }

    /**
     * Sets the value of the autoRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoRollover(String value) {
        this.autoRollover = value;
    }

    /**
     * Gets the value of the autoCapitaliseIntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCapitaliseIntt() {
        return autoCapitaliseIntt;
    }

    /**
     * Sets the value of the autoCapitaliseIntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCapitaliseIntt(String value) {
        this.autoCapitaliseIntt = value;
    }

    /**
     * Gets the value of the currentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentNumber() {
        return currentNumber;
    }

    /**
     * Sets the value of the currentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentNumber(String value) {
        this.currentNumber = value;
    }

    /**
     * Gets the value of the brokerAdviceReqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerAdviceReqd() {
        return brokerAdviceReqd;
    }

    /**
     * Sets the value of the brokerAdviceReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerAdviceReqd(String value) {
        this.brokerAdviceReqd = value;
    }

    /**
     * Gets the value of the brGrossAccr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrGrossAccr() {
        return brGrossAccr;
    }

    /**
     * Sets the value of the brGrossAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrGrossAccr(String value) {
        this.brGrossAccr = value;
    }

    /**
     * Gets the value of the brBrockerComm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrBrockerComm() {
        return brBrockerComm;
    }

    /**
     * Sets the value of the brBrockerComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrBrockerComm(String value) {
        this.brBrockerComm = value;
    }

    /**
     * Gets the value of the clCommission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClCommission() {
        return clCommission;
    }

    /**
     * Sets the value of the clCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClCommission(String value) {
        this.clCommission = value;
    }

    /**
     * Gets the value of the brExRateAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrExRateAcc() {
        return brExRateAcc;
    }

    /**
     * Sets the value of the brExRateAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrExRateAcc(String value) {
        this.brExRateAcc = value;
    }

    /**
     * Gets the value of the brAccountCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrAccountCcy() {
        return brAccountCcy;
    }

    /**
     * Sets the value of the brAccountCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrAccountCcy(String value) {
        this.brAccountCcy = value;
    }

    /**
     * Gets the value of the brDelivInstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrDelivInstr() {
        return brDelivInstr;
    }

    /**
     * Sets the value of the brDelivInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrDelivInstr(String value) {
        this.brDelivInstr = value;
    }

    /**
     * Gets the value of the cptyLimitRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptyLimitRef() {
        return cptyLimitRef;
    }

    /**
     * Sets the value of the cptyLimitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptyLimitRef(String value) {
        this.cptyLimitRef = value;
    }

    /**
     * Gets the value of the custNoNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNoNom() {
        return custNoNom;
    }

    /**
     * Sets the value of the custNoNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNoNom(String value) {
        this.custNoNom = value;
    }

    /**
     * Gets the value of the t24SecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24SecRef() {
        return t24SecRef;
    }

    /**
     * Sets the value of the t24SecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24SecRef(String value) {
        this.t24SecRef = value;
    }

    /**
     * Gets the value of the t24SecRefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24SecRefStatus() {
        return t24SecRefStatus;
    }

    /**
     * Sets the value of the t24SecRefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24SecRefStatus(String value) {
        this.t24SecRefStatus = value;
    }

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the t24TransNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24TransNo() {
        return t24TransNo;
    }

    /**
     * Sets the value of the t24TransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24TransNo(String value) {
        this.t24TransNo = value;
    }

    /**
     * Gets the value of the t24TransStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24TransStatus() {
        return t24TransStatus;
    }

    /**
     * Sets the value of the t24TransStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24TransStatus(String value) {
        this.t24TransStatus = value;
    }

    /**
     * Gets the value of the repoT24RefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepoT24RefNo() {
        return repoT24RefNo;
    }

    /**
     * Sets the value of the repoT24RefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepoT24RefNo(String value) {
        this.repoT24RefNo = value;
    }

    /**
     * Gets the value of the repoT24RefContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepoT24RefContract() {
        return repoT24RefContract;
    }

    /**
     * Sets the value of the repoT24RefContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepoT24RefContract(String value) {
        this.repoT24RefContract = value;
    }

    /**
     * Gets the value of the repoT24RefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepoT24RefStatus() {
        return repoT24RefStatus;
    }

    /**
     * Sets the value of the repoT24RefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepoT24RefStatus(String value) {
        this.repoT24RefStatus = value;
    }

    /**
     * Gets the value of the t24MMNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24MMNo() {
        return t24MMNo;
    }

    /**
     * Sets the value of the t24MMNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24MMNo(String value) {
        this.t24MMNo = value;
    }

    /**
     * Gets the value of the importT24Status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportT24Status() {
        return importT24Status;
    }

    /**
     * Sets the value of the importT24Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportT24Status(String value) {
        this.importT24Status = value;
    }

    /**
     * Gets the value of the fxoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxoRef() {
        return fxoRef;
    }

    /**
     * Sets the value of the fxoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxoRef(String value) {
        this.fxoRef = value;
    }

    /**
     * Gets the value of the mmLocrefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmLocrefName() {
        return mmLocrefName;
    }

    /**
     * Sets the value of the mmLocrefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmLocrefName(String value) {
        this.mmLocrefName = value;
    }

    /**
     * Gets the value of the sendPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendPayment() {
        return sendPayment;
    }

    /**
     * Sets the value of the sendPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendPayment(String value) {
        this.sendPayment = value;
    }

    /**
     * Gets the value of the brBenbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrBenbank() {
        return brBenbank;
    }

    /**
     * Sets the value of the brBenbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrBenbank(String value) {
        this.brBenbank = value;
    }

    /**
     * Gets the value of the bondCouponScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link CouponScheduleListType }
     *     
     */
    public CouponScheduleListType getBondCouponScheduleList() {
        return bondCouponScheduleList;
    }

    /**
     * Sets the value of the bondCouponScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponScheduleListType }
     *     
     */
    public void setBondCouponScheduleList(CouponScheduleListType value) {
        this.bondCouponScheduleList = value;
    }

    /**
     * Gets the value of the bondT24SecRefList property.
     * 
     * @return
     *     possible object is
     *     {@link T24SecRefListType }
     *     
     */
    public T24SecRefListType getBondT24SecRefList() {
        return bondT24SecRefList;
    }

    /**
     * Sets the value of the bondT24SecRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link T24SecRefListType }
     *     
     */
    public void setBondT24SecRefList(T24SecRefListType value) {
        this.bondT24SecRefList = value;
    }

    /**
     * Gets the value of the accumulateIntAmountt24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulateIntAmountt24() {
        return accumulateIntAmountt24;
    }

    /**
     * Sets the value of the accumulateIntAmountt24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulateIntAmountt24(String value) {
        this.accumulateIntAmountt24 = value;
    }

    /**
     * Gets the value of the totalOwnedQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOwnedQty() {
        return totalOwnedQty;
    }

    /**
     * Sets the value of the totalOwnedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOwnedQty(String value) {
        this.totalOwnedQty = value;
    }

    /**
     * Gets the value of the ownedQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnedQty() {
        return ownedQty;
    }

    /**
     * Sets the value of the ownedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnedQty(String value) {
        this.ownedQty = value;
    }

    /**
     * Gets the value of the buyQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyQty() {
        return buyQty;
    }

    /**
     * Sets the value of the buyQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyQty(String value) {
        this.buyQty = value;
    }

    /**
     * Gets the value of the pledgeQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPledgeQty() {
        return pledgeQty;
    }

    /**
     * Sets the value of the pledgeQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPledgeQty(String value) {
        this.pledgeQty = value;
    }

    /**
     * Gets the value of the interestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestPeriod() {
        return interestPeriod;
    }

    /**
     * Sets the value of the interestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestPeriod(String value) {
        this.interestPeriod = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNum(String value) {
        this.idNum = value;
    }

    /**
     * Gets the value of the bondInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondInterestRate() {
        return bondInterestRate;
    }

    /**
     * Sets the value of the bondInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondInterestRate(String value) {
        this.bondInterestRate = value;
    }

}
