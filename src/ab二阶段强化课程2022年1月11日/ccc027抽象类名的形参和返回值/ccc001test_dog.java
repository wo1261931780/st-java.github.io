package ab���׶�ǿ���γ�2022��1��11��.ccc027�����������βκͷ���ֵ;

public class ccc001test_dog extends ccc001test_pet {
    public String name;
    public int age;

    public ccc001test_dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void eatsm() {
        System.out.println("����dog�����е�eat����");
    }

    public void usedog(ccc001test_dog x) {
        x.eatsm();
        System.out.println(x);
    }

    public ccc001test_dog getdog() {
        ccc001test_dog x = new ccc001test_dog();
        return x;
        // ���ﷵ�ص���һ����ַ/����
    }
}
