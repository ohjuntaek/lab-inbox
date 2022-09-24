package lab.juntaek.inbox.ptwas.member;

import lab.juntaek.inbox.ptwas.inbox.domain.user.InboxMember;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InboxMemberController {

	@GetMapping("/test")
	public String test() {
		final InboxMember inboxMember = new InboxMember("name");
		return inboxMember.toString();
	}
}
