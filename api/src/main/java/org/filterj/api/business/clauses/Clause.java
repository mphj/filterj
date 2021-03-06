package org.filterj.api.business.clauses;

import org.filterj.api.Filter;
import org.filterj.api.business.QueryType;

import java.lang.reflect.Field;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/07/08
 * @since 1.0.0
 */
public abstract class Clause {

    private boolean notFlag;
    protected QueryType queryType;
    protected Field beanField;
    private Filter filter;

    public Clause(Field beanField, QueryType queryType, boolean notFlag) {
        this.beanField = beanField;
        this.filter = (Filter) beanField.getAnnotation(Filter.class);
        this.queryType = queryType;
        this.notFlag = notFlag;
    }

    public abstract ClauseBean getClause();

    protected abstract boolean isValid();

    //TODO for org.filterj.example ? OR :tableName
    public String getParamKey() {
        return filter.paramKey();
    }

    protected String[] getIgnoreValues() {
        return filter.ignoreValues();
    }

    protected String getColumnName() {
        String columnName = filter.column();
        if ("".equals(columnName)) {
            columnName = beanField.getName();
        }
        return columnName;
    }

    public String getFlag() {
        return notFlag ? " NOT " : " ";
    }

    public boolean isNotFlag() {
        return notFlag;
    }
}
