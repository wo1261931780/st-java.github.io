package c���׶�ǿ���γ�2022��1��11��.ccc001static;

public class ccc008ע������ {
    public static String name1;
    String name2;

    public static void show1() {
        System.out.println(name1);
        // System.out.println(name2);//ֱ�ӱ�����̬��������ֱ�ӷ��ʳ�Ա����

        ccc008ע������ x = new ccc008ע������();
        System.out.println(x.name2);//ֻ���ȴ���һ������ͨ����ӵķ�ʽ����name

        show2();//��̬�������Է��ʾ�̬����
        // show3();//��̬��������ֱ�ӷ���ʵ������
        // System.out.println(this);//ͬ���ģ�����ֱ�ӷ���this����Ϊthisָ��ľ��Ƕ���

    }

    public static void show2() {
        System.out.println("����show2");

    }

    public void show3() {

    }


}
