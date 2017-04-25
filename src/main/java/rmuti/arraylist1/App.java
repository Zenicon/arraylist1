package rmuti.arraylist1;

import rmuti.arraylist1.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList arrlist = new ArrayList();
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		arrlist.add(2, 100);
		arrlist.addFirst(70);
		arrlist.addLast(90);
		System.out.println(arrlist);

	}
}
