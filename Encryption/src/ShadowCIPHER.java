import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ShadowCIPHER {
	private int key;
	
	
	public ShadowCIPHER(int givenKey) {
		key=givenKey;
	}
	
	
	
	
	

	
	public void mainEncrypt(InputStream inStr, OutputStream outStr) throws IOException {
		boolean done = false;
		while (!done) {
			int next = inStr.read();
			
			if (next == -1) {
				done = true;
			}
			else {
				byte b = (byte) next;
				byte c = (byte) (b+key);
				
				outStr.write(c);
			}
		}
	}
	
}
