package ccc022�ӿڼ����ص�;

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
        System.out.println(cc.num);
        //�����20
        System.out.println(cc.num2);
        //�����10
        System.out.println(ccc026jump.num);
        //����ֱ�ӷ��ʣ�Ҳ˵������ͨ����̬���ε�
    }
}
