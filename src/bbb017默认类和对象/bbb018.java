package bbb017Ĭ����Ͷ���;

public class bbb018 {
    private String name;
    private int age;

    public bbb018() {//���췽��һ��Ҫ�����������
        System.out.println("���Խ��");
    }
    //    public bbb018(String zz){//��������˷���������ͻ���ʧ����Ҫ�������ķ������������
//        System.out.println("zzz");
//    }
    public bbb018(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
