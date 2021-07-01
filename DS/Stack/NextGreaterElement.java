import java.util.Stack;
import java.util.Scanner;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = getArray();
		printNextGreaterElement(arr);
	}

	private static void printNextGreaterElement(int[] arr) {
		if(arr == null) return; //throw new Exception();
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			printStackContent(stack, arr[i]);
			stack.push(arr[i]);
		}
		printStackContent(stack, -1);
	}

	private static void printStackContent(Stack<Integer> stack, int num) {
		while(!stack.empty() && (num == -1 || stack.peek() < num)) {
			System.out.println(stack.pop() + " " + num);
		}
	}
	
	private static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
