package c2stage_20220412.ccc125charset;

public class eee081编码表 {
    public static void main(String[] args) {
        // 简单讲一下文字的编码格式：
        // ascll格式的编码，一开始是为了欧洲各国编辑拉丁文字使用的
        // 后来出现了GBXXX系列的格式
        // 1.GB2312，
        // 这里区分了全半角
        // 2.GBK，
        // 这里包括了21003个汉字，是对原来的一次扩充，
        // 在兼容的基础上，可以使用繁体汉字和双字节编码
        // 3.GB18030，
        // 这里收录了70244个汉字，兼容的基础上，支持国内少数民族的文字编码
        // --
        // 在编码的过程中。各国采用各自的方案，导致互相访问时乱码，
        // 为了解决问题，出现了unicode编码格式
        System.out.println("---");
    }
}
