package e���׶���β2021��10��10��.eee050ɾ������;

import java.io.File;
import java.io.IOException;

public class eee051ɾ����ע������ {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo2");
        // �����Ǿ���·�����ù���ֱ��ճ���Ϳ��Զ�λ
        // File x = new File("myFile:\\java.txt");
        // ������ֱ�ӱ����Ҳ���·��λ��...
        // ���·���������ȶ�λmyFile��λ��
        // --
        // System.out.println(x.createNewFile());
        // ��û�����ö�Ӧ·��������£�
        // ��Ĭ�ϴ���һ�����ļ����ڵ�ǰjava�ļ����ڵ�Ŀ¼
        // System.out.println(x.mkdir());
        System.out.println(x.delete());
        // �������ļ���Ŀ¼������£�
        // ֱ�Ӵ���ʧ��
        // --
        // ��ɾ����ʱ����Ҫע�⣬����ֱ��ɾ�������ļ���Ŀ¼
        // �ļ��������ļ���������ɾ���ļ������ܼ���ִ��ɾ������


    }
}
