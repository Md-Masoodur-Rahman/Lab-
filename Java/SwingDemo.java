import javax.swing.*;

class SwingDemo{
	SwingDemo(){
		JFrame jfrm = new JFrame("A simple swing application");
		jfrm.setSize(275,100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jLab=new JLabel("Swing means powerful GUIs");
		jfrm.add(jLab);
		jfrm.setVisible(true);
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SwingDemo();
			}});
	}
}