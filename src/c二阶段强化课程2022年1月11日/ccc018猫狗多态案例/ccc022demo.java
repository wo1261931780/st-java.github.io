package c���׶�ǿ���γ�2022��1��11��.ccc018è����̬����;

public class ccc022demo {
    public static void main(String[] args) {
        ccc021animal x = new ccc019cat();
        x.setName("cat1");
        x.setAge(11);
        System.out.println(x.getName() + "�����Ѿ�" + x.getAge() + "����");
        x.run();
        //���ϡ�
        System.out.println("----------------");
        ccc019cat x1 = (ccc019cat) x;
        x1.run();
        ((ccc019cat) x).near();
        //ʵ������x1.near();
        //��Ϊx1=cat x��
        System.out.println("----------------");
        x = new ccc020dog();
        x.run();
        System.out.println("----------------");
        ccc020dog x2 = (ccc020dog) x;
        x2.run();
        x2.caught();
    }
}
