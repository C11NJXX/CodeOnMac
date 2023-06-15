package main.java.experiment.sy52蔡英杰.sy08;

import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame {
    public MyFrame1() {
        setSize(350, 300);

        add(new JLabel("你的名字"));

        add(new JTextField(6));

        add(new JLabel("性别"));

        JRadioButton radioButton1 = new JRadioButton("男");
        JRadioButton radioButton2 = new JRadioButton("女");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        add(new JLabel("你喜欢的水果"));

        add(new JCheckBox("苹果"));

        add(new JCheckBox("橘子"));

        add(new JCheckBox("香蕉"));

        add(new JCheckBox("桃子"));

        add(new JLabel("你每次吃几个水果"));

        JComboBox jc = new JComboBox();
        jc.addItem("少于1个");
        jc.addItem("1至2个");
        jc.addItem("多于2个");
        add(jc);

        add(new JLabel("你觉得吃水果有什么好处"));

        JTextArea textArea = new JTextArea("我认为", 3, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        add(new JButton("确定"));

        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame1();
    }
}