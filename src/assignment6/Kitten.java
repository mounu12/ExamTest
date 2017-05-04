package assignment6;

public class Kitten implements IKitten {

	 String name;
	 Person owner;
   int age;

	public Kitten(String name, Person owner) {
		setName(name);
		setOwner(owner);
		age = 0;
	}

	public void setName(String newName) {
		name = newName + " theFeline";
	}

	public String getName() {
		return name;
	}

	public void setOwner(Person newOwner) {
		owner = newOwner;
	}

	public Person getOwner() {
		return owner;
	}

	public void haveBirthday() {
		++age;
	}

	public int getAge() {
		return age;
	}

	public String tostring() {
		return name + "is" + age + "belongs to" + owner.getName();
	}

	
	
}
