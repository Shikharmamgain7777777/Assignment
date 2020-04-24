package stackUse;

import java.util.TreeSet;

public class RemoveDup {
public static void main(String[] args) {
	
	
	String[] arr= {"a,a","a,b","a,b","a,c","b,a","c,c","a,b","a,c","c,c","a,b","c,c"};
	TreeSet<String> t=new TreeSet<>(new myComparator());
	for(int i=0;i<arr.length;i++) {
		
		
		t.add(arr[i]);
	}
	System.out.println(t);
}
}
