package c2stage_20220412.ccc125charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc125
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-15  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String x = "123����";
        byte[] demo = x.getBytes();
        System.out.println(demo.length);//���յ�ǰĬ���ַ��������б���
        System.out.println(Arrays.toString(demo));
        // [49, 50, 51, -26, -75, -117, -24, -81, -107]
        // ����ǰ�������ľ���123�����仰˵��Ӣ�ĺ����ֶ�������
        // ��Ϊ��GBK��ʽ���룬-26, -75��������ʾһ�������֣������Դ�����
        byte[] DEMO2 = x.getBytes(StandardCharsets.UTF_8);// ������Ǳ����쳣��������д����
        System.out.println(DEMO2.length);// ����ַ�������
        System.out.println(Arrays.toString(DEMO2));// �����ָ�����ַ��� ��ͳһ����Ϊ��Ŀ��GBK�����ʽ

        String x2 = new String(DEMO2);// �������޸��ַ����Ժ��ַ���������
        System.out.println(DEMO2);


    }
}
