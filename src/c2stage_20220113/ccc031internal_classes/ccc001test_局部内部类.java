package c2stage_20220113.ccc031internal_classes;

public class ccc001test_�ֲ��ڲ��� {
    public String name;
    public int age;

    public ccc001test_�ֲ��ڲ���() {
    }

    public ccc001test_�ֲ��ڲ���(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showinn() {
        System.out.println("���ǳ�Ա�ڲ���");
        inn x1 = new inn();
        x1.show0();
    }

    public void show() {
        class demo {
            public void showin() {
                System.out.println("���Ǿֲ��ڲ���");
                System.out.println(name + age);
            }
        }
        demo x = new demo();
        x.showin();
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

    public class inn {
        public void show0() {
            System.out.println("���ǳ�Ա�ڲ���");
            System.out.println(name + age);
        }
    }
}
