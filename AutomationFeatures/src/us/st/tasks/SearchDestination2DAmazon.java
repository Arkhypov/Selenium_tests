package us.st.tasks;

import java.util.List;

public class SearchDestination2DAmazon {

/*	Amazon Fresh is a grocery delivery services that offers consumers the option of purchasing their groceries online and having them delivered on schedule.  
 * The Amazon Fresh team is planning a route for a delivery truck to deliver customer orders in the city of Techlandia.  The planner will create a delivery area for each order to effectively plan the route. The area is abstracted as a grid. Not all locations are accessible by road. The truck only needs to make a single delivery.

	Write an algorithm to determine the minimum distance required for the truck to deliver the order.

	Assumptions:

	Some places in the delivery area cannot be accessed by the driver, as there are no roads into those locations.
	The delivery area can be represented as a two-dimensional grid of integers, where each integer represents one cell.
	The truck must start from the top-left corner of the area, which is always accessible, and can move one cell up, down, left, or right at a time.
	The truck must navigate around the areas without roads and cannot leave the area.
	The accessible areas are represented as 1, areas with without roads are represented by 0 and the order destination is represented by 9.
	Input
	The input to the function/method consists of three arguments:
	numRows, an integer representing the number of rows;
	numColumns, an integer representing the number of columns;
	area, representing the two-dimensional grid of integers.

	Output
	Return an integer representing the total distance traversed to deliver the order else return -1.

	Constraints
	1 ≤ numRows, numColumns ≤ 1000

	Example
	Input:
	numRows = 3
	numColumns = 3
	area =
	[[1, 0, 0],
	[1, 0, 0],
	[1, 9, 1]]

	Output:
	3

	Explanation:
	Starting from the top-left corner, the truck traversed the cells (0,0) -> (1,0) -> (2,0) -> (2,1). 
	The truck traversed the total distance 3 to deliver the order.
	So, the output is 3.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumDistance(int numRows, int numColumns, List<List<Integer>> area));
	}
	
	int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
    {
		int i=0; 
		int j=0;
		int count=0;
        for(;i<area.size();){
        	if(area.get(i).get(j)==9){
        		return count;
        	}
        	if(area.get(i+1).get(j)==9){
        		return count++;
        	}
        	if(area.get(i).get(j+1)==9){
        		return count++;
        	}
        	if(area.get(i+1).get(j)==1){
        		i++;
        		count++;
        		continue;
        	}else if(area.get(i).get(j+1)==1){
        		j++;
        		count++;
        		continue;
        	}
        }
        return count;
		// WRITE YOUR CODE HERE
    }

}
