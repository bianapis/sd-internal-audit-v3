package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuditExchangeOutputModel
 */
public class BQAuditExchangeOutputModel   {
  private String auditPreconditions = null;

  private String auditAnalysisSchedule = null;

  private String auditVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String auditExchangeActionTaskReference = null;

  private Object auditExchangeActionTaskRecord = null;

  private String auditExchangeActionResponse = null;

  private String auditInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return auditPreconditions
  **/

  public String getAuditPreconditions() {
    return auditPreconditions;
  }

  public void setAuditPreconditions(String auditPreconditions) {
    this.auditPreconditions = auditPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return auditAnalysisSchedule
  **/

  public String getAuditAnalysisSchedule() {
    return auditAnalysisSchedule;
  }

  public void setAuditAnalysisSchedule(String auditAnalysisSchedule) {
    this.auditAnalysisSchedule = auditAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return auditVersionNumber
  **/

  public String getAuditVersionNumber() {
    return auditVersionNumber;
  }

  public void setAuditVersionNumber(String auditVersionNumber) {
    this.auditVersionNumber = auditVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Internal Audit Assessment specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return serviceType
  **/

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return serviceDescription
  **/

  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return serviceInputsandOuputs
  **/

  public String getServiceInputsandOuputs() {
    return serviceInputsandOuputs;
  }

  public void setServiceInputsandOuputs(String serviceInputsandOuputs) {
    this.serviceInputsandOuputs = serviceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return serviceWorkProduct
  **/

  public String getServiceWorkProduct() {
    return serviceWorkProduct;
  }

  public void setServiceWorkProduct(String serviceWorkProduct) {
    this.serviceWorkProduct = serviceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Audit instance exchange service call 
   * @return auditExchangeActionTaskReference
  **/

  public String getAuditExchangeActionTaskReference() {
    return auditExchangeActionTaskReference;
  }

  public void setAuditExchangeActionTaskReference(String auditExchangeActionTaskReference) {
    this.auditExchangeActionTaskReference = auditExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return auditExchangeActionTaskRecord
  **/

  public Object getAuditExchangeActionTaskRecord() {
    return auditExchangeActionTaskRecord;
  }

  public void setAuditExchangeActionTaskRecord(Object auditExchangeActionTaskRecord) {
    this.auditExchangeActionTaskRecord = auditExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return auditExchangeActionResponse
  **/

  public String getAuditExchangeActionResponse() {
    return auditExchangeActionResponse;
  }

  public void setAuditExchangeActionResponse(String auditExchangeActionResponse) {
    this.auditExchangeActionResponse = auditExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Audit instance (e.g. accepted, rejected, verified) 
   * @return auditInstanceStatus
  **/

  public String getAuditInstanceStatus() {
    return auditInstanceStatus;
  }

  public void setAuditInstanceStatus(String auditInstanceStatus) {
    this.auditInstanceStatus = auditInstanceStatus;
  }


}

