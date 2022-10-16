package lab.juntaek.inbox.infra.user.userlevelcondition;

import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserLevelData {
	A(new UserLevel("A", "회원")),
	B(new UserLevel("A", "무료고객")),
	C(new UserLevel("A", "유료고객"))
	;

	private final UserLevel userLevel;
}
