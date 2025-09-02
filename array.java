// lets first array create 

import java.util.Scanner;

class array {
    public static void main(String[] args) {
        // we take input from user , so we use scanner class,then also take element from
        // user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // for sum of the array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the array elements is: " + sum);

        // find max element in array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);

        // find min element in array
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);

        // find second largest element in array
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: " + smax);

        // reverse an array
        System.out.println("The reversed array is: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }

        // reverse an array using swapping
        System.out.println();
        System.out.println("The reversed array using swapping is: ");
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
