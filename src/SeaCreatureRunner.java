
public class SeaCreatureRunner {
	public static void main(String [] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
		
	}
}
