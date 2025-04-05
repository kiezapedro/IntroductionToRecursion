import java.util.ArrayList;
import java.util.List;

public class Pzz {
    public static List<Integer> pzz(int n) {
        // Base case: if n is 0, return an empty list
        if (n == 0) {
            return new ArrayList<>();
        }

        // Result list starting with the current number n
        List<Integer> result = new ArrayList<>();
        result.add(n);

        // Recursively call the function for n-1 and store sub-pattern
        List<Integer> subPattern = pzz(n - 1);

        // Add sub-pattern three times to the result list
        for (int i = 0; i < 3; i++) {
            result.addAll(subPattern);
        }

        // Add current number n again at the end
        result.add(n);

        return result;
    }

    public static void main(String[] args) {
        int n = 3; // Test with input value
        List<Integer> result = pzz(n);

        // Show result list
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
