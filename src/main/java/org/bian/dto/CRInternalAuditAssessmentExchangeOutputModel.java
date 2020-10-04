package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentExchangeOutputModel
 */
public class CRInternalAuditAssessmentExchangeOutputModel   {
  private String internalAuditAssessmentParameterType = null;

  private String internalAuditAssessmentSelectedOption = null;

  private String internalAuditAssessmentRequest = null;

  private String internalAuditAssessmentExchangeActionTaskReference = null;

  private Object internalAuditAssessmentExchangeActionTaskRecord = null;

  private String internalAuditAssessmentExchangeActionResponse = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Audit Assessment instance exchange service call 
   * @return internalAuditAssessmentExchangeActionTaskReference
  **/

  public String getInternalAuditAssessmentExchangeActionTaskReference() {
    return internalAuditAssessmentExchangeActionTaskReference;
  }

  public void setInternalAuditAssessmentExchangeActionTaskReference(String internalAuditAssessmentExchangeActionTaskReference) {
    this.internalAuditAssessmentExchangeActionTaskReference = internalAuditAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return internalAuditAssessmentExchangeActionTaskRecord
  **/

  public Object getInternalAuditAssessmentExchangeActionTaskRecord() {
    return internalAuditAssessmentExchangeActionTaskRecord;
  }

  public void setInternalAuditAssessmentExchangeActionTaskRecord(Object internalAuditAssessmentExchangeActionTaskRecord) {
    this.internalAuditAssessmentExchangeActionTaskRecord = internalAuditAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return internalAuditAssessmentExchangeActionResponse
  **/

  public String getInternalAuditAssessmentExchangeActionResponse() {
    return internalAuditAssessmentExchangeActionResponse;
  }

  public void setInternalAuditAssessmentExchangeActionResponse(String internalAuditAssessmentExchangeActionResponse) {
    this.internalAuditAssessmentExchangeActionResponse = internalAuditAssessmentExchangeActionResponse;
  }


}

