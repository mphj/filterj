package org.filterj.api.business.clauses;

import org.filterj.api.business.QueryType;

import java.lang.reflect.Field;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/07/09
 * @since 1.0.0
 */
public class LessEqualClause extends Clause {

    public LessEqualClause(Field annotatedFilterField, QueryType queryType) {
        super(annotatedFilterField,queryType);
    }

    public ClauseBean getClause() {
        return null;
    }

    public boolean isValid() {
        return false;
    }
}
