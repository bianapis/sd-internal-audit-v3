package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditRetrieveOutputModelInternalAuditOfferedService;
import org.bian.dto.SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveOutputModel
 */
public class SDInternalAuditRetrieveOutputModel   {
  private String internalAuditRetrieveActionTaskReference = null;

  private Object internalAuditRetrieveActionTaskRecord = null;

  private String internalAuditRetrieveActionResponse = null;

  private SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecord internalAuditRetrieveActionRecord = null;

  private SDInternalAuditRetrieveOutputModelInternalAuditOfferedService internalAuditOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return internalAuditRetrieveActionTaskReference
  **/

  public String getInternalAuditRetrieveActionTaskReference() {
    return internalAuditRetrieveActionTaskReference;
  }

  public void setInternalAuditRetrieveActionTaskReference(String internalAuditRetrieveActionTaskReference) {
    this.internalAuditRetrieveActionTaskReference = internalAuditRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return internalAuditRetrieveActionResponse
  **/

  public String getInternalAuditRetrieveActionResponse() {
    return internalAuditRetrieveActionResponse;
  }

  public void setInternalAuditRetrieveActionResponse(String internalAuditRetrieveActionResponse) {
    this.internalAuditRetrieveActionResponse = internalAuditRetrieveActionResponse;
  }


  /**
   * Get internalAuditRetrieveActionRecord
   * @return internalAuditRetrieveActionRecord
  **/

  public SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecord getInternalAuditRetrieveActionRecord() {
    return internalAuditRetrieveActionRecord;
  }

  public void setInternalAuditRetrieveActionRecord(SDInternalAuditRetrieveOutputModelInternalAuditRetrieveActionRecord internalAuditRetrieveActionRecord) {
    this.internalAuditRetrieveActionRecord = internalAuditRetrieveActionRecord;
  }


  /**
   * Get internalAuditOfferedService
   * @return internalAuditOfferedService
  **/

  public SDInternalAuditRetrieveOutputModelInternalAuditOfferedService getInternalAuditOfferedService() {
    return internalAuditOfferedService;
  }

  public void setInternalAuditOfferedService(SDInternalAuditRetrieveOutputModelInternalAuditOfferedService internalAuditOfferedService) {
    this.internalAuditOfferedService = internalAuditOfferedService;
  }


}

