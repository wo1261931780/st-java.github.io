package c���׶�ǿ���γ�2022��1��11��.ccc112Ȩ�����η�;

public class ccc013demo {
    private void show1() {
        System.out.println("111");
    }

    void show2() {
        System.out.println("2222");
    }

    protected void show3() {
        System.out.println("333");
    }

    public void show4() {
        System.out.println("4444");
    }

    public static void main(String[] args) {
        ccc013demo x = new ccc013demo();
        x.show1();
        x.show2();
        x.show3();
        x.show4();
        //������ʾ�ĸ�Ȩ�޵Ķ�����ֱ�ӷ��ʣ�
    }
//�򵥸���һ�£�
    //1-privateֻ�ܱ����з���
    //2-void������ͬһ�����з���
    //3-protect�����ڵ���+�̳к��ڲ�ͬ�İ��з���
    //4-public�����󣬲��̳�Ҳ���Է��ʡ�
}
