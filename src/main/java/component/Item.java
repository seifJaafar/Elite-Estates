/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import javax.swing.Icon;

/**
 *
 * @author S3IX6
 */
public class Item {
    public Item(){
        
    }
    public Item(String text, Icon Icon) {
        this.text = text;
        this.Icon = Icon;
    }

    public String getText() {
        return text;
    }

    public Icon getIcon() {
        return Icon;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIcon(Icon Icon) {
        this.Icon = Icon;
    }
    private String text;
    private Icon Icon;
}
