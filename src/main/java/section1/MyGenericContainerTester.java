/**
 * 
 */
package section1;

/**
 * @author Alt
 *
 */
public class MyGenericContainerTester {
	public static void main(String [] args){
		MyGenericContainerInterface<String> c4String = new MyGenericContainerClass<String>("Ilker");
		MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass<Integer>(1234); 
		
		System.out.println(".whateverType. Container contains:" + c4String);
		System.out.println(".whateverType. Container contains:" + c4Integer);
	}
}
