package com.hibernate.hibernate_OneToOne_uni_direction.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Person{

	@Id
	private int personId;
	private String personName;
	private String personemail;
	private long personPhone;
	
	@OneToOne
	@JoinColumn(name = "panid")
	private Pan pan;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonemail() {
		return personemail;
	}

	public void setPersonemail(String personemail) {
		this.personemail = personemail;
	}

	public long getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person [\npersonId=" + personId + ", \npersonName=" + personName + ", \npersonemail=" + personemail
				+ ", \npersonPhone=" + personPhone + ", \npan=" + pan + "]";
	}
		
}
