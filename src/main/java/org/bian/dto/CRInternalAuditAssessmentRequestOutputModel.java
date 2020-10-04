package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRequestOutputModel
 */
public class CRInternalAuditAssessmentRequestOutputModel   {
  private String internalAuditAssessmentParameterType = null;

  private String internalAuditAssessmentSelectedOption = null;

  private String internalAuditAssessmentRequest = null;

  private String internalAuditAssessmentRequestActionTaskReference = null;

  private Object internalAuditAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Audit Assessment instance request service call 
   * @return internalAuditAssessmentRequestActionTaskReference
  **/

  public String getInternalAuditAssessmentRequestActionTaskReference() {
    return internalAuditAssessmentRequestActionTaskReference;
  }

  public void setInternalAuditAssessmentRequestActionTaskReference(String internalAuditAssessmentRequestActionTaskReference) {
    this.internalAuditAssessmentRequestActionTaskReference = internalAuditAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return internalAuditAssessmentRequestActionTaskRecord
  **/

  public Object getInternalAuditAssessmentRequestActionTaskRecord() {
    return internalAuditAssessmentRequestActionTaskRecord;
  }

  public void setInternalAuditAssessmentRequestActionTaskRecord(Object internalAuditAssessmentRequestActionTaskRecord) {
    this.internalAuditAssessmentRequestActionTaskRecord = internalAuditAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

