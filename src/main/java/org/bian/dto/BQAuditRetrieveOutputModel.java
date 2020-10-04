package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuditRetrieveOutputModelAuditInstanceAnalysis;
import org.bian.dto.BQAuditRetrieveOutputModelAuditInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveOutputModel
 */
public class BQAuditRetrieveOutputModel   {
  private String auditPreconditions = null;

  private String auditAnalysisSchedule = null;

  private String auditVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String auditRetrieveActionTaskReference = null;

  private Object auditRetrieveActionTaskRecord = null;

  private String auditRetrieveActionResponse = null;

  private BQAuditRetrieveOutputModelAuditInstanceReport auditInstanceReport = null;

  private BQAuditRetrieveOutputModelAuditInstanceAnalysis auditInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Audit instance retrieve service call 
   * @return auditRetrieveActionTaskReference
  **/

  public String getAuditRetrieveActionTaskReference() {
    return auditRetrieveActionTaskReference;
  }

  public void setAuditRetrieveActionTaskReference(String auditRetrieveActionTaskReference) {
    this.auditRetrieveActionTaskReference = auditRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return auditRetrieveActionTaskRecord
  **/

  public Object getAuditRetrieveActionTaskRecord() {
    return auditRetrieveActionTaskRecord;
  }

  public void setAuditRetrieveActionTaskRecord(Object auditRetrieveActionTaskRecord) {
    this.auditRetrieveActionTaskRecord = auditRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return auditRetrieveActionResponse
  **/

  public String getAuditRetrieveActionResponse() {
    return auditRetrieveActionResponse;
  }

  public void setAuditRetrieveActionResponse(String auditRetrieveActionResponse) {
    this.auditRetrieveActionResponse = auditRetrieveActionResponse;
  }


  /**
   * Get auditInstanceReport
   * @return auditInstanceReport
  **/

  public BQAuditRetrieveOutputModelAuditInstanceReport getAuditInstanceReport() {
    return auditInstanceReport;
  }

  public void setAuditInstanceReport(BQAuditRetrieveOutputModelAuditInstanceReport auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
  }


  /**
   * Get auditInstanceAnalysis
   * @return auditInstanceAnalysis
  **/

  public BQAuditRetrieveOutputModelAuditInstanceAnalysis getAuditInstanceAnalysis() {
    return auditInstanceAnalysis;
  }

  public void setAuditInstanceAnalysis(BQAuditRetrieveOutputModelAuditInstanceAnalysis auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
  }


}

