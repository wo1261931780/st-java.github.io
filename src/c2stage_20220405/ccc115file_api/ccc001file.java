package c2stage_20220405.ccc115file_api;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220405.ccc115file_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-40  ���ڶ�
 */
public class ccc001file {
    public static void main(String[] args) {
        System.out.println("------");
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc114IO\\demo.txt");
        // �����ȡ���Ǿ���·��
        System.out.println(x.getAbsolutePath());
        // ��ȡ����·����C:\Users\1\Documents\GitHub\st-java.github.io\src\c2stage_20220405\ccc114IO\demo.txt
        System.out.println("���·����" + x.getPath());
        System.out.println(x.getName());
        System.out.println(x.length());
        System.out.println(x.lastModified());// ����޸�ʱ�䣬long���͵�����
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        System.out.println(x1.format(x.lastModified()));// ����һ�����ڸ�ʽ������2022-04-05 20:26:353
        System.out.println(x.isDirectory());// �Ƿ����ļ��У�false
        System.out.println(x.isFile());// �Ƿ����ļ���true
        System.out.println("------------------------------------");
        show2();
    }

    public static void show2() {
        File x = new File("st-java.github.io\\src\\c2stage_20220405\\ccc114IO\\demo.txt");
        System.out.println(x.getAbsolutePath());
        // ��ͬһ����Ŀ�£���ʹ�����·����file����
        // ����apiȥ��þ���·��ʱ�����ǻ�õ�һ������·��
        System.out.println("���·����" + x.getPath());//�������·���Ǿ��Բ��ᷢ���仯��
        System.out.println(x.getName());// demo.txt
        System.out.println(x.length());// 0
        System.out.println(x.lastModified());// ����޸�ʱ�䣬0
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");// 0
        System.out.println(x1.format(x.lastModified()));// ����һ�����ڸ�ʽ������1970-01-01 08:00:00
        System.out.println(x.isDirectory());// �Ƿ����ļ��У�false
        System.out.println(x.isFile());// �Ƿ����ļ���false
    }
}
