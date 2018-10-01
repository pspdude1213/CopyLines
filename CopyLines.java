import java.io.*;
import java.util.*;

public class CopyLines{

	public static void main(String[] args) throws IOException{
		int linesRead = 0;
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;

		try{
			//inputStream = new BufferedReader(new FileReader("/home/preston/Desktop/Java/input.txt"));	
			//outputStream = new BufferedWriter(new FileWriter("/home/preston/Desktop/Java/output.txt"));
			inputStream = new BufferedReader(new FileReader("./input.txt/"));
			outputStream = new BufferedWriter(new FileWriter("./output.txt/"));
			String l;

			while((l = inputStream.readLine()) != null){
				outputStream.write(l + "\n");
				linesRead++;
			}
			outputStream.flush();
			System.out.println("Lines Read = " + linesRead); 
		}finally{
			if(inputStream == null)
				inputStream.close();

			if(outputStream == null)
				outputStream.close();
		}
	}
}
