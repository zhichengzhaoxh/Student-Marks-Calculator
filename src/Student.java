import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStudentName;
    private JTextField txtMarks1;
    private JButton calculateButton;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int marks1;
                int marks2;
                int marks3;
                int total;
                double average;
                String grade;

                marks1 = Integer.parseInt(txtMarks1.getText());
                marks2 = Integer.parseInt(txtMarks2.getText());
                marks3 = Integer.parseInt(txtMarks3.getText());

                total = marks1 + marks2 + marks3;
                txtTotal.setText(String.valueOf(total));

                average = total * 1.0 / 3;
                txtAverage.setText(String.valueOf(average));

                if (average >= 90) {
                    grade = "A";
                } else if (average >= 80) {
                    grade = "B";
                } else if (average >= 70) {
                    grade = "C";
                } else if (average >= 60) {
                    grade = "D";
                } else {
                    grade = "F";
                }
                txtGrade.setText(grade);
            }
        });
    }
}
