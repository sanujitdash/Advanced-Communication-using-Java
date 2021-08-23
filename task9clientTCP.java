package task9TCP;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class task9clientTCP {

	public static void main(String[] args)throws Exception {
		Socket s0 = new Socket ("127.0.0.1",4000);
		System.out.println("Start conversation:");
		while (true) {
			Scanner s = new Scanner(System.in);
			String n = s.nextLine();
			PrintStream p = new PrintStream(s0.getOutputStream());
			p.println();
			Scanner s1 = new Scanner(s0.getInputStream());
			String t = s1.nextLine();
			System.out.println(t);
			
		}

	}

}
