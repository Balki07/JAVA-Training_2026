import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        System.out.print("Enter the number to search : ");
        int requiredElement = s.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int flag = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == requiredElement) {
                flag = mid;
                break;
            }
            else if (arr[mid] < requiredElement) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (flag != -1) {
            System.out.println("Element found at index: " + flag);
        } else {
            System.out.println("Element not found");
        }
    }
}
