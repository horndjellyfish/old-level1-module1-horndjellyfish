package IntroToObjects;

public class Duck {
	int numberOfFriends = 7;
	String favoriteFood = "bread";
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	public static void main(String[] args) {
		
	}
	void quack() {
		System.out.println("quack.");
	}
	void waddle() {
		System.out.println("*waddle*");
	}
}
