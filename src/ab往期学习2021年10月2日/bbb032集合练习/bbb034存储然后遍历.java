package ab����ѧϰ2021��10��2��.bbb032������ϰ;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb034�洢Ȼ����� {
    public static void main(String[] args) {
        // ArrayList<bbb033> arr=new ArrayList<>();
        // //�����൱�ڣ�<>�м����࣬arr�Ƕ�����˼�ǣ�����bbb033������У�������arr������ϣ��������´����Ķ���
        // bbb033 xx=new bbb033();
        // //���ֱ�Ӵ����µĶ���
        // xx.bbb034("asd",123);
        // // xx.bbb034("bbbbb",333);
        // arr.add(xx);
        // for (int x=0;x<arr.size();x++) {
        //     System.out.println(arr.equals(x));
        //     arr.get(x);
        //     System.out.println(arr.get(x));
        // }
        // ����������Ϊ��������string���͵�arr
        ArrayList<String> arr = new ArrayList<>();
        // Random xx=new Random();
        Scanner xx = new Scanner(System.in);
        // for (int x=0;x<5;x++){
        //   String x0=xx.nextLine();
        //   arr.add(x0);
        //   System.out.println(arr);
        // }
        String x1 = xx.nextLine();
        //ֱ��ʹ�ã�ʵ�ֶ������
        x1 = xx.nextLine();
        //���Ǳ�������ӽ�����
        arr.add(x1);
        x1 = xx.nextLine();
        arr.add(x1);
        x1 = xx.nextLine();
        //����ֻ��ʾ�Ƿ���ӳɹ�
        arr.add(x1);// true

        System.out.println(arr);
        //        arr.remove();//ɾָ������
        //        arr.remove();//ɾָ��λ��
        //        arr.set();//�趨ָ��λ�õ�ָ������
        //        arr.get();//���ָ��λ�õ�����
        //        arr.size();//��ü����е�����
    }
}
