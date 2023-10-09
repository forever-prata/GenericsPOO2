package uperWild;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedrinho", "123");
		Aluno a2 = new Aluno("Carlinhos", "456");
		Aluno a3 = new Aluno("Pedrinho", "789");
		List<Aluno> l1 = Arrays.asList(a1,a2,a3);
		
		listar(l1);
		
		Professor p1 = new Professor("Rodrigo", "159");
		Professor p2 = new Professor("Juliano", "159");
		Professor p3 = new Professor("Marcela", "159");
		
		System.out.println();
		List<Professor> l2 = Arrays.asList(p1,p2,p3);
		
		listar(l2);
		
		System.out.println();
		List<Integer> l4 = Arrays.asList(1,2,3,4,5);
		
		media(l4);
		
		System.out.println();
		List<Double> l5 = Arrays.asList(1.5,2.5,3.6,4.4,5.0);
		
		media(l5);
	}
	
    private static void listar(List<? extends Pessoa> list){
        for (Pessoa i : list) {
            System.out.println(i.getNome()+" "+i.getCpf());
        }
    }
    
    private static void media(List<? extends Number> list) {
    	double total = 0.0;
    	int n = 0;
        for (Number i : list) {
            total += i.doubleValue();
            n++;
        }
        
        if (n>0) {
			System.out.println(total/n);
		}else {
			System.out.println("Lista Vazia");
		}
    }
}
