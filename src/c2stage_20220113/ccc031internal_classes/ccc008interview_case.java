package c2stage_20220113.ccc031internal_classes;

public class ccc008interview_case {
    public static void main(String[] args) {

    }

}
class demo{

    private int age=33;
    public class demo2{
        private int age=22;
        public void show(){
            int age=11;
            System.out.println(age);//11
            System.out.println(this.age);//22
            // ����age�ı������ظ����ڵģ�
            // Ĭ�Ϸ���ֻ����ʷ����ڲ��ģ��������
            // ����ͬ��ģ����ǳ�Ա������������Ҫthis.xx���ƶ�
            // �����ⲿ��ģ����߷Ǳ���ģ�����Ҫ�ƶ�������Ȼ���ƶ�����λ�ã�����xx.this.yy����ʽ
            System.out.println(demo.this.age);//33
        }
    }
}
