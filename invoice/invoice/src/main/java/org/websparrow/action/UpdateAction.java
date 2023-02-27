package org.websparrow.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.websparrow.bean.InvoiceBean;
import org.websparrow.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620917L;
	private String invoiceDate = "", item = "", item1 = "", item2 = "", item3 = "", item4 = "", item5 = "", item6 = "",
			item7 = "", item8 = "", item9 = "", price = "", price1 = "", price2 = "", price3 = "", price4 = "",
			price5 = "", price6 = "", price7 = "", price8 = "", price9 = "", quantity = "", quantity1 = "",
			quantity2 = "", quantity3 = "", quantity4 = "", quantity5 = "", quantity6 = "", quantity7 = "",
			quantity8 = "", quantity9 = "", totalPrice = "", totalPrice1 = "", totalPrice2 = "", totalPrice3 = "",
			totalPrice4 = "", totalPrice5 = "", totalPrice6 = "", totalPrice7 = "", totalPrice8 = "", totalPrice9 = "",
			total_invoice_amount = "", customerName = "";
	private int invoiceId;
	private String msg = "";
	ResultSet rs = null;
	Admin dao = new Admin(); 
	String submitType;
	private List<String> itemNames;
	private List<String> customerNameList;
	

	@Override
	public String execute() throws Exception {
		try {

			itemNames = dao.getItemNames();
			customerNameList = dao.getcustomerNames();
			if (submitType.equals("updatedata")) {
				 
				 rs = dao.fetchUserDetails1(invoiceId);
					if (rs != null) {
						int count = 0;
						while (rs.next()) {
							// Create a new Invoice object and set its properties from the result set
							ArrayList<InvoiceBean> invoiceDetails = new ArrayList<>();
							InvoiceBean invoice = new InvoiceBean();
							if (count == 0) {
								
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem(rs.getString("item"));
								invoice.setPrice(rs.getString("price"));
								invoice.setQuantity(rs.getString("quantity"));
								invoice.setTotalPrice(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));
								
							} else if (count == 1) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem1(rs.getString("item"));
								invoice.setPrice1(rs.getString("price"));
								invoice.setQuantity1(rs.getString("quantity"));
								invoice.setTotalPrice1(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 2) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem2(rs.getString("item"));
								invoice.setPrice2(rs.getString("price"));
								invoice.setQuantity2(rs.getString("quantity"));
								invoice.setTotalPrice2(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 3) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem3(rs.getString("item"));
								invoice.setPrice3(rs.getString("price"));
								invoice.setQuantity3(rs.getString("quantity"));
								invoice.setTotalPrice3(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 4) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem4(rs.getString("item"));
								invoice.setPrice4(rs.getString("price"));
								invoice.setQuantity4(rs.getString("quantity"));
								invoice.setTotalPrice4(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 5) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem5(rs.getString("item"));
								invoice.setPrice5(rs.getString("price"));
								invoice.setQuantity5(rs.getString("quantity"));
								invoice.setTotalPrice5(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 6) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem6(rs.getString("item"));
								invoice.setPrice6(rs.getString("price"));
								invoice.setQuantity6(rs.getString("quantity"));
								invoice.setTotalPrice6(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 7) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem7(rs.getString("item"));
								invoice.setPrice7(rs.getString("price"));
								invoice.setQuantity7(rs.getString("quantity"));
								invoice.setTotalPrice7(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 8) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem8(rs.getString("item"));
								invoice.setPrice8(rs.getString("price"));
								invoice.setQuantity8(rs.getString("quantity"));
								invoice.setTotalPrice8(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							} else if (count == 9) {
								invoice.setInvoiceId(rs.getInt("invoiceId"));
								invoice.setInvoiceDate(rs.getString("invoiceDate"));
								invoice.setCustomerName(rs.getString("customerName"));
								invoice.setItem9(rs.getString("item"));
								invoice.setPrice9(rs.getString("price"));
								invoice.setQuantity9(rs.getString("quantity"));
								invoice.setTotalPrice9(rs.getString("totalPrice"));
								invoice.setTotal_invoice_amount(rs.getString("total_invoice_amount"));

							}

							// Add the Invoice object to the list
							invoiceDetails.add(invoice);
							count++;
						}
					}
				
			}else {
				
				invoiceId=dao.deleteUserDetails(invoiceId);
				int i = dao.updateUserDetails(invoiceId, invoiceDate, customerName, item, item1, item2, item3, item4,
						item5, item6, item7, item8, item9, price, price1, price2, price3, price4, price5, price6,
						price7, price8, price9, quantity, quantity1, quantity2, quantity3, quantity4, quantity5,
						quantity6, quantity7, quantity8, quantity9, totalPrice, totalPrice1, totalPrice2, totalPrice3,
						totalPrice4, totalPrice5, totalPrice6, totalPrice7, totalPrice8, totalPrice9,
						total_invoice_amount);
				if (i > 0) {
					msg = "Record Updated Successfuly";
				} else {
					msg = "error";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";

	}
	

	

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public List<String> getCustomerNameList() {
		return customerNameList;
	}

	public void setCustomerNameList(List<String> customerNameList) {
		this.customerNameList = customerNameList;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItem1() {
		return item1;
	}

	
	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getItem7() {
		return item7;
	}

	public void setItem7(String item7) {
		this.item7 = item7;
	}

	public String getItem8() {
		return item8;
	}

	public void setItem8(String item8) {
		this.item8 = item8;
	}

	public String getItem9() {
		return item9;
	}

	public void setItem9(String item9) {
		this.item9 = item9;
	}

	public String getPrice1() {
		return price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}

	public String getPrice3() {
		return price3;
	}

	public void setPrice3(String price3) {
		this.price3 = price3;
	}

	public String getPrice4() {
		return price4;
	}

	public void setPrice4(String price4) {
		this.price4 = price4;
	}

	public String getPrice5() {
		return price5;
	}

	public void setPrice5(String price5) {
		this.price5 = price5;
	}

	public String getPrice6() {
		return price6;
	}

	public void setPrice6(String price6) {
		this.price6 = price6;
	}

	public String getPrice7() {
		return price7;
	}

	public void setPrice7(String price7) {
		this.price7 = price7;
	}

	public String getPrice8() {
		return price8;
	}

	public void setPrice8(String price8) {
		this.price8 = price8;
	}

	public String getPrice9() {
		return price9;
	}

	public void setPrice9(String price9) {
		this.price9 = price9;
	}

	public String getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(String quantity1) {
		this.quantity1 = quantity1;
	}

	public String getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(String quantity2) {
		this.quantity2 = quantity2;
	}

	public String getQuantity3() {
		return quantity3;
	}

	public void setQuantity3(String quantity3) {
		this.quantity3 = quantity3;
	}

	public String getQuantity4() {
		return quantity4;
	}

	public void setQuantity4(String quantity4) {
		this.quantity4 = quantity4;
	}

	public String getQuantity5() {
		return quantity5;
	}

	public void setQuantity5(String quantity5) {
		this.quantity5 = quantity5;
	}

	public String getQuantity6() {
		return quantity6;
	}

	public void setQuantity6(String quantity6) {
		this.quantity6 = quantity6;
	}

	public String getQuantity7() {
		return quantity7;
	}

	public void setQuantity7(String quantity7) {
		this.quantity7 = quantity7;
	}

	public String getQuantity8() {
		return quantity8;
	}

	public void setQuantity8(String quantity8) {
		this.quantity8 = quantity8;
	}

	public String getQuantity9() {
		return quantity9;
	}

	public void setQuantity9(String quantity9) {
		this.quantity9 = quantity9;
	}

	public String getTotalPrice1() {
		return totalPrice1;
	}

	public void setTotalPrice1(String totalPrice1) {
		this.totalPrice1 = totalPrice1;
	}

	public String getTotalPrice2() {
		return totalPrice2;
	}

	public void setTotalPrice2(String totalPrice2) {
		this.totalPrice2 = totalPrice2;
	}

	public String getTotalPrice3() {
		return totalPrice3;
	}

	public void setTotalPrice3(String totalPrice3) {
		this.totalPrice3 = totalPrice3;
	}

	public String getTotalPrice4() {
		return totalPrice4;
	}

	public void setTotalPrice4(String totalPrice4) {
		this.totalPrice4 = totalPrice4;
	}

	public String getTotalPrice5() {
		return totalPrice5;
	}

	public void setTotalPrice5(String totalPrice5) {
		this.totalPrice5 = totalPrice5;
	}

	public String getTotalPrice6() {
		return totalPrice6;
	}

	public void setTotalPrice6(String totalPrice6) {
		this.totalPrice6 = totalPrice6;
	}

	public String getTotalPrice7() {
		return totalPrice7;
	}

	public void setTotalPrice7(String totalPrice7) {
		this.totalPrice7 = totalPrice7;
	}

	public String getTotalPrice8() {
		return totalPrice8;
	}

	public void setTotalPrice8(String totalPrice8) {
		this.totalPrice8 = totalPrice8;
	}

	public String getTotalPrice9() {
		return totalPrice9;
	}

	public void setTotalPrice9(String totalPrice9) {
		this.totalPrice9 = totalPrice9;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotal_invoice_amount() {
		return total_invoice_amount;
	}

	public void setTotal_invoice_amount(String total_invoice_amount) {
		this.total_invoice_amount = total_invoice_amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}

}
