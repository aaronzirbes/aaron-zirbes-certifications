package org.zirbes.standup

class Team {

    UUID id
    String name

    static hasMany = [members: User]

    static constraints = {
    }
}
