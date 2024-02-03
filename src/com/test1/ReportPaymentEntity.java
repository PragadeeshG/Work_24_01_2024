package com.test1;

public class ReportPaymentEntity {
	private Integer ReportPaymentKey;
	private Integer recordKey;
	private String effectiveDate;
	private Integer institutionName;
	private String officeType;
	private String parentOfficeType;
	private String headOfficeKey;
	private String legalType;
	private String entityState;
	private String modifiedDate;
	private String remarks;

	public ReportPaymentEntity() {

	}

	public ReportPaymentEntity(Integer reportPaymentKey, Integer recordKey, String effectiveDate,
			Integer institutionName, String officeType, String parentOfficeType, String headOfficeKey, String legalType,
			String entityState, String modifiedDate, String remarks) {
		super();
		ReportPaymentKey = reportPaymentKey;
		this.recordKey = recordKey;
		this.effectiveDate = effectiveDate;
		this.institutionName = institutionName;
		this.officeType = officeType;
		this.parentOfficeType = parentOfficeType;
		this.headOfficeKey = headOfficeKey;
		this.legalType = legalType;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	public Integer getReportPaymentKey() {
		return ReportPaymentKey;
	}

	public void setReportPaymentKey(Integer reportPaymentKey) {
		ReportPaymentKey = reportPaymentKey;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(Integer institutionName) {
		this.institutionName = institutionName;
	}

	public String getOfficeType() {
		return officeType;
	}

	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}

	public String getParentOfficeType() {
		return parentOfficeType;
	}

	public void setParentOfficeType(String parentOfficeType) {
		this.parentOfficeType = parentOfficeType;
	}

	public String getHeadOfficeKey() {
		return headOfficeKey;
	}

	public void setHeadOfficeKey(String headOfficeKey) {
		this.headOfficeKey = headOfficeKey;
	}

	public String getLegalType() {
		return legalType;
	}

	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
