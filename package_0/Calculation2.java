package package_0;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




public class Calculation1 extends JFrame {
	private JButton button;
	private JTextField text1, text2, result1, result2, result3, result4;
	private JPanel panel1;
	private JLabel label1;
	private JRadioButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o;
	

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button) {
				String price1 = text1.getText();
				int value1 = Integer.parseInt(price1);
				result1.setText(""+ value1 * value1);
				
				String price2  = text2.getText();
				int value2 = Integer.parseInt(price2);
				result2.setText(""+ value2 + value2);
				
				
				
			}
		}
	}



	
	public Calculation1() {
		setSize(300, 500);
		setTitle("�ؿ����� ��� ����ϱ�");

		ButtonListener listener = new ButtonListener();

		
	    panel1 = new JPanel();
	    panel1.setPreferredSize(new Dimension(300, 320));
	    
	    
	    label1 = new JLabel("�ؿ����� ��� ��� ���α׷�");
	    label1.setFont(new Font("���ʷյ���", Font.PLAIN, 20));
	    panel1.add(label1);
	    
	    

	    panel1.add(new JLabel("(�뷫���� ����� ����մϴ�.)"));
	    panel1.add(new JLabel("ī��� �� ȯ�� ���԰� ���� ���̰� ���� �� �ֽ��ϴ�."));
	   

		
		panel1.add(new JLabel("��ǰ �ݾ� ($)"));
		text1 = new JTextField(15);
		text1.addActionListener(listener);
		panel1.add(text1);
		
		panel1.add(new JLabel("���� ȯ�� ($)"));
		text2 = new JTextField(15);
		text2.addActionListener(listener);
		panel1.add(text2);
		

		
		

		
		
		
		
		
		
		panel1.add(new JLabel("       ��ǰ ���� (LBS), 1LBS = �� 0.45kg                    "));
		

		a = new JRadioButton(" 1   "); b = new JRadioButton(" 2   "); c = new JRadioButton(" 3   ");
		d = new JRadioButton(" 4   "); e = new JRadioButton(" 5     "); f = new JRadioButton(" 6  ");
		g = new JRadioButton(" 7  "); h = new JRadioButton(" 8  "); i = new JRadioButton(" 9  ");
		j = new JRadioButton(" 10    "); k = new JRadioButton(" 11  "); l = new JRadioButton(" 12  ");
		m = new JRadioButton(" 13  "); n = new JRadioButton(" 14  "); o = new JRadioButton(" 15    ");
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(a); group.add(b); group.add(c); group.add(d); group.add(e);
		group.add(f); group.add(g); group.add(h); group.add(i); group.add(j);
		group.add(k); group.add(l); group.add(m); group.add(n); group.add(o);
		
		
		panel1.add(a); panel1.add(b); panel1.add(c); panel1.add(d); panel1.add(e); 
		panel1.add(f); panel1.add(g); panel1.add(h); panel1.add(i); panel1.add(j);
		panel1.add(k); panel1.add(l); panel1.add(m); panel1.add(n); panel1.add(o);
		
		
		

		panel1.add(new JLabel("���� ��ǰ �ݾ�"));
		result1 = new JTextField(15);
		result1.setEditable(false);
		panel1.add(result1);
		
		panel1.add(new JLabel("���� ����"));
		result2 = new JTextField(15);
		result2.setEditable(false);
		panel1.add(result2);
		
		panel1.add(new JLabel("���� ��� �ݾ�"));
		result3 = new JTextField(15);
		result3.setEditable(false);
		panel1.add(result3);
		
		
		panel1.add(new JLabel("�� �ݾ�"));
		result4 = new JTextField(15);
		result4.setEditable(false);
		panel1.add(result4);

		

		
		
		
		
		button = new JButton("����ϱ�");
		button.addActionListener(listener);
		panel1.add(button);
		
		
		
		add(panel1);
		



		setVisible(true);
		setResizable(false);
		
	}
	
	
	public static void main(String[] args) {
		Calculation1 c = new Calculation1();

	}

}
