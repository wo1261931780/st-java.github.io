package ab����ѧϰ2021��10��2��.bbb020����ѧУ����;

public class bbb020string�ַ����ļ��ֹ��췽ʽ {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String x = new String(chars);
        String y = new String(chars);
        // ͨ��new�ķ�ʽ�½����ַ��������ܵõ�һ���µĵ�ַ
        // ���ձȽϵ�ʱ��==��Ƚϵ�ַ�����Ϊfalse
        // ��equals�Ƚϵ�ַ��Ӧ�����ݣ����Ϊtrue
        System.out.println(x == y);//false
        System.out.println(x.equals(y));//true

        // Strings="abc";
        // ֱ�Ӹ�ֵ�ķ�ʽ�����ַ������� ���ݾ���abc
        String x1 = "aaa";
        String x2 = "aaa";

        System.out.println(x1 == x2);//true
        System.out.println(x1.equals(x2));//true
    }
}
