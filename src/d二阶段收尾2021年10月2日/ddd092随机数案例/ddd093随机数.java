package d���׶���β2021��10��2��.ddd092���������;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ddd093����� {
    public static void main(String[] args) {
        // Set<Integer> x = new HashSet<>();
        Set<Integer> x = new TreeSet<>();
        // treeset���Ͽ���ִ������
        while (x.size() < 10) {
            // int x1 = (int) Math.random() * 10;
            // x.add(x1);
            // Ϊʲô�������������
            Random x1 = new Random();
            int x2 = x1.nextInt(20) + 1;
            x.add(x2);
        }
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println("����");
    }
    // for (int i = 0; i < 10; i++) {
    //     int x = (int) (Math.random() * 20);
    //     System.out.println(x);
    // }
    // ���淽����ȡ�����ݣ�������ظ�����
    // �����Ǵ��󷽷�
    // public static void mathrandom() {
    //     TreeSet<Integer> x = new TreeSet<>(new Comparator<Integer>() {
    //         @Override
    //         public int compare(Integer o1, Integer o2) {
    //             int num = o1 - o2;
    //             int num2 = num == 0 ? num : 0;
    //             return num2;
    //         }
    //     });
    //     for (int i = 0; i < 10; i++) {
    //         int x1 = (int) Math.random() * 20;
    //         System.out.println(x1);
    //         x.add(x1);
    //     }
    //     System.out.println("-----------------");
    //     for (int i : x) {
    //         System.out.println(i);
    //     }
    // }
}
