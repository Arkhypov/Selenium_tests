package us.st.tasks;


public class BinarySearchIml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//complexity: logN
	public int findBinarySearchIteratively(int[] sortedArray, int key) {
			    
				int index = Integer.MAX_VALUE;
				int l=0;
			    int r=sortedArray.length-1; 
			    while (l <= r) {
			        int midIndex = Math.abs((l + r) / 2);
			        if (sortedArray[midIndex] < key) {
			            l = midIndex + 1;
			        } else if (sortedArray[midIndex] > key) {
			            r = midIndex - 1;
			        } else if (sortedArray[midIndex] == key) {
			            index = midIndex;
			            break;
			        }
			    }
			    return index;
			}
}
