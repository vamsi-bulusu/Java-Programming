package classes;
/**
 * https://www.geeksforgeeks.org/next-greater-element/
 */

import java.util.*;
public class nextGreatestElement {
    private Stack<Integer> new_stack = new Stack<>();

    public void nextElement(int arr[], int n) {
        new_stack.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (!new_stack.empty() && new_stack.peek() < arr[i]) {
                System.out.println("Next Greatest Element for " + new_stack.peek() + "-->" + arr[i]);
                new_stack.pop();
            }
            if (!new_stack.empty() && new_stack.peek() > arr[i]) {
                int element = new_stack.pop();
                new_stack.push(arr[i]);
                new_stack.push(element);
                continue;
            }
            new_stack.push(arr[i]);
        }
            System.out.println("Next greatest Element for " + new_stack.pop() + "-->" + -1);
    }
}
