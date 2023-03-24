public class JavaProgram {
    public static void main(String[] raj){
        /*int x = 15;
        if (x%3==0 && x%5==0){
            System.out.println("Fizz - Buzz");
        }
        else if(x%3==0){
            System.out.println("fizz");
        }
        else if(x%5==0){
            System.out.println("buzz");
        }
        else{
            System.out.println("not divisible by both 3 and 5");
        }*/

        //REVERSE THE INTEGER
        int n= 12345;
        int rev = 0;
        int rem=0;
        while (n != 0) {
            rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        System.out.print(rev);
    }
}



