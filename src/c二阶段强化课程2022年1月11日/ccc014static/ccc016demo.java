package c���׶�ǿ���γ�2022��1��11��.ccc014static;

public class ccc016demo {
    public static void main(String[] args) {
        ccc015static x = new ccc015static();
        //��aaa�޸�Ϊjunw
        x.name = "junw";
        //��10�޸�Ϊ20
        x.age = 20;
        //�����Ǿ�̬��������huawei�޸�Ϊhw
        x.college = "hw";
        //��������ɾ�̬֮��һ���޸ģ���Զ��Ч
        x.show();
        //junw,20,hw
        System.out.println("finish");
        ccc015static x2 = new ccc015static();
        x2.age = 30;
        x2.show();
        //aaa,30,hw
        //����x2ֻ�޸������䣬�����aaa+30+hw����Ϊcollege�Ǿ�̬����
    }
}
