package e���׶���β2021��10��12��day9.eee094�ַ�������;
/*
    �ַ���������
        BufferedWriter�����ı�д���ַ�������������ַ������ṩ�����ַ���������ַ����ĸ�Чд�룬����ָ����������С�����߿��Խ���Ĭ�ϴ�С��Ĭ��ֵ�㹻�󣬿����ڴ������;
        BufferedReader�����ַ���������ȡ�ı��������ַ������ṩ�ַ���������еĸ�Ч��ȡ������ָ����������С�����߿���ʹ��Ĭ�ϴ�С�� Ĭ��ֵ�㹻�󣬿����ڴ������;

    ���췽����
        BufferedWriter(Writer out)
        BufferedReader(Reader in)
 */

import java.io.*;

public class eee095�ַ������� {
    public static void main(String[] args) throws IOException {
        System.out.println("-----");
        show_write();
        System.out.println("-------------------");
        show_read();
    }

    public static void show_write() throws IOException {
        // FileWriter x1 = new FileWriter("l:\\java\\dd.txt");
        BufferedWriter x1 = new BufferedWriter(new FileWriter("l:\\java\\dd.txt"));
        x1.write("demo");
        x1.write("dddd");
        x1.close();
    }

    public static void show_read() throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader("l:\\java\\dd.txt"));
        char[] x2 = new char[1024];
        int i;
        while ((i = x1.read(x2)) != -1) {
            // System.out.println((char) i);
            System.out.println(new String(x2, 0, i));
            // ����ת��Ϊ�ַ�������ʽ
        }
        System.out.println("��ȡ����");
    }

}
