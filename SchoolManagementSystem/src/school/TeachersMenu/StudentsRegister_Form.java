package school.TeachersMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class StudentsRegister_Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtStudentName;
	private JTextField txtFatherName;
	private JTextField txtMotherName;
	private JTextField txtPhone;
	private JTextField txtFatherPhone;
	private JTextField txtMotherPhone;
	private JTextField txtAddress;
	private JTextField txtAdmissionDate;
	private JTextField txtGraduationDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsRegister_Form frame = new StudentsRegister_Form();
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
	public StudentsRegister_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 640, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*
		 * Top panel
		 */
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(Color.DARK_GRAY);
		pnlTop.setBounds(0, 0, 624, 50);
		contentPane.add(pnlTop);
		pnlTop.setLayout(null);
		
		JLabel lblLoginMenu = new JLabel("Register");
		lblLoginMenu.setLocation(270, 7);
		lblLoginMenu.setSize(100, 20);
		lblLoginMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMenu.setForeground(Color.WHITE);
		lblLoginMenu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pnlTop.add(lblLoginMenu, BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(10, 10, 200, 15);
		pnlTop.add(lblId);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(10, 25, 200, 15);
		pnlTop.add(lblName);
		
		
		/*
		 * Middle Panel
		 */
		JPanel pnlMiddle = new JPanel();
		pnlMiddle.setBounds(0, 51, 624, 530);
		contentPane.add(pnlMiddle);
		pnlMiddle.setLayout(null);
		
		/*
		 * Label and textfield for id
		 */
		JLabel lblId_1 = new JLabel("Id");
		lblId_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblId_1.setBounds(10, 10, 150, 20);
		pnlMiddle.add(lblId_1);
		
		txtId = new JTextField();
		txtId.setBounds(170, 10, 120, 25);
		pnlMiddle.add(txtId);
		txtId.setColumns(10);
		
		/*
		 * Label and textfield for student name
		 */
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentName.setBounds(10, 50, 150, 20);
		pnlMiddle.add(lblStudentName);
		
		txtStudentName = new JTextField();
		txtStudentName.setColumns(10);
		txtStudentName.setBounds(170, 52, 120, 25);
		pnlMiddle.add(txtStudentName);
		
		/*
		 * Label and combobox for class
		 */
		JLabel lblClass = new JLabel("Class");
		lblClass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblClass.setBounds(10, 90, 150, 20);
		pnlMiddle.add(lblClass);
		
		JComboBox cmbClass = new JComboBox();
		cmbClass.setBounds(170, 90, 120, 25);
		pnlMiddle.add(cmbClass);
		
		/*
		 * Label and textfield for father name
		 */
		JLabel lblFatherName = new JLabel("Father Name");
		lblFatherName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFatherName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFatherName.setBounds(10, 130, 150, 20);
		pnlMiddle.add(lblFatherName);
		
		txtFatherName = new JTextField();
		txtFatherName.setColumns(10);
		txtFatherName.setBounds(170, 132, 120, 25);
		pnlMiddle.add(txtFatherName);
		
		/*
		 * Label and textfield for mother name
		 */
		JLabel lblMotherName = new JLabel("Mother Name");
		lblMotherName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMotherName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMotherName.setBounds(10, 170, 150, 20);
		pnlMiddle.add(lblMotherName);
		
		txtMotherName = new JTextField();
		txtMotherName.setColumns(10);
		txtMotherName.setBounds(170, 172, 120, 25);
		pnlMiddle.add(txtMotherName);
		
		/*
		 * Label and textfield for phone
		 */
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhone.setBounds(10, 210, 150, 20);
		pnlMiddle.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(170, 212, 120, 25);
		pnlMiddle.add(txtPhone);
		
		/*
		 * Label and textfield for father phone
		 */
		JLabel lblFatherPhone = new JLabel("Father Phone");
		lblFatherPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFatherPhone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFatherPhone.setBounds(300, 10, 150, 20);
		pnlMiddle.add(lblFatherPhone);
		
		txtFatherPhone = new JTextField();
		txtFatherPhone.setColumns(10);
		txtFatherPhone.setBounds(460, 12, 120, 25);
		pnlMiddle.add(txtFatherPhone);
		
		/*
		 * Label and textfield for mother phone
		 */
		JLabel lblMotherPhone = new JLabel("Mother Phone");
		lblMotherPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMotherPhone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMotherPhone.setBounds(300, 50, 150, 20);
		pnlMiddle.add(lblMotherPhone);
		
		txtMotherPhone = new JTextField();
		txtMotherPhone.setColumns(10);
		txtMotherPhone.setBounds(460, 52, 120, 25);
		pnlMiddle.add(txtMotherPhone);
		
		/*
		 * Label and textfield for address
		 */
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAddress.setBounds(300, 90, 150, 20);
		pnlMiddle.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(460, 92, 120, 25);
		pnlMiddle.add(txtAddress);
		
		/*
		 * Label and textfield for admission date
		 */
		JLabel lblAdmissionDate = new JLabel("Admission Date");
		lblAdmissionDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmissionDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAdmissionDate.setBounds(300, 130, 150, 20);
		pnlMiddle.add(lblAdmissionDate);
		
		txtAdmissionDate = new JTextField();
		txtAdmissionDate.setColumns(10);
		txtAdmissionDate.setBounds(460, 132, 120, 25);
		pnlMiddle.add(txtAdmissionDate);
		
		/*
		 * Label and textfield for graduation date
		 */
		JLabel lblGraduationDate = new JLabel("Graduation Date");
		lblGraduationDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGraduationDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGraduationDate.setBounds(300, 170, 150, 20);
		pnlMiddle.add(lblGraduationDate);
		
		txtGraduationDate = new JTextField();
		txtGraduationDate.setColumns(10);
		txtGraduationDate.setBounds(460, 172, 120, 25);
		pnlMiddle.add(txtGraduationDate);
		
		/*
		 * Label and combobox for status
		 */
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStatus.setBounds(300, 210, 150, 20);
		pnlMiddle.add(lblStatus);
		
		JComboBox cmbStatus = new JComboBox();
		cmbStatus.setBounds(460, 211, 120, 25);
		pnlMiddle.add(cmbStatus);
		
		/*
		 * Label and buttons for student image
		 */
		JLabel lblStudentImage = new JLabel("Student Image");
		lblStudentImage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentImage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentImage.setBounds(10, 250, 150, 20);
		pnlMiddle.add(lblStudentImage);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(170, 250, 195, 25);
		pnlMiddle.add(btnUpload);
		
		JButton btnCapture = new JButton("Capture");
		btnCapture.setBounds(385, 250, 195, 25);
		pnlMiddle.add(btnCapture);
		
		
	}
}
