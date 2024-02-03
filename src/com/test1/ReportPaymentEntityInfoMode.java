package com.test1;

public class ReportPaymentEntityInfoMode {
	private Integer ReportPaymentKey;
	private String swiftGroupKey;
	private String groupParentKey;
	private String instStatus;
	private String copGroupKey;
	private String ssiGroupKey;
	private String ibanKey;
	private String nationalId;
	private String remarks;
	private String brpKey;
	private String creation_date;
	private String entityState;
	private String modifiedDate;

	public ReportPaymentEntityInfoMode() {

	}

	public ReportPaymentEntityInfoMode(Integer reportPaymentKey, String swiftGroupKey, String groupParentKey,
			String instStatus, String copGroupKey, String ssiGroupKey, String ibanKey, String nationalId,
			String remarks, String brpKey, String creation_date, String entityState, String modifiedDate) {
		super();
		ReportPaymentKey = reportPaymentKey;
		this.swiftGroupKey = swiftGroupKey;
		this.groupParentKey = groupParentKey;
		this.instStatus = instStatus;
		this.copGroupKey = copGroupKey;
		this.ssiGroupKey = ssiGroupKey;
		this.ibanKey = ibanKey;
		this.nationalId = nationalId;
		this.remarks = remarks;
		this.brpKey = brpKey;
		this.creation_date = creation_date;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getReportPaymentKey() {
		return ReportPaymentKey;
	}

	public void setReportPaymentKey(Integer reportPaymentKey) {
		ReportPaymentKey = reportPaymentKey;
	}

	public String getSwiftGroupKey() {
		return swiftGroupKey;
	}

	public void setSwiftGroupKey(String swiftGroupKey) {
		this.swiftGroupKey = swiftGroupKey;
	}

	public String getGroupParentKey() {
		return groupParentKey;
	}

	public void setGroupParentKey(String groupParentKey) {
		this.groupParentKey = groupParentKey;
	}

	public String getInstStatus() {
		return instStatus;
	}

	public void setInstStatus(String instStatus) {
		this.instStatus = instStatus;
	}

	public String getCopGroupKey() {
		return copGroupKey;
	}

	public void setCopGroupKey(String copGroupKey) {
		this.copGroupKey = copGroupKey;
	}

	public String getSsiGroupKey() {
		return ssiGroupKey;
	}

	public void setSsiGroupKey(String ssiGroupKey) {
		this.ssiGroupKey = ssiGroupKey;
	}

	public String getIbanKey() {
		return ibanKey;
	}

	public void setIbanKey(String ibanKey) {
		this.ibanKey = ibanKey;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getBrpKey() {
		return brpKey;
	}

	public void setBrpKey(String brpKey) {
		this.brpKey = brpKey;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
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

}
