package abc����ѧϰ2021��10��2��.bbb017Ĭ����Ͷ���;

public class bbb018 {
    private String name;
    private int age;

    //���췽��һ��Ҫ�����������2021��9��15��17:17:42���ǵ�
    public bbb018() {
        System.out.println("���Խ��");
    }

    //    public bbb018(String zz){
    // ��������˷���������ͻ���ʧ����Ҫ�������ķ������������
    //        System.out.println("zzz");
    //    }
    public bbb018(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
