package com.cg.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="productss")
public class Product {
	@Id
		private static String productId;
		@Column(name="name",length=20)
		private String productName;
		@Column(name="Price",length=120)
		private int productPrice;
		public static String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(String productId, String productName, int productPrice) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.productPrice = productPrice;
		}
		

}
