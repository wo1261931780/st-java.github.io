package abc����ѧϰ2021��10��2��.bbb017Ĭ����Ͷ���;

/**
 * ��Ա����
 * ʹ��private����
 * ���췽��
 * �ṩһ���޲ι��췽��
 * �ṩһ������������Ĺ��췽��
 * ��Ա����
 * �ṩÿһ����Ա������Ӧ��setXxx()/getXxx()
 * �ṩһ����ʾ������Ϣ��show()
 */
public class bbb018b��׼�������2 {
    public static void main(String[] args) {
        System.out.println("��ʼ------------");
        bbb018a��׼�������_javabean x1 = new bbb018a��׼�������_javabean();
        bbb018a��׼�������_javabean x2 = new bbb018a��׼�������_javabean(11, "s");
        x1.show1();
        x1.setAge(11);
        x1.setName("x111111");
        x1.show1();
        System.out.println("------------------------");
        x2.show1();
        //����x2�����ʱ���Ѿ�����˲���������showֱ�ӻ�չʾ
    }
}
