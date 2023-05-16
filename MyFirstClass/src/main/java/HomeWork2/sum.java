package HomeWork2;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ///TASK 1///
        System.out.println("Tell me integer one");
        int integerone = Scanner.nextInt();
        System.out.println("Tell me integer two");
        int integertwo = Scanner.nextInt();
        System.out.println("Tell me integer three");
        int integerthree = Scanner.nextInt();

        int largest = integerone;

        if (largest < integertwo) {
            largest = integertwo;
        } if (largest < integerthree) {
            largest = integerthree;
        }
        System.out.println(largest);

        ///TASK 2///
        System.out.println("Tell me the length of a rectangle");
        double length = Scanner.nextDouble();
        System.out.println("Tell me the height of a rectangle");
        double height = Scanner.nextDouble();
        double perimeter = 2 * (length * height);
        double faceOfRectangle = length * height;
        System.out.println(perimeter +" "+ faceOfRectangle);

        ///TASK 3///
        System.out.println("Enter an integer");
        int integer = Scanner.nextInt();
        if (integer % 2 == 0)
        {
            System.out.println(integer + " is even");
        } else {
            System.out.println(integer + " is odd");
        }
        ///TASK 4///
        System.out.println("Select a number from 1 to 7");
        int DayOfTheWeek = Scanner.nextInt();
        switch (DayOfTheWeek) {
            case 1:
                System.out.println("You have selected 1. Day of the week is Monday");
                break;
            case 2:
                System.out.println("You have selected 2. Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("You have selected 3. Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("You have selected 4. Day of the week is Thursday");
                break;
            case 5:
                System.out.println("You have selected 5. Day of the week is Friday");
                break;
            case 6:
                System.out.println("You have selected 6. Day of the week is Saturday");
                break;
            case 7:
                System.out.println("You have selected 7. Day of the week is Sunday");
                break;
            default:
                System.out.println("Try Again");
                break;
        }

        }
    }

