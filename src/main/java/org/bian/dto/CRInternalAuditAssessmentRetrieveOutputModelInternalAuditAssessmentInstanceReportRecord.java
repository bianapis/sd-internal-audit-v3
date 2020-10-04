package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceReportRecord
 */
public class CRInternalAuditAssessmentRetrieveOutputModelInternalAuditAssessmentInstanceReportRecord   {
  private String internalAuditAssessmentInstanceReportData = null;

  private String internalAuditAssessmentInstanceReportType = null;

  private Object internalAuditAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return internalAuditAssessmentInstanceReportData
  **/

  public String getInternalAuditAssessmentInstanceReportData() {
    return internalAuditAssessmentInstanceReportData;
  }

  public void setInternalAuditAssessmentInstanceReportData(String internalAuditAssessmentInstanceReportData) {
    this.internalAuditAssessmentInstanceReportData = internalAuditAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return internalAuditAssessmentInstanceReport
  **/

  public Object getInternalAuditAssessmentInstanceReport() {
    return internalAuditAssessmentInstanceReport;
  }

  public void setInternalAuditAssessmentInstanceReport(Object internalAuditAssessmentInstanceReport) {
    this.internalAuditAssessmentInstanceReport = internalAuditAssessmentInstanceReport;
  }


}

