package e���׶���β2021��10��10��.eee068�����ı��ļ�����;
/*
    ����
        �ѡ�E:\\itcast\\���ﴰ��.txt�����Ƶ�ģ��Ŀ¼�µġ����ﴰ��.txt��

        ����Դ��
            E:\\itcast\\���ﴰ��.txt --- ������ --- InputStream --- FileInputStream
        Ŀ�ĵأ�
            myByteStream\\���ﴰ��.txt --- д���� --- OutputStream --- FileOutputStream

    ˼·��
        1:��������Դ�����ֽ�����������
        2:����Ŀ�ĵش����ֽ����������
        3:��д���ݣ������ı��ļ�(һ�ζ�ȡһ���ֽڣ�һ��д��һ���ֽ�)
        4:�ͷ���Դ
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee069���� {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo.txt");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo2.txt");
        int x3;
        while ((x3 = x1.read()) != -1) {
            System.out.print((char) x3);
            x2.write(x3);
        }
        x1.close();
        x2.close();
        System.out.println("����");
    }
}
