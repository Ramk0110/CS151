package dada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dada.Model;
import dada.Message;

public class ResetMessage implements Message, ActionListener {
    JTextField textfield1, textfield2, textfield3;
    Model drawingPanel;

    public ResetMessage(JTextField textfield1, JTextField textfield2, JTextField textfield3, Model drawingPanel) {
        this.textfield1 = textfield1;
        this.textfield2 = textfield2;
        this.textfield3 = textfield3;
        this.drawingPanel = drawingPanel;
    }

 
    public void actionPerformed(ActionEvent e) {
            textfield1.setText("0");
            textfield2.setText("0");
            textfield3.setText("0");
            drawingPanel.setValue(0, 0, 0);
            drawingPanel.setText(0, 0, 0);
    }
}




