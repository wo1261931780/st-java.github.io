package ab���׶�ǿ���γ�2022��1��11��.ccc023è���ӿڰ�;

public class ccc001test_run extends ccc001test_dog {
    public static void main(String[] args) {
        System.out.println("��������");
        ccc001test_animal x = new ccc001test_dog();
        x.jump();
        ccc001test_dog x1 = (ccc001test_dog) x;
        // ʹ��get��set����Ҫ��ʵ�����н���
        // ���߱�������get/set�����е��࣬�н���
        // Ϊ�˵���get/set���������Ǳ���ͬʱ�ڸ����д�������
        // �ڴ�������Ĺ�����
        // Ϊ�˱��ֳ��������Ĵ��ڣ����Ǳ���ִ��һ��ǿת��������������ַ���ܸ�ֵ��dog��
        System.out.println(x1.getName() + x1.getAge());

    }
}
