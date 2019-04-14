package us.st.tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxQueue<Integer> {
	
	LinkedList<Integer> queue = null; 
	int maxEl=0;
	List maxL = new ArrayList<Integer>();
	
	MaxQueue() {
		queue=new LinkedList<Integer>();
	}
	
	public void push(Integer el){
		if((int)el>maxEl){
			maxEl= (int)el;
			maxL.add(el);
		}
		queue.push(el);
	}
	
	public Integer peek(){
		Integer el = queue.getLast();
		if((int)el==maxEl){
			maxL.remove(el);
		}
		return queue.removeLast();
	}
	
	public int size(){
		return queue.size();
	}
	
	public boolean contains(Integer element){
		return queue.contains(element);
	}
	
	public Integer get(int pos){
		return queue.get(pos);
	}
	
	public int getMax(){
		return maxEl;
	}
}
