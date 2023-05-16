package homework3;

public class Average {
    public static void main(String[] args) {
        int[] homeWorkThree = {5, 2, 10, 5, 2, 10, 7, 19, 20, 33, 11, 12, 13, 14, 15, 16, 17, 19, 21, 50};
        float sum = 0;
        int i = 0;

        while (i < homeWorkThree.length) {
            sum += homeWorkThree[i];
            i++;
        }
        float average = (sum / homeWorkThree.length);
        System.out.printf("The Average Value of the Array is %f", average);
    }
}
