package day48;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Mouse extends JFrame {

	JPanel jp = new JPanel();
	JLabel la;

	Mouse() {
		setTitle("mouse 이벤트창");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		jp.addMouseListener(new MouseListener1());
		jp.addMouseMotionListener(new MouseListener1());
		la = new JLabel("마우스 올려보기");
		jp.add(la);
		setSize(300, 300);
		setVisible(true);

	}

	class MouseListener1 implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("Mouse Dragged(" + e.getX() + ", " + e.getY() + ")");

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("Mouse Moved(" + e.getX() + ", " + e.getY() + ")");

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText("마우스 클릭횟수 : " + e.getClickCount());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.red); // 판의 배경을 RED로 설정

		}

		@Override
		public void mouseExited(MouseEvent e) {
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.YELLOW); // 판의 배경을 YELLOW로 설정

		}
	}

	public static void main(String[] args) {

		new Mouse();

	}
}
