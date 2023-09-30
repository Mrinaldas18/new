package github;
public class Max_Subarray_Sum {
    public static void pairs(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += number[k];
                }
                System.out.println(currentSum);
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        System.out.println(" ");
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        pairs(number);
    }
}

