package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecordInternalAuditServicePoliciesandGuidelines
 */
public class SDInternalAuditRetrieveOutputModelInternalAuditOfferedServiceInternalAuditServiceRecordInternalAuditServicePoliciesandGuidelines   {
  private String internalAuditServiceEligibility = null;

  private String internalAuditServiceIntendedUses = null;

  private String internalAuditServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return internalAuditServiceEligibility
  **/

  public String getInternalAuditServiceEligibility() {
    return internalAuditServiceEligibility;
  }

  public void setInternalAuditServiceEligibility(String internalAuditServiceEligibility) {
    this.internalAuditServiceEligibility = internalAuditServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return internalAuditServiceIntendedUses
  **/

  public String getInternalAuditServiceIntendedUses() {
    return internalAuditServiceIntendedUses;
  }

  public void setInternalAuditServiceIntendedUses(String internalAuditServiceIntendedUses) {
    this.internalAuditServiceIntendedUses = internalAuditServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return internalAuditServicePricingandTerms
  **/

  public String getInternalAuditServicePricingandTerms() {
    return internalAuditServicePricingandTerms;
  }

  public void setInternalAuditServicePricingandTerms(String internalAuditServicePricingandTerms) {
    this.internalAuditServicePricingandTerms = internalAuditServicePricingandTerms;
  }


}

