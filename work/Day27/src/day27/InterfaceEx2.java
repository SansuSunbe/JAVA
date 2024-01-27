package day27;

public class InterfaceEx2 {
	public static void main(String[] args) {
		
		TourGuide guide = new TourGuide();
		guide.lesureSports();
		guide.sightseeing();
		guide.food();
		
	}
}

interface Providable {
	void lesureSports(); // 여가 스포츠

	void sightseeing(); // 관광

	void food(); // 음식
}

class koreaTour implements Providable {

	@Override
	public void lesureSports() {
		System.out.println("수상 스키");

	}

	@Override
	public void sightseeing() {
		System.out.println("관람 투어");

	}

	@Override
	public void food() {
		System.out.println("금강산도 식후경");

	}
}

class JapanTour implements Providable{

	@Override
	public void lesureSports() {
		System.out.println("주짓수");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("도쿄 투어");
		
	}

	@Override
	public void food() {
		System.out.println("라멘");
		
	}
	
}

class TourGuide {
	private Providable tour = new JapanTour();

	public void lesureSports() {
		tour.lesureSports();
	}

	public void sightseeing() {
		tour.sightseeing();
	}

	public void food() {
		tour.food();
	}
}