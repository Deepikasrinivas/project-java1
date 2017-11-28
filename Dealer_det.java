package org.login;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="DEALER_DETAILS")
public class Dealer_det {


	
		@Id
		@GeneratedValue
		@Column(name="dealer_id")
		private Integer id;
		@Column(name="dealer_name")
		private String dealer_Name;
		@Column(name="dealer_mailid")
		private String dealer_mailid;
		@Column(name="dealer_phoneno")
		private String dealer_phoneno;
		@Column(name="dealer_Address")
		@Embedded
		private Address1 address;
		public Dealer_det() {
			super();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDealer_Name() {
			return dealer_Name;
		}

		public void setDealer_Name(String dealer_Name) {
			this.dealer_Name = dealer_Name;
		}

		public String getDealer_mailid() {
			return dealer_mailid;
		}

		public void setDealer_mailid(String dealer_mailid) {
			this.dealer_mailid = dealer_mailid;
		}

		public String getDealer_phoneno() {
			return dealer_phoneno;
		}

		public void setDealer_phoneno(String dealer_phoneno) {
			this.dealer_phoneno = dealer_phoneno;
		}

		public Address1 getAddress() {
			return address;
		}

		public void setAddress(Address1 address) {
			this.address = address;
		}

	}


