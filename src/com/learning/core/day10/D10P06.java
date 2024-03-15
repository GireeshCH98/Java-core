package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class D10P06 {

	public static void main(String[] args) 
	{
		try
		{
			FileReader fre = new FileReader("DavidEnglish.txt");
			FileReader frs = new FileReader("DavidScience.txt");
			FileReader frc = new FileReader("DavidComputer.txt");
			BufferedReader bre = new BufferedReader(fre);
			BufferedReader brs = new BufferedReader(frs);
			BufferedReader brc = new BufferedReader(frc);
			
			File f = new File("DavidNotes.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			BufferedWriter fbr = new BufferedWriter(fw);
			
			String l1 = bre.readLine();
			while(l1 != null)
			{
				fbr.write(l1);
				fbr.flush();
				l1=bre.readLine();
				fbr.newLine();
			}
			fbr.newLine();
			String l2 = brs.readLine();
			while(l2 != null)
			{
				fbr.write(l2);
				fbr.flush();
				l2 = brs.readLine();
				fbr.newLine();
			}
			fbr.newLine();
			String l3 = brc.readLine();
			while(l3 != null)
			{
				fbr.write(l3);
				fbr.flush();
				l3=brc.readLine();
				fbr.newLine();
			}
			System.out.println("Copied successfully.");
			fre.close();
			frs.close();
			frc.close();
			fw.close();
			bre.close();
			brs.close();
			brc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
