package c2stage_20220405.ccc116file_create;

import java.io.File;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220405.ccc116file_create
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-53  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo.txt");
        System.out.println(x.createNewFile());// �����ļ�һ���ò�������Ϊʵ�ʿ����ж����Զ������ļ�
        File x1 = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo2");
        System.out.println(x1.mkdir());// ����Ŀ¼
        // ����Ŀ¼��apiĬ��ֻ�ܴ���һ��Ŀ¼���༶Ŀ¼��ʧ��
        File x2 = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo2\\demo3\\demo4");
        System.out.println(x1.mkdirs());// �����༶Ŀ¼
        // ����������true/false
        File x3 = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo2");
        System.out.println(x3.delete());// �ļ���ռ��״̬���ɿ���ɾ��
        // ����ɾ������������ɾ���ǿ��ļ��У�����

    }
}
