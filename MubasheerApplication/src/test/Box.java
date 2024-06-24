package test;

//Generic class definition
public class Box<T> {
	private T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
	
	
}



