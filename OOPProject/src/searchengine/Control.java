package searchengine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Control{

	      static ArrayList<Person> people =new ArrayList<Person>();

		  public static void main(String[] args) {
//				Person p1= new Person("Joe", "Mulholland", "Dublin");
//				Person p2= new Person("Arthur", "Fleck", "NYC");
//				Person p3= new Person("Phineas", "Ferb", "Dublin");
//				
//				people.add(p1);
//				people.add(p2);
//				people.add(p3);
	
//				System.out.println(people.size());
//				System.out.println(people);
//				ArrayList<Person> people = (ArrayList<Person>) people.clone();
//				System.out.println(people2);
			    File base= new File("base.txt");
			    try {
					if (base.createNewFile())
						System.out.println("The file is created");
					else
						System.out.println("The file already exists");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    try {
					FileWriter writer= new FileWriter("base.txt");
					writer.write("Author " + "Janitor " + "Doctor " + "Teacher " + "Scientist " + "Professor " + "Hitman " + "Mechanic " + "Wizard ");
					System.out.println("The file is written");
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			    
				gui Interface = new gui();
				Interface.gui();
				}
}
