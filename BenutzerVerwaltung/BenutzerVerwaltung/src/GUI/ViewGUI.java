package GUI;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ViewGUI {

    private Controller controller;

    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JButton addBtn = new JButton("+");
    private JButton test = new JButton("test");
    private JLabel title = new JLabel("Benutzer", SwingConstants.CENTER);
    private JLabel idname = new JLabel("ID                      Name");
    JList list = new JList();
    DefaultListModel model = new DefaultListModel();



    public ViewGUI(Controller controller) {
        this.controller = controller;
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        panel1.add(title, BorderLayout.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 40));

        panel1.add(addBtn, BorderLayout.EAST);
        addBtn.setPreferredSize(new Dimension(70,70));
        addBtn.setFont(new Font("Arial", Font.PLAIN, 40));

        panel2.add(idname, BorderLayout.NORTH);
        idname.setFont(new Font("Arial", Font.PLAIN, 24));
        idname.setBorder(BorderFactory.createEmptyBorder(20,80,0,0));


        list.setModel(model);
        list.setFont(new Font("Arial", Font.PLAIN, 24));
        panel2.add(list, BorderLayout.CENTER);
        list.setBorder(BorderFactory.createEmptyBorder(50,80,0,80));
        model.addElement(test);


        frame.setTitle("Benutzer");
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }
}
