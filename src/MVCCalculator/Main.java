package MVCCalculator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        RunMVCCalc();
    }

    public static void RunMVCCalc() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                View view = new View();
                Model model = new Model();
                Control control = new Control(view,model);
            }
        });
    }

}
