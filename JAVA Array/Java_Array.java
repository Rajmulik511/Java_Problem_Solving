import java.util.*;
class Arrays{
    public static void main(String[] args){
        //ARRAY DECLARATIONS
        //METHOD 1
        int arr1[]= new int[10];  //Dimensions required
        arr1[0]=100;      //EAch seperately Assigned
        arr1[1]=200;
        for(int i = 0; i<arr1.length;i++){    //ALWAYS START FROM i=0 ONLY
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        /*//METHOD 2
        // Direct initialization without giving Dimensions
        int arr2[]={1,2};
        for(int i = 0; i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }*/

        /*//METHOD 3
        //Above method goes internally in the below way
        int arr3[]= new int[]{11,22,33,44,55};
        for(int i = 0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }*/

        /*//DIIFERENT ARRAYS
        int arr1[]={1,2,3,4,5};
        String arr2[]={"raj","ram"};
        double arr3[]={10.2,20.0};
        float arr4[]={10.2f,20.0f};
        char arr5[]={'a','s'};           //Single '' ONLY
        boolean arr6[]={true,false,true};*/

        //INPUT FROM USER
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of ARRAY : ");
        int size = sc.nextInt();

        int arr1[]= new int[size];
        for(int i =0;i<size;i++){
            System.out.println("Enter at Index "+i+": ");
            arr1[i]= sc.nextInt();
        }

        System.out.println("Your ARRAY is :");
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }*/

    }
}