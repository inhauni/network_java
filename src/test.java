import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class test {

    public static String getMACIdentifier(NetworkInterface network) {
        StringBuilder identifier = new StringBuilder();

        try {
            byte[] macBuffer = network.getHardwareAddress();

            if (macBuffer != null) {
                for (int i = 0; i < macBuffer.length; i++) {   // 02X => 16진수
                    identifier.append(String.format("%02X%s",macBuffer[i],(i < macBuffer.length - 1) ? ":" : ""));
                }
            }
            else {
                return "---";
            }
        }
        catch (SocketException ex) {
            ex.printStackTrace();
        }
        return identifier.toString();


    }

    public static void main(String[] args) {


        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.println("IP address: " + address.getHostAddress());
        NetworkInterface network = null;
        try {
            network = NetworkInterface.getByInetAddress(address);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MAC address: " + getMACIdentifier(network));

    }

}