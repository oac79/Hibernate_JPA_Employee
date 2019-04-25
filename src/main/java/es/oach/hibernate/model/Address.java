package es.oach.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@Column(name = "ID_ADDRESS")
	private Long id;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTRY")
	private String country;

	public Address()
		{

		}

	public Address(Long id, String address, String city, String country)
		{
			this.id = id;
			this.address = address;
			this.city = city;
			this.country = country;
		}

	public Long getId()
		{
			return id;
		}

	public void setId(Long id)
		{
			this.id = id;
		}

	public String getAddress()
		{
			return address;
		}

	public void setAddress(String address)
		{
			this.address = address;
		}

	public String getCity()
		{
			return city;
		}

	public void setCity(String city)
		{
			this.city = city;
		}

	public String getCountry()
		{
			return country;
		}

	public void setCountry(String country)
		{
			this.country = country;
		}

	@Override
	public String toString()
		{
			return "Address [id=" + id + ", address=" + address + ", city=" + city + ", country=" + country + "]";
		}

}
