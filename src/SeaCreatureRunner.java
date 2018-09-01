
public class SeaCreatureRunner {
public static void main(String[] args) {
SeaCreature SpongeBob = new SeaCreature("SpongeBob");	
SeaCreature SquidWard = new SeaCreature("Squidward");
SeaCreature Patrick = new SeaCreature("Patrick");
	SpongeBob.eat();
	SpongeBob.laugh();
	String name = SquidWard.getName();
	System.out.println(name);
	SquidWard.eat();
	SquidWard.laugh();
	String Name = Patrick.getName();
	System.out.println(Name);
	Patrick.eat();
	Patrick.laugh();
}
}
