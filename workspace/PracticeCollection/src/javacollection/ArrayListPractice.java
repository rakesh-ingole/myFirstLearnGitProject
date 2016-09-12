package javacollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Students {
	
	int intRollNO ;
	String strName;
	
	Students (int intRollNo, String strName){
		
		this.intRollNO = intRollNo;
		this.strName = strName;
	}
	
@Override
public String toString(){
	
	return "Student{"+"rollNo=["+intRollNO+"] Name["+strName+"]}";
}
	
}

public class ArrayListPractice {

	public static void main(String[] args) {
			
		//Collection<Students> c = new ArrayList<Students>();
		List<Students> c = new ArrayList<Students>();
		c.add(new Students(1,"Amee"));
		c.add(new Students(4,"Linda"));
		c.add(new Students(3,"Freda"));
		
		Comparator<Students> compareByRollNo = new Comparator<Students>() {

			@Override
			public int compare(Students s1, Students s2) {
				// TODO Auto-generated method stub
				return s1.intRollNO > s2.intRollNO ?1:-1;
				
			}
			
			 
		};
		Collections.sort(c,compareByRollNo);
		
		for (Students s : c) 
		System.out.println(s);
		
			
		//Collections.sort(arg0);

	}

}
