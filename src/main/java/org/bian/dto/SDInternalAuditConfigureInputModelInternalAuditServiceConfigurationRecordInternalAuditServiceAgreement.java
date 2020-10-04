package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement
 */
public class SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecordInternalAuditServiceAgreement   {
  private String internalAuditServiceAgreementReference = null;

  private String internalAuditServiceUserReference = null;

  private String internalAuditServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return internalAuditServiceAgreementReference
  **/

  public String getInternalAuditServiceAgreementReference() {
    return internalAuditServiceAgreementReference;
  }

  public void setInternalAuditServiceAgreementReference(String internalAuditServiceAgreementReference) {
    this.internalAuditServiceAgreementReference = internalAuditServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return internalAuditServiceUserReference
  **/

  public String getInternalAuditServiceUserReference() {
    return internalAuditServiceUserReference;
  }

  public void setInternalAuditServiceUserReference(String internalAuditServiceUserReference) {
    this.internalAuditServiceUserReference = internalAuditServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return internalAuditServiceAgreementTermsandConditions
  **/

  public String getInternalAuditServiceAgreementTermsandConditions() {
    return internalAuditServiceAgreementTermsandConditions;
  }

  public void setInternalAuditServiceAgreementTermsandConditions(String internalAuditServiceAgreementTermsandConditions) {
    this.internalAuditServiceAgreementTermsandConditions = internalAuditServiceAgreementTermsandConditions;
  }


}

