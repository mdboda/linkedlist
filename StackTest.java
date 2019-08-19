
public class StackTest {

	public static void main(String[] args) {
		Stack s = new StackFun();
		s.push("1-Insert");
		s.push("2-Insert");
		s.push("3-Insert");
		s.push("4-Insert");
		s.push("5-Insert");
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
	
}
