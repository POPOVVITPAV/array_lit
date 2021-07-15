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
		System.out.println();
		//3. Напишите Java-программу для вставки элемента в список массивов в первой позиции
		colorList.add(0,"Gold");	
		System.out.println(colorList);
		
		//4. Напишите Java-программу для извлечения элемента 
		//	(по указанному индексу) из заданного списка массивов.
		
		System.out.println(colorList.get(0));
		//5. Напишите Java-программу для обновления определенного элемента массива по заданному элементу
		colorList.set(3, "Platinum");
		System.out.println(colorList);
		//6. Напишите программу на Java для удаления третьего элемента из списка массивов.
		colorList.remove(2);
		System.out.println(colorList);
		//7. Напишите программу на Java для поиска элемента в списке массивов
		colorList.add(3,"Yellow");
		colorList.add("Blue");
		if(colorList.contains("Platinum")) {
			System.out.println("Vay it's cool");
		}else {
			System.out.println("Not found");
		}
	}

}
