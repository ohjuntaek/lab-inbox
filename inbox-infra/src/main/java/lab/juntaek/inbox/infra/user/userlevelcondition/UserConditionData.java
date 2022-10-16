package lab.juntaek.inbox.infra.user.userlevelcondition;

import lab.juntaek.inbox.domain.user.userlevelcondition.UserCondition;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserConditions;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserConditionData {
	A(new UserCondition("A", "A상품가진고객")),
	B(new UserCondition("B", "B상품가진고객")),
	C(new UserCondition("C", "C상품가진고객"))
	;

	private final UserCondition userCondition;
}
