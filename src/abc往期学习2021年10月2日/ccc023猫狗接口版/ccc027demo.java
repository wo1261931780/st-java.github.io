package abc����ѧϰ2021��10��2��.ccc023è���ӿڰ�;

import java.util.Scanner;

public class ccc027demo {
    public static void main(String[] args) {
        System.out.println("please type name of your cat");
        Scanner name1 = new Scanner(System.in);
        // ����è������
        String namecat = name1.nextLine();
        System.out.println("please type age of your cat");
        Scanner age1 = new Scanner(System.in);
        // ����è������
        int agecat = age1.nextInt();
        // ���ι���è����
        ccc026�ӿ� cat = new ccc024cat(agecat, namecat);
        System.out.println(namecat + "�Ѿ�" + agecat + "����");
        // è��jump����
        cat.jump();
        //����ת�ͣ��Ѹ������cat���������a
        ccc024cat a = (ccc024cat) cat;
        //�൱��a.eat
        ((ccc024cat) cat).eat();
        System.out.println("-----------------stripe");
        System.out.println("-----------------stripe");
        System.out.println("-----------------stripe");
        System.out.println("please type name of your dog");
        Scanner name2 = new Scanner(System.in);
        String namedog = name2.nextLine();
        System.out.println("please type age of your dog");
        Scanner age2 = new Scanner(System.in);
        int agedog = age2.nextInt();
        ccc026�ӿ� dog = new ccc025dog(agedog, namedog);
        System.out.println(namedog + "�Ѿ�" + agedog + "����");
        dog.jump();
        ccc025dog b = (ccc025dog) dog;
        // ((ccc025dog) dog).eat();
        b.eat();
    }
}
