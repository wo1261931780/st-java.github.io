package abc����ѧϰ2021��10��2��.bbb020����ѧУ����;

public class bbb021 {
    private String school;
    private int abound;

    public bbb021() {//�޲ι��췽��
        System.out.println("�޲ι��췽��");
    }

    public bbb021(String school, int abound) {
        System.out.println("���ι��췽��");
        if (abound > 0 && abound < 5000) {
            this.abound = abound;
            this.school = school;
            System.out.println(school + "�������ǣ�" + abound);//���ﲻ��Ҫthis����Ϊ�ֲ�������������Ҫ��ֵ
        } else {
            System.out.println("��������,����������");
        }
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAbound(int abound) {
        this.abound = abound;
    }

    /*
        public String getSchool() {
            return school;
        }
        public int getAbound() {
            return abound;
        }
    */
    public void show() {
        System.out.println("ִ��show�ɹ�:" + school + "������Ϊ��" + abound);
    }

}
