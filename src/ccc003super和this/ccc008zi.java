package ccc003super��this;

public class ccc008zi extends ccc007fu {
    public int age=22;
    public void show(){
        int age=33;
        System.out.println(age);//ʹ�õ��Ƿ����е�33
        System.out.println(this.age);//ʹ�ñ����г�Ա������22
        System.out.println(super.age);//ʹ�ø����е�11
    }
}
