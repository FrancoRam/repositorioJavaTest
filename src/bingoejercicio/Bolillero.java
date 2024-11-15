
package bingoejercicio;
//wraper

import java.util.ArrayList;
import java.util.List;

public class Bolillero {
    
    private List<Integer> bolillas = new ArrayList<>();
    
    public void agregarBolilla(Integer bolilla)
    {
        if(!tieneBolilla())
        {
            throw new NoHayBolillasException
        }
        
    }
    
    public boolean tieneBolillas()
    {
        return !bolillas.isEmpty();
    }
    
    public Integer getBolillaReposicion()
    {
        
    }
    
    public Integer getBolillaSinReposicion()
    {
        
    }
}
