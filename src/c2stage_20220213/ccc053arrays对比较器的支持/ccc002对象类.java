package c2stage_20220213.ccc053arrays�ԱȽ�����֧��;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc053arrays�ԱȽ�����֧��
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-28  ������
 */
public class ccc002������ {
    private String name;
    private int age;
    private String address;

    public ccc002������() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ccc002������(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //2022��2��16��23:12:06����дһ��tostring�����������Զ����ֶ����ַ

    @Override
    public String toString() {
        return "ccc002������{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
