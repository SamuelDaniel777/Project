package com.yash.model;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.aspectj.weaver.tools.Trace;


@Entity
@Table(name = "project_data")
public class Project {
	
	@Id
	@Column(name = "project_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	
	@Column(name = "project_name")
	private String projectName;
	
	@Column(name = "project_desc")
	private String description;
	
	@Column(name = "project_identifier", unique = true)
	private String projectIdentifier;
	
	@Column(name = "project_createddate")
	private Date createdDate;
	
	@Column(name = "project_enddate")
	private Date endDate;
	
	@Column(name = "project_updateddate")
	private Date updatedDate;
	
	@Column(name = "project_startddate")
	private Date startedDate;
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}
	
	public Project() {
	}
	
	public Project(int projectId, String projectName, String description, String projectIdentifier, Date createdDate,
			Date endDate, Date updatedDate, Date startedDate) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
		this.projectIdentifier = projectIdentifier;
		this.createdDate = createdDate;
		this.endDate = endDate;
		this.updatedDate = updatedDate;
		this.startedDate = startedDate;
	}
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", description=" + description
				+ ", projectIdentifier=" + projectIdentifier + ", createdDate=" + createdDate + ", endDate=" + endDate
				+ ", updatedDate=" + updatedDate + ", startedDate=" + startedDate + "]";
	}
	
}
