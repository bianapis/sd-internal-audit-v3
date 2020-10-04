package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceReportRecord
 */
public class CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceReportRecord   {
  private String internalAuditAssessmentInstanceReportReference = null;

  private String internalAuditAssessmentInstanceReportType = null;

  private String internalAuditAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return internalAuditAssessmentInstanceReportReference
  **/

  public String getInternalAuditAssessmentInstanceReportReference() {
    return internalAuditAssessmentInstanceReportReference;
  }

  public void setInternalAuditAssessmentInstanceReportReference(String internalAuditAssessmentInstanceReportReference) {
    this.internalAuditAssessmentInstanceReportReference = internalAuditAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return internalAuditAssessmentInstanceReportType
  **/

  public String getInternalAuditAssessmentInstanceReportType() {
    return internalAuditAssessmentInstanceReportType;
  }

  public void setInternalAuditAssessmentInstanceReportType(String internalAuditAssessmentInstanceReportType) {
    this.internalAuditAssessmentInstanceReportType = internalAuditAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return internalAuditAssessmentInstanceReportParameters
  **/

  public String getInternalAuditAssessmentInstanceReportParameters() {
    return internalAuditAssessmentInstanceReportParameters;
  }

  public void setInternalAuditAssessmentInstanceReportParameters(String internalAuditAssessmentInstanceReportParameters) {
    this.internalAuditAssessmentInstanceReportParameters = internalAuditAssessmentInstanceReportParameters;
  }


}

