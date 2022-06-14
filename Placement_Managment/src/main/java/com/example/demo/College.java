package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class College {
    private Integer id;
    //private String collegeadmin;
    private String collegename;
    private String location;
    public College() {
    }
 
    public College(Integer id, String collegename, String location) {
        this.id = id;
       // this.collegeadmin = collegeadmin;
        this.collegename = collegename;
        this.location = location;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public String getCollegeadmin() {
		return collegeadmin;
	}

	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}*/

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegename=" + collegename + ", location="
				+ location + "]";
	}

	
   
	
	}
 
   
