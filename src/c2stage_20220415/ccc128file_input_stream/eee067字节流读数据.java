package c2stage_20220415.ccc128file_input_stream;
/*
    ����
        ���ļ�fos.txt�е����ݶ�ȡ�����ڿ���̨���

    FileInputStream�����ļ�ϵͳ�е��ļ���ȡ�����ֽ�
        FileInputStream(String name)��ͨ������ʵ���ļ�������������һ��FileInputStream,���ļ����ļ�ϵͳ�е�·����name����

    ʹ���ֽ������������ݵĲ��裺
        1:�����ֽ�����������
        2:�����ֽ�����������Ķ����ݷ���
        3:�ͷ���Դ
 */

import java.io.FileInputStream;
import java.io.IOException;

public class eee067�ֽ��������� {
    public static void main(String[] args) throws IOException {
        FileInputStream x = new FileInputStream("l:\\java\\demo.txt");
        // int x1 = x.read();
        // System.out.println(x1);
        // System.out.println((char) x1);
        // ǿת�Ժ����d
        // ����ַ����Ƚ϶̣���ȡ�����Ժ�ֱ�ӷ���-1
        System.out.println("--------------------");
        // for (int i = 0; x.read() != -1; i++) {
        //     int x2 = x.read();
        //     // System.out.println(x2);
        //     System.out.print((char) x2);
        // }
        // �����ѭ���У�iȫ�̶�û��ʹ��
        // ͬʱ��ÿ��readʵ���϶�ǰ����һλ�������յ��¶�ȡ���ַ�������
        // �Ľ���ʹ��whileѭ��
        int x2;
        while ((x2 = x.read()) != -1) {
            // int x2 = x.read();
            System.out.print((char) x2);
        }
        x.close();
    }
}
