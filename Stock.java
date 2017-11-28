package org.model;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="STOCK_DETAILS")
public class Stock {
	@Id
	@GeneratedValue
	@Column(name="Stock_id")
	private Integer id;
	@Column(name="Stock_productname")
	private String productName;
	@Column(name="Stock_quantity")
	private Integer quantity;
	@Column(name="Stock_netweight")
	private String netWeight;
	@Column(name="Stock_price")
	private Float price;
	@Column(name="Stock_dateOfDelievery")
	private String dateOfDelievery;
	@Column(name="Stock_delieveryAddress")
	@Embedded
	private Address delieveryAddress;
	public Stock() {
		super();
	}

	public Address getDelieveryAddress() {
		return delieveryAddress;
	}

	public void setDelieveryAddress(Address delieveryAddress) {
		this.delieveryAddress = delieveryAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public String getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}


	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDateOfDelievery() {
		return dateOfDelievery;
	}

	public void setDateOfDelievery(String dateOfDelievery) {
		this.dateOfDelievery = dateOfDelievery;
	}

}
