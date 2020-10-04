package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentInitiateOutputModel
 */
public class CRInternalAuditAssessmentInitiateOutputModel   {
  private String internalAuditAssessmentInstanceReference = null;

  private String internalAuditAssessmentInitiateActionReference = null;

  private Object internalAuditAssessmentInitiateActionRecord = null;

  private String internalAuditAssessmentInstanceStatus = null;

  private String internalAuditAssessmentParameterType = null;

  private String internalAuditAssessmentSelectedOption = null;

  private String internalAuditAssessmentRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Audit Assessment instance 
   * @return internalAuditAssessmentInstanceReference
  **/

  public String getInternalAuditAssessmentInstanceReference() {
    return internalAuditAssessmentInstanceReference;
  }

  public void setInternalAuditAssessmentInstanceReference(String internalAuditAssessmentInstanceReference) {
    this.internalAuditAssessmentInstanceReference = internalAuditAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return internalAuditAssessmentInitiateActionReference
  **/

  public String getInternalAuditAssessmentInitiateActionReference() {
    return internalAuditAssessmentInitiateActionReference;
  }

  public void setInternalAuditAssessmentInitiateActionReference(String internalAuditAssessmentInitiateActionReference) {
    this.internalAuditAssessmentInitiateActionReference = internalAuditAssessmentInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to assess InternalAudit 
   * @return internalAuditAssessmentRequest
  **/

  public String getInternalAuditAssessmentRequest() {
    return internalAuditAssessmentRequest;
  }

  public void setInternalAuditAssessmentRequest(String internalAuditAssessmentRequest) {
    this.internalAuditAssessmentRequest = internalAuditAssessmentRequest;
  }


}

