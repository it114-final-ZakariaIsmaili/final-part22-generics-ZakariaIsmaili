/**
 * 
 */
package section2.interfaces;

import section2.classes.Capital;

/**
 * @author Alt
 *
 */
public interface HasCapital <T extends Capital> {
	
	public T getCapital();
	
	public  String getCapitalName();

}
