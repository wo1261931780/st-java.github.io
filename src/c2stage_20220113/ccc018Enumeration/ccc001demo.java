package c2stage_20220113.ccc018Enumeration;

public class ccc001demo {
    public static void main(String[] args) {

    }

    public static void show(demo x) {
        // �������Ϊ������ö���д�����һ����
        // Ȼ�����������м��ֲ�ͬ��
        switch (x) {
            case demo1:
                System.out.println("1");
                break;
            case demo2:
                System.out.println("12");
                break;
            case demo3:
                System.out.println("13");
                break;
            case demo4:
                System.out.println("14");
                break;
            default:
                System.out.println("end");
                break;
        }
    }
}
