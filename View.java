package dada;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
    JTextField textfield1;
    JTextField textfield2;
    JTextField textfield3;
    JButton UpdateButton;
    JButton ResetButton;
    JLabel label = new JLabel();
    JPanel panel;

    Model drawingPanel = new Model();
    String msg;

    public View() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Homework CS151");
        this.setSize(500,500);

        add(drawingPanel, BorderLayout.CENTER);

        this.panel = new JPanel();
        this.textfield1 = new JTextField(3);
        this.textfield2 = new JTextField(3);
        this.textfield3 = new JTextField(3);
        this.UpdateButton = new JButton("Update");
        this.ResetButton = new JButton("Reset");

        panel.add(new JLabel("Red"));
        panel.add(textfield1);
        panel.add(new JLabel("Green"));
        panel.add(textfield2);
        panel.add(new JLabel("Blue"));
        panel.add(textfield3);
        panel.add(UpdateButton);
        panel.add(ResetButton);
        panel.add(new JLabel());
      
        ResetButton.addActionListener(new ResetMessage(textfield1, textfield2, textfield3, drawingPanel));
        UpdateButton.addActionListener(new UpdateMessage(textfield1, textfield2, textfield3, drawingPanel));
        UpdateButton.addActionListener(new MyListener());

        panel.add(label);
        msg = drawingPanel.getText();
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        }

	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			label.setText("The updated data is: Red " + textfield1.getText() +", Green " + textfield2.getText() + ", Blue" + textfield3.getText());
		}
	}
}
