package lab.juntaek.inbox.ptwas.inbox.domain.user;

public class InboxMember {

	private final String name;

	public InboxMember(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "InboxMember{" +
				"name='" + name + '\'' +
				'}';
	}
}
