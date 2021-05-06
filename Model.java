package dada;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Model extends JPanel{
    private int red, green, blue;
    String msg = "";

    void setValue(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public void setText(int red, int green, int blue) {
        msg = "The updated data is: Red " + red +", Green " + green + ", Blue" + blue;
    }
    
    public String getText() {
    	return msg;
    }
    
    
}
