package abc����ѧϰ2021��10��2��.ccc022�ӿڼ����ص�;

/**
 * �ӿ���+impl=�ӿں����ʵ����
 */
public class ccc027jumpimpl implements ccc026jump {

    @Override
    public void jump() {
        System.out.println("jumpimpl�е�jump����");
        //ʵ�ֵĹ����У�������κγ��󷽷����ͱ�����дһ�Σ�û������
    }

    @Override
    public void eat() {
        System.out.println("jumpimpl��eat����");
        // super();
        // �����Ȼ�ǽӿ�ʵ���࣬���ǻ����Ե��ø���Ĺ��췽��
        // ��Ҫ˵�����ǣ�
        // �ӿ��в������췽�����ڣ����ǻ����Ե���
        // ����ĵ��ã��ǵ�����object()����޲ι��췽��
        // ��Ϊ���еĹ��췽��������������������
        // ͬʱ�����е��࣬��ʵ��Ĭ�ϼ̳���object��
        // ����ʵ�����У����Խ��и���Ĺ���
    }

    @Override
    public void run() {
        System.out.println("jumpimpl�е�run����");
    }
}
