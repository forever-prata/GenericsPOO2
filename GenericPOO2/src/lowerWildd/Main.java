package lowerWildd;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedrinho", "123");
		Aluno a2 = new Aluno("Carlinhos", "456");
		Aluno a3 = new Aluno("Pedrinho", "789");
		List<Aluno> l1 = Arrays.asList(a1,a2,a3);
		
		listar(l1);
		
		Pessoa p1 = new Professor("Rodrigo", "159");
		Pessoa p2 = new Professor("Juliano", "159");
		Pessoa p3 = new Professor("Marcela", "159");
		
		System.out.println();
		List<Pessoa> l2 = Arrays.asList(p1,p2,p3);
		
		listar(l2);
		
		System.out.println();
		List<Integer> l4 = Arrays.asList(1,2,3,4,5);
		
		media(l4);
	}
	
    private static void listar(List<? super Aluno> list){ //Só Aceita Aluno e Pessoa
            System.out.println(list);
    }
    
    private static void media(List<? super Integer> list) {//Só Aceita Integer e Number
        double total = 0.0;
        int n = 0;
        for (Object obj : list) {
            if (obj instanceof Number) {
                total += ((Number) obj).doubleValue();
                n++;
            } else {
                System.out.println("Elemento não é um número: " + obj);
            }
        }

        if (n > 0) {
            System.out.println(total / n);
        } else {
            System.out.println("Lista Vazia");
        }
    }
}
