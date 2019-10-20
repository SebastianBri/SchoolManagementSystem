package school.StudentsMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AssignmentMenu_Student extends JFrame {

	private JPanel contentPane;
	private JTextField txtWeek;
	private JTextField txtSubject;
	private JTextField txtTitel;
	private JTextField txtTimeLimit;
	private JTextField txtTime;
	private JTextField txtStatus;
	private JTextField txtAbsence;
	private JTextField txtNote;
	private JTextField txtGrade;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignmentMenu_Student frame = new AssignmentMenu_Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AssignmentMenu_Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(Color.DARK_GRAY);
		pnlTop.setBounds(0, 0, 1220, 50);
		contentPane.add(pnlTop);
		pnlTop.setLayout(null);
		
		label = new JLabel("ID:");
		label.setBounds(10, 5, 200, 24);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pnlTop.add(label);
		
		JLabel lblAssignment = new JLabel("Assignment");
		lblAssignment.setBounds(575, 5, 101, 24);
		lblAssignment.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssignment.setForeground(Color.WHITE);
		lblAssignment.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pnlTop.add(lblAssignment);
		
		label_1 = new JLabel("Name:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(10, 30, 200, 15);
		pnlTop.add(label_1);
		
		JPanel pnlMiddle = new JPanel();
		pnlMiddle.setBounds(0, 50, 1220, 534);
		contentPane.add(pnlMiddle);
		pnlMiddle.setLayout(null);
		
		txtWeek = new JTextField();
		txtWeek.setEditable(false);
		txtWeek.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtWeek.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeek.setText("Week");
		txtWeek.setBounds(0, 0, 120, 30);
		pnlMiddle.add(txtWeek);
		txtWeek.setColumns(10);
		
		txtSubject = new JTextField();
		txtSubject.setEditable(false);
		txtSubject.setText("Subject");
		txtSubject.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubject.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtSubject.setColumns(10);
		txtSubject.setBounds(120, 0, 120, 30);
		pnlMiddle.add(txtSubject);
		
		txtTitel = new JTextField();
		txtTitel.setEditable(false);
		txtTitel.setText("Titel");
		txtTitel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTitel.setColumns(10);
		txtTitel.setBounds(240, 0, 120, 30);
		pnlMiddle.add(txtTitel);
		
		txtTimeLimit = new JTextField();
		txtTimeLimit.setEditable(false);
		txtTimeLimit.setText("Time limit");
		txtTimeLimit.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimeLimit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTimeLimit.setColumns(10);
		txtTimeLimit.setBounds(360, 0, 120, 30);
		pnlMiddle.add(txtTimeLimit);
		
		txtTime = new JTextField();
		txtTime.setEditable(false);
		txtTime.setText("Time");
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTime.setColumns(10);
		txtTime.setBounds(480, 0, 120, 30);
		pnlMiddle.add(txtTime);
		
		txtStatus = new JTextField();
		txtStatus.setEditable(false);
		txtStatus.setText("Status");
		txtStatus.setHorizontalAlignment(SwingConstants.CENTER);
		txtStatus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtStatus.setColumns(10);
		txtStatus.setBounds(600, 0, 120, 30);
		pnlMiddle.add(txtStatus);
		
		txtAbsence = new JTextField();
		txtAbsence.setEditable(false);
		txtAbsence.setText("Absence");
		txtAbsence.setHorizontalAlignment(SwingConstants.CENTER);
		txtAbsence.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtAbsence.setColumns(10);
		txtAbsence.setBounds(720, 0, 120, 30);
		pnlMiddle.add(txtAbsence);
		
		txtNote = new JTextField();
		txtNote.setEditable(false);
		txtNote.setText("Note");
		txtNote.setHorizontalAlignment(SwingConstants.CENTER);
		txtNote.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtNote.setColumns(10);
		txtNote.setBounds(840, 0, 260, 30);
		pnlMiddle.add(txtNote);
		
		txtGrade = new JTextField();
		txtGrade.setEditable(false);
		txtGrade.setText("Grade");
		txtGrade.setHorizontalAlignment(SwingConstants.CENTER);
		txtGrade.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtGrade.setColumns(10);
		txtGrade.setBounds(1100, 0, 120, 30);
		pnlMiddle.add(txtGrade);
		
		JPanel pnlButtom = new JPanel();
		pnlButtom.setBackground(Color.DARK_GRAY);
		pnlButtom.setBounds(0, 584, 1220, 27);
		contentPane.add(pnlButtom);
		pnlButtom.setLayout(null);
		
		label_2 = new JLabel("Date: 20-10-2019 13:12:53");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(0, 0, 225, 33);
		pnlButtom.add(label_2);
	}
}
