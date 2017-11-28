package org.login;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="CUSTOMER_DETAILS")
public class Order_details {
		@Id
		@GeneratedValue
		@Column(name="Order_id")
		private Integer id;
		@Column(name="Product_name")
		private String Product_Name;
		@Column(name="Product_id")
		private String Product_id;
		@Column(name="Payment_type")
		private String Payment_type;

}
