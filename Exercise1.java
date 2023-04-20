public class App {
    static boolean iwillNotCheat = true;
    static boolean iwillWin = true;
    public static void main(String[] args) throws Exception {
        App myApp = new App();

        //precondition
        assert iwillNotCheat == true: "Deserve bumagsak haha";
        
        myApp.Study();
        //postcondition
        assert iwillWin == true: "Tamad yarn";

    System.out.println(iwillWin);
    System.out.println(iwillNotCheat);
}

    void Study(){
        iwillWin = false;
        

    }
}
