package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditFeedbackOutputModelInternalAuditFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditFeedbackOutputModel
 */
public class SDInternalAuditFeedbackOutputModel   {
  private String internalAuditFeedbackActionTaskReference = null;

  private Object internalAuditFeedbackActionTaskRecord = null;

  private SDInternalAuditFeedbackOutputModelInternalAuditFeedbackActionRecord internalAuditFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return internalAuditFeedbackActionTaskReference
  **/

  public String getInternalAuditFeedbackActionTaskReference() {
    return internalAuditFeedbackActionTaskReference;
  }

  public void setInternalAuditFeedbackActionTaskReference(String internalAuditFeedbackActionTaskReference) {
    this.internalAuditFeedbackActionTaskReference = internalAuditFeedbackActionTaskReference;
  }


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

  public SDInternalAuditFeedbackOutputModelInternalAuditFeedbackActionRecord getInternalAuditFeedbackActionRecord() {
    return internalAuditFeedbackActionRecord;
  }

  public void setInternalAuditFeedbackActionRecord(SDInternalAuditFeedbackOutputModelInternalAuditFeedbackActionRecord internalAuditFeedbackActionRecord) {
    this.internalAuditFeedbackActionRecord = internalAuditFeedbackActionRecord;
  }


}

