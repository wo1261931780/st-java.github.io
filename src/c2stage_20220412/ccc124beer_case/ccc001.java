package c2stage_20220412.ccc124beer_case;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc124
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-39  星期二
 */
public class ccc001 {
    public static int balance = 10;
    public static int button = 0;
    public static int tops = 0;
    public static int seconds = 0;

    public static void main(String[] args) {
        // 啤酒问题，
        // 一开始可以用钱买，然后是瓶子换，最后是瓶盖换
        buy(balance, button, tops);

    }

    public static void buy(int balance, int button, int tops) {
        if (balance >= 2) {
            balance -= 2;
            button++;
            tops++;
            seconds++;
            buy(balance, button, tops);
        } else if (button >= 4) {
            button -= 3;
            tops++;
            seconds++;
            buy(balance, button, tops);
        } else if (tops >= 2) {
            button++;
            tops--;
            seconds++;
            buy(balance, button, tops);
        } else {
            System.out.println(seconds + "**" + balance + "**" + button + "**" + tops);
        }
    }

}
