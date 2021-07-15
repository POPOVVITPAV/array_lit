package arrayLister;

import java.util.ArrayList;

public class Main {

	public static void main(String[]args) {
		//1. �������� ��������� �� Java, ����� ������� ����� ������ ��������,
		//   �������� ��������� ������ (������) � ����������� ���������
		ArrayList<String> colorList =new ArrayList<>();
		
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Blue");
		
		System.out.println(colorList);
		//2. �������� Java-��������� ��� �������� ���� ��������� ������ ��������
		
		for(String cl:colorList) {
			System.out.print(cl+" ");
		}
		System.out.println();
		//3. �������� Java-��������� ��� ������� �������� � ������ �������� � ������ �������
		colorList.add(0,"Gold");	
		System.out.println(colorList);
		
		//4. �������� Java-��������� ��� ���������� �������� 
		//	(�� ���������� �������) �� ��������� ������ ��������.
		
		System.out.println(colorList.get(0));
		//5. �������� Java-��������� ��� ���������� ������������� �������� ������� �� ��������� ��������
		colorList.set(3, "Platinum");
		System.out.println(colorList);
		//6. �������� ��������� �� Java ��� �������� �������� �������� �� ������ ��������.
		colorList.remove(2);
		System.out.println(colorList);
		//7. �������� ��������� �� Java ��� ������ �������� � ������ ��������
		colorList.add(3,"Yellow");
		colorList.add("Blue");
		if(colorList.contains("Platinum")) {
			System.out.println("Vay it's cool");
		}else {
			System.out.println("Not found");
		}
	}

}
