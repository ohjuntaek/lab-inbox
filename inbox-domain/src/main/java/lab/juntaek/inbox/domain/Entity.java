package lab.juntaek.inbox.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(of = {"id"})
public abstract class Entity {
	private final Long id;

	public Entity(Long id) {
		this.id = id;
	}
}
