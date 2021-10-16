package com.yash.productcartapp.main;

import java.util.ArrayList;
import java.util.HashSet;

class ProductsList extends Thread{
		public  String ListProduct() {
			String str="List Product";
			return str;
		}
		public void run() {
			System.out.println(ListProduct());
		}
}

class AddProduct extends Thread{
		public static String AddProduct() {
			String str="AddProduct";
			return str;
		}
		public void run() {
			System.out.println(AddProduct());
		}
}
class VerifyCart extends Thread{
	public static String verifyCart() {
		String str="VerifyCart";
		return str;
	}
	public void run() {
		System.out.println(verifyCart());
	}
}

class ConfirmationPayment extends Thread{
	public static String confirmationPayment() {
		String str="ConfiramtionPayment";
		return str;
	}
	public void run() {
		System.out.println(confirmationPayment());
	}
}

class PrintRecipt  extends Thread{
	public static String printRecipt() {
		String str="PrintRecipt";
		return str;
	}
	public void run() {
		System.out.println(printRecipt());
	}
}

public class ProductApp {

	public static void main(String[] args) {
		
		ProductsList pl= new ProductsList();
		AddProduct ap= new AddProduct();
		VerifyCart vc=new VerifyCart();
		ConfirmationPayment cp=new ConfirmationPayment();
		PrintRecipt pr=new PrintRecipt();
		pl.start();
		ap.start();
		vc.start();
		cp.start();
		pr.start();
		
	}

}
