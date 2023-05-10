package planets;
import explorers.explorer;

public class jupiter implements planet {

    public void accept (explorer explorer){
        explorer.visit(this);
    }

    
}
