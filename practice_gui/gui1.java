package practice_gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;




//프레임 만들기


public class gui1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("Mergi Gui"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 닫히는 기본설정으로 x표시 누르는거 
		//DO_NOTHING_ON_CLOSE 하면 종료 눌러도 종료 안
		
		//frame.setResizable(false); 창크기 변경 못하도록 
		
		frame.setSize(420,420); // sets the size of frame
		frame.setVisible(true); //make frame visible

		ImageIcon image = new ImageIcon("cloaking.png"); // create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon of frame
		frame.getContentPane().setBackground(new Color(123,50,250)); //change color of background

		
		MyFrame myframe = new MyFrame();
	}

}
 