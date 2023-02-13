package edu.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class SimpleEchoClient {
	
		public static void main(String args[]) {         
			
			System.out.println("Simple Echo Client");
			
			Socket clientSocket=null;
			PrintWriter pw = null;
			BufferedReader br =null;
			try {         
				System.out.println("Waiting for connection.....");         
				InetAddress localAddress = InetAddress.getLocalHost();          
				try{
					clientSocket = new Socket(localAddress, 6000);                     
					pw = new PrintWriter(clientSocket.getOutputStream(), true);                     
					br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					
					System.out.println("서버에 연결됨");
					Scanner sc =new Scanner(System.in);
					while(true) {
						System.out.print("전송 메세지 입력 : ");
						String line =sc.nextLine();
						if("quit".equalsIgnoreCase(line)) {             
							break;         }         
						pw.println(line);         
						String response = br.readLine();         
						System.out.println("Server response: " + response);   
					}
				}     
				catch (IOException ex) { 
					System.out.println("접속 실패");}
				}
			catch (IOException ex) { 
				System.out.println("접속 실패");}
			} 
	
	
}
