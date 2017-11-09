import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class driver {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel labelMsgOne;
	private JLabel labelMsgOne_1;
	private JLabel labelTitle;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textFieldPublic1X;
	private JTextField textFieldPublic1Y;
	private JTextField textFieldPublic2X;
	private JTextField textFieldPublic2Y;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					driver window = new driver();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public driver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(900,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// initiate ECCkeyGenerator
		ECCKeyGenerator keyGenerator= new ECCKeyGenerator();
		try {
			keyGenerator.starter();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel labelUserOne = new JLabel("User 1");
		labelUserOne.setBounds(83, 90, 46, 14);
		frame.getContentPane().add(labelUserOne);
		
		JLabel labelUserTwo = new JLabel("User 2");
		labelUserTwo.setBounds(690, 90, 46, 14);
		frame.getContentPane().add(labelUserTwo);
		
		textField = new JTextField();
		textField.setBounds(80, 115, 175, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(690, 115, 184, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		labelMsgOne = new JLabel("Message:");
		labelMsgOne.setBounds(10, 118, 60, 14);
		frame.getContentPane().add(labelMsgOne);
		
		labelMsgOne_1 = new JLabel("Message:");
		labelMsgOne_1.setBounds(621, 118, 57, 14);
		frame.getContentPane().add(labelMsgOne_1);
		
		labelTitle = new JLabel("Messaging Encription with ECC(Diffie-Hellman)");
		labelTitle.setBounds(305, 11, 267, 48);
		frame.getContentPane().add(labelTitle);
		
		JButton btnSendOne = new JButton("Send");
		btnSendOne.setBounds(110, 146, 71, 23);
		frame.getContentPane().add(btnSendOne);
		
		JButton btnSendTwo = new JButton("Send");
		btnSendTwo.setBounds(749, 146, 71, 23);
		frame.getContentPane().add(btnSendTwo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 225, 280, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(594, 225, 280, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(174, 228, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblUsersPrivate = new JLabel("User 1's Private Value(a)");
		lblUsersPrivate.setBounds(70, 200, 150, 14);
		frame.getContentPane().add(lblUsersPrivate);
		
		JLabel label_1 = new JLabel("User 2's Private Value(b)");
		label_1.setBounds(716, 200, 158, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnGenerateOne = new JButton("Generate");
		btnGenerateOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGenerateOne.setBounds(10, 256, 89, 23);
		frame.getContentPane().add(btnGenerateOne);
		
		JButton btnGenerateTwo = new JButton("Generate");
		btnGenerateTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGenerateTwo.setBounds(785, 256, 89, 23);
		frame.getContentPane().add(btnGenerateTwo);
		
		JLabel labelStepOne = new JLabel("<-- Step One -->");
		labelStepOne.setBounds(387, 228, 108, 14);
		frame.getContentPane().add(labelStepOne);
		
		textFieldPublic1X = new JTextField();
		textFieldPublic1X.setBounds(40, 320, 280, 20);
		frame.getContentPane().add(textFieldPublic1X);
		textFieldPublic1X.setColumns(10);
		
		textFieldPublic1Y = new JTextField();
		textFieldPublic1Y.setColumns(10);
		textFieldPublic1Y.setBounds(40, 351, 280, 20);
		frame.getContentPane().add(textFieldPublic1Y);
		
		textFieldPublic2X = new JTextField();
		textFieldPublic2X.setColumns(10);
		textFieldPublic2X.setBounds(582, 320, 280, 20);
		frame.getContentPane().add(textFieldPublic2X);
		
		textFieldPublic2Y = new JTextField();
		textFieldPublic2Y.setColumns(10);
		textFieldPublic2Y.setBounds(582, 351, 280, 20);
		frame.getContentPane().add(textFieldPublic2Y);
		
		JLabel lblNewLabel_4 = new JLabel("User 1's public point(A=aG):");
		lblNewLabel_4.setBounds(106, 307, 190, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel label_3 = new JLabel("User 2's public point(B=bG):");
		label_3.setBounds(646, 307, 190, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblX = new JLabel("X:");
		lblX.setBounds(21, 323, 20, 14);
		frame.getContentPane().add(lblX);
		
		JLabel label_4 = new JLabel("Y:");
		label_4.setBounds(20, 354, 10, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("X:");
		label_5.setBounds(562, 323, 16, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Y:");
		label_6.setBounds(562, 354, 10, 14);
		frame.getContentPane().add(label_6);
		
		JButton btnComputePublicKeyOne = new JButton("Compute public key");
		btnComputePublicKeyOne.setBounds(174, 382, 146, 23);
		frame.getContentPane().add(btnComputePublicKeyOne);
		
		JButton btnComputePublicKeyTwo = new JButton("Compute public key");
		btnComputePublicKeyTwo.setBounds(716, 382, 146, 23);
		frame.getContentPane().add(btnComputePublicKeyTwo);
		
		JLabel lblUsersScrete = new JLabel("User 1's Screte Key Pair(S=aB=abG)");
		lblUsersScrete.setBounds(83, 427, 184, 14);
		frame.getContentPane().add(lblUsersScrete);
		
		textField_8 = new JTextField();
		textField_8.setBounds(40, 452, 280, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(40, 483, 280, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel label_7 = new JLabel("X:");
		label_7.setBounds(20, 455, 10, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Y:");
		label_8.setBounds(20, 486, 10, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("User 2's Screte Key Pair(S=bA=baG)");
		label_9.setBounds(621, 427, 184, 14);
		frame.getContentPane().add(label_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(582, 452, 280, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(582, 483, 280, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel label_10 = new JLabel("X:");
		label_10.setBounds(562, 455, 10, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Y:");
		label_11.setBounds(562, 486, 10, 14);
		frame.getContentPane().add(label_11);
		
		JButton btnComputePrivateKeyOne = new JButton("Generate private key");
		btnComputePrivateKeyOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnComputePrivateKeyOne.setBounds(150, 510, 170, 23);
		frame.getContentPane().add(btnComputePrivateKeyOne);
		
		JButton btnComputePrivateKeyTwo = new JButton("Generate private key");
		btnComputePrivateKeyTwo.setBounds(704, 514, 158, 23);
		frame.getContentPane().add(btnComputePrivateKeyTwo);
		
		JTextArea textDisplayOne = new JTextArea();
		textDisplayOne.setText("Message from User 2");
		textDisplayOne.setBounds(70, 555, 222, 66);
		frame.getContentPane().add(textDisplayOne);
		
		JTextArea textDisplayTwo = new JTextArea();
		textDisplayTwo.setText("Message from User 1");
		textDisplayTwo.setBounds(621, 555, 222, 66);
		frame.getContentPane().add(textDisplayTwo);
		
		JLabel labelStepTwo = new JLabel("<-- Step Two -->");
		labelStepTwo.setBounds(387, 341, 108, 14);
		frame.getContentPane().add(labelStepTwo);
		
		JLabel labelStepThree = new JLabel("<-- Step Three -->");
		labelStepThree.setBounds(387, 468, 108, 14);
		frame.getContentPane().add(labelStepThree);
	}
}
