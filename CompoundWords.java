package uHunt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;

public class CompoundWords {
	
	public static void main(String[] args){

		String input_file_name = "D://input.txt";
		
		String output_file_name = "D://output.txt";
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(input_file_name));
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(output_file_name));
			
			String line = "";
			
			ArrayList<String> list_of_string = new ArrayList<String>();
			
			while((line = reader.readLine()) != null){
				
				list_of_string.add(line);
			}
			
			ArrayList<String> answers = new ArrayList<String>();
			
			for(String s : list_of_string){
				
				for(String t : list_of_string){
					
					if(s.indexOf(t) == 0 && s != t){
						
						for(String u : list_of_string){
							
							if( s.indexOf(u) == t.length() && (t.length() + u.length() ==s.length())){
								
								//System.out.println("In loop");
								
								answers.add(s);
								
								break;
							}
						}
					}
				}
			}
			
			for(String s: answers){
				
				System.out.println(s);
				
				writer.write(s+"\n");
			}
			
			writer.close();
			reader.close();
			
		}catch (Exception e){
			
			
		}
	}

}
