package ab���׶�ǿ���γ�2022��1��11��.ccc018è����̬����;

public class ccc002test_dog extends ccc001test_animal {
    public ccc002test_dog(int age, String name) {
        super(age, name);
    }

    public ccc002test_dog() {
    }


    @Override
    public void eat(ccc001test_animal x) {
        System.out.println("�������࣬���е�eat����");
        System.out.println(x.getName() + x.getAge());
        // ��д�����У����뱣����дǰ��������ڣ�����һ��
        // ���ܸ�����û�д��ݱ����������д���

    }
}
