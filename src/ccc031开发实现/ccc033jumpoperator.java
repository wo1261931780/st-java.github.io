package ccc031����ʵ��;

public class ccc033jumpoperator implements ccc034jump {
    @Override
    public void jump() {
        System.out.println("�������е�jump");
    }

    public void method(ccc034jump j) {
        System.out.println("�������е�method");
        j.jump();
//        new ccc034jump(){
//            @Override
//            public void jump() {
//                System.out.println("finish");
//                System.out.println("jump----");
//            }
//        };
    }
}
