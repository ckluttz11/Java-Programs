package ist242;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Order {

public Order(){
}

public static void createOrderFile() {
	try{
		File file = new File("filename.txt");
		if (file.createNewFile()) {
		System.out.println("File created: " + file.getName());
		} else{
		System.out.println("File already exists.");
		}
		} catch (IOException e) {
		System.out.println("An error occured.");
		e.printStackTrace();
		}
	}


public static void writeOrderFile() {
	try{
		FileWriter writer = new FileWriter("filename.txt");
		writer.write("Welcome to IST 242 Java Programming");
		writer.close();
		System.out.println("Succesffuly wrote to the file.");
		} catch (IOException e) {
		System.out.println("An error occured.");
		e.printStackTrace();
		}
	}


public static void deleteOrderFile() {
File file = new File("filename.txt");
if (file.delete()){
System.out.println("Deleted the file: " + file.getName());
} else {
System.out.println("Failed to delete the file.");
}
}
}	