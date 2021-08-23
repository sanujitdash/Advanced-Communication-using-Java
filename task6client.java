package task6;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
public class task6client {

	public static void main(String[] args)throws Exception {
		Socket s0 = new Socket("127.0.0.1",3100);
		byte[] d = new byte[200];
		InputStream is = s0.getInputStream();
		FileOutputStream f0 = new FileOutputStream("C:\\Users\\LANIAKEA\\Desktop\\PROGRAMS\\JAVA PROGRAMS (ECLIPSE)\\Semester-2\\src\\task6\\ctext.txt");
		is.read(d,0,d.length);
		f0.write(d,0,d.length);
		f0.close();
		is.close();
		s0.close();

	}

}
