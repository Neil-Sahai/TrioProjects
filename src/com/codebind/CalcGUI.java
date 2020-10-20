package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class CalcGUI {
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

    private boolean concat = false;
    private boolean cont = false;
    private double num1;
    private double num2;
    private int operation;

    public CalcGUI() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "1");
                } else {
                    labelNumber.setText("1");
                }
                concat = true;
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "2");
                } else {
                    labelNumber.setText("2");
                }
                concat = true;
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "3");
                } else {
                    labelNumber.setText("3");
                }
                concat = true;
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "4");
                } else {
                    labelNumber.setText("4");
                }
                concat = true;
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "5");
                } else {
                    labelNumber.setText("5");
                }
                concat = true;
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "6");
                } else {
                    labelNumber.setText("6");
                }
                concat = true;
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "7");
                } else {
                    labelNumber.setText("7");
                }
                concat = true;
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "8");
                } else {
                    labelNumber.setText("8");
                }
                concat = true;
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "9");
                } else {
                    labelNumber.setText("9");
                }
                concat = true;
            }
        });
        buttonDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + ".");
                } else {
                    labelNumber.setText(".");
                }
                concat = true;
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (concat) {
                    labelNumber.setText(labelNumber.getText() + "0");
                } else {
                    labelNumber.setText("0");
                }
                concat = true;
            }
        });
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(labelNumber.getText());
                double answer = operate(num1, operation, num2);
                double roundedAnswer = Math.round(answer * 1000000);
                String result = String.valueOf(roundedAnswer / 1000000);
                labelNumber.setText(result);
                cont = false;
                concat = false;
            }
        });
        buttonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concat = false;
                if (cont) {
                    num2 = Double.parseDouble(labelNumber.getText());
                    double answer = operate(num1, operation, num2);
                    double roundedAnswer = Math.round(answer * 1000000);
                    String result = String.valueOf(roundedAnswer / 1000000);
                    labelNumber.setText(result);
                }
                num1 = Double.parseDouble(labelNumber.getText());
                operation = 1;
                cont = true;
            }
        });
        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concat = false;
                if (cont) {
                    num2 = Double.parseDouble(labelNumber.getText());
                    double answer = operate(num1, operation, num2);
                    double roundedAnswer = Math.round(answer * 1000000);
                    String result = String.valueOf(roundedAnswer / 1000000);
                    labelNumber.setText(result);
                }
                num1 = Double.parseDouble(labelNumber.getText());
                operation = 2;
                cont = true;
            }
        });
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concat = false;
                if (cont) {
                    num2 = Double.parseDouble(labelNumber.getText());
                    double answer = operate(num1, operation, num2);
                    double roundedAnswer = Math.round(answer * 1000000);
                    String result = String.valueOf(roundedAnswer / 1000000);
                    labelNumber.setText(result);
                }
                num1 = Double.parseDouble(labelNumber.getText());
                operation = 3;
                cont = true;
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concat = false;
                if (cont) {
                    num2 = Double.parseDouble(labelNumber.getText());
                    double answer = operate(num1, operation, num2);
                    double roundedAnswer = Math.round(answer * 1000000);
                    String result = String.valueOf(roundedAnswer / 1000000);
                    labelNumber.setText(result);
                }
                num1 = Double.parseDouble(labelNumber.getText());
                operation = 4;
                cont = true;
            }
        });

    }

    public double operate(double first, int op, double second) {
        double number;
        switch (op) {
            case 0:
                number = first;
                break;
            case 1:
                number = first + second;
                break;
            case 2:
                number = first - second;
                break;
            case 3:
                number = first * second;
                break;
            case 4:
                number = first / second;
                break;
            default:
                number = 0;
                break;
        }
        return number;
    }

    public static void mainGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalcGUI().panelMain);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        mainGUI();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        button1 = new JButton();
        Font button1Font = this.$$$getFont$$$("Arial Black", Font.PLAIN, 36, button1.getFont());
        if (button1Font != null) button1.setFont(button1Font);
        button1.setHideActionText(false);
        button1.setText("1");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button1, gbc);
        button2 = new JButton();
        Font button2Font = this.$$$getFont$$$("Arial Black", -1, 36, button2.getFont());
        if (button2Font != null) button2.setFont(button2Font);
        button2.setText("2");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button2, gbc);
        button3 = new JButton();
        Font button3Font = this.$$$getFont$$$("Arial Black", -1, 36, button3.getFont());
        if (button3Font != null) button3.setFont(button3Font);
        button3.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button3, gbc);
        button4 = new JButton();
        Font button4Font = this.$$$getFont$$$("Arial Black", -1, 36, button4.getFont());
        if (button4Font != null) button4.setFont(button4Font);
        button4.setText("4");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button4, gbc);
        button6 = new JButton();
        Font button6Font = this.$$$getFont$$$("Arial Black", -1, 36, button6.getFont());
        if (button6Font != null) button6.setFont(button6Font);
        button6.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button6, gbc);
        button7 = new JButton();
        Font button7Font = this.$$$getFont$$$("Arial Black", -1, 36, button7.getFont());
        if (button7Font != null) button7.setFont(button7Font);
        button7.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button7, gbc);
        button8 = new JButton();
        Font button8Font = this.$$$getFont$$$("Arial Black", -1, 36, button8.getFont());
        if (button8Font != null) button8.setFont(button8Font);
        button8.setText("8");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button8, gbc);
        button9 = new JButton();
        Font button9Font = this.$$$getFont$$$("Arial Black", -1, 36, button9.getFont());
        if (button9Font != null) button9.setFont(button9Font);
        button9.setText("9");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button9, gbc);
        buttonDecimal = new JButton();
        Font buttonDecimalFont = this.$$$getFont$$$("Arial Black", -1, 36, buttonDecimal.getFont());
        if (buttonDecimalFont != null) buttonDecimal.setFont(buttonDecimalFont);
        buttonDecimal.setText(".");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(buttonDecimal, gbc);
        button0 = new JButton();
        Font button0Font = this.$$$getFont$$$("Arial Black", -1, 36, button0.getFont());
        if (button0Font != null) button0.setFont(button0Font);
        button0.setText("0");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button0, gbc);
        buttonEqual = new JButton();
        Font buttonEqualFont = this.$$$getFont$$$("Arial Black", -1, 36, buttonEqual.getFont());
        if (buttonEqualFont != null) buttonEqual.setFont(buttonEqualFont);
        buttonEqual.setText("=");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(buttonEqual, gbc);
        buttonAddition = new JButton();
        Font buttonAdditionFont = this.$$$getFont$$$("Arial Black", -1, 36, buttonAddition.getFont());
        if (buttonAdditionFont != null) buttonAddition.setFont(buttonAdditionFont);
        buttonAddition.setText("+");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(buttonAddition, gbc);
        buttonSubtraction = new JButton();
        Font buttonSubtractionFont = this.$$$getFont$$$("Arial Black", -1, 36, buttonSubtraction.getFont());
        if (buttonSubtractionFont != null) buttonSubtraction.setFont(buttonSubtractionFont);
        buttonSubtraction.setText("-");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(buttonSubtraction, gbc);
        buttonMultiplication = new JButton();
        Font buttonMultiplicationFont = this.$$$getFont$$$("Arial Black", -1, 36, buttonMultiplication.getFont());
        if (buttonMultiplicationFont != null) buttonMultiplication.setFont(buttonMultiplicationFont);
        buttonMultiplication.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(buttonMultiplication, gbc);
        buttonDivision = new JButton();
        Font buttonDivisionFont = this.$$$getFont$$$("Arial Black", -1, 36, buttonDivision.getFont());
        if (buttonDivisionFont != null) buttonDivision.setFont(buttonDivisionFont);
        buttonDivision.setText("÷");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(buttonDivision, gbc);
        button5 = new JButton();
        Font button5Font = this.$$$getFont$$$("Arial Black", -1, 36, button5.getFont());
        if (button5Font != null) button5.setFont(button5Font);
        button5.setText("5");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(button5, gbc);
        labelNumber = new JLabel();
        labelNumber.setEnabled(true);
        Font labelNumberFont = this.$$$getFont$$$("Calibri", Font.PLAIN, 72, labelNumber.getFont());
        if (labelNumberFont != null) labelNumber.setFont(labelNumberFont);
        labelNumber.setHorizontalTextPosition(11);
        labelNumber.setText("0");
        labelNumber.setVerticalAlignment(0);
        labelNumber.setVerticalTextPosition(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        panelMain.add(labelNumber, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}
