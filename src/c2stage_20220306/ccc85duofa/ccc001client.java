package c2stage_20220306.ccc85duofa;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc85duofa
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-10-34  ����һ
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        // udpͨ�ţ����Ϸ��ͣ�ֱ��exit
        DatagramSocket demo_s = new DatagramSocket(7777);// �������ָ���ҵĶ˿��Ƕ���
        // ָ���Ժ󣬶Է����վ��Ƕ��٣���ָ��������£�Ĭ�ϰ�����䣬
        // ����ָ��������£��࿪�ͻ��˾���Ҫ���úã������ͻ
        Scanner x = new Scanner(System.in);
        while (true) {
            System.out.println("���룺");
            String s = x.nextLine();
            // if (s.equals("exit")) {
            if ("exit".equals(s)) {// ����ͰͿ�������
                // System.exit(0);
                demo_s.close();
                break;
            }
            byte[] demo_st = s.getBytes();
            DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length, InetAddress.getLocalHost(), 18959);
            // �����ǶԷ��Ķ˿�
            demo_s.send(demo_p);
        }
        // demo_s.close();
    }
}
