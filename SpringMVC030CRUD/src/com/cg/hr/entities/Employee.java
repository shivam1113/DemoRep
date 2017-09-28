package com.cg.hr.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMP")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int empNo;
	private String empNm;
	private float empSal;
	private Date hireDate;
	
	
	public Employee(int empNo, String empNm, float empSal, Date hireDate) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.empSal = empSal;
		this.hireDate = hireDate;
	}
	@Column(name="SAL")
	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Temporal(TemporalType.DATE)
	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Employee(int empNo, String empNm) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPNO")	//Is optional if table column name is same as property name
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
	@Column(name="ENAME")
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	
		@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + ", empSal="
				+ empSal + ", hireDate=" + hireDate + "]";
	}
	public Employee() {
		super();
	}


}
