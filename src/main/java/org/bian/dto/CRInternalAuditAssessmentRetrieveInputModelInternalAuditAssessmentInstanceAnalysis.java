package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceAnalysis
 */
public class CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceAnalysis   {
  private String internalAuditAssessmentInstanceAnalysisReference = null;

  private String internalAuditAssessmentInstanceAnalysisReportType = null;

  private String internalAuditAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return internalAuditAssessmentInstanceAnalysisReference
  **/

  public String getInternalAuditAssessmentInstanceAnalysisReference() {
    return internalAuditAssessmentInstanceAnalysisReference;
  }

  public void setInternalAuditAssessmentInstanceAnalysisReference(String internalAuditAssessmentInstanceAnalysisReference) {
    this.internalAuditAssessmentInstanceAnalysisReference = internalAuditAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return internalAuditAssessmentInstanceAnalysisReportType
  **/

  public String getInternalAuditAssessmentInstanceAnalysisReportType() {
    return internalAuditAssessmentInstanceAnalysisReportType;
  }

  public void setInternalAuditAssessmentInstanceAnalysisReportType(String internalAuditAssessmentInstanceAnalysisReportType) {
    this.internalAuditAssessmentInstanceAnalysisReportType = internalAuditAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return internalAuditAssessmentInstanceAnalysisParameters
  **/

  public String getInternalAuditAssessmentInstanceAnalysisParameters() {
    return internalAuditAssessmentInstanceAnalysisParameters;
  }

  public void setInternalAuditAssessmentInstanceAnalysisParameters(String internalAuditAssessmentInstanceAnalysisParameters) {
    this.internalAuditAssessmentInstanceAnalysisParameters = internalAuditAssessmentInstanceAnalysisParameters;
  }


}

