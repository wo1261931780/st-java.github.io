package e���׶���β2021��10��12��day9.eee082�������;
/*
    ���룺
        byte[] getBytes()��ʹ��ƽ̨��Ĭ���ַ������� String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�������
        byte[] getBytes(String charsetName)��ʹ��ָ�����ַ������� String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�������

    ���룺
        String(byte[] bytes)��ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ� String
        String(byte[] bytes, String charsetName)��ͨ��ָ�����ַ�������ָ�����ֽ������������µ� String
 */

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class eee083������� {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("----");
        String x = "aaa����";
        byte[] x1 = x.getBytes("UTF-8");
        // ָ�������ʽ��
        // Ȼ�󽫵õ������ݴ浽x1������
        System.out.println(Arrays.toString(x1));
        // ���������
        // [97, 97, 97, -26, -75, -117, -24, -81, -107]
        // String x2 = new String(x1);
        // ����
        String x2 = new String(x1, "GBK");
        // ���뷽ʽ�������aaa测试
        System.out.println(x2);
        // aaa����
    }
}
