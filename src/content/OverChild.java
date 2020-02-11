package content;


public class OverChild extends OverParent{

    @Override
    public String printOver(){
        return "This is child over";
    }
    
    public String someStuff(){
        String over = printOver();
        return over;
    }
    
    public String someParent(){
        String over = super.printOver();
        return over;
    }
    //cannot over the final method
//    public String finalPrint(){
//        return "this is the child final";
//    }
}
