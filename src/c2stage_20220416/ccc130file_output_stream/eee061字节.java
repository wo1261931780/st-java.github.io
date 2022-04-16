package c2stage_20220416.ccc130file_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * ���췽����
 * FileOutputStream (String name)�������ļ��������ָ��������д���ļ�
 * FileOutputStream (File file)�������ļ��������д����ָ���� File�����ʾ���ļ�
 * д���ݵ����ַ�ʽ��
 * void write (int b)����ָ�����ֽ�д����ļ������
 * һ��дһ���ֽ�����
 * void write (byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����ļ������
 * һ��дһ���ֽ���������
 * void write (byte[] b, int off, int len)���� len�ֽڴ�ָ�����ֽ����鿪ʼ����ƫ����off��ʼд����ļ������
 * һ��дһ���ֽ�����Ĳ�������
 */
public class eee061�ֽ� {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java");
        FileOutputStream x1 = new FileOutputStream("l:\\java\\demo2.txt");
        // �쳣��Ҫ�׳�
        // FileOutputStream x2=new FileOutputStream(x);
        // ���������ģ��������������
        // ��file·����װ��һ������
        // --
        // һ���µ�����ǣ��ҿ�������һ��x·������
        // Ȼ���ٰ�x���ݸ�x1����x1ִ���ļ�����
        x1.write(11);
        // void write (int b)����ָ�����ֽ�д����ļ������
        // һ��дһ���ֽ�����
        byte[] x2 = {97, 98, 99, 100, 101};
        x1.write(x2);
        // void write (byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����ļ������
        // x1.write(x2);����ʵ���Ͼ��ǰ�x2�������ȫ��д����x1��
        // Ȼ����x1�г���x2���ֽ�������abcde
        // һ��дһ���ֽ���������
        // --
        byte[] x3 = "����".getBytes(StandardCharsets.UTF_8);
        // �������ԡ���Ϊһ���ַ�����ֵ��x3��
        // Ȼ��x3��Ϊ�ַ��������õ�����
        // ����x3������ֵ
        x1.write(x3);
        byte[] x4 = "aaaa".getBytes(StandardCharsets.UTF_8);
        // void write (byte[] b, int off, int len)��
        // �� len�ֽڴ�ָ�����ֽ����鿪ʼ����ƫ����off��ʼд����ļ������
        // һ��дһ���ֽ�����Ĳ�������
        x1.write(x4, 0, x4.length);
        // ��������0��λ�ÿ�ʼ��д��x4�����������ݣ�
        // д������ݳ���Ϊx4.length
        x1.close();
    }
}
