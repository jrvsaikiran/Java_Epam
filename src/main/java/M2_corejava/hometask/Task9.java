package M2_corejava.hometask;

public class Task9 {


    public static void main(String[] args) {

//        1. Write a program to find the missing number in integer array of 1 to 100
        missingNumberIn_Array();
        missing1to100();
//        2. Write a program to find biggest and smallest number in a array.
        bigSmallNumbersIn_Array();
//        Strings:
//        1. write a program to Print duplicate characters from String
        duplicateCharactersIn_String();
//        2. write a program to check if two strings are rotations of each other
        rotationEachOther_String("AACD","ACDA");


    }

    private static void rotationEachOther_String(String str1, String str2) {
        if ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1))
            System.out.println(
                    "Strings are rotations of each other");
        else
            System.out.printf(
                    "Strings are not rotations of each other");
    }


    private static void duplicateCharactersIn_String() {
        String s = new String("abcc");
        String empty = " ";
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(!empty.contains(String.valueOf(c))){
                empty += String.valueOf(c);
            }
        }
        System.out.println(empty);
    }

    private static void bigSmallNumbersIn_Array() {
       System.out.println("Big Small Numbers in Array");
        int ary[] = {3,50,36,6};
        int Max = ary[0];
        int Min = ary[0];
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > Max) {
                Max = ary[i];
            }else if(ary[i] < Min) {
                Min = ary[i];
            }
        }
        System.out.println("Max number in array "+Max);
        System.out.println("Min number in array "+Min);
    }

    private static void missing1to100() {
        int[] ay = {2,4,6};
        boolean[] present = new boolean[101];
        for(int num :ay){
            if(num<=100){
                present[num]=true;
            }
        }
        for(int i=0; i<=100; i++){
            if(!present[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void missingNumberIn_Array() {
        int[] arr = {1, 2, 4};
//        int n = arr.length;
        int N = arr.length + 1;
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int ary : arr) {
            actualSum = ary + actualSum;
        }
        System.out.println(expectedSum - actualSum);
    }


}
