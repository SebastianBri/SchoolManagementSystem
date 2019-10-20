package school.StudentsMenu;

/*
 * Imports
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GradesMenu_Students extends JFrame {

	/*
	 * textfield
	 */
	private JPanel contentPane;
	private JTextField txtf_MathW;
	private JTextField txtf_HistoryW;
	private JTextField txtf_PhysicsW;
	private JTextField txtf_LawW;
	private JTextField txtf_EnglishW;
	private JTextField txtf_ComputeW;
	private JTextField txtf_BiologyW;
	private JTextField txtf_ChemistryW;
	private JTextField txtf_FinanceW;
	private JTextField txtf_MathO;
	private JTextField txtf_HistoryO;
	private JTextField txtf_PhysicsO;
	private JTextField txtf_LawO;
	private JTextField txtf_EnglishO;
	private JTextField txtf_ComputeO;
	private JTextField txtf_BiologyO;
	private JTextField txtf_ChemistyO;
	private JTextField txtf_FinanceO;
	private JTextField txtf_AvarageGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradesMenu_Students frame = new GradesMenu_Students();
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
	public GradesMenu_Students() {
		
		/*
		 * Date timer 
		 */
		LocalDateTime DateTime = LocalDateTime.now();
		DateTimeFormatter DateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = DateTime.format(DateTimeFormat);
		
		/*
		 * 
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(Color.DARK_GRAY);
		pnlTop.setBounds(0, 0, 700, 50);
		contentPane.add(pnlTop);
		pnlTop.setLayout(null);
		
		JLabel lblLoginMenu = new JLabel("Grades");
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
		
		JPanel pnlMiddle = new JPanel();
		pnlMiddle.setBounds(0, 50, 700, 530);
		contentPane.add(pnlMiddle);
		pnlMiddle.setLayout(null);
		
		/*
		 * Written grades Math
		 */
		JLabel lblMathW = new JLabel("Math");
		lblMathW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMathW.setBounds(20, 40, 106, 25);
		pnlMiddle.add(lblMathW);
		
		txtf_MathW = new JTextField();
		txtf_MathW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_MathW.setBounds(125, 40, 100, 25);
		pnlMiddle.add(txtf_MathW);
		txtf_MathW.setEditable(false);
		
		/*
		 * Written grades History
		 */
		JLabel lblHistoryW = new JLabel("History");
		lblHistoryW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHistoryW.setBounds(20, 90, 106, 25);
		pnlMiddle.add(lblHistoryW);
		
		txtf_HistoryW = new JTextField();
		txtf_HistoryW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_HistoryW.setColumns(10);
		txtf_HistoryW.setBounds(125, 90, 100, 25);
		pnlMiddle.add(txtf_HistoryW);
		txtf_HistoryW.setEditable(false);
		
		/*
		 * Written grades Compute
		 */
		JLabel lblComputeW = new JLabel("Compute");
		lblComputeW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblComputeW.setBounds(20, 290, 106, 25);
		pnlMiddle.add(lblComputeW);
		
		txtf_ComputeW = new JTextField();
		txtf_ComputeW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_ComputeW.setColumns(10);
		txtf_ComputeW.setBounds(125, 290, 100, 25);
		pnlMiddle.add(txtf_ComputeW);
		txtf_ComputeW.setEditable(false);
		
		
		/*
		 * Written grades English
		 */
		JLabel lblEnglishW = new JLabel("English");
		lblEnglishW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnglishW.setBounds(20, 240, 106, 25);
		pnlMiddle.add(lblEnglishW);
		
		txtf_EnglishW = new JTextField();
		txtf_EnglishW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_EnglishW.setColumns(10);
		txtf_EnglishW.setBounds(125, 240, 100, 25);
		pnlMiddle.add(txtf_EnglishW);
		txtf_EnglishW.setEditable(false);
		
		/*
		 * Written grades Physics
		 */
		JLabel lblPhyischW = new JLabel("Physics");
		lblPhyischW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhyischW.setBounds(20, 140, 106, 25);
		pnlMiddle.add(lblPhyischW);
		
		txtf_PhysicsW = new JTextField();
		txtf_PhysicsW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_PhysicsW.setColumns(10);
		txtf_PhysicsW.setBounds(125, 140, 100, 25);
		pnlMiddle.add(txtf_PhysicsW);
		txtf_PhysicsW.setEditable(false);
		
		/*
		 * Written grades Biology
		 */
		JLabel lblBiologyW = new JLabel("Biology");
		lblBiologyW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBiologyW.setBounds(20, 340, 106, 25);
		pnlMiddle.add(lblBiologyW);
		
		txtf_BiologyW = new JTextField();
		txtf_BiologyW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_BiologyW.setColumns(10);
		txtf_BiologyW.setBounds(125, 340, 100, 25);
		pnlMiddle.add(txtf_BiologyW);
		txtf_BiologyW.setEditable(false);
		
		/*
		 * Written grades Law
		 */
		JLabel lblLawW = new JLabel("Law");
		lblLawW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLawW.setBounds(20, 190, 106, 25);
		pnlMiddle.add(lblLawW);
		
		txtf_LawW = new JTextField();
		txtf_LawW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_LawW.setColumns(10);
		txtf_LawW.setBounds(125, 190, 100, 25);
		pnlMiddle.add(txtf_LawW);
		txtf_LawW.setEditable(false);
		
		
		/*
		 * Written grades Chemistry
		 */
		JLabel lblChemistryW = new JLabel("Chemistry");
		lblChemistryW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblChemistryW.setBounds(20, 390, 106, 25);
		pnlMiddle.add(lblChemistryW);
		
		txtf_ChemistryW = new JTextField();
		txtf_ChemistryW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_ChemistryW.setColumns(10);
		txtf_ChemistryW.setBounds(125, 390, 100, 25);
		pnlMiddle.add(txtf_ChemistryW);
		txtf_ChemistryW.setEditable(false);
		
		/*
		 * Written grades Finance
		 */
		JLabel lblFinanceW = new JLabel("Finance");
		lblFinanceW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFinanceW.setBounds(20, 440, 106, 25);
		pnlMiddle.add(lblFinanceW);
		
		txtf_FinanceW = new JTextField();
		txtf_FinanceW.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_FinanceW.setColumns(10);
		txtf_FinanceW.setBounds(125, 440, 100, 25);
		pnlMiddle.add(txtf_FinanceW);
		txtf_FinanceW.setEditable(false);
		
		/*
		 * Oral grades Math
		 */
		JLabel lblMathO = new JLabel("Math");
		lblMathO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMathO.setBounds(310, 40, 106, 25);
		pnlMiddle.add(lblMathO);
		
		txtf_MathO = new JTextField();
		txtf_MathO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_MathO.setColumns(10);
		txtf_MathO.setBounds(426, 40, 100, 25);
		pnlMiddle.add(txtf_MathO);
		txtf_MathO.setEditable(false);
		
		/*
		 * Oral grades History
		 */
		JLabel lblHistoryO = new JLabel("History");
		lblHistoryO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHistoryO.setBounds(310, 90, 106, 25);
		pnlMiddle.add(lblHistoryO);
		
		txtf_HistoryO = new JTextField();
		txtf_HistoryO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_HistoryO.setColumns(10);
		txtf_HistoryO.setBounds(426, 90, 100, 25);
		pnlMiddle.add(txtf_HistoryO);
		txtf_HistoryO.setEditable(false);
		
		/*
		 * Oral grades Physics
		 */
		JLabel lblPhysicsO = new JLabel("Physics");
		lblPhysicsO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhysicsO.setBounds(310, 140, 106, 25);
		pnlMiddle.add(lblPhysicsO);
		
		txtf_PhysicsO = new JTextField();
		txtf_PhysicsO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_PhysicsO.setColumns(10);
		txtf_PhysicsO.setBounds(426, 140, 100, 25);
		pnlMiddle.add(txtf_PhysicsO);
		txtf_PhysicsO.setEditable(false);
		
		/*
		 * Oral grades Law
		 */
		JLabel lblLawO = new JLabel("Law");
		lblLawO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLawO.setBounds(310, 190, 106, 25);
		pnlMiddle.add(lblLawO);
		
		txtf_LawO = new JTextField();
		txtf_LawO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_LawO.setColumns(10);
		txtf_LawO.setBounds(426, 190, 100, 25);
		pnlMiddle.add(txtf_LawO);
		txtf_LawO.setEditable(false);
		
		/*
		 * Oral grades English
		 */
		JLabel lblEnglishO = new JLabel("English");
		lblEnglishO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnglishO.setBounds(310, 240, 106, 25);
		pnlMiddle.add(lblEnglishO);
		
		txtf_EnglishO = new JTextField();
		txtf_EnglishO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_EnglishO.setColumns(10);
		txtf_EnglishO.setBounds(426, 240, 100, 25);
		pnlMiddle.add(txtf_EnglishO);
		txtf_EnglishO.setEditable(false);
		
		/*
		 * Oral grades Compute
		 */
		JLabel lblComputeO = new JLabel("Compute");
		lblComputeO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblComputeO.setBounds(310, 290, 106, 25);
		pnlMiddle.add(lblComputeO);
		
		txtf_ComputeO = new JTextField();
		txtf_ComputeO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_ComputeO.setColumns(10);
		txtf_ComputeO.setBounds(426, 290, 100, 25);
		pnlMiddle.add(txtf_ComputeO);
		txtf_ComputeO.setEditable(false);
		
		/*
		 * Oral grades Biology
		 */
		JLabel lblBiologyO = new JLabel("Biology");
		lblBiologyO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBiologyO.setBounds(310, 340, 106, 25);
		pnlMiddle.add(lblBiologyO);
		
		txtf_BiologyO = new JTextField();
		txtf_BiologyO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_BiologyO.setColumns(10);
		txtf_BiologyO.setBounds(426, 340, 100, 25);
		pnlMiddle.add(txtf_BiologyO);
		txtf_BiologyO.setEditable(false);
		
		/*
		 * Oral grades Chemistry
		 */
		JLabel lblChemistryO = new JLabel("Chemistry");
		lblChemistryO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblChemistryO.setBounds(310, 390, 106, 25);
		pnlMiddle.add(lblChemistryO);
		
		txtf_ChemistyO = new JTextField();
		txtf_ChemistyO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_ChemistyO.setColumns(10);
		txtf_ChemistyO.setBounds(426, 390, 100, 25);
		pnlMiddle.add(txtf_ChemistyO);
		txtf_ChemistyO.setEditable(false);
		
		/*
		 * Oral grades Finance
		 */
		JLabel lblFinanceO = new JLabel("Finance");
		lblFinanceO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFinanceO.setBounds(310, 440, 106, 25);
		pnlMiddle.add(lblFinanceO);
		
		txtf_FinanceO = new JTextField();
		txtf_FinanceO.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_FinanceO.setColumns(10);
		txtf_FinanceO.setBounds(426, 440, 100, 25);
		pnlMiddle.add(txtf_FinanceO);
		txtf_FinanceO.setEditable(false);
		
		/*
		 * Average grade
		 */
		JLabel lblAverage = new JLabel("Average grade");
		lblAverage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAverage.setBounds(218, 495, 130, 25);
		pnlMiddle.add(lblAverage);
		
		/*
		 * Written grades label
		 */
		JLabel lblWrittenGrades = new JLabel("Written grades");
		lblWrittenGrades.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrittenGrades.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblWrittenGrades.setBounds(20, 10, 205, 25);
		pnlMiddle.add(lblWrittenGrades);
		
		/*
		 * Oral grades label
		 */
		JLabel lblOralGrades = new JLabel("Oral grades");
		lblOralGrades.setHorizontalAlignment(SwingConstants.CENTER);
		lblOralGrades.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOralGrades.setBounds(310, 10, 216, 25);
		pnlMiddle.add(lblOralGrades);
		
		/*
		 * Average grade textfield
		 */
		txtf_AvarageGrade = new JTextField();
		txtf_AvarageGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtf_AvarageGrade.setColumns(10);
		txtf_AvarageGrade.setBounds(342, 495, 100, 25);
		pnlMiddle.add(txtf_AvarageGrade);
		txtf_AvarageGrade.setEditable(false);
		
		/*
		 * Button panel
		 */
		JPanel pnlButtom = new JPanel();
		pnlButtom.setBackground(Color.DARK_GRAY);
		pnlButtom.setForeground(new Color(0, 0, 0));
		pnlButtom.setBounds(0, 580, 700, 33);
		contentPane.add(pnlButtom);
		pnlButtom.setLayout(null);
		
		/*
		 * Date label
		 */
		JLabel lblDate = new JLabel("Date: " + formattedDate);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDate.setBounds(10, 0, 225, 33);
		pnlButtom.add(lblDate);
	}
}