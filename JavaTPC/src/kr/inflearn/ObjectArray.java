package kr.inflearn;

public class ObjectArray {
	private int count;
	private Object[] arr;
	public ObjectArray() {
		this(10);// 배열의 초기 크기를 10으로 설정
	}
	public ObjectArray(int init) {
		arr = new Object[init];
	}
	
	public void add(Object data) {
		arr[count++] = data;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
}
