package lab.juntaek.inbox.infra.user.auth;

import java.util.List;
import lab.juntaek.inbox.domain.user.auth.UserLevelConditionsActionAuth;
import lab.juntaek.inbox.infra.action.ActionData;
import lab.juntaek.inbox.infra.user.userlevelcondition.UserLevelConditionsData;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserLevelConditionsActionAuthData {
	A(new UserLevelConditionsActionAuth(1L, UserLevelConditionsData.A.getUserLevelConditions(), List.of(
			ActionData.A.getAction()
	))),
	B(new UserLevelConditionsActionAuth(2L, UserLevelConditionsData.B.getUserLevelConditions(), List.of(
			ActionData.B.getAction()
	))),
	C(new UserLevelConditionsActionAuth(3L, UserLevelConditionsData.C.getUserLevelConditions(), List.of(
			ActionData.C.getAction()
	))),
	;

	private final UserLevelConditionsActionAuth userLevelConditionsActionAuth;
}
