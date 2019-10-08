package sortersTesterClasses;
import java.util.Comparator;
import sorterClasses.BubbleSortSorter;;

public class Test {
	public static void main(String[] args) {
		Entero[] y = {new Entero(5), new Entero(9), new Entero(20), new Entero(22), new Entero(20),
				new Entero(5), new Entero(4), new Entero(13)};
		
		for(Entero entero : y) {
			System.out.println(entero);
		}
		Integer[] Arr = {5, 9, 20, 22, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		System.out.println("INTEGER ARRAY ");
		for(Integer integer : Arr) {
			System.out.println(integer);
			
		}
		System.out.println();
		test2(Arr);
		for(Integer integer: Arr) {
			System.out.println(integer);
		}
		System.out.println();
		test3(Arr);
		for(Integer integer: Arr) {
			System.out.println(integer);}
		
		
		
		}
	
	public static void test(Entero[] x) {
		BubbleSortSorter<Entero> bsort = new BubbleSortSorter<Entero>();
		bsort.sort(x, null);
		
				
	}
	public static void test2(Integer[] z) {
		BubbleSortSorter<Integer> bsort = new BubbleSortSorter<Integer>();
		bsort.sort(z, new IntegerComparator1());
		
				
	}
	public static void test3(Integer[] y) {
		BubbleSortSorter<Integer> bsort = new BubbleSortSorter<Integer>();
		bsort.sort(y, null);
		
				
	}
	
	
	
	}

