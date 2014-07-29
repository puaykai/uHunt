package uHunt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ThreeNPlusOne {
	
	public static void main(String[] args){
		
		String input_file_name = "D:\\input.txt";
		
		String output_file_name = "D:\\output.txt";
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(input_file_name));
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(output_file_name));
			
			String line = "";
			
			while((line = reader.readLine())!= null){
				
				String[] array = line.split(" ");
				
				int start_num = Integer.parseInt(array[0]);
				
				int end_num = Integer.parseInt(array[1]);
				
				int count = 0;
				
				int max_count = Integer.MIN_VALUE;
				
				for(int i = start_num; i < end_num + 1; i++){
					
					count = 0;
					
					int num = i;
					
					while( num != 1){
						
						count++;
						
						if( num % 2 == 1 ){
							
							num = 3 * num + 1;
							
						}else{
							
							num = num /2;
						}
					}
					
					max_count = (int) Math.max(count, max_count);
					
				}
				
				
				writer.write(array[0]+" "+array[1]+" "+(max_count+1)+"\n");
				
			}
			
			writer.close();
			
			reader.close();
			
			
		}catch(Exception e){
			
			
		}
		
	}

}
