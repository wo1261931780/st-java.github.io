package ab����ѧϰ2021��10��2��.aaa000helloworld;

public class aaa001demo {
    public static void main(String[] args) {
        // Ŀ�꣺����ʹ�û����������Ͷ��岻ͬ�ı�����
        // 1��byte�ֽ���  ռ1���ֽ�  -128 - 127
        byte number = 98;
        System.out.println(number);
        // byte number2 = 128; // ����

        // 2��short������ ռ2���ֽ�
        short money = 30000;

        // 3��int ���� Ĭ�ϵ����� ռ4���ֽ�(Ĭ��ʹ�õ�����)
        // �����ݸ�ֵ��û����ȷ˵��������£�Ĭ��������int���͵ı���
        int it = 232442442;

        // 4��long������ ռ8���ֽ�
        long lg = 133244244;
        // ע�⣺���дһ������������Ĭ����int���͵ģ�132223243244244��Ȼû�г���long�ķ�Χ�������������˱���int���͵ı�ʾ��Χ��
        // ���ϣ�����дһ����������������long���ͣ���Ҫ������L/l
        long lg2 = 132223243244244L;

        // 5�������ͣ�С����
        // float������ ռ4���ֽ�
        // ע�⣺���дһ��С��������Ĭ����double���ͣ����ϣ�����дһ��С����������float���͵���Ҫ�������� F / f
        float score = 98.5F;

        // 6��double˫���� ռ8���ֽ�
        double score2 = 999.99;

        // 7���ַ����ͣ�char
        char ch = 'a';
        char ch2 = '��';
        // char ch3 = '�й�'; //����

        // 8���������� boolean
        boolean rs = true;
        boolean rs2 = false;

        System.out.println("----------------������������--------------------------");
        String name = "���Բ���";
        System.out.println(name);

        System.out.println("hellow");
        int a = 10;
        System.out.println(a);
        a = 22;
        System.out.println(a);

        System.out.println("------------------------------");

        // С��Χ�ı�������������ת��Ϊ��Χ����ı���
        // ��������ת�������Զ�ת��
        byte x1 = 1;
        int x2 = x1;
        // ���byte����ת��Ϊint����
        System.out.println(x2);
        System.out.println("------------------------------");
        int x3 = 11;
        System.out.println(x3);
        // ת���󣬻ᰴ���µĸ�ʽ����չʾ
        float x4 = x3;
        System.out.println(x4);
        double x5 = x3;
        System.out.println(x5);
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        //�������ǿ��ת��
        // �ѷ�Χ��ı�����ת��ΪС�ı���������double��int
        // int xx1 =88.88;�����������̣����Ǹ������ᱨ��
        int xx1 = (int) 88.88;
        System.out.println(xx1);
        // Ŀ�꣺���ǿ������ת������ʹ�á�
        int a3546 = 20;
        byte b = (byte)a3546;
        System.out.println(a3546);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);//-36�����������Ѿ������仯
        //���仰��˵�����ݶ�ʧ

        double aasdasd = 99.5;
        int asda15 = (int) aasdasd;
        System.out.println(asda15); // 99��С������ֱ�Ӷ�ʧ���������ּ�������


        // 2021��12��15��17:18:07������ѧϰ
        // Ŀ�꣺����Զ�����ת��
        byte aa1 = 20;
        int asd56748 = aa1; // �������Զ�����ת��
        System.out.println(aa1);
        System.out.println(asd56748);

        int age = 23;
        double db = age; // �Զ�����ת��
        System.out.println(db);

        char ch1 = 'a'; // 00000000 01100001
        int code = ch1; // 00000000 00000000 00000000 01100001
        System.out.println(code);
    }
}
