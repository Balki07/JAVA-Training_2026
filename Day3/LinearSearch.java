class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {10, 25, 30, 45, 50, 65};
        int requiredElement = 45;

        int flag = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == requiredElement) {
                flag = i;
                break;
            }
        }
        if (flag == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + flag);
        }
    }
}