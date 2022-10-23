package lab.juntaek.inbox.infra.user.userlevelcondition;

import lab.juntaek.inbox.domain.user.userlevelcondition.UserCondition;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserConditionData {
	A(new UserCondition(1L, "A", "A상품가진고객")),
	B(new UserCondition(2L, "B", "B상품가진고객")),
	C(new UserCondition(3L, "C", "C상품가진고객"))
	;

	private final UserCondition userCondition;
}
