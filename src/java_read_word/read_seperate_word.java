package java_read_word;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class read_seperate_word {
	
	static ArrayList<String> st = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		ArrayList word_array = new ArrayList();
		while((line = br.readLine()) != null)
		{
			String[] s = line.split("\\s+");
			for(int i = 0; i < s.length;i++)
			{
				//System.out.println(s[i]);
				st.add(s[i]);
			}
			
			
		}
		
		br.close();
		fr.close();
		
		for(int i = 0; i < st.size();i++)
		{
			System.out.println(st.get(i));
		}
		
	}

}
