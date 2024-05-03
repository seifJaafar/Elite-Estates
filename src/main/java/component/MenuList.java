/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author S3IX6
 */
public class MenuList<E extends Object> extends JList<E> {
    private DefaultListModel model;
    private int selectedIndex = -1;
    public MenuList(){
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if(o instanceof Item){
                        Item item=(Item) o;
                        selectedIndex = index;
                    }else{
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        });
    }
    public ListCellRenderer getCellRenderer(){
        return new DefaultListCellRenderer(){
            public Component getListCellRendererComponent(JList<?> jlist,Object o,int index,boolean selected,boolean focused){
                ListItem item = new ListItem();
                item.setItem(o);
                item.setSelected(selectedIndex == index);
                return item;
            }
        };
    }
    
    public void addItem(Item item){
        model.addElement(item);
    }
}
