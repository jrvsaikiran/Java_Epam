package M2_corejava.hometask;

public class Task11 {

    public static void main(String[] args) {

//        1. Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
        maxSpan(new int[]{3, 4, 3});

//        2. Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
        boolean b = canBalance(new int[]{3, 1, 4, 7, 2, 5, 7, 21, 8});
        System.out.println(b);

//        3. Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
        sameAdjValues(new int[]{13, 15, 66, 66, 37, 8, 8, 11, 52});

//        4. We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
        int max = maxMirror(new int[]{3, 1, 4, 7, 2, 5, 4,1,3});
        System.out.println("Max mirror: " + max);

//        5. Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
        boolean b1 = linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4});
        System.out.println("Linear In: " + b1);

    }


    public static boolean linearIn(int[] outer, int[] inner) {
        int numFound = 0;
        if(inner.length == 0) {
            return true;
        }
        int k = 0;
        for(int i = 0; i < outer.length; i++) {
            if(outer[i] == inner[k]) {
                numFound++;
                k++;
            } else if(outer[i] > inner[k]) {
                return false;
            }
            if(numFound == inner.length)
            return true;
        }
        return false;
    }



    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = len - 1; i + count < len && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }

    private static void sameAdjValues(int[] ary) {
        int count = 0;
        boolean found = false;
        for (int i = 0; i < ary.length - 1; i++) {
            if (ary[i] == ary[i + 1] && !found) {
                count++;
                found = true;
            } else {
                found = false;
            }
        }
        System.out.println(count);
    }

    public static boolean canBalance(int[] nums) {
        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            int rSum = 0;
            for (int j = nums.length - 1; j > i; j--) {
                rSum += nums[j];
            }
            if (rSum == lSum)
                return true;
        }
        return false;
    }

    public static void maxSpan(int[] nums) {
        int span = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    tmp = j - i + 1;
                    span = Math.max(tmp, span);
                }
            }
        }
        System.out.println(span);
    }
}
