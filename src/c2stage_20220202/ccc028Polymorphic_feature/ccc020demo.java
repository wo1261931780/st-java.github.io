package c2stage_20220202.ccc028Polymorphic_feature;
//������Ҫ������ϰ������ܺõ������˶�̬�Ľṹ

public class ccc020demo {
    public static void main(String[] args) {
        // �ڲ����д�����xx����
        ccc019animaloperate xx = new ccc019animaloperate();
        // �ڹ��У�������x����
        ccc018dog x = new ccc018dog();
        xx.use(x);
        // �ѹ��е�x���󣬴��ݸ����������е�xx����
        // ����xx����Ϳ��Ե���use����
        // ��use��������dog���е�eat��������Ϊǰ���Ѿ����ݹ�x��������x����ֱ��ʹ��eat
        // �������е�x�Ϳ���ʹ�ô�����dog���е�eat���ܣ�
        // ���е�xʹ����֮�󣬾�sout�˳���
        ccc021cat c = new ccc021cat();
        xx.use(c);
        // �����̬ʡȥ�˶���ı��룬ֱ�����Ӷ��󼴿�
    }
}