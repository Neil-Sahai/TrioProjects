package MVCCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {

    private JPanel panelMain;
    private JLabel labelNumber;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonDecimal;
    private JButton button0;
    private JButton buttonEqual;
    private JButton buttonAddition;
    private JButton buttonSubtraction;
    private JButton buttonMultiplication;
    private JButton buttonDivision;

    public View() {

        System.out.println("new view");

        GUI();

    }

    public static void RunView(View view) {

        System.out.println("new frame");

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(view.panelMain);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    public void GUI() {

        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        panelMain.setBackground(new Color(-1));

        labelNumber = new JLabel("number");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDecimal = new JButton(". ");
        button0 = new JButton("0");
        buttonEqual = new JButton("=");
        buttonAddition = new JButton("+");
        buttonSubtraction = new JButton("−");
        buttonMultiplication = new JButton("x");
        buttonDivision = new JButton("÷");

        panelMain.add(labelNumber, newConstraints(0,0,0,4));
        panelMain.add(button1, newConstraints(0,1,50,1));
        panelMain.add(button2, newConstraints(1,1,50,1));
        panelMain.add(button3, newConstraints(2,1,50,1));
        panelMain.add(button4, newConstraints(0,2,50,1));
        panelMain.add(button4, newConstraints(0,2,50,1));
        panelMain.add(button4, newConstraints(0,2,50,1));
        panelMain.add(button4, newConstraints(0,2,50,1));
        panelMain.add(button4, newConstraints(0,2,50,1));
        panelMain.add(button4, newConstraints(0,2,50,1));
        panelMain.add(button5, newConstraints(1,2,50,1));
        panelMain.add(button6, newConstraints(2,2,50,1));
        panelMain.add(button7, newConstraints(0,3,50,1));
        panelMain.add(button8, newConstraints(1,3,50,1));
        panelMain.add(button9, newConstraints(2,3,50,1));
        panelMain.add(buttonDecimal, newConstraints(0,4,50,1));
        panelMain.add(button0, newConstraints(1,4,50,1));
        panelMain.add(buttonEqual, newConstraints(2,4,50,1));
        panelMain.add(buttonAddition, newConstraints(3,1,50,1));
        panelMain.add(buttonSubtraction, newConstraints(3,2,50,1));
        panelMain.add(buttonMultiplication, newConstraints(3,3,50,1));
        panelMain.add(buttonDivision, newConstraints(3,4,50,1));

        labelNumber.setText("0");

        Font font = new Font("Arial", Font.BOLD, 36);
        Font minus = new Font("Arial", Font.BOLD, 40);
        Font number = new Font("Arial", Font.BOLD, 72);
        labelNumber.setFont(number);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        button5.setFont(font);
        button6.setFont(font);
        button7.setFont(font);
        button8.setFont(font);
        button9.setFont(font);
        buttonDecimal.setFont(font);
        button0.setFont(font);
        buttonEqual.setFont(font);
        buttonAddition.setFont(font);
        buttonSubtraction.setFont(minus);
        buttonMultiplication.setFont(font);
        buttonDivision.setFont(font);

    }

    public GridBagConstraints newConstraints(int a, int b, int d, int g) {

        GridBagConstraints constraints = new GridBagConstraints();
        //fill cells horizontally
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //fill cells vertically
        constraints.fill = GridBagConstraints.VERTICAL;
        //main cell x position
        constraints.gridx = a;
        //main cell y position
        constraints.gridy = b;
        //width
        constraints.ipadx = d;
        //number of cells horizontally
        constraints.gridwidth = g;
        return constraints;
    }

    public String getLabelNumber() {
        return labelNumber.getText();
    }

    public void setLabelNumber(String text) {
        labelNumber.setText(text);
    }

    public void setOneAction(ActionListener actionListener) { button1.addActionListener(actionListener); }
    public void setTwoAction(ActionListener actionListener) { button2.addActionListener(actionListener); }
    public void setThreeAction(ActionListener actionListener) { button3.addActionListener(actionListener); }
    public void setFourAction(ActionListener actionListener) { button4.addActionListener(actionListener); }
    public void setFiveAction(ActionListener actionListener) { button5.addActionListener(actionListener); }
    public void setSixAction(ActionListener actionListener) { button6.addActionListener(actionListener); }
    public void setSevenAction(ActionListener actionListener) { button7.addActionListener(actionListener); }
    public void setEightAction(ActionListener actionListener) { button8.addActionListener(actionListener); }
    public void setNineAction(ActionListener actionListener) { button9.addActionListener(actionListener); }
    public void setZeroAction(ActionListener actionListener) { button0.addActionListener(actionListener); }
    public void setDecimalAction(ActionListener actionListener) { buttonDecimal.addActionListener(actionListener); }
    public void setEqualAction(ActionListener actionListener) { buttonEqual.addActionListener(actionListener); }
    public void setAddAction(ActionListener actionListener) { buttonAddition.addActionListener(actionListener); }
    public void setSubtractAction(ActionListener actionListener) { buttonSubtraction.addActionListener(actionListener); }
    public void setMultiplyAction(ActionListener actionListener) { buttonMultiplication.addActionListener(actionListener); }
    public void setDivideAction(ActionListener actionListener) { buttonDivision.addActionListener(actionListener); }

}
