package ccc014static;

public class ccc016demo {
    public static void main(String[] args) {
        ccc015static x = new ccc015static();
        x.name = "junw";//��aaa�޸�Ϊjunw
        x.age = 20;//��10�޸�Ϊ20
        x.college = "hw";//�����Ǿ�̬��������huawei�޸�Ϊhw
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
