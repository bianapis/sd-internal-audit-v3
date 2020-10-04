/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InternalAuditApiServiceImpl implements InternalAuditApiService {

	public SDInternalAuditActivateOutputModel activate(SDInternalAuditActivateInputModel request){
		return JsonReader.read("activate-SDInternalAuditActivateOutputModel.json",new TypeReference<SDInternalAuditActivateOutputModel>(){});
	}
	
	public SDInternalAuditConfigureOutputModel configure(String sdReferenceId, SDInternalAuditConfigureInputModel request){
		return JsonReader.read("configure-SDInternalAuditConfigureOutputModel.json",new TypeReference<SDInternalAuditConfigureOutputModel>(){});
	}
	
	public BQAuditExchangeOutputModel exchangeAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditExchangeInputModel request){
		return JsonReader.read("exchange-BQAuditExchangeOutputModel.json",new TypeReference<BQAuditExchangeOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRInternalAuditAssessmentExchangeOutputModel.json",new TypeReference<CRInternalAuditAssessmentExchangeOutputModel>(){});
	}
	
	public BQAuditExecuteOutputModel executeAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditExecuteInputModel request){
		return JsonReader.read("execute-BQAuditExecuteOutputModel.json",new TypeReference<BQAuditExecuteOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRInternalAuditAssessmentExecuteOutputModel.json",new TypeReference<CRInternalAuditAssessmentExecuteOutputModel>(){});
	}
	
	public SDInternalAuditFeedbackOutputModel feedback(String sdReferenceId, SDInternalAuditFeedbackInputModel request){
		return JsonReader.read("feedback-SDInternalAuditFeedbackOutputModel.json",new TypeReference<SDInternalAuditFeedbackOutputModel>(){});
	}
	
	public BQAuditGrantOutputModel grantAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditGrantInputModel request){
		return JsonReader.read("grant-BQAuditGrantOutputModel.json",new TypeReference<BQAuditGrantOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRInternalAuditAssessmentGrantOutputModel.json",new TypeReference<CRInternalAuditAssessmentGrantOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentInitiateOutputModel initiate(String sdReferenceId, CRInternalAuditAssessmentInitiateInputModel request){
		return JsonReader.read("initiate-CRInternalAuditAssessmentInitiateOutputModel.json",new TypeReference<CRInternalAuditAssessmentInitiateOutputModel>(){});
	}
	
	public BQAuditInitiateOutputModel initiateAudit(String sdReferenceId, String crReferenceId, BQAuditInitiateInputModel request){
		return JsonReader.read("initiate-BQAuditInitiateOutputModel.json",new TypeReference<BQAuditInitiateOutputModel>(){});
	}
	
	public BQAuditRequestOutputModel requestAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditRequestInputModel request){
		return JsonReader.read("request-BQAuditRequestOutputModel.json",new TypeReference<BQAuditRequestOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentRequestInputModel request){
		return JsonReader.read("request-CRInternalAuditAssessmentRequestOutputModel.json",new TypeReference<CRInternalAuditAssessmentRequestOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRInternalAuditAssessmentRetrieveOutputModel.json",new TypeReference<CRInternalAuditAssessmentRetrieveOutputModel>(){});
	}
	
	public BQAuditRetrieveOutputModel retrieveAudit(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuditRetrieveOutputModel.json",new TypeReference<BQAuditRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDInternalAuditRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInternalAuditRetrieveOutputModel.json",new TypeReference<SDInternalAuditRetrieveOutputModel>(){});
	}
	
	public CRInternalAuditAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInternalAuditAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRInternalAuditAssessmentUpdateOutputModel.json",new TypeReference<CRInternalAuditAssessmentUpdateOutputModel>(){});
	}
	
	public BQAuditUpdateOutputModel updateAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditUpdateInputModel request){
		return JsonReader.read("update-BQAuditUpdateOutputModel.json",new TypeReference<BQAuditUpdateOutputModel>(){});
	}
	
}
