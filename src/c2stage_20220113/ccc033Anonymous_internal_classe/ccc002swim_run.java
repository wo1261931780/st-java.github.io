package c2stage_20220113.ccc033Anonymous_internal_classe;

public class ccc002swim_run {
    public static void main(String[] args) {
        ccc001swim students = new ccc001swim() {
            @Override
            public void swim() {
                System.out.println("ѧ����Ӿ");
            }
        };
        competition(students);//ע�⣬��������Ǿ�̬�Ĳſ��Ե���
        //�Ǿ�̬���޷�ʹ��
        System.out.println("***************************");
        competition(new ccc001swim() {
            @Override
            public void swim() {
                System.out.println("��ʦ��Ӿ");
            }
        });
        System.out.println("***************************");
        ((ccc001swim) () -> System.out.println("lambda���ʽ��")).swim();//�������lambda���ʽ����һ���������ڲ���
        //(ccc001swim) () -> System.out.println("lambda���ʽ��")��ֱ����Ϊһ������
        //(ccc001swim) ()��ʾ�½���һ��swim�еĶ���
        // -> System.out.println("lambda���ʽ��")�Է�����д

        System.out.println("***************************");
        new ccc001swim() {
            @Override
            public void swim() {
                System.out.println("δʹ��lambda���ʽ");
            }
        }.swim();
        System.out.println("***************************");
        competition((ccc001swim) () -> System.out.println("�˶�Ա��Ӿ"));


    }

    public static void competition(ccc001swim x) {
        System.out.println("��ʼ");
        x.swim();
        System.out.println("����");
    }

}
