package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis;
import org.bian.dto.SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecord
 */
public class SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecord   {
  private SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis internalAuditActivityAnalysis = null;

  private SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis internalAuditPerformanceAnalysis = null;

  private SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get internalAuditActivityAnalysis
   * @return internalAuditActivityAnalysis
  **/

  public SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis getInternalAuditActivityAnalysis() {
    return internalAuditActivityAnalysis;
  }

  public void setInternalAuditActivityAnalysis(SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditActivityAnalysis internalAuditActivityAnalysis) {
    this.internalAuditActivityAnalysis = internalAuditActivityAnalysis;
  }


  /**
   * Get internalAuditPerformanceAnalysis
   * @return internalAuditPerformanceAnalysis
  **/

  public SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis getInternalAuditPerformanceAnalysis() {
    return internalAuditPerformanceAnalysis;
  }

  public void setInternalAuditPerformanceAnalysis(SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordInternalAuditPerformanceAnalysis internalAuditPerformanceAnalysis) {
    this.internalAuditPerformanceAnalysis = internalAuditPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

