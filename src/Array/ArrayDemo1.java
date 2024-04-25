package Array;

import java.util.Scanner;

//FIND THE OCCURRENCE OF EACH UNIQUE CHARACTER
public class ArrayDemo1 {
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ENTER THE LENGTH OF AN ARRAY");
        int length= scanner.nextInt();
        System.out.println("ENTER "+length+"INTEGER NUMBER");
        int[] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }
        int[] occurrenceOfAnElement=findOccurrence(array);
        System.out.println("OUTPUT");
        System.out.println("==================================");
        for(int i=0;i< array.length;i++){
            if(occurrenceOfAnElement[i]>0){
                System.out.println(array[i]+"\t"+occurrenceOfAnElement[i]);
            }
        }
    }

    public static int[] findOccurrence(int[] array){
        int[] tempArray=new int[array.length];

        for(int i=0;i< array.length;i++){
            int count=1;
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    tempArray[j]=-1;
                }
            }
            if(tempArray[i]==0){
                tempArray[i]=count;
            }
        }
        return tempArray;
    }
}
