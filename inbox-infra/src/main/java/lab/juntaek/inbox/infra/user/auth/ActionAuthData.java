package lab.juntaek.inbox.infra.user.auth;

import java.util.List;
import lab.juntaek.inbox.domain.user.auth.ActionAuth;
import lab.juntaek.inbox.infra.action.ActionData;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionAuthData {
	A(new ActionAuth("A", null, List.of(ActionData.A.getAction()))),
	B(new ActionAuth("B", null, null)),
	C(new ActionAuth("C", null, null)),
	;

	private final ActionAuth actionAuth;
}
