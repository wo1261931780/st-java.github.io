package ccc024è���ӿڰ����;

public class ccc026cat extends ccc029animal implements ccc025�ӿ� {
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("cat���е�jump����");
    }

    @Override
    public void eat() {
        System.out.println("cat���е�eat����");
    }

    public ccc026cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ccc026cat() {
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
