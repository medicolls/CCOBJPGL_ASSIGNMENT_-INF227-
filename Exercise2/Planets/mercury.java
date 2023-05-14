package planets;
import explorers.explorer;

public class mercury implements planet {
 
    public void accept(explorer explorer) {
        explorer.visit(this);
    }
}

