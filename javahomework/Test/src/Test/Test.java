package Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String temp = "hahahah";
		String[] s = temp.split("");
//		Pattern p = Pattern.compile("[a-z]");
//		Matcher m = p.matcher(temp);
//		while(m.find()) {
//			System.out.println(m.group());
//		}
//		for(String x : s) {
//			System.out.println(x);
//		}
//		System.out.println(s.length);
//		System.out.println(temp.length());
		for(String x : s) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}else {
				map.put(x, map.get(x) + 1);
			}
		}
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> mp : set) {
			System.out.println(mp.getKey() + " (" + mp.getValue() + ")");
		}
	}
}
