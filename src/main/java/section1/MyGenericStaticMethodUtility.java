/**
 * 
 */
package section1;

import java.util.Collection;

/**
 * @author Alt
 *
 */
public class MyGenericStaticMethodUtility {
	public static <T> T add2Colletion(T e, Collection<T> collection) {
		collection.add(e);
		return e;
	}


}
