import java.awt.*;
import java.awt.event.*;
class InnerEx7{
    public static void main(String[] args) {
        Button b = new Button("STart");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerfromed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!");
    }
}