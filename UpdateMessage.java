package dada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class UpdateMessage implements Message, ActionListener {
    JTextField textfield1, textfield2, textfield3;
    Model drawingPanel;

    public UpdateMessage(JTextField textfield1, JTextField textfield2, JTextField textfield3, Model drawingPanel) {
        this.textfield1 = textfield1;
        this.textfield2 = textfield2;
        this.textfield3 = textfield3;
        this.drawingPanel = drawingPanel;
    }

	@Override
	public void actionPerformed(ActionEvent e) {		
	}
}