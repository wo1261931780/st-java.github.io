package c2stage_20220113.ccc034object_api;

public class ccc002object_run_demo {
    public static void main(String[] args) {
        System.out.println("--------------");
        ccc001object s = new ccc001object(20, "junw");
        //��������x�ĵ�ֵַ:c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df
        System.out.println(s);
        //ԭ�ĸ����Ľ���������Ķ���
        //������Ҫ��дtostring���
        //��д������object�н���
        /*
            public void println(Object x) {
                String s = String.valueOf(x);
                //������String.valueOf��������x���ݵ�valueOf�У�
                //������һ��
                if (getClass() == PrintStream.class) {
                    writeln(String.valueOf(s));
                } else {
                    synchronized (this) {
                        print(s);
                        newLine();
                    }
                }
            }
    //--------------------------------------------
        public static String valueOf(Object obj) {
            //���洫�ݹ���֮��objʵ���Ͼ���x
            return (obj == null) ? "null" : obj.toString();
            //�����ж�obj�Ƿ�=null��
            //��ΪobjΪx����xΪccc035object x=new ccc035object(20,"junw");
            //����x������null������ȥִ��obj.toString()��
            //������һ��
        }
    //--------------------------------------------
        */
        System.out.println(s.toString());
        //����������x.toString()��ʵ�������ҵ�ccc035object�࣬�̳���ʼ��object��
        //��ʼ��object�࣬��tostring�����������ҿ���ֱ�ӵ���
        //tostring�����������Ƿ��ص�������+@+����Ĺ�ϣֵ
        //������ֱ�ӵõ��������c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df��
        //������ڲ����ж����̣�������ʹ�õĻ���object�е�tostring���������Խ��һ��
        // ��������Ľ������д��ĸ�ʽ��
        // ccc035object{age=20, name='junw'}
        // 2022��1��29��23:54:10������ûд���룬���ڷżٻص�����


    }
}
