package org;

public class MainTestClass {

	public static void main(String[] args) {
		
				TestClass obj = new TestClass();
				Testable myNotes = obj::Show;
				myNotes.note1("Hello");
	
				TestClass obj1 = new TestClass();
				Testable1 myNotes1 = obj1::ShowAgain;
				myNotes1.note2("Hello","again");
	}
}
