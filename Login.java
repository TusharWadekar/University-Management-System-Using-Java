import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login,cancel;
    JTextField tfusername,tfpassword;

    Login(){

       getContentPane().setBackground(Color.white);
       setLayout(null);

       JLabel lblusername=new JLabel("Username");
       lblusername.setBounds(40,20,100,20);
       add(lblusername);

       tfusername=new JTextField();
       tfusername.setBounds(150,20,150,20);
       add(tfusername);

        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(40,60,100,20);
        add(lblpassword);

        tfpassword=new JPasswordField();
        tfpassword.setBounds(150,70,150,20);
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(40,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.setFont(new Font("serif",Font.BOLD,16));
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(200,140,150,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("serif",Font.BOLD,16));
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);

        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent  ae) {
        if (ae.getSource() == login) {

            String username=tfusername.getText();
            String password=tfpassword.getText();

            String query="select * from login where username='"+username+"'and password='"+password+"'";
            try{
                Conn c=new Conn();
                Connection c1=c.getC();

                ResultSet rs=c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Project();
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid username and password");
                    setVisible(false);


                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
    public static void main(String[] args) {

        new Login();
    }



}
