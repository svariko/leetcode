package main.java;
import java.util.*;

public class IntersectionTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {

        int[] smaller, bigger;
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> remaining = new ArrayList<>();


        if (nums1.length <= nums2.length) {
            smaller = nums1;
            bigger = nums2;
        }
        else {
            smaller = nums2;
            bigger = nums1;
        }

        for (int i = 0; i < bigger.length; i++) {
            remaining.add(i);
        }

        for (int j = 0; j < smaller.length; j++) {
            Iterator<Integer> it = remaining.iterator();
            while (it.hasNext()) {
                int index = it.next();
                if (smaller[j] == bigger[index]) {
                    resultList.add(smaller[j]);
                    remaining.remove(Integer.valueOf(index));
                    break;
                }
            }

        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;




    }

    public static void main(String[] args) {
        IntersectionTwoArrays2 intersectionTwoArrays2 = new IntersectionTwoArrays2();

        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        int[] expectedOutput = new int[] {2,2};

        System.out.println(Arrays.toString(intersectionTwoArrays2.intersect(nums1, nums2)));



    }

}
