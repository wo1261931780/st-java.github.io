package c2stage_20220302.ddd083��Ȼ����;

//import org.jetbrains.annotations.NotNull;

public class ddd85������ implements Comparable<ddd85������> {
    private String name;
    private int age;

    public ddd85������() {
    }

    public ddd85������(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo( ddd85������ o) {
        // ע��һ������Ķ�������
        // return 0;
        // return 1;
        // ����0����ʾ��Ӳ��ɹ���Ҳ�Ͳ����ڱȽ�
        // ����1����ʾһ����ǰ�����ݴ�
        // ��ʱ�������ݵ����˳��ȥ����
        // return -1;
        // ��ʾһ����ǰ������С������������
        int num = this.age - o.age;
        // �Ƚ��������ݵĴ�С�������Ͱ�����������
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        // num == 0
        // 1.�ж������Ƿ���ȣ���Ⱦ͸�������˳���ж�
        // this.name.compareTo(o.name)
        // 2.��name�Ͷ���name�Ա������Ƿ���ͬ
        // 3.name����ͬ��ʱ�򣬸�������������
        return num2;
    }
}
