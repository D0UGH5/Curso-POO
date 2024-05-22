package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploListas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Carlos");
		list.add("Murilo");
		list.add("Maria");
		list.add("José");
		list.add("Pedro");
		list.add("João");
		list.add("Miguel");
		list.add("Jonatas");
		list.add(2, "Marco");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("___________________");
		
		list.remove("Pedro");
		list.remove(6);
		list.removeIf(x -> x.charAt(0)=='M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("___________________");
		
		System.out.println("Index of João: " + list.indexOf("João"));
		
		System.out.println("___________________");
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='J').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("___________________");
		
		String nome = list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
		System.out.println(nome);
	}

}

