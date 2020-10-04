package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceAnalysis;
import org.bian.dto.CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRetrieveOutputModel
 */
public class CRInternalAuditAssessmentRetrieveOutputModel   {
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

  private String internalAuditAssessmentRetrieveActionTaskReference = null;

  private Object internalAuditAssessmentRetrieveActionTaskRecord = null;

  private String internalAuditAssessmentRetrieveActionResponse = null;

  private CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceReportRecord internalAuditAssessmentInstanceReportRecord = null;

  private CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceAnalysis internalAuditAssessmentInstanceAnalysis = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Audit Assessment instance retrieve service call 
   * @return internalAuditAssessmentRetrieveActionTaskReference
  **/

  public String getInternalAuditAssessmentRetrieveActionTaskReference() {
    return internalAuditAssessmentRetrieveActionTaskReference;
  }

  public void setInternalAuditAssessmentRetrieveActionTaskReference(String internalAuditAssessmentRetrieveActionTaskReference) {
    this.internalAuditAssessmentRetrieveActionTaskReference = internalAuditAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalAuditAssessmentRetrieveActionTaskRecord
  **/

  public Object getInternalAuditAssessmentRetrieveActionTaskRecord() {
    return internalAuditAssessmentRetrieveActionTaskRecord;
  }

  public void setInternalAuditAssessmentRetrieveActionTaskRecord(Object internalAuditAssessmentRetrieveActionTaskRecord) {
    this.internalAuditAssessmentRetrieveActionTaskRecord = internalAuditAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return internalAuditAssessmentRetrieveActionResponse
  **/

  public String getInternalAuditAssessmentRetrieveActionResponse() {
    return internalAuditAssessmentRetrieveActionResponse;
  }

  public void setInternalAuditAssessmentRetrieveActionResponse(String internalAuditAssessmentRetrieveActionResponse) {
    this.internalAuditAssessmentRetrieveActionResponse = internalAuditAssessmentRetrieveActionResponse;
  }


  /**
   * Get internalAuditAssessmentInstanceReportRecord
   * @return internalAuditAssessmentInstanceReportRecord
  **/

  public CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceReportRecord getInternalAuditAssessmentInstanceReportRecord() {
    return internalAuditAssessmentInstanceReportRecord;
  }

  public void setInternalAuditAssessmentInstanceReportRecord(CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceReportRecord internalAuditAssessmentInstanceReportRecord) {
    this.internalAuditAssessmentInstanceReportRecord = internalAuditAssessmentInstanceReportRecord;
  }


  /**
   * Get internalAuditAssessmentInstanceAnalysis
   * @return internalAuditAssessmentInstanceAnalysis
  **/

  public CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceAnalysis getInternalAuditAssessmentInstanceAnalysis() {
    return internalAuditAssessmentInstanceAnalysis;
  }

  public void setInternalAuditAssessmentInstanceAnalysis(CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceAnalysis internalAuditAssessmentInstanceAnalysis) {
    this.internalAuditAssessmentInstanceAnalysis = internalAuditAssessmentInstanceAnalysis;
  }


}

