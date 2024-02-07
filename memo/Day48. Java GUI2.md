
- 이벤트(Event)란?
	- 프로그램을 실행하는 도중 사용자에 의해 발생하는 키보드 입력, 마우스 클릭 등의 동작

- 이벤트 처리란?
	- 이벤트가 발생했을 때, 어떤 작업을 할 것인지 결정하는 것

- 이벤트 객체란?
	- 이벤트 발생 시 이벤트에 대한 정보를 가진 객체

- 이벤트 리스너
	- 이벤트 객체에 의해서 호출 되어 해당 이벤트를 처리하는 객체
	- 이벤트 리스너 사용 시 해당 인터페이스의 추상 메서드를 구현해야한다.

- 이벤트에 따른 이벤트 리스너의 종류
	- 
	- ![](https://i.imgur.com/ao8d86i.png)

- ex) 버튼 이벤트 예시
- 
- ![](https://i.imgur.com/n3BXczA.png)
- 
- ![](https://i.imgur.com/3KkgPOL.png)
- 실행 결과
- ![](https://i.imgur.com/PokD9sJ.png)
- 
- button을 클릭하면 -> button 텍스트가 버튼클릭으로 바뀐다.
- ![](https://i.imgur.com/4XsE75K.png)

- ex) MouseEvent 실습 소스코드
	~~~
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
}	~~~
