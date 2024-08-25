package com.procedure.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@NamedStoredProcedureQuery(name="readBonus",procedureName="calculatebonus",parameters= {
		@StoredProcedureParameter(mode=ParameterMode.IN,name="eno",type=Integer.class),
		@StoredProcedureParameter(mode=ParameterMode.OUT,name="name",type=String.class),
		@StoredProcedureParameter(mode=ParameterMode.OUT,name="bonus",type=Double.class)
})
public class Employee {
	@Id
	private Integer empno;
	private String ename;
	private Double sal;
	private Integer deptno;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	

}
