package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditActivateOutputModel
 */
public class SDInternalAuditActivateOutputModel   {
  private String internalAuditActivationActionTaskReference = null;

  private Object internalAuditActivationActionTaskRecord = null;

  private String internalAuditServicingSessionReference = null;

  private Object internalAuditServicingSessionRecord = null;

  private SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord = null;

  private String internalAuditServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return internalAuditActivationActionTaskReference
  **/

  public String getInternalAuditActivationActionTaskReference() {
    return internalAuditActivationActionTaskReference;
  }

  public void setInternalAuditActivationActionTaskReference(String internalAuditActivationActionTaskReference) {
    this.internalAuditActivationActionTaskReference = internalAuditActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return internalAuditActivationActionTaskRecord
  **/

  public Object getInternalAuditActivationActionTaskRecord() {
    return internalAuditActivationActionTaskRecord;
  }

  public void setInternalAuditActivationActionTaskRecord(Object internalAuditActivationActionTaskRecord) {
    this.internalAuditActivationActionTaskRecord = internalAuditActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return internalAuditServicingSessionReference
  **/

  public String getInternalAuditServicingSessionReference() {
    return internalAuditServicingSessionReference;
  }

  public void setInternalAuditServicingSessionReference(String internalAuditServicingSessionReference) {
    this.internalAuditServicingSessionReference = internalAuditServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return internalAuditServicingSessionRecord
  **/

  public Object getInternalAuditServicingSessionRecord() {
    return internalAuditServicingSessionRecord;
  }

  public void setInternalAuditServicingSessionRecord(Object internalAuditServicingSessionRecord) {
    this.internalAuditServicingSessionRecord = internalAuditServicingSessionRecord;
  }


  /**
   * Get internalAuditServiceConfigurationRecord
   * @return internalAuditServiceConfigurationRecord
  **/

  public SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecord getInternalAuditServiceConfigurationRecord() {
    return internalAuditServiceConfigurationRecord;
  }

  public void setInternalAuditServiceConfigurationRecord(SDInternalAuditActivateOutputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord) {
    this.internalAuditServiceConfigurationRecord = internalAuditServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return internalAuditServicingSessionStatus
  **/

  public String getInternalAuditServicingSessionStatus() {
    return internalAuditServicingSessionStatus;
  }

  public void setInternalAuditServicingSessionStatus(String internalAuditServicingSessionStatus) {
    this.internalAuditServicingSessionStatus = internalAuditServicingSessionStatus;
  }


}

