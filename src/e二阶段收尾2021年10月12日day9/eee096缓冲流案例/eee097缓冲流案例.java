package e���׶���β2021��10��12��day9.eee096����������;
/*
    ����
        ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java

    ˼·��
        1:��������Դ�����ַ���������������
        2:����Ŀ�ĵش����ַ��������������
        3:��д���ݣ������ļ�
        4:�ͷ���Դ
 */

import java.io.*;

public class eee097���������� {
    public static void main(String[] args) throws IOException {
        copydemo();
    }

    public static void copydemo() throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader("l:\\java\\eee087.java"));
        BufferedWriter x2 = new BufferedWriter(new FileWriter("l:\\java\\22.java"));
        int i;
        char[] x3 = new char[1024];
        while ((i = x1.read(x3)) != -1) {
            x2.write(x3, 0, i);
            // x2.write(i);
        }
        x1.close();
        x2.close();
        System.out.println("����");

    }
}
