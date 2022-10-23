package lab.juntaek.inbox.infra.user.userlevelcondition;

import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserLevelData {
	A(new UserLevel(1L, "A", "회원")),
	B(new UserLevel(2L, "B", "무료고객")),
	C(new UserLevel(3L, "C", "유료고객"));

	private final UserLevel userLevel;
}
