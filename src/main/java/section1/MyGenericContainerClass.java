/**
 * 
 */
package section1;

/**
 * @author Alt
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T> {

	/**
	 * 
	 */
	private T contained;
	
	public MyGenericContainerClass(int i) { }
	public MyGenericContainerClass(String string) { }

	public void setContained(T contained) {
		this.contained = contained;
	}

	public T getContained() {
		return contained;
	}
	

}
