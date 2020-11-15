package package_0;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calcul extends JFrame {
	private JButton button;
	private JTextField text1, text2, result1, result2, result3, result4;
	private JLabel label1;
	private JRadioButton a, b, c, d, f;
	private JPanel panel1, panel2, panel3;
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == a) {
				String name1 = text1.getText();
				double value1 = Integer.parseInt(name1);

				
				String name2 = text2.getText();
				double value2 = Integer.parseInt(name2);
				double value3 = value2 * 1.01;
				
				double a = value1 * value3;
				int b = (int)a;
				
				double c = b * 0.1;
				int d = (int)c;
				
				double g = value2 * 12;
				int h = (int)g;
				
				int total = b + d + h;
				
				result1.setText(""+ b+"��");
				result2.setText(""+ d+"��");
				result3.setText(""+ h+"��");
				result4.setText(""+ total +"��");
			}
			
			if(e.getSource() == button || e.getSource() == b) {
				String name1 = text1.getText();
				double value1 = Integer.parseInt(name1);

				
				String name2 = text2.getText();
				double value2 = Integer.parseInt(name2);
				double value3 = value2 * 1.01;
				
				double a = value1 * value3;
				int b = (int)a;
				
				double c = b * 0.1;
				int d = (int)c;
				
				double g = value2 * 15;
				int h = (int)g;
				
				int total = b + d + h;
				
				result1.setText(""+ b+"��");
				result2.setText(""+ d+"��");
				result3.setText(""+ h+"��");
				result4.setText(""+ total +"��");
			}
			
			if(e.getSource() == button || e.getSource() == c) {
				String name1 = text1.getText();
				double value1 = Integer.parseInt(name1);

				
				String name2 = text2.getText();
				double value2 = Integer.parseInt(name2);
				double value3 = value2 * 1.01;
				
				double a = value1 * value3;
				int b = (int)a;
				
				double c = b * 0.1;
				int d = (int)c;
				
				double g = value2 * 18;
				int h = (int)g;
				
				int total = b + d + h;
				
				result1.setText(""+ b+"��");
				result2.setText(""+ d+"��");
				result3.setText(""+ h+"��");
				result4.setText(""+ total +"��");
			}
			
			if(e.getSource() == button || e.getSource() == d) {
				String name1 = text1.getText();
				double value1 = Integer.parseInt(name1);

				
				String name2 = text2.getText();
				double value2 = Integer.parseInt(name2);
				double value3 = value2 * 1.01;
				
				double a = value1 * value3;
				int b = (int)a;
				
				double c = b * 0.1;
				int d = (int)c;
				
				double g = value2 * 22;
				int h = (int)g;
				
				int total = b + d + h;
				
				result1.setText(""+ b+"��");
				result2.setText(""+ d+"��");
				result3.setText(""+ h+"��");
				result4.setText(""+ total +"��");
			}
			
			if(e.getSource() == button || e.getSource() == f) {
				String name1 = text1.getText();
				double value1 = Integer.parseInt(name1);

				
				String name2 = text2.getText();
				double value2 = Integer.parseInt(name2);
				double value3 = value2 * 1.01;
				
				double a = value1 * value3;
				int b = (int)a;
				
				double c = b * 0.1;
				int d = (int)c;
				
				double g = value2 * 28;
				int h = (int)g;
				
				int total = b + d + h;
				
				result1.setText(""+ b+"��");
				result2.setText(""+ d+"��");
				result3.setText(""+ h+"��");
				result4.setText(""+ total +"��");
			}
		}
	}
	
	public Calcul()  {
		setSize(300, 550);
		setTitle("����ϱ�");
		setLayout(new BorderLayout());
		setResizable(false);
		
		panel1 = new JPanel();
	    panel1.setPreferredSize(new Dimension(300, 150));
		panel2 = new JPanel();
	    panel2.setPreferredSize(new Dimension(300, 50));
		panel3 = new JPanel();
	    panel3.setPreferredSize(new Dimension(300, 250));
		
		
		ButtonListener listener = new ButtonListener();

		
		
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
		
		
		
		
		panel2.add(new JLabel("           ��ǰ ���� (LBS), 1LBS = �� 0.45kg                 "));
		

		a = new JRadioButton(" 1   "); b = new JRadioButton(" 2   "); c = new JRadioButton(" 3   ");
		d = new JRadioButton(" 4   "); f = new JRadioButton(" 5     "); 
		
		
		a.addActionListener(listener);
		b.addActionListener(listener);
		c.addActionListener(listener);
		d.addActionListener(listener);
		f.addActionListener(listener);
		
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(a); group.add(b); group.add(c); group.add(d); group.add(f);

		
		
		panel2.add(a); panel2.add(b); panel2.add(c); panel2.add(d); panel2.add(f); 

		
		

		button = new JButton("���Ը� �������ּ���.");
		button.addActionListener(listener);
		panel2.add(button);
		
		panel3.add(new JLabel("���� ��ǰ �ݾ�"));
		result1 = new JTextField(15);
		result1.setEditable(false);
		panel3.add(result1);
		
		panel3.add(new JLabel("���� �ΰ���"));
		result2 = new JTextField(15);
		result2.setEditable(false);
		panel3.add(result2);
		

		panel3.add(new JLabel("���� ��� �ݾ�"));
		result3 = new JTextField(15);
		result3.setEditable(false);
		panel3.add(result3);
		
		
		panel3.add(new JLabel("�� �ݾ�"));
		result4 = new JTextField(15);
		result4.setEditable(false);
		panel3.add(result4);
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.SOUTH);
		setVisible(true);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calcul c = new Calcul();
		
	}

}
