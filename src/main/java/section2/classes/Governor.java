/**
 * 
 */
package section2.classes;

import section2.interfaces.HasName;

/**
 * @author Alt
 *
 */
public class Governor implements HasName {

	public String name;
	
	public Governor(String string) {
		// TODO Auto-generated constructor stub
	}
	public void setGovernor(String _name) {
		name = _name;
	}
	public String getName() {
		return name;
	}

}
