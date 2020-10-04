package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditConfigureOutputModelInternalAuditServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditConfigureOutputModel
 */
public class SDInternalAuditConfigureOutputModel   {
  private String internalAuditConfigurationActionTaskReference = null;

  private Object internalAuditConfigurationActionTaskRecord = null;

  private SDInternalAuditConfigureOutputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord = null;

  private String internalAuditServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return internalAuditConfigurationActionTaskReference
  **/

  public String getInternalAuditConfigurationActionTaskReference() {
    return internalAuditConfigurationActionTaskReference;
  }

  public void setInternalAuditConfigurationActionTaskReference(String internalAuditConfigurationActionTaskReference) {
    this.internalAuditConfigurationActionTaskReference = internalAuditConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return internalAuditConfigurationActionTaskRecord
  **/

  public Object getInternalAuditConfigurationActionTaskRecord() {
    return internalAuditConfigurationActionTaskRecord;
  }

  public void setInternalAuditConfigurationActionTaskRecord(Object internalAuditConfigurationActionTaskRecord) {
    this.internalAuditConfigurationActionTaskRecord = internalAuditConfigurationActionTaskRecord;
  }


  /**
   * Get internalAuditServiceConfigurationRecord
   * @return internalAuditServiceConfigurationRecord
  **/

  public SDInternalAuditConfigureOutputModelInternalAuditServiceConfigurationRecord getInternalAuditServiceConfigurationRecord() {
    return internalAuditServiceConfigurationRecord;
  }

  public void setInternalAuditServiceConfigurationRecord(SDInternalAuditConfigureOutputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord) {
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

