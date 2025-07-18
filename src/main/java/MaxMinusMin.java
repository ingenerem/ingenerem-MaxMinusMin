
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int big =nums.get(0);
        int small =nums.get(0);
        for(int num : nums){
            if (num > big)
               big = num;
            if(num < small)
              small = num;
        }
        return big - small;
    }
}
