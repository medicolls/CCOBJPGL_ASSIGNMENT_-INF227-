package explorers;
import planets.*;
public class humanexplorer implements explorer{

    public void visit(mercury mercury){
        System.out.println("exploring mercury");
    }
    public void visit(mars mars){
        System.out.println("exploring mars");
    }
    public void visit(saturn saturn){
        System.out.println("exploring saturn");
    }
    
}
