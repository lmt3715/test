package com.limingtai.beans;

public class StringUtil {
	public static boolean isPhone(String str) {
		String regex = "1[3|4|5|7|9]\\d{9}";
		return str.matches(regex);
	}

	public static boolean isEmail(String str) {
		String regex = "\\w+@\\w+.(com|cn)";
		return str.matches(regex);
	}

	public static boolean isEnglish(String str) {
		String regex = "[a-zA-Z]+";
		return str.matches(regex);
	}

	public static void main(String[] args) {

	}
}
