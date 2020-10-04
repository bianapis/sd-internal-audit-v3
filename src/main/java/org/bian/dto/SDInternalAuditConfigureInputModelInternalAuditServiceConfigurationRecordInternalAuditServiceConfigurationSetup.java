package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup
 */
public class SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup   {
  private String internalAuditServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return internalAuditServiceConfigurationParameter
  **/

  public String getInternalAuditServiceConfigurationParameter() {
    return internalAuditServiceConfigurationParameter;
  }

  public void setInternalAuditServiceConfigurationParameter(String internalAuditServiceConfigurationParameter) {
    this.internalAuditServiceConfigurationParameter = internalAuditServiceConfigurationParameter;
  }


}

