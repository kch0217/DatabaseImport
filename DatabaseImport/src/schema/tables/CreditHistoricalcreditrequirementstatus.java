/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.CreditHistoricalcreditrequirementstatusRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CreditHistoricalcreditrequirementstatus extends TableImpl<CreditHistoricalcreditrequirementstatusRecord> {

    private static final long serialVersionUID = 492528115;

    /**
     * The reference instance of <code>bitnami_edx.credit_historicalcreditrequirementstatus</code>
     */
    public static final CreditHistoricalcreditrequirementstatus CREDIT_HISTORICALCREDITREQUIREMENTSTATUS = new CreditHistoricalcreditrequirementstatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CreditHistoricalcreditrequirementstatusRecord> getRecordType() {
        return CreditHistoricalcreditrequirementstatusRecord.class;
    }

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.id</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.created</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.modified</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.username</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.status</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.reason</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.history_id</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Integer> HISTORY_ID = createField("history_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.history_date</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Timestamp> HISTORY_DATE = createField("history_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.history_type</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, String> HISTORY_TYPE = createField("history_type", org.jooq.impl.SQLDataType.VARCHAR.length(1).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.history_user_id</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Integer> HISTORY_USER_ID = createField("history_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.credit_historicalcreditrequirementstatus.requirement_id</code>.
     */
    public final TableField<CreditHistoricalcreditrequirementstatusRecord, Integer> REQUIREMENT_ID = createField("requirement_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.credit_historicalcreditrequirementstatus</code> table reference
     */
    public CreditHistoricalcreditrequirementstatus() {
        this("credit_historicalcreditrequirementstatus", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.credit_historicalcreditrequirementstatus</code> table reference
     */
    public CreditHistoricalcreditrequirementstatus(String alias) {
        this(alias, CREDIT_HISTORICALCREDITREQUIREMENTSTATUS);
    }

    private CreditHistoricalcreditrequirementstatus(String alias, Table<CreditHistoricalcreditrequirementstatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private CreditHistoricalcreditrequirementstatus(String alias, Table<CreditHistoricalcreditrequirementstatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BitnamiEdx.BITNAMI_EDX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CreditHistoricalcreditrequirementstatusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CREDIT_HISTORICALCREDITREQUIREMENTSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CreditHistoricalcreditrequirementstatusRecord> getPrimaryKey() {
        return Keys.KEY_CREDIT_HISTORICALCREDITREQUIREMENTSTATUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CreditHistoricalcreditrequirementstatusRecord>> getKeys() {
        return Arrays.<UniqueKey<CreditHistoricalcreditrequirementstatusRecord>>asList(Keys.KEY_CREDIT_HISTORICALCREDITREQUIREMENTSTATUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CreditHistoricalcreditrequirementstatusRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CreditHistoricalcreditrequirementstatusRecord, ?>>asList(Keys.CREDIT_HISTORIC_HISTORY_USER_ID_72B045B9192495CC_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditHistoricalcreditrequirementstatus as(String alias) {
        return new CreditHistoricalcreditrequirementstatus(alias, this);
    }

    /**
     * Rename this table
     */
    public CreditHistoricalcreditrequirementstatus rename(String name) {
        return new CreditHistoricalcreditrequirementstatus(name, null);
    }
}
