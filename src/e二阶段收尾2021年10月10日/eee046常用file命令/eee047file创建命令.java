package e���׶���β2021��10��10��.eee046����file����;

import java.io.File;
import java.io.IOException;

public class eee047file�������� {
    public static void main(String[] args) throws IOException {
        // creat����Զ��󴴽���
        // mkdir�����Ŀ¼������
        // mkdirsǿ�ƴ��������·��
        File x = new File("l:\\java\\demo2.txt");
        // ����Ӳ�̷��Ĵ�Сдû��Ӱ�죬���Ǳ���Ҫ��java�ļ��д��ڣ������޷�����
        // �������ͬ���ļ����ڵ�����£�
        // ���������ʧ��
        System.out.println(x.createNewFile());
        // �����file�����������߼�Ŀ¼��
        // ��˼�ǣ��ҿ�����x�����ʵ�ʵ�Ŀ¼��ͬʱ��Ŀ¼�Ĵ�������
        // ��Ŀ¼���Ϊһ������
        // ------------------------------------------------------------------
        File x1 = new File("l:\\java\\demo");
        System.out.println(x1.mkdir());
        // ͬ������true/false����ʾĿ¼�����ɹ�
        // Ŀ¼�Ѿ����ڣ��ͻᴴ��ʧ�ܣ�
        // ͬʱ������ֻ֧�ִ�������Ŀ¼������java�ļ��е���������ܴ���demoĿ¼
        // ------------------------------------------------------------------
        File x2 = new File("l:\\java\\test\\ff");
        System.out.println(x2.mkdirs());
        // ������ǿ�д���Ŀ¼��ֻҪ�̷����ڣ��Ϳ��Դ����ɹ�
        // ------------------------------------------------------------------
        File x3 = new File("l:\\java\\show\\qx.txt");
        // System.out.println(x3.mkdir());
        // ִ�д����������ֻ��õ��ļ��У�����õ��ļ�
        System.out.println(x3.createNewFile());
    }

}
