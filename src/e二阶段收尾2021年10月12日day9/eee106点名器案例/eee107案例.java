package e���׶���β2021��10��12��day9.eee106����������;
/*
    ����
        ����һ���ļ�����洢�˰༶ͬѧ��������ÿһ������ռһ�У�Ҫ��ͨ������ʵ���������

    ˼·��
        1:�����ַ���������������
        2:����ArrayList���϶���
        3:�����ַ���������������ķ���������
        4:�Ѷ�ȡ�����ַ������ݴ洢��������
        5:�ͷ���Դ
        6:ʹ��Random����һ���������������ķ�Χ�ڣ�[0,���ϵĳ���)
        7:�ѵ�6���������������Ϊ������ArrayList�����л�ȡֵ
        8:�ѵ�7���õ�����������ڿ���̨
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class eee107���� {
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new FileReader("l:\\java\\demo.txt"));
        String x1;
        ArrayList<String> x2 = new ArrayList<>();
        while ((x1 = x.readLine()) != null) {
            x2.add(x1);
        }
        System.out.println("��ӽ���");
        Random x3 = new Random();
        String x4 = x2.get(x3.nextInt(x2.size() + 1));
        System.out.println(x4);
        x.close();
        
    }
}
