package c2stage_20220410.ccc119file_traversal;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc119file_traversal
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-23  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220410\\ccc119file_traversal");
        String[] demo = x.list();
        System.out.println(demo);// ֱ�ӻ�ȡ·���µ��ַ��������Ϊ[Ljava.lang.String;@682a0b20
        for (String s : demo) {
            System.out.println(s);// ccc001thread_extends.java
            // ������൱��ȥ�õ�file·���µ������ļ�����

        }
        show1(x);
        /*
         * ������Դ��˵����
         * ����һ���ַ������飬�����˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
         * ����˳���·��������ʾĿ¼����˷������� null��
         * ���򷵻�һ���ַ������飬һ����Ӧ��Ŀ¼�е�ÿ���ļ���Ŀ¼��
         * ����в�������ʾĿ¼�����Ŀ¼��Ŀ¼�����ơ�ÿ���ַ�������һ���ļ�����������һ��������·����
         * �޷���֤��������е������ַ��������κ��ض�˳����֣��ر��ǣ����ǲ��ܱ�֤����ĸ˳����֡�
         * ��ע�⣬java.nio.file.Files �ඨ���� newDirectoryStream ��������Ŀ¼������Ŀ¼���ļ������ơ�
         * �ڴ���ǳ����Ŀ¼ʱ������ܻ�ʹ�ø��ٵ���Դ�������ڴ���Զ��Ŀ¼ʱ���ܻ�����С�
         * */
    }

    public static void show1(File x) {
        File[] demo_path = x.listFiles();
        // ��·���£������ļ�����Ϊfile���󣬴浽һ�����鵱��
        for (File file : demo_path) {
            // �����õ����������������ļ�
            System.out.println(file);
            // C:\Users\1\Documents\GitHub\st-java.github.io\src\c2stage_20220410\ccc119file_traversal\ccc001thread_extends.java
            // �õ������ļ��ľ���·�������һ�����ļ��ĺ�׺
            // ������ļ��У��Ͳ����к�׺����
            // ��������ȫ������һ���ļ�/�ļ��У��ڲ������ݲ��᷵��
        }
        // ��������߲����ļ��У���ô������ֻ�ܷ���null�����ҳ���Ϊ0
    }
}
