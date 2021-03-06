package com.squadro.touricity.session;

import com.squadro.touricity.database.Database;
import com.squadro.touricity.database.query.InsertionQuery;
import com.squadro.touricity.database.result.QueryResult;
import org.slf4j.LoggerFactory;

public class CreateAccountQuery extends InsertionQuery {

    private String account_id;

    public CreateAccountQuery(String account_id) {
        this.account_id = account_id;
    }

    public String getQuery() {
        return "INSERT INTO " + Database.ACCOUNT +
                " VALUES (" + Database.value(account_id) + ")";
    }

    public boolean onResult(QueryResult result) {
        return false;
    }
}
