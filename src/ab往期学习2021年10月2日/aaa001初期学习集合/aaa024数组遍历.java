package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa024������� {
    public static void main(String[] args) {
        int[] xx = {1, 654, 6, 3, 54, 6, 156};
        // ��̬��ʼ��
        bl(xx);
        // ���÷�����������
    }

    public static void bl(int[] xx) {
        int x = 0;
        System.out.print("[");
        for (System.out.println("��ʼ������"); x < xx.length; x++) {
            if (x < xx.length - 1) {
                System.out.print(xx[x] + ",");
                // ����ֱ��ʹ�ô�ӡ�ķ�ʽƴ��
            } else {
                System.out.print(xx[x]);
            }
            //return xx[x];
        }
        System.out.println("]");
    }
}
