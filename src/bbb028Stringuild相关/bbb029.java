package bbb028Stringuild���;

public class bbb029 {
    public void xh(int[] xx) {
        System.out.print("[");
        for (int x = 0; x < xx.length; x++) {
            String x1 = "";
            x1+=xx[x];//�ַ���ԭ����������ƴ��
            if (x<xx.length-1) {
                System.out.print(x1+",");
            }else {
                System.out.print(x1+"]");
            }
        }
    }
}
