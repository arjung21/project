package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EMPLOYEES database table.
 * 
 */
@Entity
@Table(name="EMPLOYEES")
@NamedQuery(name="Employees.findAll", query="SELECT e FROM Employee e")
public class EmployeeNO implements Serializable {
	

	@Override
	public String toString() {
	/* String 	str = "Employee (employeeId=" + employeeId + ", "
				+ (commissionPct != null ? "commissionPct=" + commissionPct + ", " : "")
				+ (departmentId != null ? "departmentId=" + departmentId + ", " : "")
				+ (email != null ? "email=" + email + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (hireDate != null ? "hireDate=" + hireDate + ", " : "")
				+ (jobId != null ? "jobId=" + jobId + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (phoneNumber != null ? "phoneNumber=" + phoneNumber + ", " : "")
				+ (salary != null ? "salary=" + salary + ", " : "")
				+ (employee != null ? "employee=" + employee + ", " : "")
				+ (employees != null ? "employees=" + employees : "") + ")";*/
		return "employeeId = "+employee_Id+":"+commissionPct+departmentId+email+firstName+lastName+hireDate+jobId+lastName+phoneNumber+managerId;
	 //return str;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMPLOYEE_ID", unique=true, nullable=false, precision=6)
	private long employee_Id;

	@Column(name="COMMISSION_PCT", precision=2, scale=2)
	private BigDecimal commissionPct;

	@Column(name="DEPARTMENT_ID", precision=4)
	private BigDecimal departmentId;

	@Column(unique=true, nullable=false, length=25)
	private String email;

	@Column(name="FIRST_NAME", length=20)
	private String firstName;

	@Temporal(TemporalType.DATE)
	@Column(name="HIRE_DATE", nullable=false)
	private Date hireDate;

	@Column(name="JOB_ID", nullable=false, length=10)
	private String jobId;

	@Column(name="LAST_NAME", nullable=false, length=25)
	private String lastName;

	@Column(name="PHONE_NUMBER", length=20)
	private String phoneNumber;

	@Column(precision=8, scale=2)
	private BigDecimal salary;

	@Column(name="MANAGER_ID")
	private BigDecimal managerId;
	//bi-directional many-to-one association to Employee
	/*@ManyToOne
	@JoinColumn(name="MANAGER_ID")
	private Employee employee;*/

	//bi-directional many-to-one association to Employee
/*	@OneToMany(mappedBy="employee")
	private List<Employee> employees;*/

	public BigDecimal getManagerId() {
		return managerId;
	}

	public void setManagerId(BigDecimal managerId) {
		this.managerId = managerId;
	}

	public EmployeeNO() {
	}

	public long getEmployee_Id() {
		return this.employee_Id;
	}

	public void setEmployee_Id(long employeeId) {
		this.employee_Id = employeeId;
	}

	public BigDecimal getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}

	public BigDecimal getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	/*public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/

	/*public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}*/

	/*public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setEmployee(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setEmployee(null);

		return employee;
	}*/

}