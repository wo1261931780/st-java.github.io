package c2stage_20220403.ccc106by_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-17-21  ������
 */
public class ccc001yc {
    public static void main(String[] args) throws ParseException {
        String x = "2022��4��3��17:21:56";
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy��MM��dd��HH:mm:SS");
        Date demo = x1.parse(x);//�������й����У�������û����ģ�����javaΪ�����ѳ���Ա��������һ���쳣
        System.out.println(demo);
        // ���ڵĽ������൱�����½�һ�����ڵĽ�����
        // Ȼ��������������ý��������������̶����ַ���
    }
}
