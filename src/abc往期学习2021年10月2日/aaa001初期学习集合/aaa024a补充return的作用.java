package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa024a����return������ {
    public static void main(String[] args) {
        show(1, 2);
        System.out.println("end");
    }

    public static void show(int a, int b) {
        if (a == 0) {
            System.out.println("error");
            return;
            // ����ֱ�ӽ�����������sout��ִ�У�
            // ������֣�����ֱ�ӳ���end
        }
        int i = a / b;
        System.out.println(i);
    }
}
