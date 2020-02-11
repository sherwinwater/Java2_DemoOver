package demoover;

import content.OverChild;
import content.OverParent;

public class Main {

    public static void main(String[] args) {

        OverParent one = new OverParent();
        System.out.println("one " + one.printOver());

        OverChild two = new OverChild();
        System.out.println("two " + two.printOver());
        System.out.println("two-child " + two.someStuff());
        System.out.println("two-parent " + two.someParent());

        System.out.println("final- parent" + one.finalPrint());
        System.out.println("final- child" + two.finalPrint());

    }

}
