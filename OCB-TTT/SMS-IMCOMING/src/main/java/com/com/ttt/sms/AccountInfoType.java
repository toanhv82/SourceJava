
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * S\u1ed1 tài kho\u1ea3n
 * 
 * <p>Java class for AccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="customerInfo" type="{bian.com.vn}CustomerInfoType" minOccurs="0"/>
 *         &lt;element name="accountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpeningAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountExchangeBalanceEQV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountClassMinBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpenBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpenBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLatestTransDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOverdraftDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOverdraftExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAuthorizedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountDelegatedPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountCoownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAccrued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="savingApplicationInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSavingSerials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountRolloverAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStaffCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNarrative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payout" type="{bian.com.vn}PayoutType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="redemption" type="{bian.com.vn}RedemptionType" minOccurs="0"/>
 *         &lt;element name="terminationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountExpectedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payin" type="{bian.com.vn}PayinType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountOfficialOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInterestReceivableType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLatestReceivableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLockReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLockDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLockExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLockStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLockStatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMorgateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMorgateLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMorgateLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSheetBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountDebtGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tdBookAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookAccBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAutoRollType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountRollType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpenBranchInfo" type="{bian.com.vn}BranchInfoType" minOccurs="0"/>
 *         &lt;element name="accountManageBranchInfo" type="{bian.com.vn}BranchInfoType" minOccurs="0"/>
 *         &lt;element name="accountInterestOnRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLockAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAutoCapitalization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAutoRollover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAutoRolloverDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNextDayOfRollover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPenaltyOnRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPeriodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPeriodUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPrincipalDecreasePossible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPrincipalIncreasePossible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAccrueStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPricipalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPostingRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInterestPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInterestPeriodStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSubProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAvailableFundValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAvailableFundDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAbbreviationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountLedgerBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountChargesPackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAutoCapitallisationChangePos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAutoRolloverChangePos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPlaChangePos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountIlaChangePos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountIbRedeemDepositPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPrematureInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountDeclaredMonthlyInPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountIbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountEmissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountEmissionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountFlexProductClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountFlexProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInstructionOnDispensation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInterestBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountMISInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPremiumRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSettleAmtOnRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSuspiciousFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTaxInterestKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTaxInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountCampaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPeriodFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountFirstReceivableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNarratives" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditInterestCalculation" type="{bian.com.vn}InterestCalculationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditInterestCaptialisation" type="{bian.com.vn}InterestCaptialisationType" minOccurs="0"/>
 *         &lt;element name="debitInterestCaptialisation" type="{bian.com.vn}InterestCaptialisationType" minOccurs="0"/>
 *         &lt;element name="debitInterestCalculation" type="{bian.com.vn}InterestCalculationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attachedCard" type="{bian.com.vn}AttachedCardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastMinimalAmountDue" type="{bian.com.vn}LastMinimalAmountDueType" minOccurs="0"/>
 *         &lt;element name="limitBrief" type="{bian.com.vn}LimitBriefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountBalanceInfo" type="{bian.com.vn}AccountBalanceInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditAddIntCapitalisation" type="{bian.com.vn}InterestCaptialisationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountStatementGeneration" type="{bian.com.vn}StatementGenerationInfoType" minOccurs="0"/>
 *         &lt;element name="accountEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSmsApproval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountFrequencyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicDrawdownAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicTransferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termPeriodFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialTransferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountResolver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNostroNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastTransactionBookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSubProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfoType", propOrder = {
    "cifInfo",
    "customerInfo",
    "accountNum",
    "accountComment",
    "accountName",
    "accountType",
    "accountTypeName",
    "accountCurrency",
    "accountOpeningAmount",
    "accountBalance",
    "accountBalanceAvailable",
    "accountExchangeBalanceEQV",
    "accountOpenDate",
    "accountMaturityDate",
    "accountStatus",
    "accountClassMinBalance",
    "accountClassName",
    "accountClassCode",
    "accountInterestRate",
    "accountInterest",
    "accountOpenBranchCode",
    "accountOpenBranchName",
    "accountLatestTransDate",
    "accountOverdraftDate",
    "accountOverdraftExpiredDate",
    "accountOverdraftLimit",
    "accountAuthorizedStatus",
    "accountDelegatedPerson",
    "accountCoownerName",
    "accountTerm",
    "accountAccrued",
    "savingApplicationInterest",
    "accountSavingSerials",
    "accountRolloverAmount",
    "accountStaffCode",
    "srcAccountNum",
    "accountNarrative",
    "payout",
    "redemption",
    "terminationType",
    "accountExpectedAmount",
    "payin",
    "accountOfficialOpenDate",
    "accountInterestReceivableType",
    "accountLatestReceivableDate",
    "accountLockReason",
    "accountLockDate",
    "accountLockExpireDate",
    "accountLockStatus",
    "accountLockStatName",
    "accountMorgateType",
    "accountMorgateLimit",
    "accountMorgateLimitType",
    "accountSheetBalance",
    "accountDebtGroup",
    "tdBookAccount",
    "bookAccBRN",
    "accountAutoRollType",
    "accountRollType",
    "accountOpenBranchInfo",
    "accountManageBranchInfo",
    "accountInterestOnRedeem",
    "accountLockAmount",
    "accountAutoCapitalization",
    "accountAutoRollover",
    "accountAutoRolloverDate",
    "accountNextDayOfRollover",
    "accountPenaltyOnRedeem",
    "accountPeriodCount",
    "accountPeriodUnit",
    "accountPrincipalDecreasePossible",
    "accountPrincipalIncreasePossible",
    "accountAccrueStartDate",
    "accountPricipalAmount",
    "accountPostingRestrictions",
    "accountDeliveryMethod",
    "accountInterestPeriodEnd",
    "accountInterestPeriodStart",
    "accountSubProductCode",
    "accountAvailableFundValue",
    "accountAvailableFundDate",
    "accountAbbreviationName",
    "accountLedgerBalance",
    "accountCategoryID",
    "accountChargesPackageName",
    "accountAutoCapitallisationChangePos",
    "accountAutoRolloverChangePos",
    "accountPlaChangePos",
    "accountIlaChangePos",
    "accountIbRedeemDepositPos",
    "accountPrematureInterestRate",
    "accountPromotionCode",
    "accountDeclaredMonthlyInPayment",
    "accountIbanNumber",
    "accountPurpose",
    "accountEmissionName",
    "accountEmissionId",
    "accountFlexProductClass",
    "accountFlexProductId",
    "accountInstructionOnDispensation",
    "accountInterestBasis",
    "accountMISInterestRate",
    "accountPremiumRate",
    "accountSettleAmtOnRedeem",
    "accountSuspiciousFlag",
    "accountTaxInterestKey",
    "accountTaxInterestRate",
    "accountTotalTaxAmount",
    "accountCampaignId",
    "accountPeriodFrequency",
    "accountFirstReceivableDate",
    "accountNarratives",
    "creditInterestCalculation",
    "creditInterestCaptialisation",
    "debitInterestCaptialisation",
    "debitInterestCalculation",
    "attachedCard",
    "lastMinimalAmountDue",
    "limitBrief",
    "accountBalanceInfo",
    "creditAddIntCapitalisation",
    "accountStatementGeneration",
    "accountEndDate",
    "accountSmsApproval",
    "accountFrequencyAmount",
    "depositType",
    "periodicDrawdownAccount",
    "periodicTransferDescription",
    "termPeriodFrequency",
    "initialTransferDescription",
    "accountResolver",
    "accountOpenType",
    "accountPackage",
    "accountNostroNum",
    "lastTransactionBookingDate",
    "accountSubProductName"
})
public class AccountInfoType {

    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    protected CustomerInfoType customerInfo;
    protected String accountNum;
    protected String accountComment;
    protected String accountName;
    protected String accountType;
    protected String accountTypeName;
    protected String accountCurrency;
    protected String accountOpeningAmount;
    protected String accountBalance;
    protected String accountBalanceAvailable;
    protected String accountExchangeBalanceEQV;
    protected String accountOpenDate;
    protected String accountMaturityDate;
    protected String accountStatus;
    protected String accountClassMinBalance;
    protected String accountClassName;
    protected String accountClassCode;
    protected String accountInterestRate;
    protected String accountInterest;
    protected String accountOpenBranchCode;
    protected String accountOpenBranchName;
    protected String accountLatestTransDate;
    protected String accountOverdraftDate;
    protected String accountOverdraftExpiredDate;
    protected String accountOverdraftLimit;
    protected String accountAuthorizedStatus;
    protected String accountDelegatedPerson;
    protected String accountCoownerName;
    protected String accountTerm;
    protected String accountAccrued;
    protected String savingApplicationInterest;
    protected String accountSavingSerials;
    protected String accountRolloverAmount;
    protected String accountStaffCode;
    protected String srcAccountNum;
    protected String accountNarrative;
    protected List<PayoutType> payout;
    protected RedemptionType redemption;
    protected String terminationType;
    protected String accountExpectedAmount;
    protected List<PayinType> payin;
    protected String accountOfficialOpenDate;
    protected String accountInterestReceivableType;
    protected String accountLatestReceivableDate;
    protected String accountLockReason;
    protected String accountLockDate;
    protected String accountLockExpireDate;
    protected String accountLockStatus;
    protected String accountLockStatName;
    protected String accountMorgateType;
    protected String accountMorgateLimit;
    protected String accountMorgateLimitType;
    protected String accountSheetBalance;
    protected String accountDebtGroup;
    protected String tdBookAccount;
    protected String bookAccBRN;
    protected String accountAutoRollType;
    protected String accountRollType;
    protected BranchInfoType accountOpenBranchInfo;
    protected BranchInfoType accountManageBranchInfo;
    protected String accountInterestOnRedeem;
    protected String accountLockAmount;
    protected String accountAutoCapitalization;
    protected String accountAutoRollover;
    protected String accountAutoRolloverDate;
    protected String accountNextDayOfRollover;
    protected String accountPenaltyOnRedeem;
    protected String accountPeriodCount;
    protected String accountPeriodUnit;
    protected String accountPrincipalDecreasePossible;
    protected String accountPrincipalIncreasePossible;
    protected String accountAccrueStartDate;
    protected String accountPricipalAmount;
    protected String accountPostingRestrictions;
    protected String accountDeliveryMethod;
    protected String accountInterestPeriodEnd;
    protected String accountInterestPeriodStart;
    protected String accountSubProductCode;
    protected String accountAvailableFundValue;
    protected String accountAvailableFundDate;
    protected String accountAbbreviationName;
    protected String accountLedgerBalance;
    protected String accountCategoryID;
    protected String accountChargesPackageName;
    protected String accountAutoCapitallisationChangePos;
    protected String accountAutoRolloverChangePos;
    protected String accountPlaChangePos;
    protected String accountIlaChangePos;
    protected String accountIbRedeemDepositPos;
    protected String accountPrematureInterestRate;
    protected String accountPromotionCode;
    protected String accountDeclaredMonthlyInPayment;
    protected String accountIbanNumber;
    protected String accountPurpose;
    protected String accountEmissionName;
    protected String accountEmissionId;
    protected String accountFlexProductClass;
    protected String accountFlexProductId;
    protected String accountInstructionOnDispensation;
    protected String accountInterestBasis;
    protected String accountMISInterestRate;
    protected String accountPremiumRate;
    protected String accountSettleAmtOnRedeem;
    protected String accountSuspiciousFlag;
    protected String accountTaxInterestKey;
    protected String accountTaxInterestRate;
    protected String accountTotalTaxAmount;
    protected String accountCampaignId;
    protected String accountPeriodFrequency;
    protected String accountFirstReceivableDate;
    protected String accountNarratives;
    protected List<InterestCalculationType> creditInterestCalculation;
    protected InterestCaptialisationType creditInterestCaptialisation;
    protected InterestCaptialisationType debitInterestCaptialisation;
    protected List<InterestCalculationType> debitInterestCalculation;
    protected List<AttachedCardType> attachedCard;
    protected LastMinimalAmountDueType lastMinimalAmountDue;
    protected List<LimitBriefType> limitBrief;
    protected List<AccountBalanceInfoType> accountBalanceInfo;
    protected List<InterestCaptialisationType> creditAddIntCapitalisation;
    protected StatementGenerationInfoType accountStatementGeneration;
    protected String accountEndDate;
    protected String accountSmsApproval;
    protected String accountFrequencyAmount;
    protected String depositType;
    protected String periodicDrawdownAccount;
    protected String periodicTransferDescription;
    protected String termPeriodFrequency;
    protected String initialTransferDescription;
    protected String accountResolver;
    protected String accountOpenType;
    protected String accountPackage;
    protected String accountNostroNum;
    protected String lastTransactionBookingDate;
    protected String accountSubProductName;

    /**
     * Gets the value of the cifInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CIFInfoType }
     *     
     */
    public CIFInfoType getCIFInfo() {
        return cifInfo;
    }

    /**
     * Sets the value of the cifInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIFInfoType }
     *     
     */
    public void setCIFInfo(CIFInfoType value) {
        this.cifInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomerInfo(CustomerInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the accountComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountComment() {
        return accountComment;
    }

    /**
     * Sets the value of the accountComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountComment(String value) {
        this.accountComment = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeName() {
        return accountTypeName;
    }

    /**
     * Sets the value of the accountTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeName(String value) {
        this.accountTypeName = value;
    }

    /**
     * Gets the value of the accountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCurrency() {
        return accountCurrency;
    }

    /**
     * Sets the value of the accountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCurrency(String value) {
        this.accountCurrency = value;
    }

    /**
     * Gets the value of the accountOpeningAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOpeningAmount() {
        return accountOpeningAmount;
    }

    /**
     * Sets the value of the accountOpeningAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpeningAmount(String value) {
        this.accountOpeningAmount = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the accountBalanceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceAvailable() {
        return accountBalanceAvailable;
    }

    /**
     * Sets the value of the accountBalanceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceAvailable(String value) {
        this.accountBalanceAvailable = value;
    }

    /**
     * Gets the value of the accountExchangeBalanceEQV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountExchangeBalanceEQV() {
        return accountExchangeBalanceEQV;
    }

    /**
     * Sets the value of the accountExchangeBalanceEQV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountExchangeBalanceEQV(String value) {
        this.accountExchangeBalanceEQV = value;
    }

    /**
     * Gets the value of the accountOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOpenDate() {
        return accountOpenDate;
    }

    /**
     * Sets the value of the accountOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpenDate(String value) {
        this.accountOpenDate = value;
    }

    /**
     * Gets the value of the accountMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMaturityDate() {
        return accountMaturityDate;
    }

    /**
     * Sets the value of the accountMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMaturityDate(String value) {
        this.accountMaturityDate = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the accountClassMinBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountClassMinBalance() {
        return accountClassMinBalance;
    }

    /**
     * Sets the value of the accountClassMinBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountClassMinBalance(String value) {
        this.accountClassMinBalance = value;
    }

    /**
     * Gets the value of the accountClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountClassName() {
        return accountClassName;
    }

    /**
     * Sets the value of the accountClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountClassName(String value) {
        this.accountClassName = value;
    }

    /**
     * Gets the value of the accountClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountClassCode() {
        return accountClassCode;
    }

    /**
     * Sets the value of the accountClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountClassCode(String value) {
        this.accountClassCode = value;
    }

    /**
     * Gets the value of the accountInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterestRate() {
        return accountInterestRate;
    }

    /**
     * Sets the value of the accountInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterestRate(String value) {
        this.accountInterestRate = value;
    }

    /**
     * Gets the value of the accountInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterest() {
        return accountInterest;
    }

    /**
     * Sets the value of the accountInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterest(String value) {
        this.accountInterest = value;
    }

    /**
     * Gets the value of the accountOpenBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOpenBranchCode() {
        return accountOpenBranchCode;
    }

    /**
     * Sets the value of the accountOpenBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpenBranchCode(String value) {
        this.accountOpenBranchCode = value;
    }

    /**
     * Gets the value of the accountOpenBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOpenBranchName() {
        return accountOpenBranchName;
    }

    /**
     * Sets the value of the accountOpenBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpenBranchName(String value) {
        this.accountOpenBranchName = value;
    }

    /**
     * Gets the value of the accountLatestTransDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLatestTransDate() {
        return accountLatestTransDate;
    }

    /**
     * Sets the value of the accountLatestTransDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLatestTransDate(String value) {
        this.accountLatestTransDate = value;
    }

    /**
     * Gets the value of the accountOverdraftDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOverdraftDate() {
        return accountOverdraftDate;
    }

    /**
     * Sets the value of the accountOverdraftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOverdraftDate(String value) {
        this.accountOverdraftDate = value;
    }

    /**
     * Gets the value of the accountOverdraftExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOverdraftExpiredDate() {
        return accountOverdraftExpiredDate;
    }

    /**
     * Sets the value of the accountOverdraftExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOverdraftExpiredDate(String value) {
        this.accountOverdraftExpiredDate = value;
    }

    /**
     * Gets the value of the accountOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOverdraftLimit() {
        return accountOverdraftLimit;
    }

    /**
     * Sets the value of the accountOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOverdraftLimit(String value) {
        this.accountOverdraftLimit = value;
    }

    /**
     * Gets the value of the accountAuthorizedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAuthorizedStatus() {
        return accountAuthorizedStatus;
    }

    /**
     * Sets the value of the accountAuthorizedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAuthorizedStatus(String value) {
        this.accountAuthorizedStatus = value;
    }

    /**
     * Gets the value of the accountDelegatedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDelegatedPerson() {
        return accountDelegatedPerson;
    }

    /**
     * Sets the value of the accountDelegatedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDelegatedPerson(String value) {
        this.accountDelegatedPerson = value;
    }

    /**
     * Gets the value of the accountCoownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCoownerName() {
        return accountCoownerName;
    }

    /**
     * Sets the value of the accountCoownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCoownerName(String value) {
        this.accountCoownerName = value;
    }

    /**
     * Gets the value of the accountTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTerm() {
        return accountTerm;
    }

    /**
     * Sets the value of the accountTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTerm(String value) {
        this.accountTerm = value;
    }

    /**
     * Gets the value of the accountAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAccrued() {
        return accountAccrued;
    }

    /**
     * Sets the value of the accountAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAccrued(String value) {
        this.accountAccrued = value;
    }

    /**
     * Gets the value of the savingApplicationInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavingApplicationInterest() {
        return savingApplicationInterest;
    }

    /**
     * Sets the value of the savingApplicationInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavingApplicationInterest(String value) {
        this.savingApplicationInterest = value;
    }

    /**
     * Gets the value of the accountSavingSerials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSavingSerials() {
        return accountSavingSerials;
    }

    /**
     * Sets the value of the accountSavingSerials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSavingSerials(String value) {
        this.accountSavingSerials = value;
    }

    /**
     * Gets the value of the accountRolloverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRolloverAmount() {
        return accountRolloverAmount;
    }

    /**
     * Sets the value of the accountRolloverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRolloverAmount(String value) {
        this.accountRolloverAmount = value;
    }

    /**
     * Gets the value of the accountStaffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStaffCode() {
        return accountStaffCode;
    }

    /**
     * Sets the value of the accountStaffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStaffCode(String value) {
        this.accountStaffCode = value;
    }

    /**
     * Gets the value of the srcAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAccountNum() {
        return srcAccountNum;
    }

    /**
     * Sets the value of the srcAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAccountNum(String value) {
        this.srcAccountNum = value;
    }

    /**
     * Gets the value of the accountNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNarrative() {
        return accountNarrative;
    }

    /**
     * Sets the value of the accountNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNarrative(String value) {
        this.accountNarrative = value;
    }

    /**
     * Gets the value of the payout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayoutType }
     * 
     * 
     */
    public List<PayoutType> getPayout() {
        if (payout == null) {
            payout = new ArrayList<PayoutType>();
        }
        return this.payout;
    }

    /**
     * Gets the value of the redemption property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionType }
     *     
     */
    public RedemptionType getRedemption() {
        return redemption;
    }

    /**
     * Sets the value of the redemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionType }
     *     
     */
    public void setRedemption(RedemptionType value) {
        this.redemption = value;
    }

    /**
     * Gets the value of the terminationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationType() {
        return terminationType;
    }

    /**
     * Sets the value of the terminationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationType(String value) {
        this.terminationType = value;
    }

    /**
     * Gets the value of the accountExpectedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountExpectedAmount() {
        return accountExpectedAmount;
    }

    /**
     * Sets the value of the accountExpectedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountExpectedAmount(String value) {
        this.accountExpectedAmount = value;
    }

    /**
     * Gets the value of the payin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayinType }
     * 
     * 
     */
    public List<PayinType> getPayin() {
        if (payin == null) {
            payin = new ArrayList<PayinType>();
        }
        return this.payin;
    }

    /**
     * Gets the value of the accountOfficialOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfficialOpenDate() {
        return accountOfficialOpenDate;
    }

    /**
     * Sets the value of the accountOfficialOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfficialOpenDate(String value) {
        this.accountOfficialOpenDate = value;
    }

    /**
     * Gets the value of the accountInterestReceivableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterestReceivableType() {
        return accountInterestReceivableType;
    }

    /**
     * Sets the value of the accountInterestReceivableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterestReceivableType(String value) {
        this.accountInterestReceivableType = value;
    }

    /**
     * Gets the value of the accountLatestReceivableDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLatestReceivableDate() {
        return accountLatestReceivableDate;
    }

    /**
     * Sets the value of the accountLatestReceivableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLatestReceivableDate(String value) {
        this.accountLatestReceivableDate = value;
    }

    /**
     * Gets the value of the accountLockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLockReason() {
        return accountLockReason;
    }

    /**
     * Sets the value of the accountLockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLockReason(String value) {
        this.accountLockReason = value;
    }

    /**
     * Gets the value of the accountLockDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLockDate() {
        return accountLockDate;
    }

    /**
     * Sets the value of the accountLockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLockDate(String value) {
        this.accountLockDate = value;
    }

    /**
     * Gets the value of the accountLockExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLockExpireDate() {
        return accountLockExpireDate;
    }

    /**
     * Sets the value of the accountLockExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLockExpireDate(String value) {
        this.accountLockExpireDate = value;
    }

    /**
     * Gets the value of the accountLockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLockStatus() {
        return accountLockStatus;
    }

    /**
     * Sets the value of the accountLockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLockStatus(String value) {
        this.accountLockStatus = value;
    }

    /**
     * Gets the value of the accountLockStatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLockStatName() {
        return accountLockStatName;
    }

    /**
     * Sets the value of the accountLockStatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLockStatName(String value) {
        this.accountLockStatName = value;
    }

    /**
     * Gets the value of the accountMorgateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMorgateType() {
        return accountMorgateType;
    }

    /**
     * Sets the value of the accountMorgateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMorgateType(String value) {
        this.accountMorgateType = value;
    }

    /**
     * Gets the value of the accountMorgateLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMorgateLimit() {
        return accountMorgateLimit;
    }

    /**
     * Sets the value of the accountMorgateLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMorgateLimit(String value) {
        this.accountMorgateLimit = value;
    }

    /**
     * Gets the value of the accountMorgateLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMorgateLimitType() {
        return accountMorgateLimitType;
    }

    /**
     * Sets the value of the accountMorgateLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMorgateLimitType(String value) {
        this.accountMorgateLimitType = value;
    }

    /**
     * Gets the value of the accountSheetBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSheetBalance() {
        return accountSheetBalance;
    }

    /**
     * Sets the value of the accountSheetBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSheetBalance(String value) {
        this.accountSheetBalance = value;
    }

    /**
     * Gets the value of the accountDebtGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDebtGroup() {
        return accountDebtGroup;
    }

    /**
     * Sets the value of the accountDebtGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDebtGroup(String value) {
        this.accountDebtGroup = value;
    }

    /**
     * Gets the value of the tdBookAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdBookAccount() {
        return tdBookAccount;
    }

    /**
     * Sets the value of the tdBookAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdBookAccount(String value) {
        this.tdBookAccount = value;
    }

    /**
     * Gets the value of the bookAccBRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookAccBRN() {
        return bookAccBRN;
    }

    /**
     * Sets the value of the bookAccBRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookAccBRN(String value) {
        this.bookAccBRN = value;
    }

    /**
     * Gets the value of the accountAutoRollType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAutoRollType() {
        return accountAutoRollType;
    }

    /**
     * Sets the value of the accountAutoRollType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAutoRollType(String value) {
        this.accountAutoRollType = value;
    }

    /**
     * Gets the value of the accountRollType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRollType() {
        return accountRollType;
    }

    /**
     * Sets the value of the accountRollType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRollType(String value) {
        this.accountRollType = value;
    }

    /**
     * Gets the value of the accountOpenBranchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BranchInfoType }
     *     
     */
    public BranchInfoType getAccountOpenBranchInfo() {
        return accountOpenBranchInfo;
    }

    /**
     * Sets the value of the accountOpenBranchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchInfoType }
     *     
     */
    public void setAccountOpenBranchInfo(BranchInfoType value) {
        this.accountOpenBranchInfo = value;
    }

    /**
     * Gets the value of the accountManageBranchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BranchInfoType }
     *     
     */
    public BranchInfoType getAccountManageBranchInfo() {
        return accountManageBranchInfo;
    }

    /**
     * Sets the value of the accountManageBranchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchInfoType }
     *     
     */
    public void setAccountManageBranchInfo(BranchInfoType value) {
        this.accountManageBranchInfo = value;
    }

    /**
     * Gets the value of the accountInterestOnRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterestOnRedeem() {
        return accountInterestOnRedeem;
    }

    /**
     * Sets the value of the accountInterestOnRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterestOnRedeem(String value) {
        this.accountInterestOnRedeem = value;
    }

    /**
     * Gets the value of the accountLockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLockAmount() {
        return accountLockAmount;
    }

    /**
     * Sets the value of the accountLockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLockAmount(String value) {
        this.accountLockAmount = value;
    }

    /**
     * Gets the value of the accountAutoCapitalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAutoCapitalization() {
        return accountAutoCapitalization;
    }

    /**
     * Sets the value of the accountAutoCapitalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAutoCapitalization(String value) {
        this.accountAutoCapitalization = value;
    }

    /**
     * Gets the value of the accountAutoRollover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAutoRollover() {
        return accountAutoRollover;
    }

    /**
     * Sets the value of the accountAutoRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAutoRollover(String value) {
        this.accountAutoRollover = value;
    }

    /**
     * Gets the value of the accountAutoRolloverDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAutoRolloverDate() {
        return accountAutoRolloverDate;
    }

    /**
     * Sets the value of the accountAutoRolloverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAutoRolloverDate(String value) {
        this.accountAutoRolloverDate = value;
    }

    /**
     * Gets the value of the accountNextDayOfRollover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNextDayOfRollover() {
        return accountNextDayOfRollover;
    }

    /**
     * Sets the value of the accountNextDayOfRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNextDayOfRollover(String value) {
        this.accountNextDayOfRollover = value;
    }

    /**
     * Gets the value of the accountPenaltyOnRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPenaltyOnRedeem() {
        return accountPenaltyOnRedeem;
    }

    /**
     * Sets the value of the accountPenaltyOnRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPenaltyOnRedeem(String value) {
        this.accountPenaltyOnRedeem = value;
    }

    /**
     * Gets the value of the accountPeriodCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPeriodCount() {
        return accountPeriodCount;
    }

    /**
     * Sets the value of the accountPeriodCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPeriodCount(String value) {
        this.accountPeriodCount = value;
    }

    /**
     * Gets the value of the accountPeriodUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPeriodUnit() {
        return accountPeriodUnit;
    }

    /**
     * Sets the value of the accountPeriodUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPeriodUnit(String value) {
        this.accountPeriodUnit = value;
    }

    /**
     * Gets the value of the accountPrincipalDecreasePossible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrincipalDecreasePossible() {
        return accountPrincipalDecreasePossible;
    }

    /**
     * Sets the value of the accountPrincipalDecreasePossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrincipalDecreasePossible(String value) {
        this.accountPrincipalDecreasePossible = value;
    }

    /**
     * Gets the value of the accountPrincipalIncreasePossible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrincipalIncreasePossible() {
        return accountPrincipalIncreasePossible;
    }

    /**
     * Sets the value of the accountPrincipalIncreasePossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrincipalIncreasePossible(String value) {
        this.accountPrincipalIncreasePossible = value;
    }

    /**
     * Gets the value of the accountAccrueStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAccrueStartDate() {
        return accountAccrueStartDate;
    }

    /**
     * Sets the value of the accountAccrueStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAccrueStartDate(String value) {
        this.accountAccrueStartDate = value;
    }

    /**
     * Gets the value of the accountPricipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPricipalAmount() {
        return accountPricipalAmount;
    }

    /**
     * Sets the value of the accountPricipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPricipalAmount(String value) {
        this.accountPricipalAmount = value;
    }

    /**
     * Gets the value of the accountPostingRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPostingRestrictions() {
        return accountPostingRestrictions;
    }

    /**
     * Sets the value of the accountPostingRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPostingRestrictions(String value) {
        this.accountPostingRestrictions = value;
    }

    /**
     * Gets the value of the accountDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDeliveryMethod() {
        return accountDeliveryMethod;
    }

    /**
     * Sets the value of the accountDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDeliveryMethod(String value) {
        this.accountDeliveryMethod = value;
    }

    /**
     * Gets the value of the accountInterestPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterestPeriodEnd() {
        return accountInterestPeriodEnd;
    }

    /**
     * Sets the value of the accountInterestPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterestPeriodEnd(String value) {
        this.accountInterestPeriodEnd = value;
    }

    /**
     * Gets the value of the accountInterestPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterestPeriodStart() {
        return accountInterestPeriodStart;
    }

    /**
     * Sets the value of the accountInterestPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterestPeriodStart(String value) {
        this.accountInterestPeriodStart = value;
    }

    /**
     * Gets the value of the accountSubProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSubProductCode() {
        return accountSubProductCode;
    }

    /**
     * Sets the value of the accountSubProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSubProductCode(String value) {
        this.accountSubProductCode = value;
    }

    /**
     * Gets the value of the accountAvailableFundValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAvailableFundValue() {
        return accountAvailableFundValue;
    }

    /**
     * Sets the value of the accountAvailableFundValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAvailableFundValue(String value) {
        this.accountAvailableFundValue = value;
    }

    /**
     * Gets the value of the accountAvailableFundDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAvailableFundDate() {
        return accountAvailableFundDate;
    }

    /**
     * Sets the value of the accountAvailableFundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAvailableFundDate(String value) {
        this.accountAvailableFundDate = value;
    }

    /**
     * Gets the value of the accountAbbreviationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAbbreviationName() {
        return accountAbbreviationName;
    }

    /**
     * Sets the value of the accountAbbreviationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAbbreviationName(String value) {
        this.accountAbbreviationName = value;
    }

    /**
     * Gets the value of the accountLedgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLedgerBalance() {
        return accountLedgerBalance;
    }

    /**
     * Sets the value of the accountLedgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLedgerBalance(String value) {
        this.accountLedgerBalance = value;
    }

    /**
     * Gets the value of the accountCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCategoryID() {
        return accountCategoryID;
    }

    /**
     * Sets the value of the accountCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCategoryID(String value) {
        this.accountCategoryID = value;
    }

    /**
     * Gets the value of the accountChargesPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountChargesPackageName() {
        return accountChargesPackageName;
    }

    /**
     * Sets the value of the accountChargesPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountChargesPackageName(String value) {
        this.accountChargesPackageName = value;
    }

    /**
     * Gets the value of the accountAutoCapitallisationChangePos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAutoCapitallisationChangePos() {
        return accountAutoCapitallisationChangePos;
    }

    /**
     * Sets the value of the accountAutoCapitallisationChangePos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAutoCapitallisationChangePos(String value) {
        this.accountAutoCapitallisationChangePos = value;
    }

    /**
     * Gets the value of the accountAutoRolloverChangePos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAutoRolloverChangePos() {
        return accountAutoRolloverChangePos;
    }

    /**
     * Sets the value of the accountAutoRolloverChangePos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAutoRolloverChangePos(String value) {
        this.accountAutoRolloverChangePos = value;
    }

    /**
     * Gets the value of the accountPlaChangePos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPlaChangePos() {
        return accountPlaChangePos;
    }

    /**
     * Sets the value of the accountPlaChangePos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPlaChangePos(String value) {
        this.accountPlaChangePos = value;
    }

    /**
     * Gets the value of the accountIlaChangePos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIlaChangePos() {
        return accountIlaChangePos;
    }

    /**
     * Sets the value of the accountIlaChangePos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIlaChangePos(String value) {
        this.accountIlaChangePos = value;
    }

    /**
     * Gets the value of the accountIbRedeemDepositPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIbRedeemDepositPos() {
        return accountIbRedeemDepositPos;
    }

    /**
     * Sets the value of the accountIbRedeemDepositPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIbRedeemDepositPos(String value) {
        this.accountIbRedeemDepositPos = value;
    }

    /**
     * Gets the value of the accountPrematureInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrematureInterestRate() {
        return accountPrematureInterestRate;
    }

    /**
     * Sets the value of the accountPrematureInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrematureInterestRate(String value) {
        this.accountPrematureInterestRate = value;
    }

    /**
     * Gets the value of the accountPromotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPromotionCode() {
        return accountPromotionCode;
    }

    /**
     * Sets the value of the accountPromotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPromotionCode(String value) {
        this.accountPromotionCode = value;
    }

    /**
     * Gets the value of the accountDeclaredMonthlyInPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDeclaredMonthlyInPayment() {
        return accountDeclaredMonthlyInPayment;
    }

    /**
     * Sets the value of the accountDeclaredMonthlyInPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDeclaredMonthlyInPayment(String value) {
        this.accountDeclaredMonthlyInPayment = value;
    }

    /**
     * Gets the value of the accountIbanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIbanNumber() {
        return accountIbanNumber;
    }

    /**
     * Sets the value of the accountIbanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIbanNumber(String value) {
        this.accountIbanNumber = value;
    }

    /**
     * Gets the value of the accountPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPurpose() {
        return accountPurpose;
    }

    /**
     * Sets the value of the accountPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPurpose(String value) {
        this.accountPurpose = value;
    }

    /**
     * Gets the value of the accountEmissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEmissionName() {
        return accountEmissionName;
    }

    /**
     * Sets the value of the accountEmissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEmissionName(String value) {
        this.accountEmissionName = value;
    }

    /**
     * Gets the value of the accountEmissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEmissionId() {
        return accountEmissionId;
    }

    /**
     * Sets the value of the accountEmissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEmissionId(String value) {
        this.accountEmissionId = value;
    }

    /**
     * Gets the value of the accountFlexProductClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlexProductClass() {
        return accountFlexProductClass;
    }

    /**
     * Sets the value of the accountFlexProductClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlexProductClass(String value) {
        this.accountFlexProductClass = value;
    }

    /**
     * Gets the value of the accountFlexProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlexProductId() {
        return accountFlexProductId;
    }

    /**
     * Sets the value of the accountFlexProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlexProductId(String value) {
        this.accountFlexProductId = value;
    }

    /**
     * Gets the value of the accountInstructionOnDispensation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInstructionOnDispensation() {
        return accountInstructionOnDispensation;
    }

    /**
     * Sets the value of the accountInstructionOnDispensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInstructionOnDispensation(String value) {
        this.accountInstructionOnDispensation = value;
    }

    /**
     * Gets the value of the accountInterestBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInterestBasis() {
        return accountInterestBasis;
    }

    /**
     * Sets the value of the accountInterestBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInterestBasis(String value) {
        this.accountInterestBasis = value;
    }

    /**
     * Gets the value of the accountMISInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMISInterestRate() {
        return accountMISInterestRate;
    }

    /**
     * Sets the value of the accountMISInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMISInterestRate(String value) {
        this.accountMISInterestRate = value;
    }

    /**
     * Gets the value of the accountPremiumRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPremiumRate() {
        return accountPremiumRate;
    }

    /**
     * Sets the value of the accountPremiumRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPremiumRate(String value) {
        this.accountPremiumRate = value;
    }

    /**
     * Gets the value of the accountSettleAmtOnRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSettleAmtOnRedeem() {
        return accountSettleAmtOnRedeem;
    }

    /**
     * Sets the value of the accountSettleAmtOnRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSettleAmtOnRedeem(String value) {
        this.accountSettleAmtOnRedeem = value;
    }

    /**
     * Gets the value of the accountSuspiciousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSuspiciousFlag() {
        return accountSuspiciousFlag;
    }

    /**
     * Sets the value of the accountSuspiciousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSuspiciousFlag(String value) {
        this.accountSuspiciousFlag = value;
    }

    /**
     * Gets the value of the accountTaxInterestKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTaxInterestKey() {
        return accountTaxInterestKey;
    }

    /**
     * Sets the value of the accountTaxInterestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTaxInterestKey(String value) {
        this.accountTaxInterestKey = value;
    }

    /**
     * Gets the value of the accountTaxInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTaxInterestRate() {
        return accountTaxInterestRate;
    }

    /**
     * Sets the value of the accountTaxInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTaxInterestRate(String value) {
        this.accountTaxInterestRate = value;
    }

    /**
     * Gets the value of the accountTotalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTotalTaxAmount() {
        return accountTotalTaxAmount;
    }

    /**
     * Sets the value of the accountTotalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTotalTaxAmount(String value) {
        this.accountTotalTaxAmount = value;
    }

    /**
     * Gets the value of the accountCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCampaignId() {
        return accountCampaignId;
    }

    /**
     * Sets the value of the accountCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCampaignId(String value) {
        this.accountCampaignId = value;
    }

    /**
     * Gets the value of the accountPeriodFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPeriodFrequency() {
        return accountPeriodFrequency;
    }

    /**
     * Sets the value of the accountPeriodFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPeriodFrequency(String value) {
        this.accountPeriodFrequency = value;
    }

    /**
     * Gets the value of the accountFirstReceivableDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFirstReceivableDate() {
        return accountFirstReceivableDate;
    }

    /**
     * Sets the value of the accountFirstReceivableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFirstReceivableDate(String value) {
        this.accountFirstReceivableDate = value;
    }

    /**
     * Gets the value of the accountNarratives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNarratives() {
        return accountNarratives;
    }

    /**
     * Sets the value of the accountNarratives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNarratives(String value) {
        this.accountNarratives = value;
    }

    /**
     * Gets the value of the creditInterestCalculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditInterestCalculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditInterestCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestCalculationType }
     * 
     * 
     */
    public List<InterestCalculationType> getCreditInterestCalculation() {
        if (creditInterestCalculation == null) {
            creditInterestCalculation = new ArrayList<InterestCalculationType>();
        }
        return this.creditInterestCalculation;
    }

    /**
     * Gets the value of the creditInterestCaptialisation property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCaptialisationType }
     *     
     */
    public InterestCaptialisationType getCreditInterestCaptialisation() {
        return creditInterestCaptialisation;
    }

    /**
     * Sets the value of the creditInterestCaptialisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCaptialisationType }
     *     
     */
    public void setCreditInterestCaptialisation(InterestCaptialisationType value) {
        this.creditInterestCaptialisation = value;
    }

    /**
     * Gets the value of the debitInterestCaptialisation property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCaptialisationType }
     *     
     */
    public InterestCaptialisationType getDebitInterestCaptialisation() {
        return debitInterestCaptialisation;
    }

    /**
     * Sets the value of the debitInterestCaptialisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCaptialisationType }
     *     
     */
    public void setDebitInterestCaptialisation(InterestCaptialisationType value) {
        this.debitInterestCaptialisation = value;
    }

    /**
     * Gets the value of the debitInterestCalculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debitInterestCalculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebitInterestCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestCalculationType }
     * 
     * 
     */
    public List<InterestCalculationType> getDebitInterestCalculation() {
        if (debitInterestCalculation == null) {
            debitInterestCalculation = new ArrayList<InterestCalculationType>();
        }
        return this.debitInterestCalculation;
    }

    /**
     * Gets the value of the attachedCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedCardType }
     * 
     * 
     */
    public List<AttachedCardType> getAttachedCard() {
        if (attachedCard == null) {
            attachedCard = new ArrayList<AttachedCardType>();
        }
        return this.attachedCard;
    }

    /**
     * Gets the value of the lastMinimalAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link LastMinimalAmountDueType }
     *     
     */
    public LastMinimalAmountDueType getLastMinimalAmountDue() {
        return lastMinimalAmountDue;
    }

    /**
     * Sets the value of the lastMinimalAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMinimalAmountDueType }
     *     
     */
    public void setLastMinimalAmountDue(LastMinimalAmountDueType value) {
        this.lastMinimalAmountDue = value;
    }

    /**
     * Gets the value of the limitBrief property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitBrief property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitBrief().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitBriefType }
     * 
     * 
     */
    public List<LimitBriefType> getLimitBrief() {
        if (limitBrief == null) {
            limitBrief = new ArrayList<LimitBriefType>();
        }
        return this.limitBrief;
    }

    /**
     * Gets the value of the accountBalanceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountBalanceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountBalanceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalanceInfoType }
     * 
     * 
     */
    public List<AccountBalanceInfoType> getAccountBalanceInfo() {
        if (accountBalanceInfo == null) {
            accountBalanceInfo = new ArrayList<AccountBalanceInfoType>();
        }
        return this.accountBalanceInfo;
    }

    /**
     * Gets the value of the creditAddIntCapitalisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditAddIntCapitalisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditAddIntCapitalisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestCaptialisationType }
     * 
     * 
     */
    public List<InterestCaptialisationType> getCreditAddIntCapitalisation() {
        if (creditAddIntCapitalisation == null) {
            creditAddIntCapitalisation = new ArrayList<InterestCaptialisationType>();
        }
        return this.creditAddIntCapitalisation;
    }

    /**
     * Gets the value of the accountStatementGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link StatementGenerationInfoType }
     *     
     */
    public StatementGenerationInfoType getAccountStatementGeneration() {
        return accountStatementGeneration;
    }

    /**
     * Sets the value of the accountStatementGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementGenerationInfoType }
     *     
     */
    public void setAccountStatementGeneration(StatementGenerationInfoType value) {
        this.accountStatementGeneration = value;
    }

    /**
     * Gets the value of the accountEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEndDate() {
        return accountEndDate;
    }

    /**
     * Sets the value of the accountEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEndDate(String value) {
        this.accountEndDate = value;
    }

    /**
     * Gets the value of the accountSmsApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSmsApproval() {
        return accountSmsApproval;
    }

    /**
     * Sets the value of the accountSmsApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSmsApproval(String value) {
        this.accountSmsApproval = value;
    }

    /**
     * Gets the value of the accountFrequencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFrequencyAmount() {
        return accountFrequencyAmount;
    }

    /**
     * Sets the value of the accountFrequencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFrequencyAmount(String value) {
        this.accountFrequencyAmount = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
    }

    /**
     * Gets the value of the periodicDrawdownAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicDrawdownAccount() {
        return periodicDrawdownAccount;
    }

    /**
     * Sets the value of the periodicDrawdownAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicDrawdownAccount(String value) {
        this.periodicDrawdownAccount = value;
    }

    /**
     * Gets the value of the periodicTransferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicTransferDescription() {
        return periodicTransferDescription;
    }

    /**
     * Sets the value of the periodicTransferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicTransferDescription(String value) {
        this.periodicTransferDescription = value;
    }

    /**
     * Gets the value of the termPeriodFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermPeriodFrequency() {
        return termPeriodFrequency;
    }

    /**
     * Sets the value of the termPeriodFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermPeriodFrequency(String value) {
        this.termPeriodFrequency = value;
    }

    /**
     * Gets the value of the initialTransferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialTransferDescription() {
        return initialTransferDescription;
    }

    /**
     * Sets the value of the initialTransferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialTransferDescription(String value) {
        this.initialTransferDescription = value;
    }

    /**
     * Gets the value of the accountResolver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountResolver() {
        return accountResolver;
    }

    /**
     * Sets the value of the accountResolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountResolver(String value) {
        this.accountResolver = value;
    }

    /**
     * Gets the value of the accountOpenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOpenType() {
        return accountOpenType;
    }

    /**
     * Sets the value of the accountOpenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpenType(String value) {
        this.accountOpenType = value;
    }

    /**
     * Gets the value of the accountPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPackage() {
        return accountPackage;
    }

    /**
     * Sets the value of the accountPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPackage(String value) {
        this.accountPackage = value;
    }

    /**
     * Gets the value of the accountNostroNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNostroNum() {
        return accountNostroNum;
    }

    /**
     * Sets the value of the accountNostroNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNostroNum(String value) {
        this.accountNostroNum = value;
    }

    /**
     * Gets the value of the lastTransactionBookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTransactionBookingDate() {
        return lastTransactionBookingDate;
    }

    /**
     * Sets the value of the lastTransactionBookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTransactionBookingDate(String value) {
        this.lastTransactionBookingDate = value;
    }

    /**
     * Gets the value of the accountSubProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSubProductName() {
        return accountSubProductName;
    }

    /**
     * Sets the value of the accountSubProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSubProductName(String value) {
        this.accountSubProductName = value;
    }

}
