package planets;
import explorers.explorer;

public class neptune implements planet{

    public void accept(explorer explorer) {
        explorer.visit(this);
    }

   

    
}
