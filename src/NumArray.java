import java.util.*;

public class NumArray {

	public int[] nums;
	public int[] BIT;
	//public Map<Integer, List<Integer>> map;
	int n;
	
	public NumArray(int[] nums) {
		this.nums = nums;
		n = nums.length;
		BIT = new int[n + 1];
		/*
		map = new HashMap<>();
		for (int i = 0; i <= n; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		*/
		for (int i = 0; i < n; i++) {
			init(i, nums[i]);
		}
	}
	
	public void init(int i, int val) {
		//int j = i;
		i++;
		while (i <= n) {
			BIT[i] += val;
			//map.get(i).add(j);
			i += (i & -i);
		}
	}
	
	/*
	public void printBIT() {
		System.out.println(map);
	}
	*/
}
