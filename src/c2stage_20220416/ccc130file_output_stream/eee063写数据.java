package c2stage_20220416.ccc130file_output_stream;
/*
    �ֽ���д���ݵ�����С����:
        1:�ֽ���д�������ʵ�ֻ����أ�
            window:\r\n
            linux:\n
            mac:\r
        2:�ֽ���д�������ʵ��׷��д���أ�
            public FileOutputStream (String name,boolean append)
                �����ļ��������ָ��������д���ļ���
                ����ڶ�������Ϊtrue �����ֽڽ�д���ļ���ĩβ�����ǿ�ͷ
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee063д���� {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);
        FileOutputStream x1 = new FileOutputStream(x, true);
        // ���棬���ߵĲ�ͬ���ڣ������Ĳ���֧��׷��д��
        // ���ǣ�׷��д��ֻ�ܴ�ĩβ��ʼ��
        // ����ԭʽ123��׷��000�Ժ�ֻ����123000
        for (int i = 0; i < 10; i++) {
            x1.write("demo".getBytes());
            x1.write("\r\n".getBytes());
            // ������win�Դ��Ļ��з�
            // idea�ڲ�����ʶ����ֻ��з�
            // ����linux��win��mac�������з�����ͬ
            // window:\r\n
            // linux:\n
            // mac:\r
        }
        // �������׷��д������ͣ�
        // �ֽ�����д��������ᵼ��Դ�ļ��ڵ����ݶ�ʧ��
        // ���ݻᱻ����Ϊ�Ҵ�����д�������
        System.out.println("����");
        x1.close();
    }
}
