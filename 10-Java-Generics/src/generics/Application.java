package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Container<String, Integer> container = new Container<String, Integer>("Hello", 100);

		String val1 = container.getItem1();
		int val2 = container.getItem2();

		System.out.println(val1);
		System.out.println(val2);

		System.out.println("---------------------------------------------------");

		Container<Integer, Integer> container2 = new Container<Integer, Integer>(2333, 996);
		System.out.println(container2.getItem1());
		System.out.println(container2.getItem2());

		System.out.println("--------------");

		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(666);

		Set<Integer> setAfterUnion = union(set1, set2);
		Iterator<Integer> iterator = setAfterUnion.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------");

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;

		System.out.println("--------------------------------");

		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());

//		employees = accountants;

		// ? = any type
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2;

		// Upper bound: all child of extended Class
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		employees3 = accountants3;

		// Lower bound:
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Object> accountants4 = new ArrayList<>();
		employees4 = accountants4;

		System.out.println("--------------");

		makeEmployeeWork(accountants);

	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);

		return result;
	}

	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (Employee emp : employees) {
//		for (Accountant emp: (ArrayList<Accountant>) employees) {
			emp.work();
		}
	}

}
