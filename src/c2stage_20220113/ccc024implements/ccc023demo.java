package c2stage_20220113.ccc024implements;

public class ccc023demo {
    public static void main(String[] args) {
        //������cat�д�������x��xʹ�ø���jump�еķ�����
        ccc026jump x = new ccc024cat();
        //�����cat���е�jump����
        x.jump();
        ccc026jump cc = new ccc027jumpimpl();
        //�����jumpimpl�е�jump����
        cc.jump();
        //�����10
        System.out.println("jumpʵ���࣬���Ƕ�̬����cc��num���ݣ�" + cc.num);
        //�����20
        System.out.println("jumpʵ���࣬���Ƕ�̬����cc��num2���ݣ�" + cc.num2);
        //�����10
        System.out.println("���ڽӿ��У�����num���ݣ�" + ccc026jump.num);
        //����ֱ�ӷ��ʣ�Ҳ˵������ͨ����̬���ε�
    }
}
