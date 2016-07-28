<!doctype html>
<html>
  <head>
    <meta name="layout" content="main"/>
    <title>Scrum Status</title>
  </head>
  <body>
    <h1>Scrum Status</h1>
    <g:form name="scrumStatus" url="[controller: 'scrum', action: 'saveStatus']">

      <p>Scrum Status for ${g.formatDate([date: today, type: 'date'])}</p>

      <label for="userId">Team Member</label>
      <g:select name="userId"
                from="${userList}"
                value="${defaultTeamMember}"
                optionKey="id"
                optionValue="name" />

      <div>
        <label for="didYesterday">What did you do yesterday?</label>
        <g:textField name="didYesterday"/>
      </div>
      <div>
        <label for="doToday">What will you work on today?</label>
        <g:textField name="doToday"/>
      </div>
      <div>
        <label for="blockers">What is blocking you, if anything?</label>
        <g:textField name="blockers"/>
      </div>

    </g:form>
  </body>
</html>
