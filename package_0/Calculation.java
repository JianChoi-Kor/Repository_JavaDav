package package_0;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculation extends JFrame implements ActionListener {
	
	private JPanel topPanel, pricePanel, lbsPanel, resultPanel;
	private JRadioButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o;
	private JButton button;
	
	
	
	
	public Calculation() {
		setSize(300, 600);
		setTitle("해외직구 가격 계산 프로그램");

		
		
		//topPanel
		
		topPanel = new JPanel();
		topPanel.add(new JLabel("해외직구 가격 계산 프로그램"));
		add(topPanel,BorderLayout.NORTH);
		
		
		
		
		
		
		//pricePanel
		
		pricePanel = new JPanel();
		pricePanel.add(new JButton("계산"));

		
		
		
		a = new JRadioButton("1"); b = new JRadioButton("2"); c = new JRadioButton("3");
		d = new JRadioButton("4"); e = new JRadioButton("5"); f = new JRadioButton("6");
		g = new JRadioButton("7"); h = new JRadioButton("8"); i = new JRadioButton("9");
		j = new JRadioButton("10"); k = new JRadioButton("11"); l = new JRadioButton("12");
		m = new JRadioButton("13"); n = new JRadioButton("14"); o = new JRadioButton("15");

		ButtonGroup group = new ButtonGroup();
		
		group.add(a); group.add(b); group.add(c); group.add(d); group.add(e);
		group.add(f); group.add(g); group.add(h); group.add(i); group.add(j);
		group.add(k); group.add(l); group.add(m); group.add(n); group.add(o);
		
		pricePanel.add(a); pricePanel.add(b); pricePanel.add(c); pricePanel.add(d); 
		pricePanel.add(e); pricePanel.add(f); pricePanel.add(g); pricePanel.add(h); 
		pricePanel.add(i); pricePanel.add(j); pricePanel.add(k); pricePanel.add(l); 
		pricePanel.add(m); pricePanel.add(n); pricePanel.add(o);
		
		
		add(pricePanel,BorderLayout.CENTER);

		
		
		
		
		
		

		
		setVisible(true);
	}
	
	
	

	public static void main(String[] args) {

		Calculation c = new Calculation();

	}

}
