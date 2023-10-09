package att2;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15, 12, 0, 0); // 15 de outubro de 2023, 12:00:00 
        Date fab = calendar.getTime();
        
        calendar.set(2023, Calendar.DECEMBER, 15, 12, 0, 0);
        Date venc = calendar.getTime();
        
        Produto<Integer> p = new Produto<Integer>(1, 12.50, fab, venc);
        System.out.println(p.toString());
        
        Produto<String> p2 = new Produto<String>("Uma String", 12.50, fab, venc);
        System.out.println(p2.toString());
        
		
	}
}
