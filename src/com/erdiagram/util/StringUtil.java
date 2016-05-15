package com.erdiagram.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUtil {

	public static String append(Object... aSa) {
		return append(null, aSa);
	}
	
	public static String append(String aSeperator, Object... aSa) {
		StringBuilder sb = new StringBuilder();
		for (Object obj : aSa) {
			sb.append(obj);
			if (aSeperator != null) {
				sb.append(aSeperator);
			}
		}
		return sb.toString();
	}
	
	public static void cout(String aStr) {
		System.out.println(aStr);
	}
	
	public static String cin() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}
}
