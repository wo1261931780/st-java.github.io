package c2stage_20220113.ccc031internal_classes;

public class ccc001static_inside_class {
    // �ⲿ�࣬һ�㶼��public����ȱʡ
    // public��ʾ�κεط������Է���
// ����ȱʡ����ʾֻ����ͬ�����������
// �ڲ���û����������������һ��ʼ�Ϳ���ʹ��private����

    private String name;
    public int name2=100;
    public static int name3=100;

    public static class inner {// ע�⣬����û�����ŵģ�û�з����壩
        private String demo;
        private int demo2;
        public String demo3;

        public void show() {
            // System.out.println(name2);// �޷�������ͨ����
            System.out.println(name3);//����ֱ�ӷ����ⲿ��static����
        }
        // �ڲ������û�����Բ��
        // ���Թ��췽��������getset�����������з�����
        // �ڲ����޷������ⲿ��˽�б���
        public void show2(){
            ccc001static_inside_class x=new ccc001static_inside_class();
            System.out.println(x.name);
            // ���ǿ���ͨ���������ķ�ʽ��������
        }

        public inner(String demo, int demo2, String demo3) {
            this.demo = demo;
            this.demo2 = demo2;
            this.demo3 = demo3;
        }

        public String getDemo() {
            return demo;
        }

        public void setDemo(String demo) {
            this.demo = demo;
        }

        public int getDemo2() {
            return demo2;
        }

        public void setDemo2(int demo2) {
            this.demo2 = demo2;
        }

        public String getDemo3() {
            return demo3;
        }

        public void setDemo3(String demo3) {
            this.demo3 = demo3;
        }
    }

    public ccc001static_inside_class() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ccc001static_inside_class(String name) {
        this.name = name;
    }
}
