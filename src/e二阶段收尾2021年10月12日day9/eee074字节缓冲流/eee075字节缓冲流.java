package e���׶���β2021��10��12��day9.eee074�ֽڻ�����;

import java.io.*;

public class eee075�ֽڻ����� {
    public static void main(String[] args) throws IOException {
        File x = new File("L:\\java\\demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);
        BufferedOutputStream x1 = new BufferedOutputStream(new FileOutputStream(x));
        // ����Ĵ���ϲ�����������
        // Դ���룺
        // public BufferedOutputStream(OutputStream out) {
        // this(out, 8192);
        // }
        // public BufferedOutputStream(OutputStream out, int size) {
        // super(out);
        // if (size <= 0) {
        //     throw new IllegalArgumentException("Buffer size <= 0");
        // }
        // buf = new byte[size];
        // }
        // �൱�����ڲ���װ��һ��8192�ֽڵ�����
        x1.write("www".getBytes());
        // ����ʵ���ϻ������������Ϊִ�е���������������
        x1.write("demo".getBytes());
        x1.close();
        // FileInputStream x2 = new FileInputStream(x);
        // int i;
        // while ((i = x2.read()) != -1) {
        //     System.out.print((char) i);
        // }
        System.out.println("-----------------------------");
        // ͨ���ֽڻ�������ȡ����
        BufferedInputStream x3 = new BufferedInputStream(new FileInputStream(x));
        int i;
        while ((i = x3.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println("-----------------------------");
        // ͨ��������ʽ��ȡ����
        byte[] xx = new byte[1024];
        // 1.����һ������
        int x4;
        // 2.����һ��int���͵ı������������ն�ȡ��������
        while ((x4 = x3.read()) != -1) {
            // ����ȡ��δ������ʱ��
            System.out.println(new String(xx, 0, x4));
        }

    }
}
