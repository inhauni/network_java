package Day24Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.Socket;


public class DateClient {
    public static void main(String[] args){

        try(
                Socket client = new Socket("127.0.0.1",9000);
                BufferedReader br= new BufferedReader(new InputStreamReader(client.getInputStream()));
        ){
            System.out.println("DateServer와 연결 완료!");

            String inputdate=br.readLine();

            if(client !=null){
                System.out.println(inputdate);
            }
        }
        catch(Exception e){
            System.out.println("에러 발생");
        }
        System.out.println("시스템 종료");
    }
}
