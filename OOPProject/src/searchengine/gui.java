package searchengine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.*;

public class gui extends JFrame implements ActionListener{

static ArrayList<Person> people =new ArrayList<Person>();
static JFrame frame;
static JTextField sterm;
//static JTextField lname;
//static JTextField city;
static JButton Search;
static JButton Show;
static JPanel panel1;
static JTextArea textarea;

public void gui()
{
	frame = new JFrame("Search Engine");
	frame.setSize(800, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	sterm = new JTextField(20);
	Search = new JButton("Search");
	Show = new JButton("Show All");
	panel1 = new JPanel();
	panel1.add(sterm);
//	panel1.add(lname);
//	panel1.add(city);
	panel1.add(Search);
	panel1.add(Show);
	textarea = new JTextArea();
	frame.getContentPane().add(BorderLayout.NORTH, panel1);
	frame.getContentPane().add(BorderLayout.CENTER, textarea);
	frame.setVisible(true);
	Search.addActionListener(this);
	Show.addActionListener(this);
}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == Search)
		{
//			Person p1 = new Person(sterm.getText());
//			people.add(p1);
			//JOptionPane.showMessageDialog(this, "Results for "+sterm.getText());
			for(Person i: people)
			{
				textarea.append(i.toString());
			}
			try (BufferedReader reader= new BufferedReader(new FileReader("base.txt")))
			{
				String line= reader.readLine();
				while (line != null)
				{
					if (line.contains(sterm.getText()))
					{		
						textarea.append(" Term found");
					}
					else
					{
						textarea.append(" Term not found");
					}
					line=reader.readLine();
				}
			} catch (IOException er) {
				System.err.println("Error reading file : " +er.getMessage());
			}
		
//			if (sterm.getText() == "Super Secret");
//				JOptionPane.showMessageDialog(this, "You entered the secret term ");
		}
		else if(e.getSource() == Show)
		{
			for(Person i: people)
			{
				textarea.append(i.toString());
			}
		}
//		else if(e.getSource() == Show)
//		{
//			people.clear();
//		}
		
	}
}

