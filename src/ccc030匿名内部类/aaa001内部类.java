package ccc030�����ڲ���;

public class aaa001�ڲ��� {
    private int age = 22;
    private int ceshi = 11;

    public void find() {
        //����취��ʹ���ڲ�����½�������
        //�����½������Ķ����Ƿ����ظ���
        inside x1 = new inside();
        x1.show();
    }

    //    public class inside{
    //        public void show(){
    //            System.out.println(age);
    //        }
    //    }
    public class ceshi1 {
        public void show() {
            System.out.println(ceshi);
        }
    }

    /**
     * һ��ֱ��ʹ��private���Σ������޷��������
     */
    private class inside {
        public void show() {
            System.out.println(age);
        }
    }

}
