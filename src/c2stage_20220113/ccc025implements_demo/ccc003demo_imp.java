package c2stage_20220113.ccc025implements_demo;

public class ccc003demo_imp implements ccc001demo1, ccc002demo2 {
    private String name;

    public ccc003demo_imp(String name) {
        this.name = name;
    }

    public ccc003demo_imp() {
    }

    @Override
    public void eat() {
        System.out.println(name + "eat something");
    }

    @Override
    public void sleep() {
        System.out.println(name + "sleep each day");
    }
    // ����ֱ��alt+�س����Ϳ������ʵ�ֵĹ���
    // ����ʵ���࣬������Ҫ��������+���÷����Ĺ��̣������޷���Ч
}
