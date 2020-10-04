package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecordInternalAuditServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecord
 */
public class SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecord   {
  private String internalAuditServiceType = null;

  private String internalAuditServiceVersion = null;

  private String internalAuditServiceDescription = null;

  private SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecordInternalAuditServicePoliciesandGuidelines internalAuditServicePoliciesandGuidelines = null;

  private String internalAuditServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return internalAuditServiceType
  **/

  public String getInternalAuditServiceType() {
    return internalAuditServiceType;
  }

  public void setInternalAuditServiceType(String internalAuditServiceType) {
    this.internalAuditServiceType = internalAuditServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return internalAuditServiceDescription
  **/

  public String getInternalAuditServiceDescription() {
    return internalAuditServiceDescription;
  }

  public void setInternalAuditServiceDescription(String internalAuditServiceDescription) {
    this.internalAuditServiceDescription = internalAuditServiceDescription;
  }


  /**
   * Get internalAuditServicePoliciesandGuidelines
   * @return internalAuditServicePoliciesandGuidelines
  **/

  public SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecordInternalAuditServicePoliciesandGuidelines getInternalAuditServicePoliciesandGuidelines() {
    return internalAuditServicePoliciesandGuidelines;
  }

  public void setInternalAuditServicePoliciesandGuidelines(SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecordInternalAuditServicePoliciesandGuidelines internalAuditServicePoliciesandGuidelines) {
    this.internalAuditServicePoliciesandGuidelines = internalAuditServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return internalAuditServiceSchedule
  **/

  public String getInternalAuditServiceSchedule() {
    return internalAuditServiceSchedule;
  }

  public void setInternalAuditServiceSchedule(String internalAuditServiceSchedule) {
    this.internalAuditServiceSchedule = internalAuditServiceSchedule;
  }


}

