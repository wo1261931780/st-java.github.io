package c2stage_20220113.ccc034Commonly_used_api;

public class ccc034system {
    /**
     * ���ܱ�ʵ����==����newһ���µĶ���
     */
    public static void main(String[] args) {
        System.out.println("----------------");
        // System.exit(0);
        // ��ֹjava���������0���쳣�˳�
        //system�����Ƕ�����������System.�����
        System.out.println(System.currentTimeMillis());
        //����Ǻ�1970��֮��ĺ���ֵ
        System.out.println(System.currentTimeMillis() * 1.0 / 60 / 3600 / 24 / 30 / 365 + "��");
        double x = System.currentTimeMillis() * 1.0 / 60 / 3600 / 24 / 30 / 365;
        System.out.println(x + "��");

        System.out.println("****************");
        long x1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long x2 = System.currentTimeMillis();
        System.out.println("total:" + (x2 - x1) + "ms");
        // ��˵����
        // System.out.println();Ҳ��system��������
        // System.currentTimeMillis();���������
        // System���ڲ���Ҫ����������
    }
}
