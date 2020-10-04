package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditFeedbackInputModelInternalAuditFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditFeedbackInputModel
 */
public class SDInternalAuditFeedbackInputModel   {
  private Object internalAuditFeedbackActionTaskRecord = null;

  private SDInternalAuditFeedbackInputModelInternalAuditFeedbackActionRecord internalAuditFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return internalAuditFeedbackActionTaskRecord
  **/

  public Object getInternalAuditFeedbackActionTaskRecord() {
    return internalAuditFeedbackActionTaskRecord;
  }

  public void setInternalAuditFeedbackActionTaskRecord(Object internalAuditFeedbackActionTaskRecord) {
    this.internalAuditFeedbackActionTaskRecord = internalAuditFeedbackActionTaskRecord;
  }


  /**
   * Get internalAuditFeedbackActionRecord
   * @return internalAuditFeedbackActionRecord
  **/

  public SDInternalAuditFeedbackInputModelInternalAuditFeedbackActionRecord getInternalAuditFeedbackActionRecord() {
    return internalAuditFeedbackActionRecord;
  }

  public void setInternalAuditFeedbackActionRecord(SDInternalAuditFeedbackInputModelInternalAuditFeedbackActionRecord internalAuditFeedbackActionRecord) {
    this.internalAuditFeedbackActionRecord = internalAuditFeedbackActionRecord;
  }


}

