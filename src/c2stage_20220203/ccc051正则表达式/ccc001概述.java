package c2stage_20220203.ccc051������ʽ;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220203.ccc051������ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-23  ������
 */
public class ccc001���� {
    public static void main(String[] args) {
        // String xx;
        System.out.println(show("123"));
        System.out.println(show("000000000"));
        System.out.println(show("a"));
        System.out.println(show("333"));
    }

    public static boolean show(String x) {
        if (x == null || x.length() < 6 || x.length() > 20) {
            return false;
        }
        //�жϳ����Ƿ����Ҫ��
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) < '0' || x.charAt(i) > '9') {
                return false;
            }
        }//�ж��ַ��Ƿ�ȫ������
        return true;
    }

    public static boolean check(String x) {
        return x != null && x.matches("\\d{6,20}");
        //����˵��\\d�ĺ���
        //���ȣ�һ����б�ܱ�ʾת�����ת������
        //����\d�ͱ�ʾȫ�������֣�����java����Ϊ��\d����һ���ַ���
        //������Ҫ\\d��˵������һ��\d��һ������
        // {6,20}��ʾ����6λ�����20λ

    }
}
