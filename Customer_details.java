package org.login;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="CUSTOMER_DETAILS")
public class Customer_details {
	@Id
	@GeneratedValue
	@Column(name="User_id")
	private Integer id;
	@Column(name="Cust_name")
	private String cust_Name;
	@Column(name="cust_mailid")
	private String cust_mailid;
	@Column(name="Cust_phoneno")
	private String Cust_phoneno;
	@Column(name="Cust_Address")
	@Embedded
	private Address address;
	public Customer_details() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_mailid() {
		return cust_mailid;
	}

	public void setCust_mailid(String cust_mailid) {
		this.cust_mailid = cust_mailid;
	}

	public String getCust_phoneno() {
		return Cust_phoneno;
	}

	public void setCust_phoneno(String cust_phoneno) {
		Cust_phoneno = cust_phoneno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
