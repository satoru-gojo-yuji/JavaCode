package Company_Coding_Q;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front of the array
        for(int i=0 ; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

    }

        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);
            // Print the modified array
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }




