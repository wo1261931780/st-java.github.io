package d���׶���β2021��10��2��.ddd076��ϣ����;

public class ddd077������ {
    private String name;
    private int age;

    public ddd077������() {
    }

    public ddd077������(String name, int age) {
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ddd077������ ddd077������ = (ddd077������) o;

        if (age != ddd077������.age) {
            return false;
        }
        return name != null ? name.equals(ddd077������.name) : ddd077������.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
