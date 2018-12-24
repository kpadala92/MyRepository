package com.brt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MST_MasterTickets")
public class WorkLogRawData {
	@Id
	private Long ticketID				;     		
	private String issue_Key             ;
	private String issue_summary         ;
	private String account_Key           ;
	private String account_Name          ;
	private String issue_Type            ;
	private String issue_Status          ;
	private String project_Key           ;
	private String parent_Key            ;
	private String reporter              ;
	private String epic_Link             ;
	private String epic_Name             ;
	private String account_Client        ;
	private String parent_Ticket         ;
	private String billable              ;
	private String deliverable_Type      ;
	private String platform              ;
	private String due_Date              ;
	private String actual_End_Date       ;
	private Double story_Points          ;
	private Double time_Estimate         ;
	private String required_Status       ;
	private String categorized_Platform  ;
	private String financeCatg           ;
	private Integer financeCatgOrdered    ;
	private String totals_Category       ;
	private Integer totals_Category_Order ;
	private String summary_Category      ;
	private Integer summaryCategoryOrder  ;
	private Integer importLogID           ;
	private Integer userID                ;
	private Date createdDate           ;
	private Date lastUpdateOn          ;
	public Long getTicketID() {
		return ticketID;
	}
	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}
	public String getIssue_Key() {
		return issue_Key;
	}
	public void setIssue_Key(String issue_Key) {
		this.issue_Key = issue_Key;
	}
	public String getIssue_summary() {
		return issue_summary;
	}
	public void setIssue_summary(String issue_summary) {
		this.issue_summary = issue_summary;
	}
	public String getAccount_Key() {
		return account_Key;
	}
	public void setAccount_Key(String account_Key) {
		this.account_Key = account_Key;
	}
	public String getAccount_Name() {
		return account_Name;
	}
	public void setAccount_Name(String account_Name) {
		this.account_Name = account_Name;
	}
	public String getIssue_Type() {
		return issue_Type;
	}
	public void setIssue_Type(String issue_Type) {
		this.issue_Type = issue_Type;
	}
	public String getIssue_Status() {
		return issue_Status;
	}
	public void setIssue_Status(String issue_Status) {
		this.issue_Status = issue_Status;
	}
	public String getProject_Key() {
		return project_Key;
	}
	public void setProject_Key(String project_Key) {
		this.project_Key = project_Key;
	}
	public String getParent_Key() {
		return parent_Key;
	}
	public void setParent_Key(String parent_Key) {
		this.parent_Key = parent_Key;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getEpic_Link() {
		return epic_Link;
	}
	public void setEpic_Link(String epic_Link) {
		this.epic_Link = epic_Link;
	}
	public String getEpic_Name() {
		return epic_Name;
	}
	public void setEpic_Name(String epic_Name) {
		this.epic_Name = epic_Name;
	}
	public String getAccount_Client() {
		return account_Client;
	}
	public void setAccount_Client(String account_Client) {
		this.account_Client = account_Client;
	}
	public String getParent_Ticket() {
		return parent_Ticket;
	}
	public void setParent_Ticket(String parent_Ticket) {
		this.parent_Ticket = parent_Ticket;
	}
	public String getBillable() {
		return billable;
	}
	public void setBillable(String billable) {
		this.billable = billable;
	}
	public String getDeliverable_Type() {
		return deliverable_Type;
	}
	public void setDeliverable_Type(String deliverable_Type) {
		this.deliverable_Type = deliverable_Type;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getDue_Date() {
		return due_Date;
	}
	public void setDue_Date(String due_Date) {
		this.due_Date = due_Date;
	}
	public String getActual_End_Date() {
		return actual_End_Date;
	}
	public void setActual_End_Date(String actual_End_Date) {
		this.actual_End_Date = actual_End_Date;
	}
	public Double getStory_Points() {
		return story_Points;
	}
	public void setStory_Points(Double story_Points) {
		this.story_Points = story_Points;
	}
	public Double getTime_Estimate() {
		return time_Estimate;
	}
	public void setTime_Estimate(Double time_Estimate) {
		this.time_Estimate = time_Estimate;
	}
	public String getRequired_Status() {
		return required_Status;
	}
	public void setRequired_Status(String required_Status) {
		this.required_Status = required_Status;
	}
	public String getCategorized_Platform() {
		return categorized_Platform;
	}
	public void setCategorized_Platform(String categorized_Platform) {
		this.categorized_Platform = categorized_Platform;
	}
	public String getFinanceCatg() {
		return financeCatg;
	}
	public void setFinanceCatg(String financeCatg) {
		this.financeCatg = financeCatg;
	}
	public Integer getFinanceCatgOrdered() {
		return financeCatgOrdered;
	}
	public void setFinanceCatgOrdered(Integer financeCatgOrdered) {
		this.financeCatgOrdered = financeCatgOrdered;
	}
	public String getTotals_Category() {
		return totals_Category;
	}
	public void setTotals_Category(String totals_Category) {
		this.totals_Category = totals_Category;
	}
	public Integer getTotals_Category_Order() {
		return totals_Category_Order;
	}
	public void setTotals_Category_Order(Integer totals_Category_Order) {
		this.totals_Category_Order = totals_Category_Order;
	}
	public String getSummary_Category() {
		return summary_Category;
	}
	public void setSummary_Category(String summary_Category) {
		this.summary_Category = summary_Category;
	}
	public Integer getSummaryCategoryOrder() {
		return summaryCategoryOrder;
	}
	public void setSummaryCategoryOrder(Integer summaryCategoryOrder) {
		this.summaryCategoryOrder = summaryCategoryOrder;
	}
	public Integer getImportLogID() {
		return importLogID;
	}
	public void setImportLogID(Integer importLogID) {
		this.importLogID = importLogID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdateOn() {
		return lastUpdateOn;
	}
	public void setLastUpdateOn(Date lastUpdateOn) {
		this.lastUpdateOn = lastUpdateOn;
	}
	
}
