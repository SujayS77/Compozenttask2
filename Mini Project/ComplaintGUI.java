import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComplaintGUI implements ActionListener, WindowListener {
    private JFrame win;
    private compFile cfile;
    private JButton menuBtns[];
    private final String password = "password";

    public ComplaintGUI() {
        win = new JFrame();
        String tmpPath = System.getProperty("java.io.tmpdir");
        cfile = new compFile(tmpPath + "comps.txt");

        win.setTitle("Complaint Box");
        win.setSize(500, 600);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setLayout(new BorderLayout(10, 10));

        // Header Panel for Title
        JPanel headerPanel = new JPanel();
        JLabel headerLabel = new JLabel("University Complaint Management", JLabel.CENTER);
        headerLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        headerPanel.add(headerLabel);
        win.add(headerPanel, BorderLayout.NORTH);

        // Panel for Menu Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // Padding for buttons

        menuBtns = new JButton[5];
        String[] buttonNames = {
            "Complaint Management", 
            "1. Register a Complaint", 
            "2. Status of Complaint", 
            "3. Check Complaint Filed", 
            "4. Report"
        };

        for (int i = 0; i < menuBtns.length; ++i) {
            menuBtns[i] = new JButton(buttonNames[i]);
            menuBtns[i].setFont(new Font("SansSerif", Font.PLAIN, 16));  // Font for buttons
            menuBtns[i].setFocusPainted(false); // Remove focus border
            buttonPanel.add(menuBtns[i]);
            menuBtns[i].addActionListener(this);
        }

        // Disable the first button (Complaint Management)
        menuBtns[0].setEnabled(false);

        win.add(buttonPanel, BorderLayout.CENTER);

        // Footer for any additional information
        JPanel footerPanel = new JPanel();
        JLabel footerLabel = new JLabel("© 2024 University Complaint System", JLabel.CENTER);
        footerLabel.setFont(new Font("SansSerif", Font.ITALIC, 12));
        footerPanel.add(footerLabel);
        win.add(footerPanel, BorderLayout.SOUTH);

        win.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (menuBtns[1] == e.getSource()) {
            new compRegister(cfile);
        } else if (menuBtns[2] == e.getSource()) {
            new compStatus(cfile);
        } else if (menuBtns[3] == e.getSource()) {
            String pwdEntered = JOptionPane.showInputDialog(win, "Enter Password : ");
            if (pwdEntered == null) {
                // do nothing
            } else if (pwdEntered.equals(password)) {
                new compCheck(cfile);
            } else {
                JOptionPane.showMessageDialog(win, "Wrong password");
            }
        } else if (menuBtns[4] == e.getSource()) {
            new compReport(cfile);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        win.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        cfile.exit();
    }

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
