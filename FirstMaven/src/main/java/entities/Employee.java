package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp10")
public class Employee {

	@Id
	@Column(name = "EMPNO")
	private int empid;

	@Column(name = "ENAME")
	private String ename;

	@Column(name = "JOB")
	private String job;

	@Column(name = "MGR")
	private int mgr;

	@Column(name = "HIREDATE")
	private Date hiredate;

	@Column(name = "SAL")
	private float sal;

	@Column(name = "DEPTNO")
	private int deptno;

	public Employee() {
		super();
	}

	public Employee(int empid, String ename, String job, int mgr, Date hiredate, float sal, int deptno) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}
