package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditRetrieveInputModelInternalAuditOfferedService;
import org.bian.dto.SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveInputModel
 */
public class SDInternalAuditRetrieveInputModel   {
  private Object internalAuditRetrieveActionTaskRecord = null;

  private String internalAuditRetrieveActionRequest = null;

  private SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecord internalAuditRetrieveActionRecord = null;

  private SDInternalAuditRetrieveInputModelInternalAuditOfferedService internalAuditOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalAuditRetrieveActionTaskRecord
  **/

  public Object getInternalAuditRetrieveActionTaskRecord() {
    return internalAuditRetrieveActionTaskRecord;
  }

  public void setInternalAuditRetrieveActionTaskRecord(Object internalAuditRetrieveActionTaskRecord) {
    this.internalAuditRetrieveActionTaskRecord = internalAuditRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return internalAuditRetrieveActionRequest
  **/

  public String getInternalAuditRetrieveActionRequest() {
    return internalAuditRetrieveActionRequest;
  }

  public void setInternalAuditRetrieveActionRequest(String internalAuditRetrieveActionRequest) {
    this.internalAuditRetrieveActionRequest = internalAuditRetrieveActionRequest;
  }


  /**
   * Get internalAuditRetrieveActionRecord
   * @return internalAuditRetrieveActionRecord
  **/

  public SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecord getInternalAuditRetrieveActionRecord() {
    return internalAuditRetrieveActionRecord;
  }

  public void setInternalAuditRetrieveActionRecord(SDInternalAuditRetrieveInputModelInternalAuditRetrieveActionRecord internalAuditRetrieveActionRecord) {
    this.internalAuditRetrieveActionRecord = internalAuditRetrieveActionRecord;
  }


  /**
   * Get internalAuditOfferedService
   * @return internalAuditOfferedService
  **/

  public SDInternalAuditRetrieveInputModelInternalAuditOfferedService getInternalAuditOfferedService() {
    return internalAuditOfferedService;
  }

  public void setInternalAuditOfferedService(SDInternalAuditRetrieveInputModelInternalAuditOfferedService internalAuditOfferedService) {
    this.internalAuditOfferedService = internalAuditOfferedService;
  }


}

