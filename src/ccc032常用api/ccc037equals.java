package ccc032����api;

public class ccc037equals {
    public String name;
    public int age;

    public ccc037equals() {
    }

    public ccc037equals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //this----x
        //o---xx
        if (this == o) {
            return true;
        }
        //�����ǱȽϵ�ַ
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //�ȱȽ�o(Ҳ����xx)�Ƿ�Ϊnull��Ϊnull��ֱ��Ϊfalse
        //Ȼ��Ƚ�������class�Ƿ���ͬһ����������false
        ccc037equals that = (ccc037equals) o;
        //����ת�ͣ���o(Ҳ����xx)��that������thatΪxx

        if (age != that.age) {
            return false;
        }
        //�����x��age��that(xx)��age�Ƚϣ���ͬ�ͷ���false
        //���Ӧ������Ƚ�int���͵�����
        return (name != null) ? (name.equals(that.name)) : (that.name == null);
        //����Ƚ�x��name�Ƿ���null���������������
        //Ȼ������string�е�equals�Ƚ�x��xx�������Ƿ���ͬ
        //��ͬ��ֱ�ӷ��ؼ���
    }
}
