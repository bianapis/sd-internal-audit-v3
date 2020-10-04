package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditRetrieveInputModelInternalAuditOfferedServiceInternalAuditServiceRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveInputModelInternalAuditOfferedService
 */
public class SDInternalAuditRetrieveInputModelInternalAuditOfferedService   {
  private String internalAuditServiceReference = null;

  private SDInternalAuditRetrieveInputModelInternalAuditOfferedServiceInternalAuditServiceRecord internalAuditServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return internalAuditServiceReference
  **/

  public String getInternalAuditServiceReference() {
    return internalAuditServiceReference;
  }

  public void setInternalAuditServiceReference(String internalAuditServiceReference) {
    this.internalAuditServiceReference = internalAuditServiceReference;
  }


  /**
   * Get internalAuditServiceRecord
   * @return internalAuditServiceRecord
  **/

  public SDInternalAuditRetrieveInputModelInternalAuditOfferedServiceInternalAuditServiceRecord getInternalAuditServiceRecord() {
    return internalAuditServiceRecord;
  }

  public void setInternalAuditServiceRecord(SDInternalAuditRetrieveInputModelInternalAuditOfferedServiceInternalAuditServiceRecord internalAuditServiceRecord) {
    this.internalAuditServiceRecord = internalAuditServiceRecord;
  }


}

