package c2stage_20220306x.ccc85duofa;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc85duofa
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-10-42  ����һ
 */
public class ccc002service {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(18959);//1.����ͨ�ţ����ö˿�
        byte[] demo_st = new byte[1024 * 64];// 2.��������ĳ���
        int st_length = demo_st.length;// 3.����ʵ�ʵĳ���

        String show_st = "";// 6.չʾ���������Ϊ0-�ܳ���
        while (true) {
            DatagramPacket demo_p = new DatagramPacket(demo_st, st_length);// 4.�����ַ������úý��յĳ���
            demo_s.receive(demo_p);// 5.����
            // show_st = new String(demo_st, 0, st_length);
            show_st = new String(demo_st, 0, demo_p.getLength());// Ҫȥ��ȡ���ȣ�����ֱ�ӵõ�����
            System.out.println("���յ��Ľ��Ϊ��" + show_st + "���Է���ַ��" + demo_p.getAddress() + "���Է��˿ڣ�" + demo_p.getPort());
        }

    }
}
