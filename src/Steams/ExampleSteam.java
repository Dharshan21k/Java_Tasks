package Steams;

import java.util.ArrayList;

import java.util.Set;
import java.util.stream.Collectors;

public class ExampleSteam {
public static void main(String args[]) {
	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("dharshan");
	arrayList.add("karthik");
	arrayList.add("sasi");
	arrayList.add("ganesan");
	arrayList.stream().forEach(System.out::println);
	Set<String> set=arrayList.stream().filter(x->x.startsWith("d")).map(x->x.toUpperCase()).collect(Collectors.toSet());
	set.stream().forEach(System.out::println);
	}
}
