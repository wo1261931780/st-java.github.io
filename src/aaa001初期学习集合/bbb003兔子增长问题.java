package aaa001����ѧϰ����;

public class bbb003������������ {
    public static void main(String[] args) {
        //��һ�δ���-------------------
        /*int x1=1;
        int x2=1;
        int xx = 3;
        int x3 = 0;
        for(System.out.println("��ʼ����:");xx<21;xx++){
            x3=x1+x2;
            x1=x2;
            x2=x3;
            System.out.println("��"+xx+"���µ�ʱ�������ǣ�"+x3);
        }*/

        int[] xx = new int[20];
        xx[0] = 1;
        xx[1] = 1;
        //xx[2] = xx[0] + xx[1];
        int x = 2;
        for (System.out.println("��ʼ����:"); x < xx.length; x++) {
            xx[x] = xx[x - 2] + xx[x - 1];
            //xx[x - 2] = xx[x - 1];
            //xx[x - 1] = xx[x];
            System.out.println("��" + x + "���µ�ʱ�������ǣ�" + xx[x]);
        }
    }
}
