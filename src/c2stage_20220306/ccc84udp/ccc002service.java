package c2stage_20220306.ccc84udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc84udp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-09-01  ����һ
 */
public class ccc002service {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(999);// ����˸��ݿͻ���ȷ���˿ڡ������߶˿�һ��
        byte[] byte_pack = new byte[1024 * 64];// һ������64kb�����Ǿ�ʹ��Ĭ�ϵĴ�С�ͳ�����Ϊ���յı�׼
        DatagramPacket demo_p = new DatagramPacket(byte_pack, byte_pack.length);

        demo_s.receive(demo_p);// ͨ��ȥ�������úõİ�
        // String x = new String(byte_pack);// ��������ý��ܵĳ��ȣ�Ĭ�ϰ��ս������ĳ���ȥ��ȡ�ַ���������Ĳ���
        // �������·���˽��յ�������̫����ʵ�����ݺܶ�
        String x = new String(byte_pack, 0, demo_p.getLength());// �����ַ�������Ϊ0���ַ�����ĩβ
        System.out.println("���͵�����Ϊ��" + x);
        System.out.println(demo_p.getAddress());// ��ȡ�ͻ��˵ĵ�ַ��/192.168.3.115
        System.out.println(demo_p.getPort());// ��ȡ�ͻ��˵Ķ˿�59177

        demo_s.close();
        // �����������׼���������ݣ�Ȼ�������ͻ��˷���
    }
}
