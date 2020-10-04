package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement;
import org.bian.dto.SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup;
import org.bian.dto.SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDInternalAuditConfigureOutputModelInternalAuditServiceConfigurationRecord
 */
public class SDInternalAuditConfigureOutputModelInternalAuditServiceConfigurationRecord   {
  private String internalAuditServiceConfigurationSettingDescription = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription internalAuditServiceSubscription = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement internalAuditServiceAgreement = null;

  private String internalAuditServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return internalAuditServiceConfigurationSettingDescription
  **/

  public String getInternalAuditServiceConfigurationSettingDescription() {
    return internalAuditServiceConfigurationSettingDescription;
  }

  public void setInternalAuditServiceConfigurationSettingDescription(String internalAuditServiceConfigurationSettingDescription) {
    this.internalAuditServiceConfigurationSettingDescription = internalAuditServiceConfigurationSettingDescription;
  }


  /**
   * Get internalAuditServiceConfigurationSetup
   * @return internalAuditServiceConfigurationSetup
  **/

  public SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup getInternalAuditServiceConfigurationSetup() {
    return internalAuditServiceConfigurationSetup;
  }

  public void setInternalAuditServiceConfigurationSetup(SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup) {
    this.internalAuditServiceConfigurationSetup = internalAuditServiceConfigurationSetup;
  }


  /**
   * Get internalAuditServiceSubscription
   * @return internalAuditServiceSubscription
  **/

  public SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription getInternalAuditServiceSubscription() {
    return internalAuditServiceSubscription;
  }

  public void setInternalAuditServiceSubscription(SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription internalAuditServiceSubscription) {
    this.internalAuditServiceSubscription = internalAuditServiceSubscription;
  }


  /**
   * Get internalAuditServiceAgreement
   * @return internalAuditServiceAgreement
  **/

  public SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement getInternalAuditServiceAgreement() {
    return internalAuditServiceAgreement;
  }

  public void setInternalAuditServiceAgreement(SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement internalAuditServiceAgreement) {
    this.internalAuditServiceAgreement = internalAuditServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return internalAuditServiceStatus
  **/

  public String getInternalAuditServiceStatus() {
    return internalAuditServiceStatus;
  }

  public void setInternalAuditServiceStatus(String internalAuditServiceStatus) {
    this.internalAuditServiceStatus = internalAuditServiceStatus;
  }


}

