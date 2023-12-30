package Programming20;

import javax.sound.midi.Soundbank;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int[] ara={1, 5, 3, 6, 11, 9, 2, 13, 11, 7, 3, 9};

        printArray(ara);

        // Question 1 (Total Sum)
        System.out.println("\nTotal sum = " +arraySum(ara));

        // Question 2 (Largest Number in Array)
        System.out.println("\nLargest Element in array = "+largestNumber(ara));

        // Question 3 (Total number of Even and Odd)
        evenOrOdd(ara);

        // Question 4 (Reverse Array)
        reverseArray(ara);

        // Question 5 (Factorial Number)
        System.out.println("\nFactorial Number of 4 = "+factorialNumber(4));

        //Question 6 (Palindrome Check)
        char[] chars = {'l', 'e', 'v', 'e', 'l'};
        System.out.println("\nThis characters are Palindrome = "+checkPalindrome(chars));

        // Question 7 (Prime Number check)
        System.out.println("\nPrime number check: ");
        primeNumber(9);

        // Question 8 (First N element Fibonacci Numbers)
        System.out.print("\nFirst 8 Fibonacci numbers : ");
        fibonaaciSeries(9);

        // Question 9 (Linear Search - True/False)
        System.out.print("\nLinear Search of ");
        System.out.print(linearSearch(8, ara)+"\n");

        // Question 10 (Binary Search - True/False)
        System.out.print("\nBinary Search of ");
        System.out.println(binarySearch(13, ara));

        // Question 11 (Duplicate Element - True/False)
        duplicateElement(ara);

        // Question 12 (Count Vowel and Constant)
        String str = "abcdefg";
        vowelAndConsonants(str);

        // Question 13 (Multiplication table)
        multiplicationTable(2);

        // Question 14 (5 X 5 Matrix Addition)
        int[][] mat = matrixAddition(5);
        System.out.println("\nAddition of Matrix A and Matrix B = ");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        // Question 15 (Average of Array)
        System.out.println("\nAverage of the array is = "+averageOfArray(ara));

        // Question 16 (Check Leap Year)
        checkLeapYear(2024);

        // Question 17 (Pattern Printing)
        patternPrinting(5);

        // Question 18 (Reveres String)
        String str2 = "apple";
        System.out.println("\nReverse of "+(char)34+str2+ (char)34+ " is = "+(char)34+reverseString(str2)+(char)34);

        // Question 19 (Check number is Armstrong number or not)
        checkArmStrongNumber(1634);

        // Question 20 (Find and Print Minimum and Maximum number);
        minimumAndMaximum(ara);

        // Question 21 (Simple Interest)
        simpleInterest();

        // Question 22 (Celsius -> <- Fahrenheit)
        celsiusToFahrenheit();

        // Question 23 (Check is it Uppercase, Lowercase, digit, special character?)
        checkCharacter();

        // Question 24 (Second Largest Number)
        secondLargestNumber(ara);

        // Question 25 (find digit in String and sum of them)
        String s = "abd3E9f13s";
        System.out.println("\nString is "+s+", And Digit sum in String = "+digitSumString(s));
    }

    public static void printArray(int[] ara){
        System.out.print("Array is [");
        for(int i=0; i<ara.length; i++){
            System.out.print(" "+ara[i]);
        }
        System.out.println(" ]");
    }

    // Question 1 Answer
    public static int arraySum(int[] ara){
        int n = ara.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum = sum + ara[i];
        }
        return sum;
    }

    // Question 2 Answer
    public static int largestNumber(int[] ara){
        int largeNumber = ara[0];
        for(int i=1; i<ara.length; i++){
            if(ara[i] > largeNumber){
                largeNumber = ara[i];
            }
        }
        return largeNumber;
    }

    // Question 3 Answer
    public static void evenOrOdd(int[] ara){
        int even=0, odd=0;
        for(int i=0; i<ara.length; i++){
            if(ara[i]%2==0) even++;
            else odd++;
        }
        System.out.println("\nTotal Even number = "+even);
        System.out.println("Total Odd number = "+odd);
    }

    // Question 4 Answer
    public static void reverseArray(int[] ara){
        int n = ara.length;
        int left=0, right=n-1;
        while(left<right){
            int temp = ara[left];
            ara[left] = ara[right];
            ara[right] = temp;
            left++;
            right--;
        }
        System.out.print("\nReverse Array : ");
        for(int i=0; i<n; i++){
            System.out.print(ara[i]+" ");
        }
        System.out.println();
    }

    // Question 5 Answer
    public static int factorialNumber(int n){
        if(n==1) return n;
        return n * factorialNumber(n-1);
    }

    // Question 6 Answer
    public static boolean checkPalindrome(char[] chars){
        int n = chars.length;
        int left=0, right=n-1;
        while(left<right){
            if(chars[left] != chars[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    // Question 7 Answer
    public static void primeNumber(int n){
        if(n==1){
            System.out.println(n+" is not prime number.");
            return;
        }
        if(n==2){
            System.out.println(n+ " is a prime number.");
            return;
        }

        if(n%2==0){
            System.out.println(n+" is not prime number.");
            return;
        }

        boolean prime = true;

        for(int i=3; i<n; i=i+2){
            if(n%i==0){
                prime = false;
                break;
            }
        }

        if(prime == true){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is not a prime number.");
        }
    }

    // Question 8 Answer
    public static void fibonacci(int pos, int n, int num1, int num2){
        if(pos > n) return;
        int sum = num1 + num2;
        System.out.print(" "+sum);
        fibonacci(pos+1, n, num2, sum);
    }
    public static void fibonaaciSeries(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        if(n==2){
            System.out.println(1+" "+1);
            return;
        }
        int pos=3, num1 = 1, num2 = 1;
        System.out.print("1 1");
        fibonacci(pos, n, num1, num2);
        System.out.println();
    }

    // Question 9 Answer
    public static boolean linearSearch(int target, int[] ara){
        System.out.print(target + " is = ");
        for(int i=0; i<ara.length; i++){
            if(ara[i] == target) return true;
        }
        return false;
    }

    // Question 10 Answer
    public static boolean binarySearch(int target, int[] ara){
        System.out.print(target+" is = ");
        Arrays.sort(ara);
        int n = ara.length;
        int left = 0, right = n-1, mid;
        while(left<=right){
            mid = (left+right)/2;
            if(ara[mid] == target){
                return true;
            }else if(ara[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return false;
    }

    // Question 11 Answer
    public static void duplicateElement(int[] ara){
        int n = ara.length;
        Arrays.sort(ara);
        int now=-1;
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<n-1; i++){
            if(ara[i] == ara[i+1] && ara[i] != now){
                list.add(ara[i]);
                now = ara[i];
            }
        }
        if(now==-1){
            System.out.println("\nThere is no duplicate element.");
        }else{
            System.out.print("\nThere is duplicate element : ");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }

    // Question 12 Answer
    public static void vowelAndConsonants(String str){
        int len = str.length();
        int vowel=0, consonant = 0;
        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }else{
                consonant++;
            }
        }

        System.out.println("\nIn "+(char)34+str+(char)34+" there is total "+vowel+ " vowels and "+consonant+" consonants.");
    }

    // Question 13 Answer
    public static void multiplicationTable(int n){
        System.out.println("\n"+n+"'s multiplication table are");

        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }

    // Question 14 Answer
    public static int[][] matrixAddition(int n){
        int[][] a={
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] b={
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("\nMatrix A is = ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix B is = ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        return mat;
    }

    // Question 15 Answer
    public static double averageOfArray(int[] ara){
        int sum=0;
        int arrayLength = ara.length;
        for(int i=0; i<arrayLength; i++){
            sum = sum + ara[i];
        }
        double average = (double) sum/arrayLength;
        return average;
    }

    // Question 16 Answer
    public static void checkLeapYear(int year){
        System.out.println();
        if(year%100==0 && year%400== 0){
            System.out.println(year + " is a Leap Year.");
        }else if(year%100 != 0 && year%4==0){
            System.out.println(year+" is a Leap Year.");
        }else{
            System.out.println(year + " is Not a Leap year.");
        }
    }

    // Question 17 Answer
    public static void patternPrinting(int n){
        System.out.println("\nPrinting "+n+" size of Pyramid : ");
        for(int i=1; i<=n; i++){
            int last = (i*2)-1;
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=last; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 18 Answer
    public static String reverseString(String str){
        int stringLength = str.length();
        int left = 0, right=stringLength-1;
        byte[] b = str.getBytes();
        while(left < right){
            byte temp = b[left];
            b[left] = b[right];
            b[right] = temp;
            left++;
            right--;
        }

        return new String(b);
    }

    // Question 19 Answer
    public static void checkArmStrongNumber(int n){
        int num = n;
        int digitLength = 0;
        while(num>0){
            digitLength++;
            num = num/10;
        }
        int armstrong=0, mul, rem;
        num = n;
        while(num>0){
            rem = num%10;
            mul=1;
            for(int i=1; i<=digitLength; i++){
                mul = mul*rem;
            }
            armstrong = armstrong + mul;
            num= num/10;
        }
        System.out.println();
        if(armstrong == n){
            System.out.println(n+ " is a Armstrong Number.");
        }else{
            System.out.println(n+" is not a Armstrong Number.");
        }
    }

    // Question 20 Answer
    public static void minimumAndMaximum(int[] ara){
        int min = 999999999;
        int max = -99999999;

        for(int i=0; i<ara.length; i++){
            if(ara[i]>max){
                max = ara[i];
            }
            if(ara[i] < min){
                min = ara[i];
            }
        }

        System.out.println("\nIn the Array Minimum number is = "+min+" and Maximum number is = "+max);
    }

    // Question 21 Answer
    public static void simpleInterest(){
        double principal, rate, time;
        double simpleInterest;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter your rate: ");
        rate = input.nextDouble();
        System.out.print("Enter your time: ");
        time = input.nextDouble();

        simpleInterest = (principal*rate*time)/100.00;
        System.out.println("Simple Interest = "+simpleInterest);
    }

    // Question 22 Answer
    public static void celsiusToFahrenheit(){
        Scanner input = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.println("\nFind Celsius.");
        System.out.print("Enter Fahrenheit value: ");
        fahrenheit = input.nextFloat();
        celsius = (fahrenheit-32)/1.8f;
        System.out.println("Celsius = "+celsius);

        System.out.println("\nFind Fahrenheit.");
        System.out.print("Enter Celsius value: ");
        celsius = input.nextFloat();
        fahrenheit = (celsius * 1.8f)+32;
        System.out.println("Fahrenheit = "+fahrenheit);
    }

    // Question 23 Answer
    public static void checkCharacter(){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("\nEnter a character: ");
        ch = input.next().charAt(0);
        System.out.print("Your are input a = ");
        if(ch>='a' && ch<='z'){
            System.out.println("Lower Case Character.");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case Character.");
        }else if(ch>='0' && ch<='9'){
            System.out.println("Digit.");
        }else{
            System.out.println("Special Character.");
        }
    }

    // Question 24 Answer
    public static void secondLargestNumber(int[] ara){
        int large1 = ara[0];
        int large2 = -1;

        for(int i=1; i<ara.length; i++){
            if(ara[i] > large1){
                large2 = large1;
                large1 = ara[i];
            }
            if(ara[i]<large1 && ara[i] > large2){
                large2 = ara[i];
            }
        }

        System.out.println("\nSecond Largest Number = "+large2);
    }

    // Question 25 Answer
    public static int digitSumString(String s){
        int len = s.length();
        int sum = 0;
        int digit, num;
        for(int i=0; i<len; i++){
            num = 0;
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                while(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    digit = s.charAt(i)-'0';
                    num = num*10+digit;
                    i++;
                }
                i--;
                sum = sum + num;
            }

        }

        return sum;
    }

}
