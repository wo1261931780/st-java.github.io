package ccc032����api;

public class ccc035object {
    //Ĭ��������extends object
    //public class ccc035object extends object{
    int age;
    String name;
    public ccc035object() {
    }

    public ccc035object(int age, String name) {
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

    //��Ϊ���õ��������object��������ڴ���д

    @Override
    public String toString() {
        return "ccc035object{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    //����ǣ���ccc035object{age=20, name='junw'}��
}
