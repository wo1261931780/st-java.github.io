package aaa001����ѧϰ����;

import java.util.Random;

public class bbb009��ί��� {
    public static void main(String[] args) {
        Random xx = new Random();
        int[] arr = new int[6];
        int x = 0;
        for (System.out.println("start"); x < arr.length; x++) {
            arr[x] = xx.nextInt(100);
            System.out.println("��" + x + "λ��ί�����ĵ÷��ǣ�" + arr[x]);
        }
//        int max=0;
        mm(arr, x);
//        System.out.println("���ֵ�ǣ�");
        //�����ǹٷ��ķ���-------------------------
        //�����ǹٷ��ķ���-------------------------
        //�����ǹٷ��ķ���-------------------------
        /*����������������������ƽ���ֵķ��������Ǳ���˼������ͬ��
        Scanner zz=new Scanner(System.in);
        int z1=zz.nextInt();
        for (int z=0;z< arr.length;z++){
            System.out.println("��"+(z+1)+"����ί�ķ����ǣ�");//����������Ը����󣬵��ǲ��ܸ�����/���
            arr[z]=zz.nextInt();
        }*/
    }

    public static void mm(int[] arr, int x) {
        int mn = 0;
        //���ﶨ��û�����⣬������max=0��˵���Ǳ�����ʼ��ʱ��x���ǲ���ȷ�����ݣ����¸���û�н��б�����
        x = 0;//��Ҫ��x����һ�ζ��塣
        int max = arr[x];
        int min = arr[x];
        for (System.out.println("��ʼ�Ա�"); x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
                mn += arr[x];
            } else if (min > arr[x]) {
                min = arr[x];
                mn += arr[x];
            } else {
                mn += arr[x];
            }
        }
        mn = mn - max - min;
        System.out.println("��������,���ֵΪ��" + max + ".��������,��СֵΪ��" + min);
        //System.out.println("ѡ�ֵ÷֣�" + mn/4);
        //����ĳ�arr.length-2�ȽϿ�ѧ
        System.out.println("ѡ�ֵ÷��ǣ�" + mn / (arr.length - 2));
    }

}
