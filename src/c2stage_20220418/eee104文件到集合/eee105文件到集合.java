package c2stage_20220418.eee104�ļ�������;
/*
    ����
        ���ı��ļ��е����ݶ�ȡ�������У����������ϡ�Ҫ���ļ���ÿһ��������һ������Ԫ��

    ˼·��
        1:�����ַ���������������
        2:����ArrayList���϶���
        3:�����ַ���������������ķ���������
        4:�Ѷ�ȡ�����ַ������ݴ洢��������
        5:�ͷ���Դ
        6:��������
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class eee105�ļ������� {
    public static void main(String[] args) throws IOException {
        ArrayList<String> xx = new ArrayList<>();
        readshow(xx);
        System.out.println("--------------");
        for (int i = 0; i < xx.size(); i++) {
            System.out.println(xx.get(i));
        }
        System.out.println("--------------");
        System.out.println(xx);
    }

    public static void readshow(ArrayList<String> xx) throws IOException {
        BufferedReader x = new BufferedReader(new FileReader("l:\\java\\demo.txt"));
        String x1 = "";
        while ((x1 = x.readLine()) != null) {
            // xx.add(x1 + "\r\n");
            xx.add(x1);
        }
        x.close();
        System.out.println("����");

    }
}
