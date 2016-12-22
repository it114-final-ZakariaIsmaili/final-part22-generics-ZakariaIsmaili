package section2.interfaces;

import section2.classes.Governor;

public interface HasGovernor <T extends Governor>{
	
	public T getGovernor();
	
	public String getCapitalName();	

}
