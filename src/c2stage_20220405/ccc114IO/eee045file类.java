package c2stage_20220405.ccc114IO;

import java.io.File;

/**
 * File���ļ���Ŀ¼·�����ĳ����ʾ
 * 1:�ļ���Ŀ¼�ǿ���ͨ��File��װ�ɶ����
 * 2:����File���ԣ����װ�Ĳ�����һ���������ڵ��ļ���������һ��·�������ѡ��������Ǵ��ڵģ�Ҳ�����ǲ����ڵġ�
 * ������Ҫͨ������Ĳ��������·��������ת��Ϊ������ڵ�
 * ���췽����
 * File(String pathname)��ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����
 * File(String parent, String child)���Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����
 * File(File parent, String child)���Ӹ�����·��������·�����ַ��������µ� Fileʵ����
 */
public class eee045file�� {
    public static void main(String[] args) {
        File x = new File("l:\\demo");
        System.out.println(x);
        // l:\demo
        System.out.println("---------------------");
        File x1 = new File("l:\\demo", "\\java");
        System.out.println(x1);
        // l:\demo\java
        System.out.println("---------------------");
        File x2 = new File(x1, "\\demo2");
        System.out.println(x2);
        // l:\demo\java\demo2
        // ·���µ��ļ������Դ��ڣ�Ҳ���Բ����ڣ�ֻ����Ϊһ������
        // ����ĸ��࣬һ������·����Ϊ����
    }
}
