import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

class One{
    private One(){

    }

    public static One produceOneInstance(){  // return type = One 객체
        return new One();   // 생성자를 호출하는 코드
    }

}
public class test {


    public static void main(String[] args) {
//        One o = new One();

        One o = One.produceOneInstance(); // 꼭 생성자만이 새 객체를 만들 수 있는 것은 아니다
    }




}