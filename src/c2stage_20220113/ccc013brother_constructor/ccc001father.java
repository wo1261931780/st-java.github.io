package c2stage_20220113.ccc013brother_constructor;

public class ccc001father {
    private String name;
    private int age;

    public ccc001father() {
    }

    public ccc001father(String name, int age) {
        this.name = name;
        this.age = age;
        // this(name,11);
    }
    public ccc001father(String name) {//�ֵܹ�����
        this(name,11);
        // �ڹ����ʱ��Ĭ��������age�ĳ���ֵΪ11
        // ��Ҫ˵�����ǣ�
        // �ڹ���Ĺ����У���Ϊ�̳���object��
        // ���еķ�����һ��Ĭ�϶�����super����
        // ����this��super�޷�����ͬһ�У���������ʹ�õ���this
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
