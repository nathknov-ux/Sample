package com.mycompany.activity7;
import javax.swing.*;
import java.awt.*;

public class Activity7 extends JFrame {
    
    public Activity7() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        JPanel mainPanel = new JPanel();
        JPanel form = new JPanel();
        JPanel btn = new JPanel();
        JPanel output = new JPanel();
        
        mainPanel.setLayout(new BorderLayout());
        form.setLayout(new GridLayout(8, 2, 5, 5));
        output.setLayout(new GridLayout(4, 2, 5, 5));
        
        String[] labelsTop = {"Employee Number", "Employee Name", "Department", "Number of Days Worked",
            "Rate Per Day", "Overtime Hours Worked", "Overtime Rate Per Hour", "Deductions"};
        JTextField[] textfields = new JTextField[labelsTop.length];
        String[] deptCB = {"", ""};
        JComboBox comboBox = new JComboBox(deptCB);
        comboBox.setBackground(Color.WHITE);
        
        for (int i = 0; i < labelsTop.length; i++) {
            JLabel label = new JLabel(labelsTop[i]);
            form.add(label);
            
            if (i != 2) {
                textfields[i] = new JTextField(15);
                form.add(textfields[i]);
            } else {
                form.add(comboBox);
            }
        }
        
        JButton computeBtn = new JButton("Compute");
        btn.add(computeBtn);
        
        String[] labelsBot = {"Basic Pay", "Overtime Pay", "Gross Pay", "Net Pay"};
        JTextField[] outputFields = new JTextField[labelsBot.length];
        
        for (int i = 0; i < labelsBot.length; i++) {
            JLabel label = new JLabel(labelsBot[i]);
            output.add(label);
            outputFields[i] = new JTextField(15);
            outputFields[i].setEditable(false);
            outputFields[i].setBackground(Color.WHITE);
            output.add(outputFields[i]);
        }
        
        form.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        btn.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        output.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        mainPanel.add(form, BorderLayout.CENTER);
        mainPanel.add(btn, BorderLayout.SOUTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(output, BorderLayout.SOUTH);
        
        this.setTitle("Employee Payroll Calculator");
        this.setSize(550, 650);
        this.setMinimumSize(new Dimension(500, 600));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Activity7();
    }
}