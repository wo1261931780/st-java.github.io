package c2stage_20220403.ccc106by_exceptions;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-26  ������
 */

/**
 * Ŀ�꣺����ʱ�쳣�Ĵ���ʽ����
 * <p>
 * ��ʽ�����ڳ����쳣�ĵط��Լ�����˭����˭����
 * <p>
 * �Լ������쳣�ʹ����쳣�ĸ�ʽ��������
 * try{
 * // ���ӿ��ܳ����쳣�Ĵ��룡
 * }catch(�쳣����1 ����){
 * // �����쳣
 * }catch(�쳣����2 ����){
 * // �����쳣
 * }...
 * <p>
 * ���Ӳ������쳣��ҵ��д����
 * try{
 * // ���ܳ����쳣�Ĵ��룡
 * }catch (Exception e){
 * e.printStackTrace(); // ֱ�Ӵ�ӡ�쳣ջ��Ϣ
 * }
 * Exception���Բ�����һ���쳣���ͣ�
 * <p>
 * С�᣺
 * �ڶ��ַ�ʽ�����Դ����쳣�����ҳ����쳣�����Ҳ����������
 * ���ַ������ǿ��Եġ�
 * ���Ǵ���������˵�����ַ�ʽ������õģ��ϲ�����߲���ֱ��֪���ײ��ִ�������
 */
public class ccc004�����쳣2 {
    public static void main(String[] args) {
        System.out.println("����ʼ��������");
        parseTime("2011-11-11 11:11:11");
        System.out.println("���������������");
    }

    public static void parseTime(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);

            InputStream is = new FileInputStream("E:/meinv.jpg");
        } catch (Exception e) {
            e.printStackTrace(); // ��ӡ�쳣ջ��Ϣ
        }
    }
}
