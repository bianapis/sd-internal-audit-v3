package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveInputModelInternalAuditOfferedServiceInternalAuditServiceRecord
 */
public class SDInternalAuditRetrieveInputModelInternalAuditOfferedServiceInternalAuditServiceRecord   {
  private String internalAuditServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return internalAuditServiceVersion
  **/

  public String getInternalAuditServiceVersion() {
    return internalAuditServiceVersion;
  }

  public void setInternalAuditServiceVersion(String internalAuditServiceVersion) {
    this.internalAuditServiceVersion = internalAuditServiceVersion;
  }


}

