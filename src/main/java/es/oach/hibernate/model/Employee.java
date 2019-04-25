package es.oach.hibernate.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	private LocalDate dateOfBirth;

	@OneToOne(cascade =
		{ CascadeType.ALL })
	@JoinColumn(name = "ID_ADDRESS")
	private Address address;

	public Employee()
		{

		}

	public Employee(long code, String surname, String name, LocalDate dateOfBirth, Address address)
		{
			this.code = code;
			this.surname = surname;
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.address = address;
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

	public LocalDate getDateOfBirth()
		{
			return dateOfBirth;
		}

	public void setDateOfBirth(LocalDate dateOfBirth)
		{
			this.dateOfBirth = dateOfBirth;
		}

	public Address getAddress()
		{
			return address;
		}

	public void setAddress(Address address)
		{
			this.address = address;
		}

	@Override
	public String toString()
		{
			return "Employee [code=" + code + ", surname=" + surname + ", name=" + name + ", dateOfBirth=" + dateOfBirth
					+ ", address=" + address + "]";
		}

}
