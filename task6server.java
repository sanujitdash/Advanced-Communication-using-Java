package task6;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class task6server {

	public static void main(String[] args)throws Exception {
		ServerSocket ss = new ServerSocket (3100);
		Socket ss1 = ss.accept();
		FileInputStream f1 = new FileInputStream ("C:\\stext.txt");
		byte d[] = new byte[200];
		f1.read(d,0,d.length);
		OutputStream os = ss1.getOutputStream();
		os.write(d,0,d.length);
		os.close();
		f1.close();
		ss1.close();
		ss.close();

	}

}
