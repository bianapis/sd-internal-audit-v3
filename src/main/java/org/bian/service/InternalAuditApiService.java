/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InternalAuditApiService {

	SDInternalAuditActivateOutputModel activate(SDInternalAuditActivateInputModel request);
	
	SDInternalAuditConfigureOutputModel configure(String sdReferenceId, SDInternalAuditConfigureInputModel request);
	
	BQAuditExchangeOutputModel exchangeAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditExchangeInputModel request);
	
	CRInternalAuditAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentExchangeInputModel request);
	
	BQAuditExecuteOutputModel executeAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditExecuteInputModel request);
	
	CRInternalAuditAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentExecuteInputModel request);
	
	SDInternalAuditFeedbackOutputModel feedback(String sdReferenceId, SDInternalAuditFeedbackInputModel request);
	
	BQAuditGrantOutputModel grantAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditGrantInputModel request);
	
	CRInternalAuditAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentGrantInputModel request);
	
	CRInternalAuditAssessmentInitiateOutputModel initiate(String sdReferenceId, CRInternalAuditAssessmentInitiateInputModel request);
	
	BQAuditInitiateOutputModel initiateAudit(String sdReferenceId, String crReferenceId, BQAuditInitiateInputModel request);
	
	BQAuditRequestOutputModel requestAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditRequestInputModel request);
	
	CRInternalAuditAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentRequestInputModel request);
	
	CRInternalAuditAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQAuditRetrieveOutputModel retrieveAudit(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDInternalAuditRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRInternalAuditAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentUpdateInputModel request);
	
	BQAuditUpdateOutputModel updateAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditUpdateInputModel request);
	
}
