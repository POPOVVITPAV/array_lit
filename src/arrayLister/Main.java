package arrayLister;

import java.util.ArrayList;

public class Main {

	public static void main(String[]args) {
		//1. Напишите программу на Java, чтобы создать новый список массивов,
		//   добавить несколько цветов (строку) и распечатать коллекцию
		ArrayList<String> colorList =new ArrayList<>();
		
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Blue");
		
		System.out.println(colorList);
		//2. Напишите Java-программу для итерации всех элементов списка массивов
		
		for(String cl:colorList) {
			System.out.print(cl+" ");
		}
	}

}
