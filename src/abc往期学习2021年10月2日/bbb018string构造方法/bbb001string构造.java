package abc����ѧϰ2021��10��2��.bbb018string���췽��;

public class bbb001string���� {
    public static void main(String[] args) {
        char[] xx = {'a', 'b', '��', '��'};
        String s = new String(xx);
        System.out.println(s);
        //�����ab����

        byte[] x1 = {97, 98, 99, 65, 66};
        String s2 = new String(x1);
        System.out.println(s2);
        //�����abcAB


        // ������
        // ֱ�Ӵ����ַ�����ͨ��new�ķ�ʽ�½������ַ���,
        // ���ߵõ��Ľ����ͬ����Ϊһ���ǳ����أ�һ���Ƕ��ڴ�Ķ���
        String q = "aaa";
        String q2 = "aaa";
        System.out.println(q == q2);
        //���Ϊtrue
        System.out.println("******************");
        String q3 = new String(x1);
        String q4 = new String(x1);
        System.out.println(q3 == q4);
        //���Ϊfalse
    }


}
