package c2stage_20220418.eee102���ϵ��ļ�;
/*
    ����
        ��ArrayList�����е��ַ�������д�뵽�ı��ļ���Ҫ��ÿһ���ַ���Ԫ����Ϊ�ļ��е�һ������

    ˼·��
        1:����ArrayList����
        2:�������д洢�ַ���Ԫ��
        3:�����ַ��������������
        4:�������ϣ��õ�ÿһ���ַ�������
        5:�����ַ��������������ķ���д����
        6:�ͷ���Դ
 */

import java.io.*;
import java.util.ArrayList;

public class eee103���� {
    public static void main(String[] args) throws IOException {
        ArrayList<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("bbb");
        x.add("ccc");
        x.add("ddd");
        show(x);
    }

    public static void show(ArrayList<String> x) throws IOException {
        BufferedWriter x1 = new BufferedWriter(new FileWriter("l:\\java\\demo.txt"));
        BufferedReader x2 = new BufferedReader(new FileReader("l:\\java\\demo.txt"));
        String x3;
        // while ((x3 = x2.readLine()) != null) {
        for (int i = 0; i < x.size(); i++) {
            x3 = x.get(i);
            System.out.println(x3);
            x1.write(x3);
            x1.newLine();
            x1.flush();
        }
        System.out.println("����");
    }
}
