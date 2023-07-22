package main.java.experiment.sy52蔡英杰.sy09.sy09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkAppGUI extends JFrame {
    private JTextField clientInputField;
    private JTextArea conversationArea;

    private Socket clientSocket;
    private PrintWriter toServer;
    private BufferedReader fromServer;

    public TalkAppGUI() {
        setTitle("Talk App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        conversationArea = new JTextArea();
        conversationArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(conversationArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        clientInputField = new JTextField();
        inputPanel.add(clientInputField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        try {
            clientSocket = new Socket("127.0.0.1", 8899);
            toServer = new PrintWriter(clientSocket.getOutputStream(), true);
            fromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Thread(new ServerListener()).start();
    }

    private class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String clientInput = clientInputField.getText();
            toServer.println(clientInput);
            clientInputField.setText("");
            appendText("Client: " + clientInput);
        }
    }

    private class ServerListener implements Runnable {
        public void run() {
            try {
                String serverResponse;
                while ((serverResponse = fromServer.readLine()) != null) {
                    appendText("Server: " + serverResponse);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void appendText(String text) {
        conversationArea.append(text + "\n");
        conversationArea.setCaretPosition(conversationArea.getDocument().getLength());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TalkAppGUI app = new TalkAppGUI();
                app.setVisible(true);
            }
        });
    }
}
