package abc����ѧϰ2021��10��2��.ccc010è�͹�;

public class ccc001testanimal {
    private int age;
    private String name;

    public ccc001testanimal() {
    }

    public ccc001testanimal(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(name + "�Ѿ�" + age + "��");
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

    public void eatsm() {
        System.out.println("���ǳԶ���");
    }
}
