package Day24Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {
    public static void main(String[] args) {

        System.out.println("Day24Practice.DateServer 생성!");
        System.out.println("Day24Practice.DateClient 연결 대기중.....");

        try(ServerSocket serversoket = new ServerSocket(9000);
            Socket connectsocket =serversoket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(connectsocket.getInputStream()));
            PrintWriter pw = new PrintWriter(connectsocket.getOutputStream(),true);
            ){
            System.out.println("연결 완료!");
            String date = null;


                if (connectsocket != null) {
                    date = new Date().toString();
                    System.out.println("Date : " + date);
                    pw.println("Date : " + date);

                }


        }

        catch(Exception e){
            System.out.println("오류 발생");
        }
        System.out.println("시스템 종료");
    }
}
