package ab����ѧϰ2021��10��2��.aaa000helloworld;

public class aaa002demo {
    public static void main(String[] args) {
        // 2021��12��15��17:40:09������ѧϰ
        // Ŀ�꣺���ջ��������������������ʹ�ã�+ - * / %
        int aaa = 10;
        int bbb = 3;
        System.out.println(aaa + bbb);
        System.out.println(aaa - bbb);
        System.out.println(aaa * bbb);
        System.out.println(aaa / bbb); // 3.3333  ==>  3
        System.out.println(aaa * 1.0 / bbb); // 3.3333
        System.out.println(3 / 2);
        System.out.println(3 * 1.0 / 2); // 1.5����������Ƚ������͵�ת��
        System.out.println(3  / 2 * 1.0); // 1.0
        // �������ȼ������3/2�����Եõ�1��С�������Ѿ���ʧ��1*1.0ֻ�ܵõ�1.0
        System.out.println(aaa % bbb); // 1

        // Ŀ�꣺+���������ӷ���ʶ��
        int a = 5 ;
        System.out.println("abc" + 'a'); // abca
        System.out.println("abc" + a);   // abc5
        System.out.println(5 + a); // 10
        System.out.println("abc" + 5 + 'a'); // abc5a
        System.out.println(15 + "abc" + 15); // 15abc15
        System.out.println(a + 'a'); // 102
        System.out.println(a + "" +'a'); // 5a
        System.out.println(a + 'a'+" itheima "); // 102 itheima
        System.out.println("itheima"+ a + 'a'); // itheima5a
        System.out.println("itheima"+ ( a + 'a' ));// itheima102
        // ���������
        int asdqwe = 14;
        int b = 5;
        System.out.print("�ӷ���");
        System.out.println(asdqwe + b);//19
        System.out.println("���ַ������Ӻű����Ӻţ�" + asdqwe + b);//145
        System.out.println("-------------------------------");
        System.out.print("������");
        System.out.println(asdqwe - b);
        // System.out.println("���ַ������ͻ������Ӻţ�" + a + b);
        System.out.println("-------------------------------");
        System.out.print("�˷���");
        System.out.println(asdqwe * b);
        System.out.println("���ַ������˷����䣺" + asdqwe * b);
        System.out.println("-------------------------------");
        System.out.print("������");
        System.out.println(asdqwe / b);
        System.out.println("���ַ������������䣺" + asdqwe / b);
        System.out.println("�����õ���=2��ȡ��õ�����=0");
        // �����ļ��㣬���������������������2021��9��7��14:35:29
        System.out.println("-------------------------------");
        System.out.print("ȡ�ࣺ");
        System.out.println(asdqwe % b);
        System.out.println("���ַ�����ȡ�಻�䣺" + asdqwe % b);
        // ���������ֻ�����������Ҫ��õ�С����������С������
        // ������˵���������С������ô�м�һ����С������
        System.out.println(6.0 / 5);
    }
}
