package us.st.tasks;

import java.util.Arrays;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class TestTaskTranswise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		
		//System.out.println(find_numbers(3,1,13));
	}
	static String find_numbers(int digit, int start, int end) {
		String result ="";
		for(int i=start; i<=end && i<1000;){
			if(i<10 && i==digit){
				result+=i;
				i=10; continue;
			} else if((int)Math.floor(i/10)==digit || i%10==digit && i<100){
				result=result.isEmpty() ? String.valueOf(i) : result+" "+i;
				
			} else if((int)Math.floor(i/100)==digit || i%10==digit){
				result=result.isEmpty() ? String.valueOf(i) : result+" "+i;
				
			}StringUtils.equals(cs1, cs2)
			
			
			/*System.out.println("i= "+i);
			System.out.println(Math.floor(i/10));
			System.out.println(i%10);
			System.out.println(i%100);*/
			/*if(i%10==digit || i%100==3){
				
			}*/
			i++;
		}
		
		
		return result;

        

    }
}