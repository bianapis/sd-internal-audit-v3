package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup;
import org.bian.dto.SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement;
import org.bian.dto.SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecord
 */
public class SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecord   {
  private String internalAuditServiceConfigurationSettingReference = null;

  private String internalAuditServiceConfigurationSettingDescription = null;

  private SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup = null;

  private SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription internalAuditServiceSubscription = null;

  private SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement internalAuditServiceAgreement = null;

  private String internalAuditServiceStatus = null;


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

  public SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup getInternalAuditServiceConfigurationSetup() {
    return internalAuditServiceConfigurationSetup;
  }

  public void setInternalAuditServiceConfigurationSetup(SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup) {
    this.internalAuditServiceConfigurationSetup = internalAuditServiceConfigurationSetup;
  }


  /**
   * Get internalAuditServiceSubscription
   * @return internalAuditServiceSubscription
  **/

  public SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription getInternalAuditServiceSubscription() {
    return internalAuditServiceSubscription;
  }

  public void setInternalAuditServiceSubscription(SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription internalAuditServiceSubscription) {
    this.internalAuditServiceSubscription = internalAuditServiceSubscription;
  }


  /**
   * Get internalAuditServiceAgreement
   * @return internalAuditServiceAgreement
  **/

  public SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement getInternalAuditServiceAgreement() {
    return internalAuditServiceAgreement;
  }

  public void setInternalAuditServiceAgreement(SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement internalAuditServiceAgreement) {
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

