/**
 * 
 */
package section2.classes;

/**
 * @author Alt
 *
 */
public class StateTester {
	public static void main(String[] args){
	State<Capital, Governor> nj = new State<Capital, Governor>("NJ", new Capital("Trenton"), new Governor("Chris Chrisite"));
	System.out.println("nj name:" + nj.getName() + ", capital name" + nj.getCapitalName() + ", governor name " + nj.getName());
}
}
