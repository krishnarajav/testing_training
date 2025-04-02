package generics;

public class GenericDataStore {
	public static void main(String args[]) {
		datastore<Integer> intStore = new datastore<>();
		intStore.setdata(200);
		System.out.println(intStore.getdata());
		
		datastore<String> stringStore = new datastore<>();
		stringStore.setdata("Hello");
		System.out.println(stringStore.getdata());
		
	}
}
