package ab����ѧϰ2021��10��2��.bbb028Stringuild���;

public class bbb034�ַ���ƴ��plus {
    public static void main(String[] args) {
        //         int[] arr={1,5,41,32,154,564,654,86};
        //         StringBuilder xx=new StringBuilder("[");
        //         for (int x=0;x<arr.length;x++){
        //             if (x==arr.length-1) {
        //                 xx.append(arr[x]+"]");
        //             }else {
        //                 xx.append(arr[x]+",");
        //             }
        //         }
        // //        System.out.println(xx+"]");
        // //        xx.append("]");
        //         System.out.println(xx);
        //         String a=xx.toString();
        //         System.out.println(a);
        System.out.println("��ʼִ��");
        int[] x = {1, 2, 2, 13, 1, 2, 5, 4, 5};
        StringBuilder x1 = new StringBuilder();
        x1.append("[");
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x1.append(x[i]).append("]");
            } else {
                x1.append(x[i]).append(",");
            }
        }
        // x1.append("]");
        System.out.println(x1);
    }
}
