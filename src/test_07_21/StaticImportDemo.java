package test_07_21;

//import java.util.Arrays;
// ��ʾ������Arrays���еľ�̬����sort
import java.util.Arrays;

@SuppressWarnings("unused")
public class StaticImportDemo {

	public static void main(String[] args) {

		int[] arri = { 2, 6, 4, 9, 1, 3, 5 };
		sort(arri);
		
		System.out.println(Arrays.toString(arri));

		// double[] arrd = { 2, 6, 4, 9, 1, 3, 5 };
		// sort(arrd);
	}
	
	public static void sort(int[] arr){}
	

}
