package com.creational.prototype;

public class MainClass {

	public static void main(String str[]) {
		
		ProfessionCache.loadProfessionCache();
		
		Profession docterProf = ProfessionCache.getClonenNewProfession(1);
		
		System.out.println(docterProf);
		
		Profession docterProf2 = ProfessionCache.getClonenNewProfession(1);
		System.out.println(docterProf2);
	}
}
