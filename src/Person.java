
public class Person {
	private String Name;
	private String Superpower;
Person(String name,String superpower){
	this.Name = name;
	this.Superpower = superpower;
}
public String toString(){
	return Name + " has mad " + Superpower + " skills.";
}
String getName() {
	return Name;
}
String getSuperpower() {
	return Superpower;
}
void setName(String name) {
	this.Name = name;
}
void setSuperpower(String superpower) {
	this.Superpower = superpower;
}
}
