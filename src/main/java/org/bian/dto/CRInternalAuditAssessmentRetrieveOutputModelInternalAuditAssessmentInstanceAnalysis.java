package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceAnalysis
 */
public class CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceAnalysis   {
  private String internalAuditAssessmentInstanceAnalysisData = null;

  private String internalAuditAssessmentInstanceAnalysisReportType = null;

  private Object internalAuditAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return internalAuditAssessmentInstanceAnalysisData
  **/

  public String getInternalAuditAssessmentInstanceAnalysisData() {
    return internalAuditAssessmentInstanceAnalysisData;
  }

  public void setInternalAuditAssessmentInstanceAnalysisData(String internalAuditAssessmentInstanceAnalysisData) {
    this.internalAuditAssessmentInstanceAnalysisData = internalAuditAssessmentInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return internalAuditAssessmentInstanceAnalysisReport
  **/

  public Object getInternalAuditAssessmentInstanceAnalysisReport() {
    return internalAuditAssessmentInstanceAnalysisReport;
  }

  public void setInternalAuditAssessmentInstanceAnalysisReport(Object internalAuditAssessmentInstanceAnalysisReport) {
    this.internalAuditAssessmentInstanceAnalysisReport = internalAuditAssessmentInstanceAnalysisReport;
  }


}

