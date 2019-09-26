
public class HashMapNode<Element> {
	private Element key;
	private Element value;
	
	public HashMapNode(Element key, Element value) {
		this.key = key;
		this.value = value;
	}
	public HashMapNode() {
		this.key = null;
		this.value = null;
	}
	public Element getValue() {
		return value;
	}
	public Element getKey() {
		return key;
	}
	public void setValue(Element value) {
		this.value=value;
	}
	public void setKey(Element key) {
		this.key=key;
	}
}
