package c2stage_20220326.eee025hashmap����2;

public class eee026ѧ���� {
    private String age;
    private String city;

    public eee026ѧ����() {
    }

    public eee026ѧ����(String age, String city) {
        this.age = age;
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        eee026ѧ���� eee026ѧ���� = (eee026ѧ����) o;

        if (age != null ? !age.equals(eee026ѧ����.age) : eee026ѧ����.age != null) return false;
        return city != null ? city.equals(eee026ѧ����.city) : eee026ѧ����.city == null;
    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
