package school;

/*
 * All imports that makes it all happen
 */
import school.StudentsMenu.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class Login_Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Form frame = new Login_Form();
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
	public Login_Form() {
		
		/*
		 * Form start modification 
		 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make it possible to close the window/Frame
		this.setLocationRelativeTo(null);
		this.setTitle("School Management System");
		this.setBounds(100, 100, 500, 400);
		this.setResizable(false);
		
		/*
		 * Modification to Contentpane
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * Upper panel on the contentpane
		 */
		JPanel Upper_Panel = new JPanel();
		Upper_Panel.setBackground(Color.DARK_GRAY);
		Upper_Panel.setBounds(0, 0, 484, 30);
		contentPane.add(Upper_Panel);
		Upper_Panel.setLayout(new BorderLayout(0, 0));
		
		/*
		 * Label login menu on upper panel
		 */
		JLabel lblLoginMenu = new JLabel("Login Menu");
		lblLoginMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMenu.setForeground(Color.WHITE);
		lblLoginMenu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Upper_Panel.add(lblLoginMenu, BorderLayout.CENTER);
		
		/*
		 * Middle panel on the contentpane
		 */
		JPanel Middle_Panel = new JPanel();
		Middle_Panel.setBounds(0, 30, 484, 308);
		contentPane.add(Middle_Panel);
		Middle_Panel.setLayout(null);
		
		/*
		 * Label username on middle panel
		 */
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUsername.setBounds(70, 50, 101, 14);
		Middle_Panel.add(lblUsername);
		
		/*
		 * Label password on middle panel
		 */
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setToolTipText("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBounds(70, 120, 101, 14);
		Middle_Panel.add(lblPassword);
		
		/*
		 * Textfield username on middle panel
		 * Makes it possible for user to write its username 
		 */
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtUsername.setText("Username");
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				/*
				 * clear the text field on focus if you are about to write in the field
				 */
				if (txtUsername.getText().trim().toLowerCase().equals("username")) {
					txtUsername.setText("");
					txtUsername.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				/*
				 * Set text in the field if you havent wrote anything in it.
				 */
				if (txtUsername.getText().trim().equals("") || txtUsername.getText().trim().equals("username")) {
					txtUsername.setText("username");
					txtUsername.setForeground(new Color(153,153,153));
				}
			}
		});
		txtUsername.setBounds(181, 49, 160, 20);
		Middle_Panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		/*
		 * Passwordfield password on middle panel
		 * Makes it possible for user to write its password 
		 */
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.LIGHT_GRAY);
		passwordField.setText("********");
		passwordField.setToolTipText("");
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				/*
				 * clear the text field on focus if you are about to write in the field
				 */
				String pass = String.copyValueOf(passwordField.getPassword());
				
				if (pass.trim().toLowerCase().equals("********")) {
					passwordField.setText("");
					passwordField.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				/*
				 * Set text in the field if you havent wrote anything in it.
				 */
				String pass = String.valueOf(passwordField.getPassword());
				
				if (pass.trim().equals("") || pass.trim().toLowerCase().equals("********")) {
					passwordField.setText("********");
					passwordField.setForeground(new Color(153,153,153));
				}
				
			}
		});
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		passwordField.setBounds(181, 119, 160, 20);
		Middle_Panel.add(passwordField);
		
		/*
		 * Button login on middlepane
		 * button to login when text is in both fields
		 */
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * The try an catch statement is the statement that makes login happen 
				 * It takes the input in both fields and compare them to an table in the databse
				 * if it matches then you can login, if it dosent matches it gives you an error
				 */
				PreparedStatement st;
				ResultSet rs;
				
				String adminUsername = txtUsername.getText(); // Takes input from username textfield
				String adminPassword = String.valueOf(passwordField.getPassword()); //Takes input from passwordfield
				
				String queryAdmin = "SELECT * FROM `users` WHERE `Username`= ? AND `Password`= ?"; // Takes input from databse
				
				try {
					st = DatabaseConnection.getConnection().prepareStatement(queryAdmin);
					
					st.setString(1, adminUsername);
					st.setString(2, adminPassword);	
					rs = st.executeQuery();
					
					
					if(rs.next()) {
						/*
						 * Open new form if you have connected to database and simple modification to that form
						 */
						StudentsMenu_Form form = new StudentsMenu_Form();
						form.setVisible(true);
						form.setLocationRelativeTo(null);
						form.setExtendedState(JFrame.MAXIMIZED_BOTH);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error", 2); // print if it dosent match the database 
					}
					
				} catch (SQLException e1) {
					
					e1.printStackTrace(); // Print error
				}
				

			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogin.setBounds(70, 200, 89, 40);
		Middle_Panel.add(btnLogin);
		
		/*
		 * Button Reset on middle pane
		 * Button to reset what stands in fields, if something went wrong
		 */
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Clear text field and password field when clicked
				txtUsername.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBounds(252, 200, 89, 40);
		Middle_Panel.add(btnReset);
		
		/*
		 * Lower panel on content pane
		 */
		JPanel LowerPanel = new JPanel();
		LowerPanel.setBackground(Color.DARK_GRAY);
		LowerPanel.setBounds(0, 336, 484, 25);
		contentPane.add(LowerPanel);
	}
}
