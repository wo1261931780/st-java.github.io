package c2stage_20220202.ccc029Polymorphic_transform;

public class ccc020 {
    public static void main(String[] args) {
        ccc018animal x = new ccc019cat();
        // 向上转型------------------------------------------
        //把子类对象赋值给父类使用
        //在cat子类中创建x，使用父类animal的功能
        //这里的x对象实际上是子类cat中存在的，但是x是多态的，可以使用父类的功能
        //不过这里显示的还是“cat类中的run方法”
        x.run();
        System.out.println("-------------------------------");
        // 向下转型------------------------------------------
        // 把cat x(父类)给cat c(子类)。
        // 这里实际上是把父类对象的地址，赋值给子类
        // 好处在于，减少了对象的创建，同时可以调用子类的方法（核心）
        ccc019cat c = (ccc019cat) x;
        c.coach();
        c.run();
        // 上面做的c和创建一个新的cat对象没有差别，
        // ------------------------------------------
        // ------------------------------------------
        // ------------------------------------------
        // ------------------------------------------
        ccc019cat d1 = new ccc019cat();
        // 都可以直接调用cat中的方法
        d1.run();
        d1.coach();
        System.out.println("-------------------------------");
        //向下转型，让父类变量可以使用子类的功能
        x = new ccc021dog();
        // 这里的x是animal中的，相当于我把dog的地址给了animal
        //这里把x从子类cat中，变到子类dog中，从而使用dog的功能
        //因为需要使用重写，所以功能的名称不能改，必须是run
        x.run();
        // 如果我把x的地址向下发给新的cat类，那么就会出现另一种情况
        ccc019cat cc = (ccc019cat) x;
        // 这里的x地址是dog中的地址，所以不能强转为cat类，最终报错
        // cc.coach();

    }
}
