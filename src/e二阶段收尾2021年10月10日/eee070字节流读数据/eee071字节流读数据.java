package e���׶���β2021��10��10��.eee070�ֽ���������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���󣺰��ļ�fos.txt�е����ݶ�ȡ�����ڿ���̨���
 * ʹ���ֽ������������ݵĲ��裺
 * 1:�����ֽ�����������
 * 2:�����ֽ�����������Ķ����ݷ���
 * 3:�ͷ���Դ
 */
public class eee071�ֽ��������� {
    public static void main(String[] args) throws IOException {
        recycle();
    }

    public static void recycle() throws IOException {
        byte[] xx = new byte[1024];
        // 1024����������
        // ����ĺ��Ĺ������ڣ�
        // һ�ζ�ȡһ���ֽڵ�����
        File xx1 = new File("l:\\java\\demo.txt");
        FileInputStream xx2 = new FileInputStream(xx1);
        int xx3 = 0;
        if (xx2 != null) {
            while ((xx3 = xx2.read(xx)) != -1) {
                // xx3 = xx2.read(xx);
                System.out.print(new String(xx, 0, xx3));
            }
        }
        xx2.close();
    }

    public static void mm() throws IOException {
        File x = new File("l:\\java\\demo.txt");
        FileInputStream x1 = new FileInputStream(x);
        byte[] x2 = new byte[5];
        int x3 = x1.read(x2);
        System.out.println(x3);
        // ���Ϊ��5
        // x3��ʾʵ�ʶ�ȡ�������ݸ���
        System.out.println(new String(x2));
        // ���Ϊ��aaaaa
        // ��ʾ���½���һ���ַ�����Ȼ���ȡ���ַ�����Ϊ5
        // --˵һ�������߼���
        // 1.�ҹ�����һ������Ϊ5�����飬
        // byte[] x2 = new byte[5];
        // 2.x1ȥ��ȡx2���ȵ����ݣ�
        // int x3 = x1.read(x2);
        // 3.Ȼ������ݳ��ȴ浽x3�У�
        // չʾ��Ӧ���
        // System.out.println(x3);
        // ���Ϊ��5
        // x3��ʾʵ�ʶ�ȡ�������ݸ���
        // 4.��ԭ��һֱ��ȡ���������е����ݣ����ڰ������е����ݴ浽�ַ�����
        // new String(x2)
        // ֱ�Ӱ��ֽ��������ַ���
        // System.out.println(new String(x2));
        // ���Ϊ��aaaaa
        // ----------------------------------------------------------------
        // ����Ĵ������ظ�ִ�ж�ȡ������
        System.out.println("--------------------");
        x3 = x1.read(x2);
        System.out.println(x3);
        // ���Ϊ5
        System.out.println(new String(x2));
        // ���Ϊ����
        //
        // bbb��
        // �����ȡ��ʵ�������ǣ�\r\nbbb��
        // �������������ݳ��Ȼ���5���ַ������ǻ���Ҳ����ȡ����
        System.out.println("--------------------");
        x3 = x1.read(x2);
        System.out.println(x3);
        // ���Ϊ5
        System.out.println(new String(x2));
        // ��ȡ����Ϊ��bb\r\n-
        // ...
        // System.out.println("--------------------");
        // x3 = x1.read(x2);
        // System.out.println(x3);
        // System.out.println(new String(x2));
        // ...����ִ��
        // ...
        System.out.println("--------------------");
        x3 = x1.read(x2);
        System.out.println(x3);
        // ���Ϊ3
        // System.out.println(new String(x2));
        // ��ȡ����Ϊ��emo-d
        // ʵ��ֻ��ȡ��emo�����ַ���������иĽ�
        System.out.println("--------------------");
        System.out.println(new String(x2, 0, x3));
        // ���������ֱ��ʾ��
        // ����Ҫ��ȡ���ַ����ȣ�0����ʵ�ʶ�ȡ���ַ�����
    }
}
