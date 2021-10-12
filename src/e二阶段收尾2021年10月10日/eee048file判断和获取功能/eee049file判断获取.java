package e���׶���β2021��10��10��.eee048file�жϺͻ�ȡ����;
/*
    File����жϺͻ�ȡ���ܣ�
        public boolean isDirectory()�����Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
        public boolean isFile()�����Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
        public boolean exists()�����Դ˳���·������ʾ��File�Ƿ����

        public String getAbsolutePath()�����ش˳���·�����ľ���·�����ַ���
        public String getPath()�����˳���·����ת��Ϊ·�����ַ���
        public String getName()�������ɴ˳���·������ʾ���ļ���Ŀ¼������

        public String[] list()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
        public File[] listFiles()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
 */

import java.io.File;
import java.lang.reflect.Field;

public class eee049file�жϻ�ȡ {
    public static void main(String[] args) {
        File x = new File("l:java\\demo");
        System.out.println(x);
        // l:java\demo
        // ����ʱ����Ŀ¼����
        System.out.println(x.isDirectory());
        // �ж��Ƿ�ΪĿ¼��true
        System.out.println(x.isFile());
        // �ж��Ƿ�Ϊ�ļ���false
        System.out.println(x.exists());
        // �ж�file�Ƿ���ڣ�true
        // ------------------------------------------------------------
        System.out.println(x.getAbsolutePath());
        // l:\\java\demo,����·��������ʽΪ�ַ���
        System.out.println(x.getPath());
        // l:java\demo��·���ַ���
        System.out.println(x.getName());
        // demo��·�����ļ���Ŀ¼���ƣ�
        // ����ֻչʾĩλ���ļ�����
        // ------------------------------------------------------------
        System.out.println("-------------------");
        File x1 = new File("l:java");
        String[] x2 = x1.list();
        // ����Ŀ¼�е��ļ���Ŀ¼������,�����ƹ���һ���ַ�������
        // �൱�ڴ�һ���ļ��У�Ȼ��չʾ�ļ����ڲ��������ļ�
        for (String i : x2) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        // Ŀ¼�е��ļ���Ŀ¼��File�������飬��file����������
        // �ô��ǣ������ڵ��ļ�ȫ����file��ʽ��
        // ��file��ʽ��������ֱ�ӵ���file����
        File[] x3 = x1.listFiles();
        for (File i2 : x3) {
            System.out.print(i2.getName());
            System.out.println("�ǲ����ļ���" + i2.isFile());
        }

    }
}
