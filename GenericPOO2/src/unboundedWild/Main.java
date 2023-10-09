package unboundedWild;

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
		List<Object> l4 = Arrays.asList(1,2,3,4,5);
		
		listar(l4);
		
		//ex 2
		Caixa<?> c = new Caixa<>(null);
		System.out.println(c);
		
		Caixa<?> c2 = new Caixa<>(p1);
		System.out.println(c2);
		
	}
	
    private static void listar(List<?> list){
        for (Object i : list) {
            System.out.print(i.toString()+ " ");
        }
        System.out.println();
    }
  }
