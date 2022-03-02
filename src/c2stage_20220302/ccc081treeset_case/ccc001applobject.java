package c2stage_20220302.ccc081treeset_case;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc081treeset_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-53  ������
 */
public class ccc001applobject implements Comparable<ccc001applobject> {
    private double weight;
    private String name;
    private int price;
    private String address;

    @Override
    public String toString() {
        return "ccc001applobject{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

    public ccc001applobject() {
    }

    public ccc001applobject(double weight, String name, int price, String address) {
        this.weight = weight;
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // ��д�Ƚ���
    // �Զ���ȽϷ���

    @Override
    public int compareTo(ccc001applobject o) {
        return this.price - o.price >= 0 ? 1 : -1;
        // �ڲ����жϷ�����0��ʾ��ͬ��ȥ��
        // 1��ʾ����
        // -1��ʾС��
    }
}
