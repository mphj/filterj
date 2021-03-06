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
public class GreaterEqualClause extends Clause {
    public GreaterEqualClause(Field beanField, QueryType queryType) {
        super(beanField,queryType, false);
    }

    public ClauseBean getClause() {
        String format = "(%s >= %s)";
        return new ClauseBean(String.format(format, getColumnName(), getParamKey()), getIgnoreValues());
    }

    protected final boolean isValid() {
        return false;
    }
}
