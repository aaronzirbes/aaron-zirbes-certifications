package org.zirbes.standup

class Status {

    UUID id

    Date date
    User user
    Team team

    String didYesterday
    String doToday
    String blockers

    static constraints = {
    }
}
