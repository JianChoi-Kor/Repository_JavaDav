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
				
				result1.setText(""+ b+"원");
				result2.setText(""+ d+"원");
				result3.setText(""+ h+"원");
				result4.setText(""+ total +"원");
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
				
				result1.setText(""+ b+"원");
				result2.setText(""+ d+"원");
				result3.setText(""+ h+"원");
				result4.setText(""+ total +"원");
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
				
				result1.setText(""+ b+"원");
				result2.setText(""+ d+"원");
				result3.setText(""+ h+"원");
				result4.setText(""+ total +"원");
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
				
				result1.setText(""+ b+"원");
				result2.setText(""+ d+"원");
				result3.setText(""+ h+"원");
				result4.setText(""+ total +"원");
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
				
				result1.setText(""+ b+"원");
				result2.setText(""+ d+"원");
				result3.setText(""+ h+"원");
				result4.setText(""+ total +"원");
			}
		}
	}
	
	public Calcul()  {
		setSize(300, 550);
		setTitle("계산하기");
		setLayout(new BorderLayout());
		setResizable(false);
		
		panel1 = new JPanel();
	    panel1.setPreferredSize(new Dimension(300, 150));
		panel2 = new JPanel();
	    panel2.setPreferredSize(new Dimension(300, 50));
		panel3 = new JPanel();
	    panel3.setPreferredSize(new Dimension(300, 250));
		
		
		ButtonListener listener = new ButtonListener();

		
		
		label1 = new JLabel("해외직구 비용 계산 프로그램");
		label1.setFont(new Font("함초롱돋움", Font.PLAIN, 20));
		panel1.add(label1);
		
		 panel1.add(new JLabel("(대략적인 비용을 계산합니다.)"));
		 panel1.add(new JLabel("카드사 및 환율 매입가 같은 차이가 있을 수 있습니다."));
		
		
		panel1.add(new JLabel("제품 금액 ($)"));
		text1 = new JTextField(15);
		text1.addActionListener(listener);
		panel1.add(text1);
		
		panel1.add(new JLabel("현재 환율 ($)"));
		text2 = new JTextField(15);
		text2.addActionListener(listener);
		panel1.add(text2);
		
		
		
		
		panel2.add(new JLabel("           제품 무게 (LBS), 1LBS = 약 0.45kg                 "));
		

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

		
		

		button = new JButton("무게를 선택해주세요.");
		button.addActionListener(listener);
		panel2.add(button);
		
		panel3.add(new JLabel("예상 제품 금액"));
		result1 = new JTextField(15);
		result1.setEditable(false);
		panel3.add(result1);
		
		panel3.add(new JLabel("예상 부과세"));
		result2 = new JTextField(15);
		result2.setEditable(false);
		panel3.add(result2);
		

		panel3.add(new JLabel("예상 배송 금액"));
		result3 = new JTextField(15);
		result3.setEditable(false);
		panel3.add(result3);
		
		
		panel3.add(new JLabel("총 금액"));
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
