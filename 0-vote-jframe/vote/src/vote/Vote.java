package vote;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Font;

public class Vote extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vote frame = new Vote();
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
	public Vote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel.setBounds(56, 40, 105, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter age");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setBounds(56, 102, 70, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				if(age>=18) 
					lblInfo.setText(n+"You are elegible to Vote!");
				else
					lblInfo.setText(n+ "You are not eligible to Vote!");
			}
		});
		btnOk.setFont(new Font("Dialog", Font.BOLD, 14));
		btnOk.setBounds(56, 173, 105, 27);
		contentPane.add(btnOk);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Dialog", Font.BOLD, 14));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtName.setText("");
				txtAge.setText("");
				lblInfo.setText("");
			}
		});
		btnReset.setBounds(186, 173, 105, 27);
		contentPane.add(btnReset);
		
		txtName = new JTextField();
		txtName.setBounds(186, 38, 199, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(186, 100, 199, 21);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(56, 224, 329, 17);
		contentPane.add(lblInfo);
	}
}
