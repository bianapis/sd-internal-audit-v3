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
 * SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecord
 */
public class SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecord   {
  private String internalAuditServiceConfigurationSettingReference = null;

  private String internalAuditServiceConfigurationSettingType = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceConfigurationSetup internalAuditServiceConfigurationSetup = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription internalAuditServiceSubscription = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement internalAuditServiceAgreement = null;


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


}

