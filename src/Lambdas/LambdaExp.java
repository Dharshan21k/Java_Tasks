package Lambdas;

import java.util.ArrayList;

interface operation{
    
    int fun(int a, int b);
}
public class LambdaExp {
public static void main(String[] args){
        
        // Lambda expression to add and multiply  two numbers with diff functionalities
       operation add = (a, b) -> a + b;
        operation mult=(a,b)-> a*b;
        int resultAdd = add.fun(10, 20);
        int resultMult=mult.fun(10,30);
        System.out.println("Sum: " + resultAdd);
        System.out.println("Multiply: " + resultMult);
        // using lambda in collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(n -> System.out.println(n));
    }

}
