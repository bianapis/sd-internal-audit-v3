package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInternalAuditAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQAuditRequestInputModel
 */
public class BQAuditRequestInputModel   {
  private String internalAuditAssessmentInstanceReference = null;

  private String auditInstanceReference = null;

  private String auditPreconditions = null;

  private String auditAnalysisSchedule = null;

  private String auditVersionNumber = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private Object auditRequestActionTaskRecord = null;

  private CRInternalAuditAssessmentRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Internal Audit Assessment instance 
   * @return internalAuditAssessmentInstanceReference
  **/

  public String getInternalAuditAssessmentInstanceReference() {
    return internalAuditAssessmentInstanceReference;
  }

  public void setInternalAuditAssessmentInstanceReference(String internalAuditAssessmentInstanceReference) {
    this.internalAuditAssessmentInstanceReference = internalAuditAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Audit instance 
   * @return auditInstanceReference
  **/

  public String getAuditInstanceReference() {
    return auditInstanceReference;
  }

  public void setAuditInstanceReference(String auditInstanceReference) {
    this.auditInstanceReference = auditInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return auditRequestActionTaskRecord
  **/

  public Object getAuditRequestActionTaskRecord() {
    return auditRequestActionTaskRecord;
  }

  public void setAuditRequestActionTaskRecord(Object auditRequestActionTaskRecord) {
    this.auditRequestActionTaskRecord = auditRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRInternalAuditAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRInternalAuditAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

