package homework3;

public class NumberN3and7 {
    public static void main(String[] args) {
        homework3(21);
        }
    public static void homework3(int promenliva){
        for (int g = 0; g<=promenliva;g++){
            System.out.println(g);
        }
        System.out.println("----------------------------------");

        for (int i=0; i<=promenliva;i++){
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.printf("The numbers that cant be divided by 3 and 7 are: %d\n",i);

            }

        }
    }
}
