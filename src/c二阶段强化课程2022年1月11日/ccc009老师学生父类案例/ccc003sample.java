package c���׶�ǿ���γ�2022��1��11��.ccc009��ʦѧ�����స��;

import java.util.Scanner;
//ʹ�ÿ�ݼ����в�����alt+inselt
//һ�����˴��Σ�ϵͳ�Ͳ����޲Σ���ʱ��Ҫ�ֶ�����һ��

public class ccc003sample {
    private String name = "";
    private int age = 0;
    Scanner xx = new Scanner(System.in);

//    public ccc003sample(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void setName() {
        System.out.println("������������");
        String name = xx.nextLine();
        this.name = name;
//        System.out.println(name1);
    }

    Scanner x1 = new Scanner(System.in);

    public void setAge() {
        System.out.println("���������䣺");
        int age = x1.nextInt();
        this.age = age;
//        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
