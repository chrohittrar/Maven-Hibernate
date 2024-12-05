package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "emp100")
public class Employee {
	
		@Id 
		@Column (name = "EMPNO")
		private int empid;
		
		@Column (name="ENAME")
		private String ename;
		
		@Column (name="SAL")
		private float sal;
		
		
		public Employee() {
			super();
		}
		

		public Employee(int empid, String ename, float sal) {
			this.empid = empid;
			this.ename = ename;
			this.sal = sal;
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

		public float getSal() {
			return sal;
		}

		public void setSal(float sal) {
			this.sal = sal;
		}
			
		
}
