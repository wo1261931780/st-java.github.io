package ccc026�˶�Ա�ͽ�������;

public class ccc035demo {
    public static void main(String[] args) {
        ccc031ƹ�����˶�Ա p1 = new ccc031ƹ�����˶�Ա(11, "aaa");
        System.out.println("player information-------------");
        System.out.println("��Ա������" + p1.getName() + "---��Ա���䣺" + p1.getAge());
        p1.eat();
        p1.study();
        p1.learn();
        System.out.println("guide information-------------");
        ccc033ƹ������� g1 = new ccc033ƹ�������(35, "ggg");
        System.out.println("����������" + g1.getName() + "---�������䣺" + g1.getAge());
        g1.eat();
        g1.teach();
        g1.learn();
        System.out.println("-------------------------------------");
        System.out.println("player information-------------");
        ccc032�����˶�Ա p2 = new ccc032�����˶�Ա(22, "bbb");
        System.out.println("��Ա������" + p2.getName() + "---��Ա���䣺" + p2.getAge());
        p2.eat();
        p2.study();
        System.out.println("guide information-------------");
        ccc034������� g2 = new ccc034�������(45, "wwwww");
        System.out.println("����������" + g2.getName() + "---�������䣺" + g2.getAge());
        g2.eat();
        g2.teach();
    }
}
