package aaa001����ѧϰ����;

public class bbb005����Ԫ����� {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int x = 0;
        int xx = 0;
        for (System.out.println("��ʼѭ��"); x < arr.length; x++) {
            if (arr[x] % 10 != 7 && arr[x] / 10 % 10 != 7 && arr[x] % 2 == 0) {
                xx += arr[x];
            }
            /*
            if(arr[x]%10==7||arr[x]/10%10==7){
                //x++;
            }else if(arr[x]%2==0){
                xx +=arr[x];
                //x++;
            }*/
        }
        System.out.println(xx + "ѭ������");
    }
}
