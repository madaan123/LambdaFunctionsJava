package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;

	public String getName() {
		return name;
	}

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data> data = new ArrayList<Data>();
		data.add(new Data("Ashish"));
		data.add(new Data("Ramu"));
		data.add(new Data("Ria"));
		data.add(new Data("Samurai"));

		Collections.sort(data, (Data o1, Data o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		
		// Sorting based on length
		Collections.sort(data, (Data o1, Data o2) -> {
			if(o1.getName().length()<o2.getName().length())
				return -1;
			else if(o1.getName().length()>o2.getName().length())
				return 1;
			else
				return 0;
		});

		for (Data d : data) {
			System.out.println(d.getName());
		}
	}

}
