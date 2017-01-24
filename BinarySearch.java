import java.util.Arrays;
//二分查找法
public class BinarySearch{
	public static int rank(int key, int[] a){
		//数组必须是有序的
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi-lo)/2;
			if(key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] whitelist = {1,5,4,8,13};
		Arrays.sort(whitelist);
		int testNum = 13;
		if(rank(testNum, whitelist) < 0){
			System.out.println(testNum);
		}else{
			System.out.println(testNum+":exists in array.");
		}
	}
	
}
