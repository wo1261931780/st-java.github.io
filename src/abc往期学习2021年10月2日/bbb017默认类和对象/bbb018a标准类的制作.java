package abc����ѧϰ2021��10��2��.bbb017Ĭ����Ͷ���;

/**
 * ��Ա����
 * ʹ��private����
 * ���췽��
 * �ṩһ���޲ι��췽��
 * �ṩһ������������Ĺ��췽��
 * ��Ա����
 * �ṩÿһ����Ա������Ӧ��setXxx()/getXxx()
 * �ṩһ����ʾ������Ϣ��show()
 */
public class bbb018a��׼������� {
    private int age;
    private String name;

    public bbb018a��׼�������() {
        System.out.println("�����޲ι��췽��");
    }

    /**
     * public void bbb017b��׼�������(int age, String name) {}
     * ����ķ������㹹�췽������Ϊ�趨�˷���ֵvoid
     */
    public bbb018a��׼�������(int age, String name) {
        System.out.println("���ι���");
        this.age = age;
        this.name = name;
        System.out.println("-----------------------------");
    }

    public void show1() {
        System.out.println(name + "������Ϊ��" + age);
        System.out.println("��Ϣչʾ����");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
