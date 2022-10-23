package lab.juntaek.inbox.domain.action;

import java.util.List;
import lab.juntaek.inbox.domain.Entity;
import lab.juntaek.inbox.domain.NaturalId;
import lombok.Getter;

@Getter
public class Action extends Entity {

	@NaturalId
	private final String code;

	public Action(Long id, String code) {
		super(id);
		this.code = code;
	}

}
