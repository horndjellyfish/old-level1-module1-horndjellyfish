package Smurf;


public class Smurf {
	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("My name is " + name + ".");
		return name;
	}

	public void eat() {
		System.out.println(name + " is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor(String hatColor) {
		// 3. Fill in this method
		return name + "'s hat is " + hatColor + ".";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy(String gender) {
		// 4. Fill in this method
		return name + " is a " + gender + ".";
	}
	

}



