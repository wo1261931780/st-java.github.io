package e���׶���β2021��10��10��.eee054�ݹ鰸���׳�;

public class eee055��׳� {
    public static void main(String[] args) {
        System.out.println("���");
        int xx = f(5);
        System.out.println(xx);

    }

    public static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * f(x - 1);
        }
    }
}
