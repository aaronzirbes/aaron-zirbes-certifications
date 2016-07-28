package org.zirbes.standup

class User {

    UUID id
    String displayName
    String username

    static belongsTo = [team: Team]

    static constraints = {
    }
}
