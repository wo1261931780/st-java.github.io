package abc����ѧϰ2021��10��2��.bbb049ѧ����������¼��;

public class bbb050��̳� {
    private String name = "";
    private int age = 0;

    public bbb050��̳�() {
    }

    public bbb050��̳�(String name, int age) {
        //���븳ֵ����Ȼԭ�����޷���þ�������
        this.name = name;
        this.age = age;
        System.out.println(name + age);
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


    //    Scanner x=new Scanner(System.in);
    //    public void bl(){
    //        System.out.println("������������");
    //        name=x.nextLine();
    //        System.out.println("���������䣺");
    //        age=x.nextInt();
    //    }
}
