package os.soft.wzvtc;

/**
 * 二数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9。因为 nums[0] + nums[1] = 2 + 7 = 9，所以返回 [0, 1]
 *
 * 如果没有找到，就返回null
 */
public class SumOfTwoDigit {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};int target = 10;
        //int[] nums = new int[]{6, 2, 4, 15};int target = 8;
        int [] result=twoSum(nums,target);
        if(result==null){

        }else{
            System.out.println("下标分别是："+result[0]+"、"+result[1]);
            System.out.println("这两个数分别是："+nums[result[0]]+"、"+nums[result[1]]);
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i ; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;

    }

}
