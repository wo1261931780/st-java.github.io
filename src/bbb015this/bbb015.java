package bbb015this;

public class bbb015 {
    private String name;
    private int age;

    public void setName(String name1) {
        this.name = name1;//������this��nameת������ʵ�ʲ�������ֹ�����ظ���
        //this���������ڣ�ָ������ı�������ֹ�����ظ�
        //����name1��private�е���ô�ظ�����ôthis.name�ʹ�����private�е�name
        //ͬ���ĵ���ʹ���ں����super
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public void show() {
        System.out.println(name + "---" + age);
    }


}
