package abc����ѧϰ2021��10��2��.bbb011���������ͳɼ�;

public class bbb013a�ؼ���private {
    private int age;
    private String name;

    public void showdemo() {
        System.out.println("showdemo---------");
    }

    public int getAge() {
        System.out.println(age);
        return age;

    }

    public void setAge(int age) {
        this.age = age;
        /*
        age = 1;
        this.age = 1;
        ������Ҫע�⣬����ֱ������age=1��
        ��Ϊage��this.age��ͬ��ageָ����Ƿ����ڲ�����ľֲ�������������ջ�ڴ��С�
        this.ageָ����Ƕ��ڴ��еĳ�Ա������
        ֻ�н����ݸ�ֵ�����ڴ��еı��������п���ʵ�������޸ġ���get�����Ż���Ч
        */
        // System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this.name = name;
        name = "naasd";
        // System.out.println(name);
    }
}
