package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription
 */
public class SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecordInternalAuditServiceSubscription   {
  private String internalAuditServiceSubscriberReference = null;

  private String internalAuditServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return internalAuditServiceSubscriberReference
  **/

  public String getInternalAuditServiceSubscriberReference() {
    return internalAuditServiceSubscriberReference;
  }

  public void setInternalAuditServiceSubscriberReference(String internalAuditServiceSubscriberReference) {
    this.internalAuditServiceSubscriberReference = internalAuditServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return internalAuditServiceSubscriberAccessProfile
  **/

  public String getInternalAuditServiceSubscriberAccessProfile() {
    return internalAuditServiceSubscriberAccessProfile;
  }

  public void setInternalAuditServiceSubscriberAccessProfile(String internalAuditServiceSubscriberAccessProfile) {
    this.internalAuditServiceSubscriberAccessProfile = internalAuditServiceSubscriberAccessProfile;
  }


}

