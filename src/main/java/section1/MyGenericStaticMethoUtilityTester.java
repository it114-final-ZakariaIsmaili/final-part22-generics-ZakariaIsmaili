package section1;

import java.util.ArrayList;
import java.util.List;

public class MyGenericStaticMethoUtilityTester {
	public static void main(String [] args){
		List<String> strings = new ArrayList<String>();

		String s = new String("element_1");
		String returnedStr = MyGenericStaticMethodUtility.add2Colletion(s, strings);
		System.out.println("added String: " + returnedStr + ", now strings.size:" + strings.size());
		
		Integer i1 = new Integer (1234);
		List<Integer> integers = new ArrayList<Integer>();
		Integer returnedInt = MyGenericStaticMethodUtility.add2Colletion(i1, integers);
		System.out.println("added Integer: " + returnedInt + ", now integers.size:" + integers.size());
		
		
		
	}

}
