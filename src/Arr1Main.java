import java.util.Arrays;

public class Arr1Main {

	public static void main(String[] args) {
		// init type 1
				int[] arr1 = new int[3];
				arr1[0] = 1;
				arr1[1] = 2;
				arr1[2] = 3;
				// init type 2
				int[] arr2 = { 1 , 2 , 3};
				// init type 3
				int[] arr3 = new int[] {1,2,3};
				//
				System.out.println("arr1:" + Arrays.toString(arr1));
				System.out.println("arr2:" + Arrays.toString(arr2));
				System.out.println("arr3:" + Arrays.toString(arr3));
				//
				System.out.println("sum(arr1):" + sum(arr1));
				System.out.println("sum1(arr1):" + sum1(arr1));
				System.out.println("min(arr1):" + min(arr1));
				System.out.println("contains(arr1,4):" + contains(arr1,4));
				System.out.println("indexOf(arr1,4):" + indexOf(arr1,4));
				System.out.println("lastIndexOf(arr1,4):" + lastIndexOf(arr1,4));
				System.out.println("lastIndexOf(arr1,2):" + lastIndexOf(arr1,2));

	}

	static int sum(int[] pArray) {
		int sum = 0;
		for(int i=0;i < pArray.length;i++) {
			sum += pArray[i];
		}
		return sum;
	}
	
	static int sum1(int[] pArray) {
		int sum = 0;
		for(int value : pArray) {
			sum += value;
		}
		return sum;
	}
	
	static int min(int[] pArray) {
		int min = Integer.MAX_VALUE;
		for(int value : pArray) {
			if(value < min) {
				min = value;
			}
		}
		return min;
	}
	
	static boolean contains(int[] pArray,int pValue) {
		for(int value : pArray) {
			if(value == pValue) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param pArray
	 * @param pValue
	 * @return index of the first element in the array or -1 if not found
	 */
	static int indexOf(int[] pArray,int pValue) {
		int idx = -1;
		for(int i = 0;i < pArray.length;i++) {
			if(pArray[i] == pValue) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	
	/**
	 * 
	 * @param pArray
	 * @param pValue
	 * @return index of the last element in the array or -1 if not found
	 */
	
	static int lastIndexOf(int[] pArray,int pValue) {
		for(int i = pArray.length - 1;i >= 0;i--) {
			if(pArray[i] == pValue) {
				return i;
			}
		}
		return -1;
	}
}
