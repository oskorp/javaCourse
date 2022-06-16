package day5;

public class armStrong {
    public static void main(String[] args) {
        int n,sum=0,temp,rem;
        n = 3711;
        temp = n;
        String s = "omkar";
        System.out.println(s.length());
        while(n>0){
            rem = n % 10;
            sum = sum + rem * rem *rem;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong no");;
        }
        else{
            System.out.println("Not armstrong");
        }
    }
    
}
