package MVCCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {

    private View view;
    private Model model;

    private boolean concat = false;
    private boolean cont = false;
    private boolean dec = false;
    private double num1;
    private double num2;
    private int operation = 0;

    public Control(View view, Model model) {
        this.model = model;
        this.view = view;

        view.RunView(view);

        view.setOneAction(new oneListen());
        view.setTwoAction(new twoListen());
        view.setThreeAction(new threeListen());
        view.setFourAction(new fourListen());
        view.setFiveAction(new fiveListen());
        view.setSixAction(new sixListen());
        view.setSevenAction(new sevenListen());
        view.setEightAction(new eightListen());
        view.setNineAction(new nineListen());
        view.setZeroAction(new zeroListen());
        view.setDecimalAction(new decimalListen());
        view.setEqualAction(new equalListen());
        view.setAddAction(new addListen());
        view.setSubtractAction(new subtractListen());
        view.setMultiplyAction(new multiplyListen());
        view.setDivideAction(new divideListen());

    }

    class oneListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "1",concat));
            concat = true;
        }
    }
    class twoListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "2",concat));
            concat = true;
        }
    }
    class threeListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "3",concat));
            concat = true;
        }
    }
    class fourListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "4",concat));
            concat = true;
        }
    }
    class fiveListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "5",concat));
            concat = true;
        }
    }
    class sixListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "6",concat));
            concat = true;
        }
    }
    class sevenListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "7",concat));
            concat = true;
        }
    }
    class eightListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "8",concat));
            concat = true;
        }
    }
    class nineListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "9",concat));
            concat = true;
        }
    }
    class zeroListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setLabelNumber(model.num(view.getLabelNumber(), "0",concat));
            if(view.getLabelNumber() == "0") {
                concat = false;
            } else {
                concat = true;
            }
        }
    }
    class decimalListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!dec) {
                view.setLabelNumber(model.num(view.getLabelNumber(), ".",concat));
            }
            if (view.getLabelNumber() == ".") {
                view.setLabelNumber("0.");
            }
            dec = true;
            concat = true;
        }
    }
    class equalListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            concat = false;
            dec = false;
            cont = false;
            num2 = Double.parseDouble(view.getLabelNumber());
            view.setLabelNumber(model.operate(num1, operation, num2));
        }
    }
    class addListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            concat = false;
            dec = false;
            if (cont) {
                num2 = Double.parseDouble(view.getLabelNumber());
                view.setLabelNumber(model.operate(num1, operation, num2));
            }
            num1 = Double.parseDouble(view.getLabelNumber());
            operation = 1;
            cont = true;
        }
    }
    class subtractListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            concat = false;
            dec = false;
            if (cont) {
                num2 = Double.parseDouble(view.getLabelNumber());
                view.setLabelNumber(model.operate(num1, operation, num2));
            }
            num1 = Double.parseDouble(view.getLabelNumber());
            operation = 2;
            cont = true;
        }
    }
    class multiplyListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            concat = false;
            dec = false;
            if (cont) {
                num2 = Double.parseDouble(view.getLabelNumber());
                view.setLabelNumber(model.operate(num1, operation, num2));
            }
            num1 = Double.parseDouble(view.getLabelNumber());
            operation = 3;
            cont = true;
        }
    }
    class divideListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            concat = false;
            dec = false;
            if (cont) {
                num2 = Double.parseDouble(view.getLabelNumber());
                view.setLabelNumber(model.operate(num1, operation, num2));
            }
            num1 = Double.parseDouble(view.getLabelNumber());
            operation = 4;
            cont = true;
        }
    }

}
