package e���׶���β2021��10��12��day9.eee100�����ļ�����;
/*
    ����
        ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java

    ˼·��
        1:��������Դ�����ַ���������������
        2:����Ŀ�ĵش����ַ��������������
        3:��д���ݣ������ļ�
            ʹ���ַ����������й���ʵ��
        4:�ͷ���Դ
 */

import java.io.*;

public class eee101���ư��� {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\eee087.java");
        readshow(x);
    }

    public static void readshow(File x) throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader(x));
        BufferedWriter x4 = new BufferedWriter(new FileWriter("l:\\java\\copy.java"));
        char[] x2 = new char[1024];
        String x3;
        while ((x3 = x1.readLine()) != null) {
            x4.write(x3);
            // ����ֻ��ȡ�����ݣ�����Ը�ʽ���д���
            x4.newLine();
            // �ֶ���ӻ���
            x4.flush();
            // �ֶ�ˢ�´�ȡ
        }
        x1.close();
        x4.close();
        System.out.println("����");
    }
}
