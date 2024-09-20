package M2_corejava.hometask;

public class Task10 {
    public static void main(String[] args) {

//       1. You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        speedControl(83, false);

//        2. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is  6. Note: the function Math.abs(num) computes the absolute value of a number.
        trueNumber(1, 5);

//        3. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
        teaAndCAndy(3, 8);

//        4. You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
        lottery(4,5,60);

//        5. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
        greaterNumber(2,2,3);

//        6. Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        digitAppears(35,95);

//        7. Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
        sumLimit(3,6);

//        8. Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
        withoutString("jrvsai","vs");

//        9. Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
        largestBlock("kiirraaan");

//        10. Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
        sumNumbers("sai34jrv45ui");

    }

    public static void sumNumbers(String str) {
        int sum = 0;
        String tmp = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                tmp += str.charAt(i);
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(tmp);
                    tmp = "";
                }
            }
        }
        System.out.println(sum);
    }

    private static void largestBlock(String str) {
        int max=0;
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }else{
                    break;
                }
            }
            if(count >max){
                max=count;
            }
        }
        System.out.println(max);
    }

    public static void   withoutString(String base, String remove) {
         System.out.println(base.replaceAll(STR."(?i)\{remove}", ""));
    }

    private static void sumLimit(int a, int b) {
        String ab = Integer.toString(a + b);
        String s2 = Integer.toString(a);
        if(s2.length()==ab.length()){
            System.out.println(ab);
        }else {
            System.out.println(s2);
        }
    }

    private static void digitAppears(int a, int b) {
        int aL = a / 10;
        int aR = a % 10;
        int bL = b / 10;
        int bR = b % 10;
        if(aL == bL || aL == bR || aR == bR || aR == bL){
            System.out.println("digitAppears " + a + " and " + b + " are equal");
        }else {
            System.out.println("digitAppears " + a + " and " + b + " are not equal");
        }

    }

    private static void greaterNumber(int a, int b, int c) {
        if(b>=a){
            if(c>=b){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }else {
            System.out.println("false");
        }
    }

    private static void lottery(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
             System.out.println("lottery ticket returns "+10);
        } else if (ab - bc == 10 || ab - ac == 10) {
            System.out.println("lottery ticket returns "+ 5);
        }
        else {
            System.out.println("lottery ticket returns "+0);
        }
}

    private static int teaAndCAndy(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return condition(1, tea, candy);
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return condition(2, tea, candy);
        }else {
            return condition(1, tea, candy);
        }
    }

    private static int condition(int i, int tea, int candy) {
        switch (i) {
            case 0:
                System.out.println("Bad with condition " + tea + " and " + candy);
                break;
            case 1:
                System.out.println("Good with condition " + tea + " and " + candy);
                break;
            case 2:
                System.out.println("Great with condition " + tea + " and " + candy);
                break;
            case 3:
                System.out.println("Null condition " + tea + " and " + candy);
                break;
        }
        return i;
    }

    private static void trueNumber(int a, int b) {
        int sum = a + b;
        int difference = Math.abs(a - b);
        if (sum == 6 || difference == 6) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static int speedControl(int speed, boolean b) {
        if (b) {
            if (speed <= 65) {
                return ticket(0, speed);
            } else if (speed >= 66 && speed <= 86) {
                return ticket(1, speed);
            } else if (speed >= 87) {
                return ticket(2, speed);
            }
        } else {
            if (speed <= 60) {
                return ticket(0, speed);
            } else if (speed >= 61 && speed <= 80) {
                return ticket(1, speed);
            } else if (speed >= 81) {
                return ticket(2, speed);
            }
        }
        return speed;
    }

    private static int ticket(int i, int speed) {
        switch (i) {
            case 0:
                System.out.println("No Ticket for speed " + speed);
                break;
            case 1:
                System.out.println("Small Ticket for speed " + speed);
                break;
            case 2:
                System.out.println("Big Ticket for speed " + speed);
                break;
        }
        return i;
    }


}
