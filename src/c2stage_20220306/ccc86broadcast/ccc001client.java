package c2stage_20220306.ccc86broadcast;

import java.io.IOException;
import java.net.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc86broadcast
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-13  ����һ
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(8080);
        byte[] demo_st = "123456".getBytes();
        // DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length, InetAddress.getLocalHost(), 12356);
        DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length, InetAddress.getByName("255.255.255.255"), 12356);
        // ���ߵĲ�ͬ�����������˹㲥ip
        demo_s.send(demo_p);
        demo_s.close();
    }
}
