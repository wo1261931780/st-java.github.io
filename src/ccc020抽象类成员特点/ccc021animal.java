package ccc020�������Ա�ص�;

public abstract class ccc021animal {
    private int age = 20;
    private final String nn = "222";//final��һ��ͳ�Ϊ����

    public void show() {
        age = 12;
        System.out.println(age);
    }

    public ccc021animal() {
    }

    public ccc021animal(int age) {
        //��������Խ��й��죬�����������ʵ�ֶԸ���ķ���
        //���ֹ�����ҪΪ��ʵ�����ݵĳ�ʼ��
        this.age = age;
    }
    public abstract void eat();
}
