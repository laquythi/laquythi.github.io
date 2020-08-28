package communityuni.com;

public class TestParameter {
    public static int sum(int ... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // sum o day la 1 overloadding method,va la 1 array se tu dong co gian so phan tu khi nguoi dung truyen vao
        int s = sum(1,2,3,4,5,6,7,8,9);
        System.out.println("s = " + s); // ket qua s = 45

        int s2 = sum();
        System.out.println(s2); // ket qua s2 = 0;

        int s3 = sum(1,5,1,7,8,9,9,8,7);
        System.out.println("s3 = " + s3); // ket qua s3 = 55

        int s4 = sum(7,9,9,1);
        System.out.println("s4 = " + s4); // ket qua s4 = 26

    }
}
