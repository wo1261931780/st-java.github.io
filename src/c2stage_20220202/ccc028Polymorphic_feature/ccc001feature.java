package c2stage_20220202.ccc028Polymorphic_feature;

public class ccc001feature {
    public static void main(String[] args) {
        ccc018dog x=new ccc018dog();
        show(x);


    }
    // �÷������������˶�̬������
    // ����show�����У���Ҫ����animal���͵Ķ���
    // ��������������õ�ʱ��ֱ��ʹ��dog�����
    // ����ǣ������show���������˶�̬�ķ�ʽ���д���
    // �൱��show(ccc017animal x=new ccc018dog)
    // ����show������ʹ�õ�eat����dog���еķ�����

    // -------------------------------------
    // �������ַ����ĺô��ǣ�show�ڲ����Ե������еĶ��������


    public static void show(ccc017animal x){
        System.out.println("show method");
        x.eat();
    }

}
