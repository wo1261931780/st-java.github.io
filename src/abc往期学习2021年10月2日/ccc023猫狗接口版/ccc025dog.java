package abc����ѧϰ2021��10��2��.ccc023è���ӿڰ�;

public class ccc025dog implements ccc026�ӿ� {
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("dog���е�jump����");
    }

    public void eat() {
        System.out.println("dog���е�eat����");
    }

    public ccc025dog() {
    }

    public ccc025dog(int age, String name) {
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
