package c2stage_20220220.ccc070genericity;

public class eee001���ͷ���<T> {
    public void show(String x) {
        System.out.println(x);
    }
    // ��������ͬ��������ͬ����Ϊ��������

    public void show(Integer x) {
        System.out.println(x);
    }

    public void show(boolean x) {
        System.out.println(x);
    }

    // public void show(T x) {
    //     System.out.println(x);
    // }

    /**
     * ��������Ϊ��static�����ſ�������
     * ���ʹ����static���Σ���ô�����ڲ�������������������
     */
    public <T> void show(T x) {
        // ������Ƿ��ͷ���
        System.out.println(x);
    }
}
