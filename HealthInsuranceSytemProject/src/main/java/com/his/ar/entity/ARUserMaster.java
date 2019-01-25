package com.his.ar.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * @author nit
 * Entity class case worker registration
 * 
 */
@Entity
@Table(name="AR_USER_MASTER")
@Data
public class ARUserMaster {
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_FIRST_NAME")
	private String firstName;
	@Column(name="USER_LAST_NAME")
	private String lastName;
	@Column(name="USER_EMAIL")
	private String userEmail;
	@Column(name="USER_PWD")
	private String userPwd;
	@Column(name="USER_DOB")
	private Date userDob;
	@Column(name="USER_PHNO")
	private String userPhno;
	@Column(name="USER_ROLE")
	private String userRole;
	@Column(name="ACTIVE_SW")
	private String activeSw;
	@Column(name="CRATED_DATE")
	private Timestamp createDate;
	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
}//close class
