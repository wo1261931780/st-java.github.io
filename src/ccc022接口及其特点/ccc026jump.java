package ccc022�ӿڼ����ص�;

public interface ccc026jump {
    /**
     * �����ǳ���ģ����ǽӿ��Դ���������
     * �ӿ�ʹ��interface����
     * �о���Ա�ص㣬ֱ�ӿ���û�г�Ա����/���췽��/��Ա����
     * �ӿ��У�Ĭ��final�������������еı���ʵ���϶��ǳ������޷����Σ���
     */
    public int num = 10;
    public final int num2 = 20;
    //����д��
    public static final int num3 = 33;
    int num4 = 44;

    public abstract void jump();

    /**
     * �ӿ�û�й��췽������Ϊû�о������
     * ���仰˵�������ڽӿ��й�������
     * ͬ���ģ�
     * public void eat();��������
     * �����������ԣ���Ϊ�ǳ����
     */
    public abstract void eat();

    /**
     * �ӿ��У�Ĭ����ǰ���public abstract��Ĭ�Ϸ����ǳ���ģ�
     */
    void run();
    //���� ��עһ�£�����ӿ����з������֣�
    //��ô����ʵ�ֵ�ʱ�򣬱�����д�������еķ�������Ȼ�ᱨ��
}
