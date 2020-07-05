package _adv_java.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.PrintStream;

import java.util.Scanner;

public class Reader {

	public static void main(String[] args) {
		
		
		//Reading from data.txt file (referenced as ReaderFile) using the Scanner
		try {
			
			String F_location =  File.separator + "Users"+ File.separator +"lafik"+ File.separator +"eclipse-workspace"+ File.separator +"project"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"_adv_java"+ File.separator +"project"+ File.separator +"data.txt";
		
			File ReaderFile = new File(F_location);
						
			Scanner ReaderScanner = new Scanner(ReaderFile);
			
			String newline = ReaderScanner.nextLine();
			
			// Splittin the file
			String[] person = newline.split(",");
			
			String name = person[0];
			String sex = person[1];
			String age = person[2];
			String height = person[3];
			String weight = person[4];
			
			Person p = new Person();
			int Age = Integer.parseInt(age);
			float Height = Float.parseFloat(height);
			float Weight = Float.parseFloat(weight);
			
			p.setName(name);
			p.setSex(sex);
			p.setAge(Age);
			p.setHeight(Height);
			p.setWeight(Weight);
			
			PrintStream console = new PrintStream ("C:\\Users\\lafik\\eclipse-workspace\\project\\output\\mvnbuild1.out");
			System.out.println("Person: "+ p.toString());
			Arrays.sort(person);
			System.setOut(console);
			System.out.print("newline: "+ newline);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
