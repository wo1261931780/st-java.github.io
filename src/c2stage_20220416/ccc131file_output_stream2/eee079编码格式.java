package c2stage_20220416.ccc131file_output_stream2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class eee079�����ʽ {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String x = "abc";
        // ����һ���ַ�
        byte[] x1 = x.getBytes();
        // ���ַ���ת��Ϊ�ֽ�����
        System.out.println(Arrays.toString(x1));
        // ������ֽ�ת��Ϊstring����
        // �����
        // [97, 98, 99]
        // -----------------------------------------------------
        System.out.println("--------------");
        String xx = "abc����";
        byte[] xx1 = xx.getBytes();
        System.out.println(Arrays.toString(xx1));
        // ���Ϊ��
        // [97, 98, 99, -78, -30, -54, -44]
        // ����Ĭ��ʹ�õ���GBK��ʽ���룬
        // һ�����֣���Ӧ���������ֽ�
        // ���ʹ��UTF-8��ʽ���룬һ�����ֶ�Ӧ�����ֽ�
        byte[] xx2 = xx.getBytes("UTF-8");
        System.out.println(Arrays.toString(xx2));
        // ���Ϊ��
        // [97, 98, 99, -26, -75, -117, -24, -81, -107]
        // ��Ӧ�ı����ʽΪUTF-8��ʽ
        // һ�������ַ�ռ�������ֽ�
        // ���ֵĵ�һ���ֽڶ��Ǹ���
        // java�ײ��ڱ����ʱ����ձ����������

    }
}
