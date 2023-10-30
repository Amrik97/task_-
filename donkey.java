// Класс Donkey наследуется от класса Animal
public class donkey extends animal {
	public donkey(String name, String skills) {
		super(name, skills);
	}

	@Override
	public void displayCommands() {
		System.out.println("Список команд для осла:");
		System.out.println(getSkills());
	}

	@Override
	public void teachNewCommand(String command) {
		String updatedSkills = getSkills() + "," + command;
		setSkills(updatedSkills);
	}
}
