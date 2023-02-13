package edu.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
//import java.net.UnknownHostException;

public class Day21 {

	public static void main(String[] args) {
		 try {         
			 URL url = new URL("http://www.daum.net");  // if 잘못된 주소이면 connection이 만들어지지 않음         
			 URLConnection urlConnection = url.openConnection();  // 주소와 연결 생성
			 BufferedReader br = new BufferedReader(       //getInputStream() : connection된 주소와의 stream 생성          
				 new InputStreamReader(urlConnection.getInputStream()) /*inputstreamreader : 웹 브라우저의 html코드를 텍스트 형태로 담아둠 
				 														-> bufferedreader로 다시 임시저장공간에 저장*/
			);         // decorator 2개와 같은 형식
			 String line;        
			 while ((line = br.readLine()) != null) {     // br을 한줄씩 line에 넣어서 null이 나오기 전까지 한줄씩 출력        
				 System.out.println(line);         
			 	}         
			 br.close();     
		 } 
		 
		 catch (IOException ex) {         // Handle exceptions     }

			System.out.println("입출력 오류");

		}

	}
			
}
