import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class ArrayDemo{
    public static void main(String[] args)throws IOException {

//PROGRAM 1
// WAP TO FIND THE SUM OF ODD NOS IN ARRAY
        /*int sum = 0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array");
        int size = Integer.parseInt(br.readLine());
        int array[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i=0;i<size;i++){
            array[i]=Integer.parseInt(br.readLine());
            if (array[i]%2==1){
                sum=sum+array[i];

            }
        }
        System.out.println("Sum of odd nos : "+ sum);*/

        //PROGRAM 2
        // WAP TO FIND PRODUCT OF EVEN  NOS FORM ARRAY
        /*int mul =1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of Array ");
        int size = Integer.parseInt(br.readLine());
        int array[]= new int[size];
        System.out.println("Enter Array Elements :");
        for(int i = 0;i<size;i++){
            array[i]=Integer.parseInt(br.readLine());
            if(array[i]%2==0){
                mul=mul*array[i];
            }
        }
        System.out.println("Multiplication of EVEN Nos : "+mul);*/

        //PROGRAM 3
        // PRODUCT OF ODD INDEX ONLY
        /*int mul =1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of Array ");
        int size = Integer.parseInt(br.readLine());
        int array[]= new int[size];
        System.out.println("Enter Array Elements :");
        for(int i = 0;i<size;i++){
            array[i]=Integer.parseInt(br.readLine());
            if(i%2==1){
                mul=mul*array[i];
            }
        }
        System.out.println("Multiplication of ODD Index only : "+mul);*/

        //PROGRAM 4
        //WAP TAKE 7 CHARACTER FROM USER AND PRINT ONLY VOWELS FROM THEM
        /*int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int size = sc.nextInt();
        char carray[]= new char[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<size;i++){
            carray[i]=sc.next().charAt(0);
        }
        for(int i=0;i<carray.length;i++){
            if(carray[i]=='a'||carray[i]=='e'||carray[i]=='i'||carray[i]=='o'||carray[i]=='u'){
                System.out.print(carray[i]+" ");
            }
            System.out.println();
        }*/

        //PROBLEM 5
        // NO DIVISIBLE BY 5 FROM THE ARRAY
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of array :");
        int size = Integer.parseInt(br.readLine());
        int array[]=new int[size];
        System.out.println("Enter Array Elements :");
        for(int i=0;i<size;i++){
            array[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("No Divisible by 5 Are : ");
        for(int i=0;i<array.length;i++){
            if(array[i]%5==0){
                System.out.print(array[i]+" ");
            }
        }


    }
}
