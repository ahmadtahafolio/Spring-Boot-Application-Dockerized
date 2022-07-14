package com.example.groceryStore.model;

public class CustomerDetailsResponse {


	 private int customerId;
	 
	 private String customerName;

	 private String bill;

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getBill() {
			return bill;
		}

		public void setBill(String bill) {
			this.bill = bill;
		}

		public CustomerDetailsResponse(int customerId, String customerName, String bill) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.bill = bill;
		}
	    
	    

   }
