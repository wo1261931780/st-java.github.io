package d二阶段收尾2021年10月2日.ddd035集合案例;
// 使用迭代器和循环，收集输入的信息，然后储存到集合中
// 输入三个信息以后，将集合中的信息全部遍历出来


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ddd038循环改进 {
    public static void main(String[] args) {
        Collection<ddd036student> x = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "位信息：");
            ddd036student x2 = showdemo();
            x.add(x2);
        }
        Iterator<ddd036student> xx = x.iterator();
        while (xx.hasNext()) {
            ddd036student x5 = xx.next();
            System.out.println(x5.getName() + "," + x5.getAge());
        }
    }

    public static ddd036student showdemo() {
        Scanner x1 = new Scanner(System.in);
        System.out.println("name:");
        String x2 = x1.nextLine();
        System.out.println("age:");
        int x3 = x1.nextInt();
        ddd036student x4 = new ddd036student(x2, x3);
        return x4;
    }
}
