package school.StudentsMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class ScheduleMenu_Student extends JFrame {

	private JPanel contentPane;
	private JTextField txtTimeday;
	private JTextField txtMonday;
	private JTextField txtTuesday;
	private JTextField txtWednesday;
	private JTextField txtFriday;
	private JTextField txtThursday;
	private JTextField txtSaturday;
	private JTextField txtSunday;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JLabel lblNewLabel;
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
					ScheduleMenu_Student frame = new ScheduleMenu_Student();
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
	public ScheduleMenu_Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlUpper = new JPanel();
		pnlUpper.setBackground(Color.DARK_GRAY);
		pnlUpper.setBounds(0, 0, 960, 43);
		contentPane.add(pnlUpper);
		pnlUpper.setLayout(null);
		
		lblNewLabel = new JLabel("Schedule");
		lblNewLabel.setBounds(441, 5, 77, 24);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pnlUpper.add(lblNewLabel);
		
		label_1 = new JLabel("ID:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(10, 0, 200, 24);
		pnlUpper.add(label_1);
		
		label_2 = new JLabel("Name:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(10, 25, 200, 15);
		pnlUpper.add(label_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 42, 960, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtTimeday = new JTextField();
		txtTimeday.setEditable(false);
		txtTimeday.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimeday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTimeday.setText("Time/Day");
		txtTimeday.setBounds(0, 0, 120, 50);
		panel.add(txtTimeday);
		txtTimeday.setColumns(10);
		
		txtMonday = new JTextField();
		txtMonday.setEditable(false);
		txtMonday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtMonday.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonday.setText("Monday");
		txtMonday.setColumns(10);
		txtMonday.setBounds(120, 0, 120, 50);
		panel.add(txtMonday);
		
		txtTuesday = new JTextField();
		txtTuesday.setEditable(false);
		txtTuesday.setText("Tuesday");
		txtTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuesday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTuesday.setColumns(10);
		txtTuesday.setBounds(240, 0, 120, 50);
		panel.add(txtTuesday);
		
		txtWednesday = new JTextField();
		txtWednesday.setEditable(false);
		txtWednesday.setText("Wednesday");
		txtWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		txtWednesday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtWednesday.setColumns(10);
		txtWednesday.setBounds(360, 0, 120, 50);
		panel.add(txtWednesday);
		
		txtThursday = new JTextField();
		txtThursday.setEditable(false);
		txtThursday.setText("Thursday");
		txtThursday.setHorizontalAlignment(SwingConstants.CENTER);
		txtThursday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtThursday.setColumns(10);
		txtThursday.setBounds(480, 0, 120, 50);
		panel.add(txtThursday);
		
		txtFriday = new JTextField();
		txtFriday.setEditable(false);
		txtFriday.setText("Friday");
		txtFriday.setHorizontalAlignment(SwingConstants.CENTER);
		txtFriday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFriday.setColumns(10);
		txtFriday.setBounds(600, 0, 120, 50);
		panel.add(txtFriday);
		
		txtSaturday = new JTextField();
		txtSaturday.setEditable(false);
		txtSaturday.setText("Saturday");
		txtSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		txtSaturday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtSaturday.setColumns(10);
		txtSaturday.setBounds(720, 0, 120, 50);
		panel.add(txtSaturday);
		
		txtSunday = new JTextField();
		txtSunday.setEditable(false);
		txtSunday.setText("Sunday");
		txtSunday.setHorizontalAlignment(SwingConstants.CENTER);
		txtSunday.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtSunday.setColumns(10);
		txtSunday.setBounds(840, 0, 120, 50);
		panel.add(txtSunday);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("08:10 - 09:40");
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(0, 50, 120, 50);
		panel.add(textField_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("09:40 - 10:00");
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(0, 100, 120, 30);
		panel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("10:00 - 11:30");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(0, 130, 120, 50);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("11:30 - 12:00");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(0, 180, 120, 30);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setText("12:00 - 13:30");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(0, 210, 120, 50);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText("13:30 - 13:45");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(0, 260, 120, 30);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setText("13:45 - 15:15");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(0, 290, 120, 50);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(0, 340, 120, 160);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(120, 50, 120, 50);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(120, 100, 120, 30);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(120, 130, 120, 50);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(120, 210, 120, 50);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(120, 290, 120, 50);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(120, 340, 120, 160);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(120, 180, 120, 30);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(120, 260, 120, 30);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(240, 100, 120, 30);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(360, 100, 120, 30);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(480, 100, 120, 30);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(600, 100, 120, 30);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(720, 100, 120, 30);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(840, 100, 120, 30);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_22.setColumns(10);
		textField_22.setBounds(240, 180, 120, 30);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(360, 180, 120, 30);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_24.setColumns(10);
		textField_24.setBounds(480, 180, 120, 30);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_25.setColumns(10);
		textField_25.setBounds(600, 180, 120, 30);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_26.setColumns(10);
		textField_26.setBounds(720, 180, 120, 30);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_27.setColumns(10);
		textField_27.setBounds(840, 180, 120, 30);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_28.setColumns(10);
		textField_28.setBounds(240, 260, 120, 30);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_29.setColumns(10);
		textField_29.setBounds(360, 260, 120, 30);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_30.setColumns(10);
		textField_30.setBounds(480, 260, 120, 30);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_31.setColumns(10);
		textField_31.setBounds(600, 260, 120, 30);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_32.setColumns(10);
		textField_32.setBounds(720, 260, 120, 30);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_33.setColumns(10);
		textField_33.setBounds(840, 260, 120, 30);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_34.setColumns(10);
		textField_34.setBounds(240, 50, 120, 50);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_35.setColumns(10);
		textField_35.setBounds(360, 50, 120, 50);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_36.setColumns(10);
		textField_36.setBounds(480, 50, 120, 50);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_37.setColumns(10);
		textField_37.setBounds(600, 50, 120, 50);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_38.setColumns(10);
		textField_38.setBounds(720, 50, 120, 50);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_39.setColumns(10);
		textField_39.setBounds(840, 50, 120, 50);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_40.setColumns(10);
		textField_40.setBounds(240, 130, 120, 50);
		panel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_41.setColumns(10);
		textField_41.setBounds(360, 130, 120, 50);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_42.setColumns(10);
		textField_42.setBounds(480, 130, 120, 50);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_43.setColumns(10);
		textField_43.setBounds(600, 130, 120, 50);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_44.setColumns(10);
		textField_44.setBounds(720, 130, 120, 50);
		panel.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_45.setColumns(10);
		textField_45.setBounds(840, 130, 120, 50);
		panel.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_46.setColumns(10);
		textField_46.setBounds(240, 210, 120, 50);
		panel.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_47.setColumns(10);
		textField_47.setBounds(360, 210, 120, 50);
		panel.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_48.setColumns(10);
		textField_48.setBounds(480, 210, 120, 50);
		panel.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setEditable(false);
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_49.setColumns(10);
		textField_49.setBounds(600, 210, 120, 50);
		panel.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setEditable(false);
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_50.setColumns(10);
		textField_50.setBounds(720, 210, 120, 50);
		panel.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_51.setColumns(10);
		textField_51.setBounds(840, 210, 120, 50);
		panel.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setEditable(false);
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_52.setColumns(10);
		textField_52.setBounds(840, 290, 120, 50);
		panel.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setEditable(false);
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_53.setColumns(10);
		textField_53.setBounds(720, 290, 120, 50);
		panel.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setEditable(false);
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_54.setColumns(10);
		textField_54.setBounds(600, 290, 120, 50);
		panel.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setEditable(false);
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_55.setColumns(10);
		textField_55.setBounds(480, 290, 120, 50);
		panel.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setEditable(false);
		textField_56.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_56.setColumns(10);
		textField_56.setBounds(360, 290, 120, 50);
		panel.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setEditable(false);
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_57.setColumns(10);
		textField_57.setBounds(240, 290, 120, 50);
		panel.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setEditable(false);
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_58.setColumns(10);
		textField_58.setBounds(240, 340, 120, 160);
		panel.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setEditable(false);
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_59.setColumns(10);
		textField_59.setBounds(360, 340, 120, 160);
		panel.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setEditable(false);
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_60.setColumns(10);
		textField_60.setBounds(480, 340, 120, 160);
		panel.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setEditable(false);
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_61.setColumns(10);
		textField_61.setBounds(600, 340, 120, 160);
		panel.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_62.setColumns(10);
		textField_62.setBounds(720, 340, 120, 160);
		panel.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_63.setColumns(10);
		textField_63.setBounds(840, 340, 120, 160);
		panel.add(textField_63);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 541, 960, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		label = new JLabel("Date: 20-10-2019 13:12:53");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(0, 0, 225, 33);
		panel_1.add(label);
	}
}
