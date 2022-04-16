package c2stage_20220416.ccc135file_write;
/*
    ����
        ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java

    ����Դ��Ŀ�ĵصķ���
        ����Դ��myCharStream\\ConversionStreamDemo.java --- ������ --- Reader --- InputStreamReader --- FileReader
        Ŀ�ĵأ� myCharStream\\ Copy.java --- д���� --- Writer --- OutputStreamWriter --- FileWriter

    ˼·��
        1:��������Դ�����ַ�����������
        2:����Ŀ�ĵش����ַ����������
        3:��д���ݣ������ļ�
        4:�ͷ���Դ
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class eee093���ư��� {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\eee087.java");
        show(x);
        System.out.println("--");
    }

    public static void show(File x) throws IOException {
        // InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        FileReader x1 = new FileReader(x);
        // ������Ӽ��
        // OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream("l:\\java\\33.java"));
        FileWriter x2 = new FileWriter("l:\\java\\demo\\22.java");
        char[] xx = new char[1024];
        int i;
        while ((i = x1.read(xx)) != -1) {
            x2.write(xx, 0, i);
        }
        x1.close();
        x2.close();
    }
}
