import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

public class Base10toBase2 {
	
	static JTextField base10, base2;
	static JButton convert;
	
	public Base10toBase2() {
		JFrame f = new JFrame("Base10toBase Convertor");
		f.getContentPane().setLayout(new FlowLayout());
		base10 = new JTextField("", 10);
		convert = new JButton("Convert");
		convert.setBounds(100, 100, 140, 40);
		base2 = new JTextField("", 10);
		
		
		f.getContentPane().add(base10);
		f.getContentPane().add(convert);
		f.getContentPane().add(base2);
		f.pack();
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		convert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int base10Int = Integer.parseInt(base10.getText());
				String base2Int = Integer.toString(base10Int, 2);
				base2.setText(base2Int);
			}
		});
	}
	
	public static void main(String[] args) {
		new Base10toBase2();
		String s = "HE";
		String hi = s.toLowerCase();
		hi += "LLO";
		System.out.println(hi);
	}
}
