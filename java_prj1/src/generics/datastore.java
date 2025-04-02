package generics;

public class datastore<T> {
	private T data;
	
	public void setdata(T data) {
		this.data = data;
	}
	
	public T getdata() {
		return data;
	}
}
