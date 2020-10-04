package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup
 */
public class SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup   {
  private String internalAuditServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return internalAuditServiceConfigurationParameter
  **/

  public String getInternalAuditServiceConfigurationParameter() {
    return internalAuditServiceConfigurationParameter;
  }

  public void setInternalAuditServiceConfigurationParameter(String internalAuditServiceConfigurationParameter) {
    this.internalAuditServiceConfigurationParameter = internalAuditServiceConfigurationParameter;
  }


}

