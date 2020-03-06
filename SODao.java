package com.cts.soportal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SODao {

	@Autowired
	private EntityManager em;

	public MstrUser findByLoginId(String loginId) {
		Query query = em.createNativeQuery("select * from MSTR_USER where Login_Id = :loginId", MstrUser.class);
		query.setParameter("loginId", loginId);
		List<MstrUser> resulList = query.getResultList();
		return resulList.get(0);
	}

	public List<MstrStatus> findByStatusType(String statusType1, String statusType2) {
		Query query = em.createNativeQuery(
				" SELECT * FROM mstr_status where Status_Type IN (:statusType1, :statusType2)", MstrStatus.class);
		query.setParameter("statusType1", statusType1);
		query.setParameter("statusType2", statusType2);
		List<MstrStatus> resulList = query.getResultList();
		return resulList;
	}

	public List<MstrResourceLocation> findByLocation() {
		// TODO Auto-generated method stub
		Query query = em.createNativeQuery(" SELECT Location_Id,City_Name FROM MSTR_Resource_Location",
				MstrResourceLocation.class);
		List<MstrResourceLocation> resulList = query.getResultList();
		return resulList;
	}

	public List<MstrLob> findByLob() {
		// TODO Auto-generated method stub
		Query query = em.createNativeQuery(" SELECT LOB_Id,LOB_Name FROM MSTR_LOB", MstrLob.class);
		List<MstrLob> resulList = query.getResultList();
		return resulList;
	}

	public void save(SODetail soDetail) {
		Query query = em.createNativeQuery( "INSERT SODETAIL(SO_Id ,SO_Type ,SO_Status ,Practise_Id ,SO_Priority ,SO_Comment,Last_working_date ,Billing_Start_Date ,Location_Type,City_Name ,RIMS_ID ,Tracking_No,Skill_Set ,SO_Creation_date ,Fulfillment_POC ,LOB_Id ,Practise_Area ,Job_Level ,Project_Type ,Project_ID ,DL_Mapping ,EL_Mapping ,Bill_Rate)"
				VALUES('soType',soStatus,practice,priority,uniqueId,soAgeing,soCreationDate,soLastWorkingDate,location,city,rims,tracking,projectType,projectId,projectName,jobLevel,practiceArea,clientLob,fulfillmentPoc,skills,billingDate,blmlsblUpside,leadTime,cp,revenueLoss,riskAmount,dLMapping,elMapping,billRate,soComments), MstrUser.class);
		
		
		// TODO Auto-generated method stub
		
	}

}
