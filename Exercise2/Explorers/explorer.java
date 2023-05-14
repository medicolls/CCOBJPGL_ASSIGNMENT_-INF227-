package explorers;
import planets.planet;
import planets.mercury;
import planets.mars;
import planets.saturn;

public interface explorer {

    void visit(mercury mercury);

    void visit(mars mars);
    
    void visit(saturn saturn);
    

    default void visit(planet planet){
        System.out.println("landed on an unknown planet");
    };

    
}
