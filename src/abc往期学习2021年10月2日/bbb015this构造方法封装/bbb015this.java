package abc����ѧϰ2021��10��2��.bbb015this���췽����װ;

public class bbb015this {
    private String name;
    private int age;

    public void setName(String name1) {
        //������this��nameת������ʵ�ʲ�������ֹ�����ظ���
        this.name = name1;
        //this���������ڣ�ָ������ı�������ֹ�����ظ�
        // ��Ա�������������еı���name
        // this.nameָ����Ա��������Ĭ�������name��ָ���ֲ�����
        //����name1��private�е�name�ظ�����ôthis.name�ʹ�����private�е�name
        //ͬ���ĵ���ʹ���ں����super
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public void show() {
        System.out.println(name + "---" + age);
    }
}
