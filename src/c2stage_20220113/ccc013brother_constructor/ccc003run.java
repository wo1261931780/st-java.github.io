package c2stage_20220113.ccc013brother_constructor;

public class ccc003run {
    public static void main(String[] args) {
        ccc001father x=new ccc001father();
        x.setName("aa");
        System.out.println(x.getName()+"--"+x.getAge());//aa--0
        // ����û�и�ֵ������ʹ�õ����޲ι��췽��
        ccc001father x1=new ccc001father("bb");
        System.out.println(x1.getName()+"--"+x1.getAge());// bb--11
        // ����ʹ�õ����ֵܹ�����������Ĭ�ϸ���11

        ccc001father x2=new ccc001father("cc",33);
        System.out.println(x2.getName()+"--"+x2.getAge());// cc--33
        // ���ι��췽��




    }
}
