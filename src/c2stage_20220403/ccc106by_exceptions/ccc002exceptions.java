package c2stage_20220403.ccc106by_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-22  ������
 */
public class ccc002exceptions {
    public static void main(String[] args) throws ParseException {
        String x = "2022��4��3��";
        show(x);
    }

    public static void show(String x) throws ParseException {
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy��MM��dd��");
        x1.parse(x);
        System.out.println(x1);
        // �׳��쳣����û�н����ֻ�ǽ�������ʱ����
        // ������������쳣��������ջ��ǻ�������������
        // ������쳣�׳������ܴ��ڶ�������������Ҫ��˭�ȳ���
        // �����쳣123��ȫ���������׳�������׶�ͨ��
        // �����������ڼ䣬2���쳣�׳�������������
        // ����ֻ�����2���쳣����Ϊ����������3���쳣û�г��ֵĻ���
    }
}
