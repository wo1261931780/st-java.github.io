package c2stage_20220213.ccc051������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051������ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-17-03  ������
 */
public class ccc005����Ӧ�� {
    public static void main(String[] args) {
        //�����õ�һ���ַ���
        String x = "���������ѧϰJava,�绰020-43422424��������ϵ����" +
                "itcast@itcast.cn,�绰18762832633��0203232323" +
                "����bozai@itcast.cn��400-100-3233 ��4001003232";
        // String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})" + "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //����������ʽ��������Ϊ�����Ĺ���
        String x1 = "(\\w{2,9}@\\w[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";
        // ����ÿ��|����һ������

        //����һ��pattern���󣬶���ʹ��x1�Ĺ���
        Pattern x2 = Pattern.compile(x1);

        //���������Ķ��󣬵��÷����������õ����ַ���x
        Matcher x3 = x2.matcher(x);
        // ���н��������շ����ȡ���
        while (x3.find()) {
            String demo1 = x3.group();
            System.out.println(demo1);
        }
    }
}
