package homework3;

public class SumOfOddsAndEvens {
    public static void main(String[] args) {
        int[] homeWorkThree = {5, 2, 10, 5, 2, 10, 7, 19, 20, 33, 11, 12, 13, 14, 15, 16, 17, 19, 21, 50};
            int evenSum = 0;
            int oddSum = 0;

            for (int i = 0; i < homeWorkThree.length; i++) {
                if (homeWorkThree[i] % 2 == 0) {
                    evenSum += homeWorkThree[i];
                } else {
                    oddSum += homeWorkThree[i];
                }
            }

            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
    }

