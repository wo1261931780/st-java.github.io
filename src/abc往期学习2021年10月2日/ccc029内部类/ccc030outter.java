package abc����ѧϰ2021��10��2��.ccc029�ڲ���;

public class ccc030outter {
    private int age = 10;

    /**
     * �ⲿ�ķ���������ͬ�����У������ڲ��ķ����������ȴ�������
     */
    public void see() {
        innn x = new innn();
        x.show();
    }

    /**
     * �ڲ���
     */
    public class innn {
        //�ڲ���ĺ����ǣ�����м䣬�ٴ���һ���࣬
        //����ڲ��������࣬����ֱ��ʹ����ԭ���ı����ͷ���
        // ������innn�࣬��һ���ڲ��࣬
        // innn�м�Ķ��󣬿��Է����ⲿ��age������ͬʱ����չʾ
        //�ڲ������ֱ�ӷ����ⲿ��age��Ա
        public void show() {
            System.out.println(age);
        }
    }
}
