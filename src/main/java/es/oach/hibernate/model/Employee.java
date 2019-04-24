package es.oach.hibernate.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODE_EMPLOYEE")
	private long code;

	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	public Employee()
		{

		}

	public Employee(long code, String surname, String name, Date dateOfBirth)
		{
			this.code = code;
			this.surname = surname;
			this.name = name;
			this.dateOfBirth = dateOfBirth;
		}

	public long getCode()
		{
			return code;
		}

	public void setCode(long code)
		{
			this.code = code;
		}

	public String getSurname()
		{
			return surname;
		}

	public void setSurname(String surname)
		{
			this.surname = surname;
		}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public Date getDateOfBirth()
		{
			return dateOfBirth;
		}

	public void setDateOfBirth(Date dateOfBirth)
		{
			this.dateOfBirth = dateOfBirth;
		}

	@Override
	public String toString()
		{
			return "Employee [code=" + code + ", surname=" + surname + ", name=" + name + ", dateOfBirth=" + dateOfBirth
					+ "]";
		}

}
