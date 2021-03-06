package com.squadro.touricity.session;

import com.squadro.touricity.database.Database;
import com.squadro.touricity.database.query.InsertionQuery;
import com.squadro.touricity.database.result.QueryResult;

public class CreateSessionQuery extends InsertionQuery {

    private SessionCookie sessionCookie;
    private String account_id;

    public CreateSessionQuery(SessionCookie sessionCookie, String account_id) {
        this.sessionCookie = sessionCookie;
        this.account_id = account_id;
    }

    public String getQuery() {
        return "INSERT INTO " + Database.SESSION + " (account_id,session_id) VALUES('" + account_id + "','" + sessionCookie.getUuid() + "')";
    }

    public boolean onResult(QueryResult result) {
        return false;
    }
}
