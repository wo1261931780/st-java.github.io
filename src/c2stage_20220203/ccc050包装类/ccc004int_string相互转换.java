package c2stage_20220203.ccc050��װ��;

public class ccc004int_string�໥ת�� {
    public static void main(String[] args) {
        int xx = 10;
        // ��������в���Ҳ����������ȫ���ֵ�����½���
        // int����ת��Ϊstring����
        // �ȶ���Ϊstring
        String x1 = String.valueOf(xx);
        System.out.println(xx);
        System.out.println("----------------");

        String s = "200";
        // ת��Ϊinteger
        Integer s1 = Integer.valueOf(s);
        // Ȼ����int
        int s2 = s1.intValue();
        System.out.println(s2);
        System.out.println("----------------");

        // ������÷���ֱ�ӱ��int
        int w = Integer.parseInt(s);
        System.out.println(w);
    }
}
