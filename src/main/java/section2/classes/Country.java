package section2.classes;

import section2.interfaces.HasCapital;
import section2.interfaces.HasName;

public class Country <C extends Capital> implements HasName, HasCapital<C> {

	private String name;
	
	private C Capital;
	
	public Country(String _name) {
		name = _name;
	}
	
	public Country (String string, C _Capital) {
		Capital = _Capital;
	}
		
	public String getCapitalName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public C getCapital() {
		// TODO Auto-generated method stub
		return Capital;
	}

}
