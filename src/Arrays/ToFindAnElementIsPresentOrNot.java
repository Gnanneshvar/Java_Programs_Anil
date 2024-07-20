package Arrays;

public class ToFindAnElementIsPresentOrNot {
    static int count;
    public static void main(String[] args) {
        int arr[]={4,8,9,13,10,3,5,4,8,49,11,4,121,4,13,14,4,37,27,54,39};
        int findElement=20,i,countElement=20;
        boolean status = false;
        for(i=0;i<arr.length;i++){
            if(findElement==arr[i]){
                System.out.println("The element is present in ::"+i);
                status=true;
                break;
            }
        }
        if(!status){
            System.out.println("The element is not present in the list");
        }
        checkTheCountOfElemenent(arr,countElement);
        System.out.println("The number of times, the element is repeated is::"+count);

        System.out.println("The Largest number in an Array is::"+getLargestNumber(arr));
        System.out.println("After Sorting::");
        sortAnArray();
    }

    // With parameters and without return type
    public static void checkTheCountOfElemenent(int array[],int element)
    {
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                count++;
            }
        }
    }
    // With return type and with parameters
    public static int getLargestNumber(int[] arr)
    {
        int largestNumber=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largestNumber){
                largestNumber=arr[i];
            }
        }
        return largestNumber;
    }

    // I need to sort an array
    public static void sortAnArray()
    {
        int sortArray[]={6,3,9,19,2,13,7,15};
        int largest,temp;
        for(int i=0;i<sortArray.length;i++){
            for(int j=0;j<sortArray.length-i;j++)
            {
                if(j<sortArray.length-1){
                    if(sortArray[j]>sortArray[j+1]){
                        temp = sortArray[j];
                        sortArray[j]=sortArray[j+1];
                        sortArray[j+1]=temp;
                    }
                }
            }
            System.out.print(" After Iteration::"+(i+1)+"   ::: ");
            for(int k=0;k<sortArray.length;k++){
                System.out.print(sortArray[k]+" ");
            }
            System.out.println();
        }
        System.out.println("Final Sorting");
        for(int i=0;i<sortArray.length;i++){
            System.out.print(sortArray[i]+" ");
        }
    }
}
