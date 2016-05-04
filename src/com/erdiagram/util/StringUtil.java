package com.erdiagram.util;

public class StringUtil {

//	public static String stringAppend(Integer... strings, String... strings2) {
//		String[] str = strings + strings2;
//		return stringAppend(str);
//	}
	
	public static String stringAppend(String... strings) {
		StringBuilder sb = new StringBuilder();
		for (String str : strings) {
			sb.append(str);
		}
		return sb.toString();
	}
}
