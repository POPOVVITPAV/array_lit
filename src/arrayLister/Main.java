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
	}

}
