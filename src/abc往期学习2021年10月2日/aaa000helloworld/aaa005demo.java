package abc����ѧϰ2021��10��2��.aaa000helloworld;

public class aaa005demo {
    public static void main(String[] args) {
        //��ϵ�������2021��9��3��17:46:22
        int x1 = 10;
        int x2 = 20;
        System.out.println(x2 = x1);//������Ϊ10���൱�ڸ�ֵx1��x2���������x2

        //�߼������
        //һ�����֣���/��/���/��

        //��·�߼����������·��&&����·��||
        //�������
        int i = 10;
        int j = 20;
        int k = 30;
        //&& ��false��false
        //        ��һ����·��Ϊfalse������ͨ�����false��
        System.out.println((i > j) && (i > k)); //false && false
        //----------------------------------------------------
        //��·��false��ǰ�滹�Ǻ��棬û��ϵ
        System.out.println((i < j) && (i > k)); //true && false
        System.out.println((i > j) && (i < k)); //false && true
        //----------------------------------------------------
        System.out.println((i < j) && (i < k)); //true && true
        System.out.println("�����Ƕ�·��--------");

        //|| ��true��true
        //        ����·��ֻҪ��һ����ͨ·���ɵ���Ŀ�ĵأ����true
        System.out.println((i > j) || (i > k)); //false || false
        //----------------------------------------------------
        System.out.println((i < j) || (i > k)); //true || false
        System.out.println((i > j) || (i < k)); //false || true
        //----------------------------------------------------
        System.out.println((i < j) || (i < k)); //true || true
        System.out.println("��·��--------");
        //----------------------------------------------------
        //----------------------------------------------------
        //&&��&
        //System.out.println((i++ > 100) & (j++ > 100)); //false & false
        //        ���ִ���������䣬��ôi���Ϊ11��j���Ϊ21
        System.out.println((i++ > 100) && (j++ > 100)); //false && false
        //        ִ���������䣬i���Ϊ11��jΪ20
        //��·�룬ִ�е�ʱ��ֻҪ����false���ͻ�ֱ��ֹͣ�����������Ĵ���
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
