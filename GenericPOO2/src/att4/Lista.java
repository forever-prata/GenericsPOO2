package att4;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<Nodo> nodos;
	
    public Lista() {
        this.nodos = new ArrayList<>();
    }
    
    public boolean inserir(Nodo<?> n) {
    	boolean contem = buscar(n);
    	if (!contem) {
			nodos.add(n);
			return true;
		}else {
			return false;
		}
    }
    
    private boolean buscar(Nodo<?> n) {
    	boolean achou = false;
    	for (Nodo nodo : nodos) {
			if (nodo.getChave().equals(n.getChave())) {
				achou = true;
			}
		}
    	return achou;
    }
}
