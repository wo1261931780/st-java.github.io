package c2stage_20220113.ccc005�����;

public class ccc002�����2 {

    private String name;

    /**
     ���ڶ���ģ������һ����أ��Զ�����ִ�С�
     */ {
        System.out.println("==�޲ι������鱻����ִ��һ��==");
        name = "������";
    }

    public ccc002�����2() {
        System.out.println("==�޲ι�����������ִ��==");
    }

    public static void main(String[] args) {
        // Ŀ�꣺ѧϰ����������ص㡢��������
        ccc002�����2 t = new ccc002�����2();
        System.out.println(t.name);

        ccc002�����2 t1 = new ccc002�����2();
        System.out.println(t1.name);
    }

    // ���ս��
    // ==�������鱻����ִ��һ��==
    // ==�޲ι�����������ִ��==
    // ������
    // ==�������鱻����ִ��һ��==
    // ==�޲ι�����������ִ��==
    // ������


}
