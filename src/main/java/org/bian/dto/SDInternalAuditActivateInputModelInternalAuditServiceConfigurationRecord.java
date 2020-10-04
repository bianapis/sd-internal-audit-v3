package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecord
 */
public class SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecord   {
  private String internalAuditServiceConfigurationSettingReference = null;

  private String internalAuditServiceConfigurationSettingType = null;

  private SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return internalAuditServiceConfigurationSettingReference
  **/

  public String getInternalAuditServiceConfigurationSettingReference() {
    return internalAuditServiceConfigurationSettingReference;
  }

  public void setInternalAuditServiceConfigurationSettingReference(String internalAuditServiceConfigurationSettingReference) {
    this.internalAuditServiceConfigurationSettingReference = internalAuditServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return internalAuditServiceConfigurationSettingType
  **/

  public String getInternalAuditServiceConfigurationSettingType() {
    return internalAuditServiceConfigurationSettingType;
  }

  public void setInternalAuditServiceConfigurationSettingType(String internalAuditServiceConfigurationSettingType) {
    this.internalAuditServiceConfigurationSettingType = internalAuditServiceConfigurationSettingType;
  }


  /**
   * Get internalAuditServiceConfigurationSetup
   * @return internalAuditServiceConfigurationSetup
  **/

  public SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup getInternalAuditServiceConfigurationSetup() {
    return internalAuditServiceConfigurationSetup;
  }

  public void setInternalAuditServiceConfigurationSetup(SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup) {
    this.internalAuditServiceConfigurationSetup = internalAuditServiceConfigurationSetup;
  }


}

