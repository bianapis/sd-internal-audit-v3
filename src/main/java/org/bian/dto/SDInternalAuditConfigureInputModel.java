package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDInternalAuditConfigureInputModel
 */
public class SDInternalAuditConfigureInputModel   {
  private Object internalAuditConfigurationActionTaskRecord = null;

  private String internalAuditServicingSessionReference = null;

  private String internalAuditServiceReference = null;

  private SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord = null;


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

  public SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecord getInternalAuditServiceConfigurationRecord() {
    return internalAuditServiceConfigurationRecord;
  }

  public void setInternalAuditServiceConfigurationRecord(SDInternalAuditConfigureInputModelInternalAuditServiceConfigurationRecord internalAuditServiceConfigurationRecord) {
    this.internalAuditServiceConfigurationRecord = internalAuditServiceConfigurationRecord;
  }


}

