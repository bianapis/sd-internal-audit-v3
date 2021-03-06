package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentInitiateInputModel
 */
public class CRInternalAuditAssessmentInitiateInputModel   {
  private String internalAuditServicingSessionReference = null;

  private Object internalAuditAssessmentInitiateActionRecord = null;

  private String internalAuditAssessmentInstanceStatus = null;

  private String internalAuditAssessmentParameterType = null;

  private String internalAuditAssessmentSelectedOption = null;

  private String internalAuditAssessmentType = null;

  private String internalAuditAssessmentReference = null;

  private String internalAuditAssessmentRequest = null;

  private String internalAuditAssessmentSchedule = null;

  private String internalAuditAssessmentStatus = null;

  private String internalAuditAssessmentUsageLog = null;

  private String internalAuditAssessmentServiceProviderReference = null;

  private String internalAuditAssessmentRequesterReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return internalAuditServicingSessionReference
  **/

  public String getInternalAuditServicingSessionReference() {
    return internalAuditServicingSessionReference;
  }

  public void setInternalAuditServicingSessionReference(String internalAuditServicingSessionReference) {
    this.internalAuditServicingSessionReference = internalAuditServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return internalAuditAssessmentInitiateActionRecord
  **/

  public Object getInternalAuditAssessmentInitiateActionRecord() {
    return internalAuditAssessmentInitiateActionRecord;
  }

  public void setInternalAuditAssessmentInitiateActionRecord(Object internalAuditAssessmentInitiateActionRecord) {
    this.internalAuditAssessmentInitiateActionRecord = internalAuditAssessmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Internal Audit Assessment instance (e.g. initialised, pending, active) 
   * @return internalAuditAssessmentInstanceStatus
  **/

  public String getInternalAuditAssessmentInstanceStatus() {
    return internalAuditAssessmentInstanceStatus;
  }

  public void setInternalAuditAssessmentInstanceStatus(String internalAuditAssessmentInstanceStatus) {
    this.internalAuditAssessmentInstanceStatus = internalAuditAssessmentInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Assessments according to type of concern defined within Internal Audit Assessment . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc. 
   * @return internalAuditAssessmentParameterType
  **/

  public String getInternalAuditAssessmentParameterType() {
    return internalAuditAssessmentParameterType;
  }

  public void setInternalAuditAssessmentParameterType(String internalAuditAssessmentParameterType) {
    this.internalAuditAssessmentParameterType = internalAuditAssessmentParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of assessment 
   * @return internalAuditAssessmentSelectedOption
  **/

  public String getInternalAuditAssessmentSelectedOption() {
    return internalAuditAssessmentSelectedOption;
  }

  public void setInternalAuditAssessmentSelectedOption(String internalAuditAssessmentSelectedOption) {
    this.internalAuditAssessmentSelectedOption = internalAuditAssessmentSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Internal Audit Assessment 
   * @return internalAuditAssessmentType
  **/

  public String getInternalAuditAssessmentType() {
    return internalAuditAssessmentType;
  }

  public void setInternalAuditAssessmentType(String internalAuditAssessmentType) {
    this.internalAuditAssessmentType = internalAuditAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Internal Audit Assessment 
   * @return internalAuditAssessmentReference
  **/

  public String getInternalAuditAssessmentReference() {
    return internalAuditAssessmentReference;
  }

  public void setInternalAuditAssessmentReference(String internalAuditAssessmentReference) {
    this.internalAuditAssessmentReference = internalAuditAssessmentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to assess InternalAudit 
   * @return internalAuditAssessmentRequest
  **/

  public String getInternalAuditAssessmentRequest() {
    return internalAuditAssessmentRequest;
  }

  public void setInternalAuditAssessmentRequest(String internalAuditAssessmentRequest) {
    this.internalAuditAssessmentRequest = internalAuditAssessmentRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to assess InternalAudit 
   * @return internalAuditAssessmentSchedule
  **/

  public String getInternalAuditAssessmentSchedule() {
    return internalAuditAssessmentSchedule;
  }

  public void setInternalAuditAssessmentSchedule(String internalAuditAssessmentSchedule) {
    this.internalAuditAssessmentSchedule = internalAuditAssessmentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Internal Audit Assessment 
   * @return internalAuditAssessmentStatus
  **/

  public String getInternalAuditAssessmentStatus() {
    return internalAuditAssessmentStatus;
  }

  public void setInternalAuditAssessmentStatus(String internalAuditAssessmentStatus) {
    this.internalAuditAssessmentStatus = internalAuditAssessmentStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Internal Audit Assessment 
   * @return internalAuditAssessmentUsageLog
  **/

  public String getInternalAuditAssessmentUsageLog() {
    return internalAuditAssessmentUsageLog;
  }

  public void setInternalAuditAssessmentUsageLog(String internalAuditAssessmentUsageLog) {
    this.internalAuditAssessmentUsageLog = internalAuditAssessmentUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Internal Audit Assessment 
   * @return internalAuditAssessmentServiceProviderReference
  **/

  public String getInternalAuditAssessmentServiceProviderReference() {
    return internalAuditAssessmentServiceProviderReference;
  }

  public void setInternalAuditAssessmentServiceProviderReference(String internalAuditAssessmentServiceProviderReference) {
    this.internalAuditAssessmentServiceProviderReference = internalAuditAssessmentServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has requested Internal Audit Assessment 
   * @return internalAuditAssessmentRequesterReference
  **/

  public String getInternalAuditAssessmentRequesterReference() {
    return internalAuditAssessmentRequesterReference;
  }

  public void setInternalAuditAssessmentRequesterReference(String internalAuditAssessmentRequesterReference) {
    this.internalAuditAssessmentRequesterReference = internalAuditAssessmentRequesterReference;
  }


}

