// Класс Hamster наследуется от класса Animal
public class hamster extends animal {
	public hamster(String name, String skills) {
		super(name, skills);
	}

	@Override
	public void displayCommands() {
		System.out.println("Список команд для хомяка:");
		System.out.println(getSkills());
	}

	@Override
	public void teachNewCommand(String command) {
		String updatedSkills = getSkills() + "," + command;
		setSkills(updatedSkills);
	}
}