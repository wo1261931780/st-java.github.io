package ab���׶�ǿ���γ�2022��1��11��.ccc024è���ӿڰ����;

public class ccc027dog extends ccc029animal implements ccc025�ӿ� {//�������ͬʱ�̳к�ʵ��
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("dog----jump");
    }

    @Override
    public void eat() {
        System.out.println("meat--------------");
    }

    public ccc027dog() {
    }

    public ccc027dog(int age, String name) {
        this.age = age;
        this.name = name;
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
