package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���췽����
 * InputStreamReader (InputStream in)������һ��ʹ��Ĭ���ַ�����InputStreamReader
 * �����ݵ�2�ַ�ʽ��
 * int read ()��һ�ζ�һ���ַ�����
 * int read (char[] cbuf)��һ�ζ�һ���ַ���������
 */
public class eee089������ {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\dd.txt");
        // re(x);
        re2(x);
    }

    public static void re(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        int i;
        while ((i = x1.read()) != -1) {
            System.out.println((char) i);
        }
        // ��Ҫע����ǣ�
        // �����ȡ�ַ����ݣ��ǰ���ÿ���ַ�����չʾ��
        // ������������֣�չʾ���ǲ�+��
        // �����ַ�����ݱ����������Զ�ת��
        x1.close();
    }

    public static void re2(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        char[] x2 = new char[1024];
        int i;
        while ((i = x1.read(x2)) != -1) {
            // System.out.println((char) i);
            System.out.println(new String(x2, 0, i));
            // ���飬ƫ��������ȡ�����ַ�����i
            // ��Ҫ���͵��ǣ������ȡ���ļ����Ϳ���������ģ�
            // ����java�ļ������ջᰴ��txt�ı���ʽȥ��ȡ
        }
        x1.close();
    }
}
// ��������
// ѧУ�շѣ�ѧ�ӷѶ��٣����ͳ�ƣ�
