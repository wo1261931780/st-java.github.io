package c���׶�ǿ���γ�2022��1��11��.ccc032����api;

public class ccc036objectdemo {
    public static void main(String[] args) {
        System.out.println("--------------");
        ccc035object s = new ccc035object(20, "junw");
        //��������x�ĵ�ֵַ:c���׶�ǿ���γ�2022��1��11��.ccc032����api.ccc035object@776ec8df
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
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            //���������ս�������ص�������+@+����Ĺ�ϣֵ
            //���Ϊ����c���׶�ǿ���γ�2022��1��11��.ccc032����api.ccc035object@776ec8df��
        }
    //--------------------------------------------
        */
        System.out.println(s.toString());
        //����������x.toString()��ʵ�������ҵ�ccc035object�࣬�̳���ʼ��object��
        //��ʼ��object�࣬��tostring�����������ҿ���ֱ�ӵ���
        //tostring�����������Ƿ��ص�������+@+����Ĺ�ϣֵ
        //������ֱ�ӵõ��������c���׶�ǿ���γ�2022��1��11��.ccc032����api.ccc035object@776ec8df��
        //������ڲ����ж����̣�������ʹ�õĻ���object�е�tostring���������Խ��һ��

    }
}
