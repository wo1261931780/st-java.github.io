package e���׶���β2021��10��10��.eee072ͼƬ����;
/*
    ����
        ��E:\\itcast\\mn.jpg���Ƶ�ģ��Ŀ¼�µ�mn.jpg

    ˼·��
        1:��������Դ�����ֽ�����������
        2:����Ŀ�ĵش����ֽ����������
        3:��д���ݣ�����ͼƬ(һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����)
        4:�ͷ���Դ
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee073ͼƬ���� {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo.png");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo\\xx.png");
        // ��һ�����е�ʱ��û��ָ������xx.png���Ժ���Ҫע��
        byte[] x3 = new byte[1024];
        // ���1024�����ݵĴ洢��ʽ��Ĭ��1024����������
        int x4;
        while ((x4 = x1.read(x3)) != -1) {
            x2.write(x3, 0, x4);
        }
        // �����ϣ����е��ļ��������ֽڹ��ɵĶ���
        // ������ֽ������������еĶ�д��ʵ���Ͼ�������os�еĸ���ճ������
        x1.close();
        x2.close();
        System.out.println("����");
    }
}
