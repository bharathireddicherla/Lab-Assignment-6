import java.util.*;

public class Ques61 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		add(list);
		addAll(list);
		System.out.println("---------Iterator----------");
		for(Integer listItem: list) {
			System.out.println(listItem);
		}
		System.out.println("----------------removing-----------");
		remove(list);
		Object[] arrList = new Integer[size(list)];
		arrList = list.toArray();
		
		System.out.println("list in array");
		for(Object item: arrList) {
			System.out.print(item + " ");
		}
		System.out.println();
		add(set);
		addAll(set);
		remove(set);
		System.out.println("-------------contains in set---------");
		contains(set);
		
		System.out.println("----------------set------------------");
		for(Integer setItem: set) {
			System.out.println(setItem);
		}
		
		Object[] arrSet = new Integer[size(set)];
		arrSet = set.toArray();
		
		System.out.println("set in array");
		for(Object item: arrSet) {
			System.out.print(item + " ");
		}
		
	}
	private static void contains(Set<Integer> set) {
		System.out.println(set.contains(new Integer(20)));
		
	}

	private static void contains(List<Integer> list) {
		System.out.println(list.contains(10));
		
	}

	private static int size(Set<Integer> set) {
		return set.size();
		
	}

	private static int size(List<Integer> list) {
		return list.size();
	}

	private static void clear(Set<Integer> set) {
		set.clear();
		
	}

	private static void clear(List<Integer> list) {
		list.clear();
		
	}

	private static void removeAll(Set<Integer> set) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(30);
		set1.add(20);
		set.removeAll(set1);
		
	}

	private static boolean remove(Set<Integer> set) {
		
		return set.remove(new Integer(10));
	}

	private static void removeAll(List<Integer> list) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(30);
		list1.add(20);
		list.removeAll(list1);
		
	}

	private static boolean remove(List<Integer> list) {
		return list.remove(new Integer(10));
	}

	private static void addAll(Set<Integer> set) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(30);
		set1.add(40);
		set.addAll(set1);
	}

	private static void addAll(List<Integer> list) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(30);
		list1.add(40);
		list.addAll(list1);
		
	}

	private static void add(Set<Integer> set) {
		set.add(20);
		set.add(60);
		
	}

	private static void add(List<Integer> list) {
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
	}

}