package c2stage_20220403.ccc107try_catch;

import java.text.SimpleDateFormat;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc107try_catch
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-31  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy��MM��dd");
        try {
            String x = "2022��4��3��";
            x1.parse(x);
            // һ�����������ƽ��ģ�����쳣��Ҫ�׳���ʱ��ͳһ�ŵ�һ��try����catch�м䣬������ֺ�������Ŀ�ָ��
            // } catch (ParseException e) {// ��������أ�����Ե����쳣���Ե�
            // ���仰˵���������ĳ����������쳣���ͻ�����������������ʾ
            // Ϊ�˽������������ʾ������Ҫtry����catch�����쳣�Ľ��
            // e.printStackTrace();
            // } catch (ParseException|xxx e) {
            // ��ҵ��д����
            // ֱ���׳��쳣�ĸ���exceptions
        } catch (Exception e) {
            System.out.println("exceptions");
        }


    }
}
