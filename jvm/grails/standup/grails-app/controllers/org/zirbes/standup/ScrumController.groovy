package org.zirbes.standup

class ScrumController {

    ScrumService scrumService

    def index() {
        List<Map> userList = []
        UUID defaultUserId = UUID.randomUUID()
        return [
            today: new Date(),
            userList: userList,
            defaultTeamMember: defaultUserId,
        ]
    }

    def saveStatus(ScrumStatusCommand scrumStatus) {
    }

}
