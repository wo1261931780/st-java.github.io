package c2stage_20220113.ccc031internal_classes;

public class ccc031��Ա�ڲ��� {
    private int age = 22;
    private int ceshi = 11;

    /**
     * ����취��ʹ���ڲ�����½�������
     */
    public void find() {
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
