package lab.juntaek.inbox.domain.user.userlevelcondition;

import lab.juntaek.inbox.domain.Entity;
import lab.juntaek.inbox.domain.NaturalId;
import lombok.Getter;

@Getter
public class UserLevel extends Entity {

	@NaturalId
	private final String code;

	private final String name;

	public UserLevel(Long id, String code, String name) {
		super(id);
		this.code = code;
		this.name = name;
	}
}
