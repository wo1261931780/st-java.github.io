package bbb049ѧ����������¼��;

public class bbb050��̳� {
    private String name = "";
    private int age = 0;

    public bbb050��̳�() {
    }

    public bbb050��̳�(String name, int age) {
        this.name = name;//���븳ֵ����Ȼԭ�����޷���þ�������
        this.age = age;
        System.out.println(name + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    //    Scanner x=new Scanner(System.in);
//    public void bl(){
//        System.out.println("������������");
//        name=x.nextLine();
//        System.out.println("���������䣺");
//        age=x.nextInt();
//    }
}
