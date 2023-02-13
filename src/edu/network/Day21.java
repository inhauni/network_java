package edu.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day21 {

	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.inha.ac.kr");
//			InetAddress addr = InetAddress.getByName("www.kiminha.ac.kr"); //UnknownHostException 발생
//			System.out.println(addr);
			System.out.println(addr.getCanonicalHostName());
			System.out.println(addr.getHostAddress());
		} catch (UnknownHostException e) {  // python 의 exception 구문과 같은 역할
			
//			e.printStackTrace();
			System.out.println("해당 url은 존재하지 않습니다.");
		}

	}

}
