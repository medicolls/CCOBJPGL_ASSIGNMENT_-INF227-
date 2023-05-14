package explorers;
import planets.*;

public class robotexplorer implements explorer{

    public void visit(mercury mercury){
        System.out.println("inspecting mercury");
    }
    public void visit(mars mars){
        System.out.println("inspecting mars");
    }
    public void visit(saturn saturn){
        System.out.println("inspecting saturn");
    }
    
}
