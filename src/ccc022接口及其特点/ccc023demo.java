package ccc022�ӿڼ����ص�;

public class ccc023demo {
    public static void main(String[] args) {
        ccc026jump x = new ccc024cat();//������cat�д�������x��xʹ�ø���jump�еķ�����
        x.jump();//�����cat���е�jump����
        ccc026jump cc = new ccc027jumpimpl();
        cc.jump();//�����jumpimpl�е�jump����
        System.out.println(cc.num);//�����10
        System.out.println(cc.num2);//�����20
        System.out.println(ccc026jump.num);//�����10
        //����ֱ�ӷ��ʣ�Ҳ˵������ͨ����̬���ε�
    }
}
