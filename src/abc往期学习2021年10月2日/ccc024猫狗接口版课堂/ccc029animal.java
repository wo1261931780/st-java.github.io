package abc����ѧϰ2021��10��2��.ccc024è���ӿڰ����;

public abstract class ccc029animal {
    private int age;
    private String name;
    public abstract void eat();
    //eat�����ǳ���ģ�
    //��Ϊ������Ҫ�������ж�eat������д������Ϊ�˽�Լ���룬���Գ�����

    public ccc029animal() {
    }

    public ccc029animal(int age, String name) {
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
