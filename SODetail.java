package com.cts.soportal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SO_DETAIL")
public class SODetail {

	@Id
	@GeneratedValue
	private Integer id;

	private String soType;
	private String soStatus;
	private String practise;
	private String priority;
	private int uniqueId;
	private String soAgeing;
	private Date soCreationDate;
	private Date solastworkingDate;
	private String location;
	private String city;
	private String rims;
	private String tracking;
	private String projectType;
	private int projectId;
	private String projectName;
	private String jobLevel;
	private String practiseArea;
	private String clientLob;
	private String fulfillmentPoc;
	private String skills;
	private Date billingDate;
	private String blmlsblUpside;
	private int leadTime;
	private int cp;
	private int revenueLoss;
	private int riskAmount;
	private String dlMapping;
	private String elMapping;
	private String soComments;

	public SODetail() {

	}

	public SODetail(Integer id, String soType, String soStatus, String practise, String priority, int uniqueId,
			String soAgeing, Date socreationDate, Date solastworkingDate, String location, String city, String rims,
			String tracking, String projectType, int projectId, String projectName, String jobLevel,
			String practiseArea, String clientLob, String fulfillmentPoc, String skills, Date billingDate,
			String blmlsblUpside, int leadTime, int cp, int revenueLoss, int riskAmount, String dlMapping,
			String elMapping, String soComments) {
		super();
		this.id = id;
		this.soType = soType;
		this.soStatus = soStatus;
		this.practise = practise;
		this.priority = priority;
		this.uniqueId = uniqueId;
		this.soAgeing = soAgeing;
		this.soCreationDate = socreationDate;
		this.solastworkingDate = solastworkingDate;
		this.location = location;
		this.city = city;
		this.rims = rims;
		this.tracking = tracking;
		this.projectType = projectType;
		this.projectId = projectId;
		this.projectName = projectName;
		this.jobLevel = jobLevel;
		this.practiseArea = practiseArea;
		this.clientLob = clientLob;
		this.fulfillmentPoc = fulfillmentPoc;
		this.skills = skills;
		this.billingDate = billingDate;
		this.blmlsblUpside = blmlsblUpside;
		this.leadTime = leadTime;
		this.cp = cp;
		this.revenueLoss = revenueLoss;
		this.riskAmount = riskAmount;
		this.dlMapping = dlMapping;
		this.elMapping = elMapping;
		this.soComments = soComments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSoType() {
		return soType;
	}

	public void setSoType(String soType) {
		this.soType = soType;
	}

	public String getSoStatus() {
		return soStatus;
	}

	public void setSoStatus(String soStatus) {
		this.soStatus = soStatus;
	}

	public String getPractise() {
		return practise;
	}

	public void setPractise(String practise) {
		this.practise = practise;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getSoAgeing() {
		return soAgeing;
	}

	public void setSoAgeing(String soAgeing) {
		this.soAgeing = soAgeing;
	}

	public Date getSocreationDate() {
		return soCreationDate;
	}

	public void setSocreationDate(Date socreationDate) {
		this.soCreationDate = socreationDate;
	}

	public Date getSolastworkingDate() {
		return solastworkingDate;
	}

	public void setSolastworkingDate(Date solastworkingDate) {
		this.solastworkingDate = solastworkingDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRims() {
		return rims;
	}

	public void setRims(String rims) {
		this.rims = rims;
	}

	public String getTracking() {
		return tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getPractiseArea() {
		return practiseArea;
	}

	public void setPractiseArea(String practiseArea) {
		this.practiseArea = practiseArea;
	}

	public String getClientLob() {
		return clientLob;
	}

	public void setClientLob(String clientLob) {
		this.clientLob = clientLob;
	}

	public String getFulfillmentPoc() {
		return fulfillmentPoc;
	}

	public void setFulfillmentPoc(String fulfillmentPoc) {
		this.fulfillmentPoc = fulfillmentPoc;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public String getBlmlsblUpside() {
		return blmlsblUpside;
	}

	public void setBlmlsblUpside(String blmlsblUpside) {
		this.blmlsblUpside = blmlsblUpside;
	}

	public int getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(int leadTime) {
		this.leadTime = leadTime;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getRevenueLoss() {
		return revenueLoss;
	}

	public void setRevenueLoss(int revenueLoss) {
		this.revenueLoss = revenueLoss;
	}

	public int getRiskAmount() {
		return riskAmount;
	}

	public void setRiskAmount(int riskAmount) {
		this.riskAmount = riskAmount;
	}

	public String getDlMapping() {
		return dlMapping;
	}

	public void setDlMapping(String dlMapping) {
		this.dlMapping = dlMapping;
	}

	public String getElMapping() {
		return elMapping;
	}

	public void setElMapping(String elMapping) {
		this.elMapping = elMapping;
	}

	public String getsoComments() {
		return soComments;
	}

	public void setsoComments(String soComments) {
		this.soComments = soComments;
	}

}
