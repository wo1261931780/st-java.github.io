package c2stage_20220403.ccc106by_exceptions;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-27  ������
 */

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ŀ�꣺����ʱ�쳣�Ĵ���ʽ����
 * <p>
 * ��ʽ���� �ڳ����쳣�ĵط����쳣һ��һ����׳������������ߣ�
 * ���������߼��в����������淶������
 * <p>
 * С�᣺
 * ����ʱ�쳣�Ĵ���ʽ�����ײ���ֵ��쳣�׳������������߼��в�����
 * ���ַ������������߿���֪���ײ�ִ�е������ͬʱ�����ڳ����쳣��Ҳ������������������
 * ��������õķ�����
 * <p>
 * ��Ȼ�쳣�����ִ���ʽ�����ǿ�����ֻҪ�ܽ��������⣬ÿ�ַ�ʽ���ֿ����õ�!!
 */
public class ccc005�����쳣3 {
    public static void main(String[] args) {
        System.out.println("����ʼ��������");
        try {
            parseTime("2011-11-11 11:11:11");
            System.out.println("���ܲ����ɹ�~~~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("���ܲ���ʧ��~~~");
        }
        System.out.println("���������������");
    }

    public static void parseTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("D:/meinv.jpg");
    }

}
