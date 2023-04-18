public class App {

    static boolean iWillReview = true;
    static boolean iWillNotFail = true;


    public static void main(String[] args) throws Exception {

        App myApp = new App();
        

        assert iWillReview == true : "nanood kase ako ng movie kagabi";

        exam();

        assert iWillNotFail == true : "hindi kase ako nagreview"; 
        
        
    }

    static void exam(){
        iWillNotFail = false;
    }
    void Study(){
        iWillReview = false;
        iWillNotFail = false;

    }
}
