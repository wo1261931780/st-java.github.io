import java.util.Scanner;

public class bbb013 {
    //    String name;
    //    int age;
    private int name;
    Scanner xx = new Scanner(System.in);

    public void setName(int x1) {
        System.out.println("���������ƣ�");
        x1 = xx.nextInt();
        name = x1;
    }

    private int age;//private��ǰ׺���趨��������ֱ�ӷ��ʡ�

    public void setAge(int a) {//�����set�ǹ̶����䣬���Զ���ʾǰ��ı���
        if (a < 0 || a > 120) {
            System.out.println("�������ݣ�����������");
        } else {
            age = a;
        }
    }

    public void show() {
        System.out.println(name + "�ĳɼ���:" + age);
    }
}
