package c2stage_20220306x.ccc84udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc84udp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-45  ������
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        DatagramSocket client_s = new DatagramSocket();
        // �����ڲ�������Ҫ�����˿ںţ���Ϊ�Դ��˿�
        byte[] client_pack = "1324564".getBytes();// ��װ����
        DatagramPacket client_p = new DatagramPacket(client_pack, client_pack.length, InetAddress.getLocalHost(), 999);
        client_s.send(client_p);// ���Ͷ˷������ݸ����ն�
        client_s.close();
    }
}
