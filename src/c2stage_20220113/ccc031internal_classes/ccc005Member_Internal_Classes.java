package c2stage_20220113.ccc031internal_classes;

public class ccc005Member_Internal_Classes {
    private int age = 22;
    private int ceshi = 11;
    // ע��һ�£�ʹ��getset��¶�ӿڵ�ʱ��
    // ����������ͱ�ʾ���Ƿ�����ⲿ����

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
    public class ceshi1 {// ����ǳ�Ա�ڲ���

        // ��Ա�ڲ��࣬���ⲿ���һ������
        // ����ccc031 x=new ccc031();
        // ��Ա�ڲ�����������������ִ���
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
