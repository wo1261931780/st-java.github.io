package ccc026�˶�Ա�ͽ�������;

public abstract class ccc002test_athelete extends ccc001test_people implements ccc001test_learn {
    public ccc002test_athelete() {
    }

    public ccc002test_athelete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eatsm() {
        System.out.println("�˶�Ա�Խ���ʳƷ");
    }

    @Override
    public void jobsm() {
        System.out.println("����ѧϰ����");
    }
}
