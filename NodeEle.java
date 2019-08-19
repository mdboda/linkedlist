
public class NodeEle<T> {

	private NodeEle<T> next;
	
	private Object value;

	public NodeEle<T> getNext() {
		return next;
	}

	public void setNext(NodeEle<T> next) {
		this.next = next;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return "NodeEle[value="+this.value+"]";
	}
	
}
