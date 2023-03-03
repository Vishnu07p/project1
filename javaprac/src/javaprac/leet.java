package javaprac;

public class leet {
	
	
	static int j = 32;
    public int[] twoSum(int[] nums, int target) {
    
    for( int i=0;i<nums.length;i++){

for(int j=1;j<nums.length;j++){
    if(nums[i] + nums[j] == target){
    	return new int[]{i,j};
    }
}

    }
    return new int []{};
    }	public static void main(String []args) {
    	leet v = new leet();
    int [] k = v.twoSum(new int [] {2,3,4,5}, 6);
    System.out.print(k[0]);
    System.out.print(k[1]);
    
		
	}

}
