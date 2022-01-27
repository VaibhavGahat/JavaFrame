import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Regitration extends JFrame {
    final private Font mainFont =new Font("Segoe print",Font.BOLD,18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;
    public void initialize(){
        JLabel lbfirstName = new JLabel("First Name");
        lbfirstName.setFont(mainFont);

        tfFirstName =new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel();
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel =new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(lbfirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        JButton btnOk = new JButton("Ok");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firtsName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello "+firtsName + " "+ lastName);
                
            }
            
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
                
            }

        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        formPanel.setOpaque(false);
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);


        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(128,128,255));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainpanel.add(formPanel,BorderLayout.NORTH);
        mainpanel.add(lbWelcome, BorderLayout.CENTER);
        mainpanel.add(buttonPanel,BorderLayout.SOUTH);

        add(mainpanel);
        setTitle("Welcome");
        setSize(500,500);
        setMaximumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String []args){
        Regitration myFrame = new Regitration();
        myFrame.initialize();
    }

}