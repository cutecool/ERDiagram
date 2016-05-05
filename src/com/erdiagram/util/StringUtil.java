package com.erdiagram.util;

public class StringUtil {

//	public static String stringAppend(Integer... strings, String... strings2) {
//		String[] str = strings + strings2;
//		return stringAppend(str);
//	}
	
	public static String StringAppend(Object... aSa) {
		return StringAppend(null, aSa);
	}
	
	private static String StringAppend(String aSeperator, Object... aSa) {
		StringBuilder sb = new StringBuilder();
		for (Object obj : aSa) {
			sb.append(obj);
			if (aSeperator != null) {
				sb.append(aSeperator);
			}
		}
		return sb.toString();
	}
}
