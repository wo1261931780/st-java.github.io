package ccc032����api;

public class ccc033math {
    public static void main(String[] args) {
        System.out.println(Math.abs(12));//12�����ؾ���ֵ
        System.out.println(Math.abs(-12));
        System.out.println("----");
        System.out.println(Math.ceil(12.1));//13�����ء�=x
        System.out.println(Math.ceil(-12.1));//-12���ء�=x
        System.out.println("----");
        System.out.println(Math.floor(12.1));//12�����ء�=x
        System.out.println(Math.floor(-12.1));//-13�����ء�=x
        System.out.println("----");
        System.out.println(Math.round(12.1));//12.0����������
        System.out.println(Math.round(-12.1));//-13.0����������
        System.out.println(Math.round(-12.1F));//-13��F��ʾ��float����
        System.out.println("----");
        System.out.println(Math.max(12.1,12.2));//12.2���ϴ�ֵ
        System.out.println(Math.min(12.1,12.2));//12.1����Сֵ
        System.out.println("----");
        System.out.println(Math.pow(2,3));//8������2��3�η�
        System.out.println("----");
        System.out.println(Math.random());//[0.0-1.0)֮��������,����0.0��������1.0
        System.out.println((int)(Math.random()*100));//ȡ��
//        System.out.println(Math.abs(-55));
    }
}
