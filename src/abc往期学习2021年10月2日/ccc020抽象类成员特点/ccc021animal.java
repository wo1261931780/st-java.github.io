package abc����ѧϰ2021��10��2��.ccc020�������Ա�ص�;

public abstract class ccc021animal {
    /**
     * final��һ��ͳ�Ϊ����
     */
    private final String nn = "222";
    private int age = 20;

    /**
     * Ĭ�ϴ��ڵĹ��췽��
     */
    public ccc021animal() {
    }

    /**
     * ����ѡ����ڵĴ��ι���
     */
    public ccc021animal(int age) {
        //��������Խ��й��죬�����������ʵ�ֶԸ���ķ���
        //���ֹ�����ҪΪ��ʵ�����ݵĳ�ʼ��
        this.age = age;
    }

    /**
     * �ɴ��ڵĳ�Ա����
     */
    public void show() {
        age = 12;
        System.out.println(age);
    }

    /**
     * �ɴ��ڵĴ��η���
     * ���η����Ĵ��ڣ�һ��������˴���ĸ����ԣ�
     * ������˵��Ҳ���������࣬����ȥִ����д����
     */
    public abstract void eat();
}
