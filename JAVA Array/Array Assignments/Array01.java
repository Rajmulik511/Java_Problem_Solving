import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArrayDemo{
    public static void main(String[] args)throws IOException {
        int sum = 0;
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
        System.out.println("Sum of odd nos : "+ sum);

    }
}