package c���׶�ǿ���γ�2022��1��11��.ccc001static;

public class ccc005static���η��� {
    /**
     * ������Ҫ����static�ķ�Χ
     */
    public static int agej = 10;
    public static String xj = "yyyy";
    public int age = 20;
    public String x = "xxxx";
    //ccc017range xx=new ccc017range();

    public static void show1j() {
        System.out.println("11111111111111");
    }

    public static void show3j() {
        //��̬����ֻ�ܷ��ʾ�̬������main�����Ǿ�̬
        System.out.println("33333333333");
        System.out.println(agej);
        //        System.out.println(age);//��̬�����޷�����
        System.out.println(xj);
        //        System.out.println(x);//��̬�����޷�����
        show1j();
        //        show2();//��̬�����޷�����
        //        show4();//��̬�����޷�����
    }

    //��̬ȫ�����Է���
    public void show2() {
        System.out.println("2222222222222");
        System.out.println(agej);
        System.out.println(age);
        System.out.println(xj);
        System.out.println(x);
        show1j();
        show3j();
        show4();
    }

    public void show4() {
        System.out.println("444444444444");
    }
}
