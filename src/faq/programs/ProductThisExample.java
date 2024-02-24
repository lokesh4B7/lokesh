package faq.programs;

import java.util.Scanner;

class Product1 {
	String prodName, prodCode;
	double prodPrice, discount;

	Product1(String prodName, double prodPrice, String prodCode, double discount) {
		System.out.println("This Constructor has FOUR Parameters");
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodCode = prodCode;
		this.discount = discount;
		System.out.println("Hellooooo " + prodName);
	}

	void printProdDetails() {
		System.out.println("This is Print method - whcih is instance method of product class");
		System.out.println("Product Name is  : " + prodName);
		System.out.println("Product Price  is  : " + prodPrice);
		System.out.println("Product Code is  : " + prodCode);
		System.out.println("Product Discount is  : " + discount);
	}
}

public class ProductThisExample {
	public static void main(String[] args) {
		String prodName, prodCode;
		double prodPrice, discount;
		System.out.println("---This is main Method ---");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Prudct Name");
		prodName = s.nextLine();
		System.out.println("Enter Prudct Code");
		prodCode = s.nextLine();
		System.out.println("Enter Prudct Price");
		prodPrice = s.nextDouble();
		System.out.println("Enter Prudct Discount");
		discount = s.nextDouble();
		Product1 p2 = new Product1(prodName, prodPrice, prodCode, discount);
		p2.printProdDetails();
		System.out.println("=== Trying to print with Object Reference====");
		System.out.println("Product Code is  : " + p2.prodCode);
		s.close();
	}

}