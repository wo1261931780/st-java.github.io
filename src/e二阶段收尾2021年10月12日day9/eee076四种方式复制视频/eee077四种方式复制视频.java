package e���׶���β2021��10��12��day9.eee076���ַ�ʽ������Ƶ;
/*
    ����
        ��E:\\itcast\\�ֽ�������ͼƬ.avi ���Ƶ�ģ��Ŀ¼�µ� �ֽ�������ͼƬ.avi

    ˼·��
        1:��������Դ�����ֽ�����������
        2:����Ŀ�ĵش����ֽ����������
        3:��д���ݣ�����ͼƬ(һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����)
        4:�ͷ���Դ

    ���ַ�ʽʵ�ָ�����Ƶ������¼ÿ�ַ�ʽ������Ƶ��ʱ��
        1:�����ֽ���һ�ζ�дһ���ֽ�             ����ʱ��64565����
        2:�����ֽ���һ�ζ�дһ���ֽ�����          ����ʱ��107����
        3:�ֽڻ�����һ�ζ�дһ���ֽ�             ����ʱ��405����
        4:�ֽڻ�����һ�ζ�дһ���ֽ�����          ����ʱ��60����
 */

import java.io.*;

public class eee077���ַ�ʽ������Ƶ {
    public static void main(String[] args) throws IOException {
        onecopy();
        System.out.println("--------------------");
        onesz();
        System.out.println("--------------------");
        cc_onebyte();
        System.out.println("--------------------");
        cc_onesz();
    }

    /**
     * 1:�����ֽ���һ�ζ�дһ���ֽ�             ����ʱ��64565����
     */
    public static void onecopy() throws IOException {
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo\\onecopy.mp4");
        int i;
        while ((i = x1.read()) != -1) {
            x2.write(i);
        }
        x1.close();
        x2.close();
        System.out.println("onecpoy����");
        long t2 = System.currentTimeMillis();
        // System.out.println((t2 - t1) / 1000 + "��");
        System.out.println((t2 - t1) + "����");
    }

    /**
     * 2:�����ֽ���һ�ζ�дһ���ֽ�����          ����ʱ��107����
     */
    public static void onesz() throws IOException {
        // System.out.println("��ʼ");
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo\\onesz.mp4");
        byte[] xx = new byte[1024];
        int x3;
        // while ((x3 = x1.read()) != -1) {
        // ע���ˣ�
        // ����д����ͬ����Ҫ�����鴫�ݹ���
        // �������Ϊ��
        // ��ÿ��read�ĳ���Ϊxx����ĳ���
        while ((x3 = x1.read(xx)) != -1) {
            x2.write(xx, 0, x3);
        }
        // ��δ����read���鳤�ȵ�����£�
        // ����õ����ļ���С�����⣬
        // ͬʱ����ٶ��൱��
        x1.close();
        x2.close();
        long t2 = System.currentTimeMillis();
        System.out.println("onesz����");
        // System.out.println((t2 - t1) / 1000 + "��");
        System.out.println((t2 - t1) + "����");
    }

    /**
     * 3:�ֽڻ�����һ�ζ�дһ���ֽ�             ����ʱ��405����
     */
    public static void cc_onebyte() throws IOException {
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        BufferedInputStream x1 = new BufferedInputStream(new FileInputStream(x));
        BufferedOutputStream x2 = new BufferedOutputStream(new FileOutputStream("l:\\java\\demo\\cc_onebyte.mp4"));
        int i;
        while ((i = x1.read()) != -1) {
            x2.write(i);
        }
        x1.close();
        x2.close();
        System.out.println("cc_onebyte����");
        long t2 = System.currentTimeMillis();
        // System.out.println((t2 - t1) / 1000 + "��");
        System.out.println((t2 - t1) + "����");
    }

    /**
     * 4:�ֽڻ�����һ�ζ�дһ���ֽ�����          ����ʱ��60����
     */
    public static void cc_onesz() throws IOException {
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        BufferedInputStream x1 = new BufferedInputStream(new FileInputStream(x));
        BufferedOutputStream x2 = new BufferedOutputStream(new FileOutputStream("l:\\java\\demo\\cc_onesz.mp4"));
        int i;
        byte[] x3 = new byte[1024];
        while ((i = x1.read(x3)) != -1) {
            x2.write(x3, 0, i);
        }
        x1.close();
        x2.close();
        System.out.println("cc_onesz����");
        long t2 = System.currentTimeMillis();
        // System.out.println((t2 - t1) / 1000 + "��");
        System.out.println((t2 - t1) + "����");
    }
    // ���ս����
    //     onecpoy����
    // 9921����
    // --------------------
    //     onesz����
    // 15����
    // --------------------
    //     cc_onebyte����
    // 79����
    // --------------------
    //     cc_onesz����
    // 5����


}
