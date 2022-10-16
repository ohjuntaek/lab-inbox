package lab.juntaek.inbox.infra.action;

import lab.juntaek.inbox.domain.action.Action;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionData {
	A(new Action("A")),
	B(new Action("B")),
	C(new Action("C"))
	;

	private final Action action;
}
