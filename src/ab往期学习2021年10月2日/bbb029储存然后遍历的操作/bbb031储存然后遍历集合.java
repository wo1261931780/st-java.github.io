package ab����ѧϰ2021��10��2��.bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

public class bbb031����Ȼ��������� {
    public static void main(String[] args) {
        //         Random zz=new Random();
        //         int z1=zz.nextInt(1000);
        //         ArrayList<String> xx=new ArrayList<>();
        //         xx.add("11");
        //         xx.add("22");
        //         xx.add("33");
        // //        String zq="xx";
        // //        xx.add(zq);
        // //        ArrayList<int> z=new ArrayList<int>();
        // //        xx.add("z1");
        //         System.out.println("��ʼ����");
        //         for (int x=0;x<xx.size();x++){
        //             System.out.println("���");
        //             System.out.println(xx.get(x));
        //         }
        ArrayList<String> x = new ArrayList<>();
        x.add("111");
        x.add("222");
        x.add("333");
        System.out.print("[");
        for (int i = 0; i < x.size(); i++) {
            System.out.print("��" + (i + 1) + "������Ϊ��" + x.get(i) + "--");
        }
        System.out.print("]");
    }
}
