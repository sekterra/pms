package com.yullin.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 프로젝트 마스터 모델 클래스
 */
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	private String projectName;
	private String projectFromDate;
	private String projectToDate;
	private String projectDesc;
	private String pmId;
	private String useYn;
	private String disuseReason;
	private String createrId;
	private String createDate;
	private String updaterId;
	private String updateDate;

	public Project() {
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectFromDate() {
		return projectFromDate;
	}

	public void setProjectFromDate(String projectFromDate) {
		this.projectFromDate = projectFromDate;
	}

	public String getProjectToDate() {
		return projectToDate;
	}

	public void setProjectToDate(String projectToDate) {
		this.projectToDate = projectToDate;
	}

	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public String getPmId() {
		return pmId;
	}

	public void setPmId(String pmId) {
		this.pmId = pmId;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getDisuseReason() {
		return disuseReason;
	}

	public void setDisuseReason(String disuseReason) {
		this.disuseReason = disuseReason;
	}

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdaterId() {
		return updaterId;
	}

	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
