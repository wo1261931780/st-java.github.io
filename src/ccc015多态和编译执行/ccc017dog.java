package ccc015多态和编译执行;
//作为子类
public class ccc017dog extends ccc016animal {
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
//        super.eat();
        System.out.println("dog fight for food with other animal");
    }

    public void damagehome() {
        System.out.println("damage your home is completed");
    }
}
