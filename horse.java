// Класс Horse наследуется от класса Animal
public class horse extends animal {
	public horse(String name, String skills) {
		super(name, skills);
	}

	@Override
	public void displayCommands() {
		System.out.println("Список команд для коня:");
		System.out.println(getSkills());
	}

	@Override
	public void teachNewCommand(String command) {
		String updatedSkills = getSkills() + "," + command;
		setSkills(updatedSkills);
	}
}
