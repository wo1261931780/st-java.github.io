package c2stage_20220113.ccc026implements_jdk8;

public interface ccc001interface {
    default void eat() {
        System.out.println("eat something");
        show2();
    }
    // Ĭ�Ϸ���������ֱ�ӵ��ã���Ϊ���ʻ��ǽӿ�
    // ��Ҫ���ã�ֻ�ܱ�ʵ�ֺ���ʵ�����н��е���

    static void show() {
        System.out.println("show something");
    }
    // �������־�̬����������Ҫʹ����������

    // ˽�з���
    private void show2() {
        System.out.println("demo show2");
    }
    // �������ַ�������˽�У�ֻ��������ڲ������ã�
// �������ǣ��ӿڱ����߱����������
// ��ˣ�Ҫ��ʹ������˽�з�������ֻ�ܽ������ŵ��������������У�
// ������������Ч��ʱ�򣬼�ӵ��ø÷���


}
