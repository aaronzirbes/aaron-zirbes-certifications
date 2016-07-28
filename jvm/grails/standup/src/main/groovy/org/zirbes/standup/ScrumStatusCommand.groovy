package org.zirbes.standup

import grails.validation.Validateable

class ScrumStatusCommand implements Validateable {

    Date date
    UUID userId
    UUID teamId

    String didYesterday
    String doToday
    String blockers

    static constraints = {
        date max: new Date()
        didYesterday nullable:true, blank:false
        doToday blank:false
        blockers nullable: true, blank:false
    }

}
