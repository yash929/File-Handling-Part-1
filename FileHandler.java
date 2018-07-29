 import java.io.*;
 public class FileHandler {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Yash/Desktop/GIT/abc.txt");
		f.createNewFile();
		 System.out.println("Path=" +f.getPath());
		 
			try {  
		
	            Writer w = new FileWriter("abc.txt");  
	            String str = "Hi";  
	            w.write(str);  
	            w.close();  
	            
	            System.out.println("Action Completed!");  
	        }
			catch (IOException e) {  
	            e.printStackTrace(); }  
			
			
			try {  
	            Reader r = new FileReader("abc.txt");  
	            int data = r.read(); 
	            
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = r.read();  
	            }  
	            r.close();  
	        } catch (Exception ex) {  
	            System.out.println(ex); 
	            }
 		
		
	}
}