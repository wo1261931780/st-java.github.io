package e���׶���β2021��10��8��.eee009�ɱ����;

public class eee010�ɱ�����Ͳ������ {
    public static void main(String[] args) {
        System.out.println(sum(1, 16857));
        System.out.println(sum(1, 1, 1468));
        System.out.println(sum(1, 123, 123123, 5647571));


    }


    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    //
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    //
    // public static int sum(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }

    /**
     * �����൱�ڰ����еĲ���ͳһ����Ϊһ���������飩
     * �����϶࣬���ҵ��������Ϳɱ���������ڵ�ʱ��
     * ��Ҫ���ɱ��������
     */
    public static int sum(int x, int... a) {
        // public static int sum(int... a) {
        // return 0;
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}
