import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {

    Project(){
        setSize(1540,850);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb=new JMenuBar();
         //new Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.blue);
        mb.add(newInformation);

        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo=new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

          //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.red);
        mb.add(details);

        JMenuItem facultydetails= new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.blue);
        mb.add(leave);

        JMenuItem facultyleave= new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave=new JMenuItem("Student Leave");
        studentleave.setBackground(Color.white);
        studentleave.addActionListener(this);
        leave.add(studentleave);

        //Leave Details
        JMenu leavedetaild = new JMenu("Leave Details");
        leavedetaild.setForeground(Color.red);
        mb.add(leavedetaild);

        JMenuItem facultyleavedetails= new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.white);
        facultyleavedetails.addActionListener(this);
        leavedetaild.add(facultyleavedetails);

        JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.white);
        studentleavedetails.addActionListener(this);
        leavedetaild.add(studentleavedetails);

        //Exam Details
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.blue);
        mb.add(exam);

        JMenuItem examinationdetails= new JMenuItem(" Examination Result");
        examinationdetails.setBackground(Color.white);
        exam.add(examinationdetails);

        JMenuItem entermarks=new JMenuItem(" Enter Marks ");
        entermarks.setBackground(Color.white);
        exam.add(entermarks);

        //Update Details
        JMenu updateInfo = new JMenu("Update");
        updateInfo.setForeground(Color.red);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo= new JMenuItem(" Update Faculty Details");
        updatefacultyinfo.setBackground(Color.white);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo=new JMenuItem(" Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updateInfo.add(updatestudentinfo);

        //Update Details
        JMenu fee = new JMenu("fee Details");
        fee.setForeground(Color.blue);
        mb.add(fee);

        JMenuItem feestructure= new JMenuItem(" Fee Structure");
        feestructure.setBackground(Color.white);
        fee.add(feestructure);

        JMenuItem feefrom=new JMenuItem(" Students Fee From");
        feefrom.setBackground(Color.white);
        fee.add(feefrom);

        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.red);
        mb.add(utility);

        JMenuItem notepad= new JMenuItem(" Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc=new JMenuItem(" Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);

        //Exam
        JMenu exit = new JMenu("Exam");
        exit.setForeground(Color.blue);
        mb.add(exit);

        JMenuItem ex= new JMenuItem("Exam");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg=ae.getActionCommand();

        if(msg.equals("Exit")){
            setVisible(false);
        } else if (msg.equals(" Calculator")) {
            try{
                 Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else if (msg.equals(" Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }

        } else if (msg.equals("New Faculty Information")) {
           new AddTeacher();

        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
             new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }

    }

    public static void main(String[] args) {
        new Project();
    }


}
