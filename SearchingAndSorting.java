import java.util.Scanner;

class Searching {
    public int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length ; i++){
            if(target == arr[i])
                return i;
        }
        return -1;
    }
    public int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(target == arr[mid])
                return mid;
            else if (target < arr[mid])
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }
}
class Array{
    public void arrayPrint(int[] arr){
        System.out.print("\nArray -> ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public void arrayAddElements(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Elements: ");
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        arrayPrint(arr);
    }
}
public class SearchingAndSorting{
    public static void main(String[] args){
        Array objArr = new Array();
        Searching objSer = new Searching();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        objArr.arrayAddElements(arr);

        int choice = 0,target,result;
        System.out.println("\n1. Search\n2. Sort");
        System.out.print("\nEnter Choice: ");
        choice = sc.nextInt();
        choice = choice == 1 ? 1 : 2;
        if(choice == 1){
            System.out.println("\n1. Linear Search\n2. Binary Search");
            System.out.print("\nEnter Choice: ");
            choice = sc.nextInt();
            choice = choice == 1 ? 1 : 2;
        }
        switch (choice){
            case 1:
                System.out.print("\nEnter target element to be searched: ");
                target = sc.nextInt();
                result = objSer.linearSearch(arr,target);
                if(result!=-1)
                    System.out.println("\nElement found at index "+result);
                else
                    System.out.println("\nElement not found!");
                break;
            case 2:
                System.out.print("Enter target element to be searched: ");
                target = sc.nextInt();
                result = objSer.binarySearch(arr,target);
                if(result!=-1)
                    System.out.println("\nElement found at index "+result);
                else
                    System.out.println("\nElement not found!");
                break;
        }
    }
}