package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa016������������ {
    public static void main(String[] args) {
        System.out.println("��ʼ��������:");
        //int[] xx = new int[10];��̬��ʼ����
        //int[] xx = new int[]{123,13545,16541,6546748};
        //��̬��ʼ�����൱��ֱ�Ӹ���������
        int[] xx = {111, 222, 333, 44, 6854, 654, 564, 31, 65, 4896, 74, 61, 4, 867, 6};
        // ����ֻ����ʾ����ĵ�ַ
        System.out.println(xx);
        // System.out.println(xx[1]);
        // System.out.println(xx[2]);
        // System.out.println(xx[0]);���鶼�Ǵ�0��ʼ����
        //xx.length��ʾ���ǣ����鳤����һ�����֣�[]�е�����Ҳ����ֱ�Ӷ���.
        System.out.println(xx.length);
        int x = 0;
        for (System.out.println("��ʼ�����"); x < xx.length; x++) {
            System.out.println("��" + x + "�����ǣ�" + xx[x]);
            //System.out.println(xx[x]);
            System.out.println("�ظ���ʾ--------------------");
        }
    }
}
