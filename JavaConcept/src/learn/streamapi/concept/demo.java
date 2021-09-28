package learn.streamapi.concept;

public class demo {

	public static void main(String[] args) {

		int nums[] = new int[] { 3,2,2,3};
		
//		
//		    int i = 0;
//		    for (int j = 1; j < nums.length; j++) {
//		        if (nums[j] != nums[i]) {
//		            i++;
//		            nums[i] = nums[j];
//		        }
//		    }

		int val=3;
		int j=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
               
                nums[j]=nums[i];
                ++j;
            }
        }
		for (int k = 0; k < nums.length; k++) {
			System.out.println(nums[k]);
		}
	}

}
