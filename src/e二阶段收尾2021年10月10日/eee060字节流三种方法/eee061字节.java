package e���׶���β2021��10��10��.eee060�ֽ������ַ���;

import java.io.File;
import java.io.FileNotFoundException;
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
        // һ��дһ���ֽ���������
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
        // ��������0��λ�ÿ�ʼ��дx4�ĳ��ȵ�����
        x1.close();
    }
}
