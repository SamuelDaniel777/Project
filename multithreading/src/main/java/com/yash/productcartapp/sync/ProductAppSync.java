package com.yash.productcartapp.sync;

import java.util.ArrayList;
import java.util.HashSet;

class Product extends Thread{
	
	public static synchronized ArrayList product() {
		
		ArrayList productList=new ArrayList<>();
		productList.add("Rice");
		productList.add("Wheat");
		productList.add("Flour");
		productList.add("Sugar");
		productList.add("Rajma");
		productList.add("Beans");
		productList.add("corn flour");
		return productList;
	}
	
	@Override
	public void run() {
		synchronized (this){
			System.out.println("Product "+product());
			this.notify();			//child thread giving notification
		}
	}
}

class AddProduct extends Thread{
	
	public static synchronized ArrayList<ProductList> addProduct() {
		
		ArrayList<ProductList> al=new ArrayList<>();
		al.add(new ProductList(11,100.10,"rice"));
		al.add(new ProductList(12,121.10,"wheat"));
		al.add(new ProductList(11,200.10,"sugar"));
		return al;
		
	}
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Product Added" +addProduct());
			this.notify();
		}
	}
}

class VerifyCart extends Thread{
	
	public static synchronized ArrayList<ProductList>  verifyProduct() {
		
		ArrayList<ProductList> al=new ArrayList<>();
		al.add(new ProductList(11,100.10,"rice"));
		al.add(new ProductList(12,121.10,"wheat"));
		al.add(new ProductList(11,200.10,"sugar"));
		return al;
		
	}
	
	@Override
	public void run() {
		synchronized(this) {
			System.out.println("Verify Cart" +verifyProduct());
			this.notify();
		}
		
	}
}

class ConfirmPayment extends Thread{
	
	public static synchronized String paymetnConfirm() {
		return "Payment Confirmation";
		
	}
	
	@Override
	public void run() {
		synchronized(this) {
			System.out.println(paymetnConfirm());
			this.notify();
		}
	}
}

class PrintRecipt extends Thread{
	
	public static synchronized double printRecipt() {
		VerifyCart vc=new VerifyCart();
		return 123.4;
	}
	
	@Override
	public void run() {
		synchronized(this) {
			System.out.println(printRecipt());
			this.notify();
		}
	}
}

public class ProductAppSync {

	public static void main(String[] args) throws InterruptedException {
		Product pl= new Product();
		AddProduct ap= new AddProduct();
		VerifyCart vc=new VerifyCart();
		PrintRecipt pr=new PrintRecipt();
		pl.start();
		pl.setName("Thread ABC");
//		System.out.println(pl.getPriority());
//		Thread.sleep(1000);
		synchronized (pl) {
			System.out.println("main thread is going to be in waiting state");
			pl.wait();
			System.out.println("main thread got notification");
		}
		ap.start();
		synchronized (ap) {
			ap.wait();
		}
		vc.start();
		synchronized (vc) {
			vc.wait();
		}
		pr.start();
		synchronized (pr) {
			pr.wait();
		}
		System.out.println(pl.getName());
	}

}
