package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceAnalysis;
import org.bian.dto.CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInternalAuditAssessmentRetrieveInputModel
 */
public class CRInternalAuditAssessmentRetrieveInputModel   {
  private Object internalAuditAssessmentRetrieveActionTaskRecord = null;

  private String internalAuditAssessmentRetrieveActionRequest = null;

  private CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceReportRecord internalAuditAssessmentInstanceReportRecord = null;

  private CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceAnalysis internalAuditAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return internalAuditAssessmentRetrieveActionRequest
  **/

  public String getInternalAuditAssessmentRetrieveActionRequest() {
    return internalAuditAssessmentRetrieveActionRequest;
  }

  public void setInternalAuditAssessmentRetrieveActionRequest(String internalAuditAssessmentRetrieveActionRequest) {
    this.internalAuditAssessmentRetrieveActionRequest = internalAuditAssessmentRetrieveActionRequest;
  }


  /**
   * Get internalAuditAssessmentInstanceReportRecord
   * @return internalAuditAssessmentInstanceReportRecord
  **/

  public CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceReportRecord getInternalAuditAssessmentInstanceReportRecord() {
    return internalAuditAssessmentInstanceReportRecord;
  }

  public void setInternalAuditAssessmentInstanceReportRecord(CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceReportRecord internalAuditAssessmentInstanceReportRecord) {
    this.internalAuditAssessmentInstanceReportRecord = internalAuditAssessmentInstanceReportRecord;
  }


  /**
   * Get internalAuditAssessmentInstanceAnalysis
   * @return internalAuditAssessmentInstanceAnalysis
  **/

  public CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceAnalysis getInternalAuditAssessmentInstanceAnalysis() {
    return internalAuditAssessmentInstanceAnalysis;
  }

  public void setInternalAuditAssessmentInstanceAnalysis(CRInternalAuditAssessmentRetrieveInputModelInternalAuditAssessmentInstanceAnalysis internalAuditAssessmentInstanceAnalysis) {
    this.internalAuditAssessmentInstanceAnalysis = internalAuditAssessmentInstanceAnalysis;
  }


}

