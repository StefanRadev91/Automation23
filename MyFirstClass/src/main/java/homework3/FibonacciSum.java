package homework3;

import HomeWork2.sum;

public class FibonacciSum {
    public static void main(String[] args) {

            int n = 10, firstTerm = 0, secondTerm = 1;
            int sum = firstTerm+secondTerm;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 3; i <= n; ++i) {
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
                sum += nextTerm;
                System.out.println(sum);
            }
        }
    }

