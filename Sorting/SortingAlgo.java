import java.util.*;
class SortingAlgo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option =1;
        while(option>0){
            showOption();
            option = sc.nextInt();
            if(option==0)
            break;
            optionOfSorting(option);
        }
        sc.close();
        System.out.print("Program terminated");
        

        
    }
    
    public static void showOption(){
        System.out.println("*Enter The Key for option of Sorting Algorithm");
        System.out.println("1). Bubble Sort");
        System.out.println("2). Selection Sort");
        System.out.println("3). Insertion Sort");
        System.out.println("4). Counting Sort");
        System.out.println("Exit: Press 0");
    }
    public static void optionOfSorting(int option){
        int arr[] = {5,2,6,4,1,3};
        
        switch (option) {
            case 1:
                bubble(arr);
                printArr(arr);
                break;
            
            case 2:
                selectionSort(arr);
                printArr(arr);
                break;
            
            case 3:
                insertionSort(arr);
                printArr(arr);
                break;    
            
            case 4:
                countingSort(arr);
                printArr(arr);
                break;
            default:
                break;
        }
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubble(int[] arr){
        for(int i=arr.length; i>1; i--){
            for(int j=1; j<i; j++){
                if(arr[j-1]>arr[j]){
                    arr[j-1]=arr[j-1]+arr[j];
                    arr[j]=arr[j-1]-arr[j];
                    arr[j-1]= arr[j-1]-arr[j];
                }
            }
        }
    }


    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIth=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIth]){
                    minIth=j;
                }
            }
            
            int temp=arr[minIth];
            arr[minIth]=arr[i];
            arr[i]=temp;
        }
        
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int prev=i-1;
            
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingSort(int[] arr){
        int largest = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[largest]<arr[i]){
                largest=i;
            }
        }

        int count[] = new int[arr[largest]+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}

    