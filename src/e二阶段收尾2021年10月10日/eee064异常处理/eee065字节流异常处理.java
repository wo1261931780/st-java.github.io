package e二阶段收尾2021年10月10日.eee064异常处理;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee065字节流异常处理 {
    public static void main(String[] args) {
        FileOutputStream x = null;
        try {
            x = new FileOutputStream("l:\\java\\ee.txt");
            x.write(97);
            // 1.首先对异常进行try...catch操作
            // x.close();
            // 但是write出现异常以后，不会继续执行close命令
            // 考虑到所有的资源必须被关闭，这里加入一个finally语句，保证必须执行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (x != null) {
                try {
                    x.close();
                    // 2.这里执行close命令，有异常继续抛出
                    // 3.考虑到x的定义问题，优先对x进行初始化操作
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // 上面这里还有一个问题，如果出现了路径异常，
                // 直接导致x为null，
                // 进而导致finally中的x.close为空指针
                // --
                // java是没有指针的，这里说的"java指针"指的就是java的引用
                // 空指针就是空引用，
                // java空指针异常就是引用本身为空，却调用了方法，这个时候就会出现空指针异常。
            }
        }
    }
}
