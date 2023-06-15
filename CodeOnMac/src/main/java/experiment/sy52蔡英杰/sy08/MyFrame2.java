package main.java.experiment.sy52蔡英杰.sy08;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    public MyFrame2() {
        setTitle("图书类别修改");
        setSize(510, 400);

        ImageIcon icon1 = new ImageIcon("C:\\Users\\jj\\IdeaProjects\\javasy\\src\\sy8.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0, 0, 490, 80);
        add(label1);

        Object[] titles = {"图书类别编号", "图书类别名称", "可借天数", "罚款"};
        Object[][] data = {
                {1, "qaz", 30, 3},
                {2, "wsx", 40, 4},
                {3, "edc", 50, 5}
        };
        JTable jtable1 = new JTable(data, titles);
        JScrollPane jscrollpane = new JScrollPane(jtable1);
        jscrollpane.setBounds(0, 80, 490, 100);
        add(jscrollpane);

        JLabel label2 = new JLabel("类别编号");
        label2.setBounds(10, 200, 70, 20);
        add(label2);

        JLabel label3 = new JLabel("类别名称");
        label3.setBounds(160, 200, 70, 20);
        add(label3);

        JComboBox jc = new JComboBox();
        jc.addItem("qaz");
        jc.addItem("wsx");
        jc.addItem("edc");
        jc.setBounds(230, 200, 70, 20);
        add(jc);

        JLabel label4 = new JLabel("可借天数");
        label4.setBounds(310, 200, 70, 20);
        add(label4);

        JLabel label5 = new JLabel("罚款");
        label5.setBounds(10, 250, 70, 20);
        add(label5);

        JTextField jTextField1 = new JTextField(6);
        jTextField1.setBounds(80, 200, 70, 20);
        add(jTextField1);

        JTextField jTextField2 = new JTextField(6);
        jTextField2.setBounds(380, 200, 70, 20);
        add(jTextField2);

        JTextField jTextField3 = new JTextField(6);
        jTextField3.setBounds(80, 250, 70, 20);
        add(jTextField3);

        JButton button1 = new JButton("修改");
        button1.setBounds(160, 300, 70, 20);
        add(button1);

        JButton button2 = new JButton("退出");
        button2.setBounds(250, 300, 70, 20);
        add(button2);

        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame2();
    }
}