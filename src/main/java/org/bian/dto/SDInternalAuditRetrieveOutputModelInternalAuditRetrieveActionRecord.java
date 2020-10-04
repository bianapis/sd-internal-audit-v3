package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis;
import org.bian.dto.SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecord
 */
public class SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecord   {
  private SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis internalAuditActivityAnalysis = null;

  private SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis internalAuditPerformanceAnalysis = null;

  private SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get internalAuditActivityAnalysis
   * @return internalAuditActivityAnalysis
  **/

  public SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis getInternalAuditActivityAnalysis() {
    return internalAuditActivityAnalysis;
  }

  public void setInternalAuditActivityAnalysis(SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis internalAuditActivityAnalysis) {
    this.internalAuditActivityAnalysis = internalAuditActivityAnalysis;
  }


  /**
   * Get internalAuditPerformanceAnalysis
   * @return internalAuditPerformanceAnalysis
  **/

  public SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis getInternalAuditPerformanceAnalysis() {
    return internalAuditPerformanceAnalysis;
  }

  public void setInternalAuditPerformanceAnalysis(SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis internalAuditPerformanceAnalysis) {
    this.internalAuditPerformanceAnalysis = internalAuditPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

