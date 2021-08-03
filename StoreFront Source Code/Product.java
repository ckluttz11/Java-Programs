package ist242; 

 

import java.util.Scanner;  // Import the Scanner class 


public class Product{ 

 

/** 

* The productId property unique record identifier for the product 

* The productName property stores the full product description 

*/ 

 private int productId; 

 private String productName; 

 

/**Constructor method for the Product - empty object*/ 

 public Product(){ 

  } 

 

/** 

* Setter method for the productId 

* @param prodId product identifier 

*/ 

 public void setProductId(int prodId){ 

  productId = prodId; 

 } 

 

/** 

* Setter method for the productName 

* @param prodName product name 

*/ 

 public void setProductName(String prodName){ 

  productName = prodName; 

 } 

 

/** 

* Getter method for the productId 

* @return productId 

*/ 

 public int getProductId(){ 

  return productId; 

 } 

 

/** 

* Getter method for the productName 

* @return productName 

*/ 

 public String getProductName(){ 

  return productName; 

 } 

 

/** Prompt the user for  method for the productId and productName */ 

 public void promptUserProduct(){ 

  Scanner scan = new Scanner(System.in);  

  System.out.println("Enter Product Id"); 

  productId = scan.nextInt();  //Read user input int 

  scan.nextLine();  //Clear out the carriage return 

  System.out.println("Enter Product Name"); 

  productName = scan.nextLine();  //Read user input String 

 } 

 

} 