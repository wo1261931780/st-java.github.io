package c���׶�ǿ���γ�2022��1��11��.ccc109��ʦѧ�����స��;

public class ccc004run {
    public static void main(String[] args) {
        System.out.println("programme start to run");
        ccc001teacher t1 = new ccc001teacher();
//        System.out.println();
        t1.setName();
        t1.setAge();
        t1.teach();
        System.out.println("������" + t1.getName() + "---����Ϊ��" + t1.getAge());
        ccc002student s1 = new ccc002student();
        s1.setName();
        s1.setAge();
        s1.learn();
        System.out.println("������" + s1.getName() + "---����Ϊ��" + s1.getAge());
    }
}
