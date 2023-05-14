package planets;
import explorers.explorer;

public class mars implements planet {

    public void accept (explorer explorer){
        explorer.visit(this);
    }

    
}
