import java.util.*;
public class LargestRecTrap {

	private static int maxHistogram(int[] input) {
		Deque<Integer> stack = new LinkedList<Integer>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0; i < input.length;){
            if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
                stack.offerFirst(i++);
            }else{
                int top = stack.pollFirst();
                if(stack.isEmpty()){
                    area = input[top] * i;
                }
                else{
                    area = input[top] * (i - stack.peekFirst() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pollFirst();
            if(stack.isEmpty()){
                area = input[top] * i;
            }
           
            else{
                area = input[top] * (i - stack.peekFirst() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
	}

	
	
	public static void main(String[] args) {
		int input[] = {2,2,2,6,1,5,4,2,2,2,2};
        int maxArea = maxHistogram(input);
        //System.out.println(maxArea);
        System.out.println(maxArea );
	}

	
}
