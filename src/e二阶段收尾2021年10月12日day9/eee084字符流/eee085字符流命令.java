package e���׶���β2021��10��12��day9.eee084�ַ���;
/*
    InputStreamReader���Ǵ��ֽ������ַ���������
        ����ȡ�ֽڣ���ʹ��ָ���ı��뽫�����Ϊ�ַ�
        ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���

    OutputStreamWriter���Ǵ��ַ������ֽ���������
        �Ǵ��ַ������ֽ�����������ʹ��ָ���ı��뽫д����ַ�����Ϊ�ֽ�
        ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���
 */

import java.io.*;

public class eee085�ַ������� {
    public static void main(String[] args) throws IOException {
        // ʹ��ָ���ı��룬���ַ�����Ϊ�ֽ�
        // ��ָ��������£�����ΪĬ���ַ���
        // OutputStreamWriter x = new OutputStreamWriter(new FileOutputStream("l:\\java\\test.txt"));
        // ����ֱ�Ӵ�����һ��txt����Ȼ����Ĭ�ϱ����ʽ��ֱ�����ָ������
        OutputStreamWriter x = new OutputStreamWriter(new FileOutputStream("l:\\java\\test.txt"), "UTF-8");
        // ָ���������ͣ�����writer������
        x.write("����");
        x.close();
        System.out.println("-----------");
        InputStreamReader x1 = new InputStreamReader(new FileInputStream("l:\\java\\test.txt"));
        int i;
        while ((i = x1.read()) != -1) {
            System.out.println((char) i);
        }
        // ���̳�չʾ���ҵĶ�д���벻һ�»ᵼ���������
        // UTF-8��GBK��������������չʾ����
        x1.close();

    }
    // �ܽ�һ�°ɣ�
    // InputStreamReader��ȡ�ֽڣ�Ȼ�����Ϊ�ַ�
    // OutputStreamWriter��ȡ�ַ���Ȼ�����Ϊ�ֽ�
}
