package task9TCP;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class task9serverTCP {

	public static void main(String[] args)throws Exception {
	ServerSocket ss = new ServerSocket(4000);
	Socket ss1 = ss.accept();
	Scanner j = new Scanner(System.in);
	while (true) {
		Scanner s1 = new Scanner(ss1.getInputStream());
		String a = s1.nextLine();
		System.out.println(a);
		String b = j.nextLine();
		PrintStream p = new PrintStream(ss1.getOutputStream());
		p.println(b);
		
	}

	}

}
