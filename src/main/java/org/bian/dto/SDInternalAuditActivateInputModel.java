package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditActivateInputModel
 */
public class SDInternalAuditActivateInputModel   {
  private Object internalAuditActivationActionTaskRecord = null;

  private String internalAuditCenterReference = null;

  private String internalAuditServiceReference = null;

  private SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return internalAuditCenterReference
  **/

  public String getInternalAuditCenterReference() {
    return internalAuditCenterReference;
  }

  public void setInternalAuditCenterReference(String internalAuditCenterReference) {
    this.internalAuditCenterReference = internalAuditCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return internalAuditServiceReference
  **/

  public String getInternalAuditServiceReference() {
    return internalAuditServiceReference;
  }

  public void setInternalAuditServiceReference(String internalAuditServiceReference) {
    this.internalAuditServiceReference = internalAuditServiceReference;
  }


  /**
   * Get internalAuditServiceConfigurationRecord
   * @return internalAuditServiceConfigurationRecord
  **/

  public SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecord getInternalAuditServiceConfigurationRecord() {
    return internalAuditServiceConfigurationRecord;
  }

  public void setInternalAuditServiceConfigurationRecord(SDInternalAuditActivateInputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord) {
    this.internalAuditServiceConfigurationRecord = internalAuditServiceConfigurationRecord;
  }


}

