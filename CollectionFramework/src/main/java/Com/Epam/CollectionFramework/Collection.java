package Com.Epam.CollectionFramework;

public class Collection {
	public static void main(String[] args) {
		List<Integer> Al = new List<Integer>();
		Al.add(1);
		Al.add(2);
		Al.add(3);
		Al.add(4);
		Al.add(5);
		System.out.println("List:" + Al);
		Al.add(6);
		System.out.println("List after addition: " + Al);
        Al.remove(3);
        System.out.println("List after remove: " + Al);
        System.out.println("performing get: "  +  Al.get(2));
        System.out.println("finding size: "  +  Al.size());
        Al.clear();
        System.out.println("List after clearing: " + Al);
	}
}
