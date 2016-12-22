/**
 * 
 */
package section2.classes;

import section2.interfaces.HasCapital;
import section2.interfaces.HasGovernor;
import section2.interfaces.HasName;

/**
 * @author Alt
 *
 */
public class State <C extends Capital,G extends Governor> implements HasCapital<C>, HasName, HasGovernor<G> {
		
	private String name;
	private C Capital;
	private G Governor;
	
	public State(String _name) {
		name = _name;
	}
	
	public State (String string, C _Capital, section2.classes.Governor governor2) {
		Capital = _Capital;
	}
	public State (G _Governor){
		Governor = _Governor;
	}
	

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return name;
	}

	public G getGovernor() {
		// TODO Auto-generated method stub
		return Governor;
	}

	public C getCapital() {
		// TODO Auto-generated method stub
		return Capital;
	}

}
