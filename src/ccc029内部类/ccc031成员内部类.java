package ccc029�ڲ���;

public class ccc031��Ա�ڲ��� {
    private int age = 22;
    private int ceshi=11;

    //    public class inside{
//        public void show(){
//            System.out.println(age);
//        }
//    }
    public class ceshi1{
            public void show(){
                System.out.println(ceshi);
            }
    }
    private class inside {//һ��ֱ��ʹ��private���Σ������޷��������

        public void show() {
            System.out.println(age);
        }
    }

    public void find() {//����취��ʹ���ڲ�����½�������
        //�����½������Ķ����Ƿ����ظ���
        inside x1 = new inside();
        x1.show();
    }
}
