package c2stage_20220415.ccc128file_input_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220414
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-08  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        // ͬ���Ƕ�ȡ���ݣ����ʹ��������Ϊ������λ��ȡ
        InputStream x = new FileInputStream("src/c2stage_20220415/ccc128file_input_stream/demo.txt");
        // byte[] x1 = new byte[3];
        // int demo1 = x.read(x1);// ����õ��Ҷ�ȡ�ĳ���
        // String str = new String(demo1);
        // System.out.println(str);// 3,����Ӧ����jdk�İ汾���죬�Ҷ�ȡ�Ľ����ֻ�ж�ȡ���ֽڸ���
        // �̳�չʾ���Ǿ�����ֽ�����
        // ������漰����
        // ����Ҷ�ζ�ȡ��12345������ֽڣ�����3��һ�飬һ����ȡ����
        // ���εĽ������123��453��
        // ��Ϊ���ֽ�������ʽ���ڶ�ȡ������ʱ�򣬻���ǰ��ȡ��ǰ������
        // ͬ�������ȡ��ϣ���ֱ�ӷ���-1
        // int read = x.read(x1);
        // String x2 = new String(x1, 0, read);// 4as
        // System.out.println(x2);
        // ����һ������Ĵ��룬��ȡһ���ֽ���������ݣ���0��ʼ�����������Ҷ�ȡ�ĳ���
        show(x);
        // ԭʼ����Ϊ123456abcd
    }

    public static void show(InputStream s) throws IOException {
        byte[] x = new byte[3];
        int demolength = 0;
        while ((demolength = s.read(x)) != -1) {
            String demo = new String(x, 0, demolength);
            // ������ȡ�ĺô����ڣ��������ǿ�ж�ȡ�����
            // ��ȡ�����һ�Σ����ֻ��һ���ֽڣ�Ҳ�ᰴ��һ���ֽ�չʾ���
            System.out.println(demo);
            // ����Ҳ������
            // ����ҵ����ݣ����ǰ���3���еģ�����12����
            // ���ʱ���ȡ���ͻᰴ��12�������ʽ��û�п��Ǳ��룬ֱ�Ӱ���3�ı���ȥ��ȡ
        }
    }
}
