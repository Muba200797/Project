package interviewprep;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Test {
	

	
	    public static void main(String[] args) {
	        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	           //e.printStackTrace();
	          
	        
	    }
	}

}
