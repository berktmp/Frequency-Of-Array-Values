import java.util.Arrays;

public class Main {
    // Method to check the frequency of elements in the array
    static boolean isFrequency(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            // Skip if the element is already visited
            if (visited[i] == true)
                continue;

            int count = 1;
            // Count the frequency of the current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            // Print the element and its frequency
            if (count >= 1) {
                System.out.println(arr[i] + " appeared " + count + " times.");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = list.length;

        System.out.println("----------------------------------------");
        System.out.println("Array: " + Arrays.toString(list));
        System.out.println("----------------------------------------");

        System.out.println("Frequency of Elements:");
        isFrequency(list, n);
    }
}
