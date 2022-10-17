package com.nttdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="userresponse")

public class Response {

//	@Id
//	private int id;
//	@Type(type = "json")
//    @Column(columnDefinition = "json")
//	private String response;
//	
//	
//	public Response() {
//		
//	}
//
//
//	public Response(int id, String response) {
//		super();
//		this.id = id;
//		this.response = response;
//	}
//
//
//	public int getid() {
//		return id;
//	}
//
//
//	public void setid(int id) {
//		this.id = id;
//	}
//
//
//	public String getResponse() {
//		return response;
//	}
//
//
//	public void setResponse(String response) {
//		this.response = response;
//	}
//	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private String uemail;
	private int qid;
	private String response;
	public Response() {
		
	}
	public Response(int rid, String uemail, int qid, String response) {
		super();
		this.rid = rid;
		this.uemail = uemail;
		this.qid = qid;
		this.response = response;
	}
	public int getrid() {
		return rid;
	}
	public void setrid(int rid) {
		this.rid = rid;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
