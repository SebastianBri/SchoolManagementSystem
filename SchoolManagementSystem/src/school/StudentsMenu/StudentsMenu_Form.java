package school.StudentsMenu;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class StudentsMenu_Form extends JFrame {

	private JPanel contentPane;
	//private JPanel pnlMidt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsMenu_Form frame = new StudentsMenu_Form();
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
	public StudentsMenu_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		LocalDateTime DateTime = LocalDateTime.now();
		DateTimeFormatter DateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = DateTime.format(DateTimeFormat);
		
		
		JFrame frame = new JFrame();
		Container pane = frame.getContentPane();
		pane.setLayout(null);
		contentPane.setLayout(null);
		
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(Color.DARK_GRAY);
		pnlTop.setBounds(0, 0, 1086, 50);
		getContentPane().add(pnlTop);
		pnlTop.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(10, 10, 47, 18);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		pnlTop.add(lblName);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblId.setBounds(10, 28, 47, 18);
		pnlTop.add(lblId);
		
		JLabel lblStudentsMenu = new JLabel("Students Menu");
		lblStudentsMenu.setForeground(Color.WHITE);
		lblStudentsMenu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentsMenu.setBounds(474, 14, 122, 14);
		pnlTop.add(lblStudentsMenu);
		
		JPanel panelMiddle = new JPanel();
		panelMiddle.setBackground(Color.WHITE);
		panelMiddle.setBounds(0, 50, 1086, 530);
		contentPane.add(panelMiddle);

		ImageIcon ScheduleImage = new ImageIcon("C:\\Users\\sebth\\Dropbox\\Java\\Eclipse\\Workspace\\SchoolManagementSystem\\src\\school\\StudentsMenu\\Images\\Schedule.png");
		Image imageSchedule = ScheduleImage.getImage();
		Image scaleImangeSchedule = imageSchedule.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); 
		ScheduleImage = new ImageIcon(scaleImangeSchedule);
		JButton btnschedule = new JButton(ScheduleImage);
		btnschedule.setVisible(true);
		btnschedule.setOpaque(false);
		btnschedule.setContentAreaFilled(false);
		btnschedule.setBorderPainted(false);
		btnschedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		panelMiddle.setLayout(null);
		btnschedule.setBounds(170, 50, 153, 129);
		panelMiddle.add(btnschedule);
		
		ImageIcon AssignmentImage = new ImageIcon("C:\\Users\\sebth\\Dropbox\\Java\\Eclipse\\Workspace\\SchoolManagementSystem\\src\\school\\StudentsMenu\\Images\\Assignment.png");
		Image imageAssignment = AssignmentImage.getImage();
		Image scaleImageAssignment = imageAssignment.getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH); 
		AssignmentImage = new ImageIcon(scaleImageAssignment);
		JButton btnAssignment = new JButton(AssignmentImage);
		btnschedule.setVisible(true);
		btnAssignment.setOpaque(false);
		btnAssignment.setContentAreaFilled(false);
		btnAssignment.setBorderPainted(false);
		btnAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnAssignment.setBounds(480, 70, 153, 109);
		panelMiddle.add(btnAssignment);
		
		ImageIcon HomeworkImage = new ImageIcon("C:\\Users\\sebth\\Dropbox\\Java\\Eclipse\\Workspace\\SchoolManagementSystem\\src\\school\\StudentsMenu\\Images\\Homework.png");
		Image imageHomework = HomeworkImage.getImage();
		Image scaleImageHomework = imageHomework.getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH); 
		HomeworkImage = new ImageIcon(scaleImageHomework);
		JButton btnHomework = new JButton(HomeworkImage);
		btnHomework.setOpaque(false);
		btnHomework.setContentAreaFilled(false);
		btnHomework.setBorderPainted(false);
		btnHomework.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnHomework.setBounds(790, 70, 153, 109);
		panelMiddle.add(btnHomework);
		
		ImageIcon GradesImage = new ImageIcon("C:\\Users\\sebth\\Dropbox\\Java\\Eclipse\\Workspace\\SchoolManagementSystem\\src\\school\\StudentsMenu\\Images\\Grades.png");
		Image imageGrades = GradesImage.getImage();
		Image scaleImageGrades = imageGrades.getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH); 
		GradesImage = new ImageIcon(scaleImageGrades);
		JButton btnGrades = new JButton(GradesImage);
		btnGrades.setOpaque(false);
		btnGrades.setContentAreaFilled(false);
		btnGrades.setBorderPainted(false);
		btnGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GradesMenu_Students gradesMenu = new GradesMenu_Students();
				gradesMenu.setVisible(true);
				gradesMenu.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btnGrades.setBounds(170, 300, 153, 109);
		panelMiddle.add(btnGrades);
		
		ImageIcon AbsenceImage = new ImageIcon("C:\\Users\\sebth\\Dropbox\\Java\\Eclipse\\Workspace\\SchoolManagementSystem\\src\\school\\StudentsMenu\\Images\\Absence.png");
		Image imageAbsence = AbsenceImage.getImage();
		Image scaleImageAbsence = imageAbsence.getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH); 
		AbsenceImage = new ImageIcon(scaleImageAbsence);
		JButton btnAbsence = new JButton(AbsenceImage);
		btnAbsence.setOpaque(false);
		btnAbsence.setContentAreaFilled(false);
		btnAbsence.setBorderPainted(false);
		btnAbsence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnAbsence.setBounds(480, 300, 153, 109);
		panelMiddle.add(btnAbsence);
		
		ImageIcon MessageImage = new ImageIcon("C:\\Users\\sebth\\Dropbox\\Java\\Eclipse\\Workspace\\SchoolManagementSystem\\src\\school\\StudentsMenu\\Images\\Message.png");
		Image imageMessage = MessageImage.getImage();
		Image scaleImageMessage = imageMessage.getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH); 
		MessageImage = new ImageIcon(scaleImageMessage);
		JButton btnMessages = new JButton(MessageImage);
		btnMessages.setOpaque(false);
		btnMessages.setContentAreaFilled(false);
		btnMessages.setBorderPainted(false);
		btnMessages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnMessages.setBounds(790, 300, 153, 109);
		panelMiddle.add(btnMessages);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchedule.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSchedule.setBounds(180, 190, 128, 25);
		panelMiddle.add(lblSchedule);
		
		JLabel lblAssignment = new JLabel("Assignments");
		lblAssignment.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssignment.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAssignment.setBounds(490, 190, 128, 25);
		panelMiddle.add(lblAssignment);
		
		JLabel lblHomework = new JLabel("Homework");
		lblHomework.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomework.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHomework.setBounds(800, 190, 109, 25);
		panelMiddle.add(lblHomework);
		
		JLabel lblMessages = new JLabel("Messages");
		lblMessages.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessages.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMessages.setBounds(820, 420, 97, 25);
		panelMiddle.add(lblMessages);
		
		JLabel lblAbsence = new JLabel("Absence");
		lblAbsence.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbsence.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAbsence.setBounds(520, 420, 85, 25);
		panelMiddle.add(lblAbsence);
		
		JLabel lblGrades = new JLabel("Grades");
		lblGrades.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrades.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGrades.setBounds(210, 420, 71, 25);
		panelMiddle.add(lblGrades);
		
		JPanel pnlButtom = new JPanel();
		pnlButtom.setBackground(Color.DARK_GRAY);
		pnlButtom.setBounds(0, 580, 1086, 31);
		getContentPane().add(pnlButtom);
		pnlButtom.setLayout(null);
		
		JLabel lblDate = new JLabel("Date: " + formattedDate);
		lblDate.setBounds(10, 0, 230, 24);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pnlButtom.add(lblDate);
		
	}
}
