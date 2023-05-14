package planets;
import explorers.explorer;

public class saturn implements planet{
    public void accept (explorer explorer){
        explorer.visit(this);
    }
    
}
