package com.thoughtfocus.arrayassignment;

public class LanguageTest {
	public static void main(String[] args) {
		Languages language = new Languages();
		Languages language1 = new Languages();
		Languages language2 = new Languages();
		language.save("Java");
		language.save("Python");
		language.save("Js");
		language.save("Html");
		language.save("Css");
		language.save("Spring");
		language.save("Hibernate");
		language.save("Django");
		language.save("JDBC");
		language.save("Sql");
		language.save("Jquery");
		language.save("Bootstrap");
		language.save("C#");
		language.save("Angular");
		language.printAll();
		System.out.println("-------------------");
		language.update("Python", "py");
//		System.out.println("--------------------");
//		String delete=language.delete("Js");
//		language.printAll();
//		System.out.println(delete);
		language.printAll();
	}

}
