public class Fibonacci {

    public static void main(String[] args) {
        fibo(7);
    }

    //1,1,2,3,5,8,13

    public static void fibo(int n){
        long n1=1;
        long n2=1;
        //we know 1st and 2nd number so we start from 3th
        for(int i=3;i<=n;i++){
            long temp = n2+n1;
            n1=n2;
            n2=temp;



        }
        System.out.println(n2);
    }
}
