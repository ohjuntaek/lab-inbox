package lab.juntaek.inbox.infra.action;

import lab.juntaek.inbox.domain.action.Action;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionData {
	A(new Action(1L, "A")),
	B(new Action(2L, "B")),
	C(new Action(3L, "C"))
	;

	private final Action action;
}
