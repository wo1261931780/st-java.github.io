package c2stage_20220418.ccc140series;

import java.io.Serializable;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-50  ����һ
 */
public class ccc001object implements Serializable {
    // ����ʵ�ָýӿڣ��ſ��Խ������л�����
    // ʵ������һ���źţ�����jvm���뽫���������л�����ʽ���д洢����
    // ������˵���ǲ������ƵĽӿڻ��кܶ࣬���ݽӿڣ��������ж϶���洢�����ͺ͸�ʽ
    // �������л��İ汾�ţ����л��ͷ����л������뱣�ְ汾һ�£��������л�����

    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private transient String address;// ����͸��ǰ׺����󲻻�������л�����ֹ���������룬
    // ���ֱ�Ӷ�ȡ�ļ���ֻ��õ�һ��addressΪnull�Ľ��

    public ccc001object(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ccc001object() {
    }

    @Override
    public String toString() {
        return "ccc001object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
