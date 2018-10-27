package Person;


public class PersonRunner {
	public static void main(String [] args) {
		Person flash = new Person();
		Person greenArrow = new Person();
		Person whiteCanary = new Person();
		String fsuperpower = "super speed";
		String fname = "Flash";
		flash.setName(fname);
		flash.setSuperpower(fsuperpower);
		System.out.println(fname + " has mad " + fsuperpower + " skills.");
		String gname = "Green Arrow";
		String gsuperpower = "archery";
		greenArrow.setName(gname);
		greenArrow.setSuperpower(gsuperpower);
		System.out.println(gname + " has mad " + gsuperpower + " skills.");
		String wname = "White Canary";
		String wsuperpower = "fighting";
		whiteCanary.setName(wname);
		whiteCanary.setSuperpower(wsuperpower);
		System.out.println(wname + " has mad " + wsuperpower + " skills.");
		
	}
		
		
	
	
}
