package c2stage_20220418.ccc143properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc143properties
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-48  ���ڶ�
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        Properties x = new Properties();// �����½�һ�������ļ�����
        System.out.println(x);// ֱ������������ڲ�û�еõ������Ϣ�������ǿյ�
        x.load(new FileReader("src/c2stage_20220418/ccc143properties/ccc001.properties"));
        // ʹ��fileread�Ժ����������Դ���õ��ڲ�����Ϣ
        System.out.println(x);// Ȼ��չʾ�����ܿ������
        String demo = x.getProperty("ceshi");// ��ȡָ���ļ�����ֵ�浽һ���ַ�����
        System.out.println(demo);//������õ����
        String demo2 = x.getProperty("222");
        System.out.println(demo2);// û�ж�Ӧ��������null


    }
}
