package c2stage_20220306x.ccc83tcpudp;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc83
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-23  ������
 */
public class ccc001gethostname {
    public static void main(String[] args) throws IOException {
        InetAddress x = InetAddress.getLocalHost();
        System.out.println(x);// LAPTOP-OUE6761M/192.168.3.115
        InetAddress x1 = InetAddress.getByName("www.baidu.com");
        System.out.println(x1.getHostName());// www.baidu.com
        System.out.println(x1.getHostAddress());// 14.215.177.39
        // ��λ�ȡ������ip��һ������Ϊ���������˼�Ⱥ������һ̨崻������������޷�ʹ��

        InetAddress x2 = InetAddress.getByName("14.215.177.39");// ֱ�ӻ�ȡ��ַҲ�ܵõ�һ���Ľ��
        System.out.println(x2.getHostName());// 14.215.177.39���Ƚ�������Ϊ�൱������һ����������

        System.out.println(x2.isReachable(2000));// �ж�ʱ���ڣ��Ƿ������ͨ

    }
}
