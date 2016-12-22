package section2.classes;

import section2.interfaces.HasName;

public class Capital implements HasName {

	public String name;
	
	public Capital(String _name) {
		name = _name;
		
	}
	
	public String getName() {

		return name;
	}

}
