package e���׶���β2021��10��10��.eee056����Ŀ¼;
/*
    ����
        ���󣺸���һ��·��(E:\\itcast)����ͨ���ݹ���ɱ�����Ŀ¼�µ��������ݣ����������ļ��ľ���·������ڿ���̨

    ˼·��
        1:���ݸ�����·������һ��File����
        2:����һ�����������ڻ�ȡ����Ŀ¼�µ��������ݣ�����Ϊ��1��������File����
        3:��ȡ������FileĿ¼�����е��ļ�����Ŀ¼��File����
        4:������File���飬�õ�ÿһ��File����
        5:�жϸ�File�����Ƿ���Ŀ¼
            �ǣ��ݹ����
            ���ǣ���ȡ����·������ڿ���̨
        6:���÷���
 */

import java.io.File;

public class eee57���� {
    public static void main(String[] args) {
        File x = new File("l:\\java");
        show(x);
        System.out.println("����");
    }

    public static void show(File x) {
        File[] x1 = x.listFiles();
        // ��ȡ��Ŀ¼�µ������ļ�
        // Ȼ����ļ�ִ�б������ж��ļ�����
        // System.out.println(x1);
        if (x1 != null) {
            // �����ж��Ƿ��ǿռ���
            for (File i : x1) {
                if (i.isDirectory()) {
                    show(i);
                    // �ݹ���õĹؼ�һ��
                } else {
                    String x2 = i.getAbsolutePath();
                    System.out.println(x2);
                    // �������·��
                }
            }
        }
        // return show(x);
        // ����������ᵼ��ѭ�����ã�
        // �ݹ�û�г���
    }
}
