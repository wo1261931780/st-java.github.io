package ab往期学习2021年10月2日.bbb010学生类和方法;

public class bbb010面向对象基础 {
    /**
     * 对象是数据信息，类是对象的数据的类型
     * 对象是具体的，类是抽象的。
     * 简单来说，对象是一个东西所代表的数据，而计算机会从数据的种类/类型，来理解这个东西――理解这个数据。
     * 属性是某个对象/东西，拥有的特征，每个属性是用值来表示。
     * 比如一个手机，他的属性是价格，价格的值是3000。
     * 行为，就是对象能执行的操作――对象能做的事情。
     * 对于计算机来说，类是对象的抽象，对象是类的实体。
     * 类，就是手机这种东西。
     * 对象，就是华为mate40 pro，小米mix3，这种具体的东西。
     * 属性，就是对象（mix3手机）的价格，比如3000或者5000。
     * 行为，就是对象（mix3手机）的功能，打电话，玩游戏这种。
     * --------------------------------------------------------
     * //--------------------------------------------------------
     * //--------------------------------------------------------
     * //类，是java的基本单位。
     * //类是由属性和行为抽象得到的，换句话来说，两个对象的属性和行为相同，那么我们可以将它归为一类。
     * //类=属性+行为
     * //属性，通过变量表现，所以可以控制变量来控制属性。
     * //行为，通过方法表现。
     * string huawei;
     * huawei 是字符串类型的变量，所以直接定义。
     * int 6800；
     * 6800是价格，因为是数字类型的变量，所以int。
     * public void call(){
     * //这里没有static，就是在定义方法。
     * //方法的名称是call。
     * System.out.println("打电话");
     * //--------------------------------------------------------
     * //--------------------------------------------------------
     * Random xx= new random();
     * //类---xx是对象---类名();
     * //一个class就是一个类。
     * //类的名称可以自己定义，但是最好英文，同时因为是另一个class中的，所以要说清楚。
     * int x1 = xx.nextInt(100);
     * //定义x1，对象是xx，方法名是nextInt。
     * }
     * 测试类都有一个main方法。
     */
    public static void main(String[] args) {
        //Scanner xx= new Scanner();
        //xx是new出来的对象，在堆内存中存在，而堆内存中的都有默认值。
        //根据对象的种类，字符串返回null，int整数返回0。
        bbb011学生类 c = new bbb011学生类();
        // 在011类中新建一个对象c
        // 然后这个对象c调用了类中的方法study
        c.study();
        // study()是一个方法
        // 方法的调用就是直接输入study()即可
        System.out.println(c.name);
        // name是一个变量，一般直接用string name定义即可
        // 变量无法像上面的命令一样独立输出，所以必须放入语句中
        c.name = "1111";
        // 可以进行变量的修改，这里都是堆内存中的数据
        System.out.println(c.name);
    }

    public void xx1() {
        // class是一个类，xx1只是类中的一个方法罢了
        // 20-25天
    }
}
