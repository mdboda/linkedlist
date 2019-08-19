
public class StackFun implements Stack{

	private int length=0;
	private NodeEle<Object> top = null;
	
	@Override
	public void push(Object o) {
		NodeEle<Object> newNode = new NodeEle<>();
		newNode.setValue(o);
		if(top == null){
			top = newNode;
		}else{
			newNode.setNext(top);
			top = newNode;
		}
		length++;	
	}

	@Override
	public Object pop() {
		Object obj = "-1";
		if(top!=null){
			obj = top;
			top = top.getNext();
			length = length-1;
		}
		return obj.toString();
	}

}
