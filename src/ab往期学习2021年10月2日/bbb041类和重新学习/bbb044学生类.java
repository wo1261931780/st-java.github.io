package ab����ѧϰ2021��10��2��.bbb041�������ѧϰ;

public class bbb044ѧ���� {
    private String name = "";
    private int age;

    public bbb044ѧ����() {
    }

    //000001�޲ι��췽��
    // public void bbb044ѧ����(String name,int age){
    // this.name=name;
    // this.age=age;
    // System.out.println("bbb044�е�ѧ��"+name+age+"�Ѿ�ѧϰ���");
    // }
    //000002�����ǰ�bbb044��Ϊһ���������ж���
    //1000001���ι��췽��
    public bbb044ѧ����(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + age);
    }
}
