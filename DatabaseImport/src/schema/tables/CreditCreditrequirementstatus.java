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
import schema.tables.records.CreditCreditrequirementstatusRecord;


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
public class CreditCreditrequirementstatus extends TableImpl<CreditCreditrequirementstatusRecord> {

    private static final long serialVersionUID = -501433125;

    /**
     * The reference instance of <code>bitnami_edx.credit_creditrequirementstatus</code>
     */
    public static final CreditCreditrequirementstatus CREDIT_CREDITREQUIREMENTSTATUS = new CreditCreditrequirementstatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CreditCreditrequirementstatusRecord> getRecordType() {
        return CreditCreditrequirementstatusRecord.class;
    }

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.id</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.created</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.modified</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.username</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.status</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.reason</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirementstatus.requirement_id</code>.
     */
    public final TableField<CreditCreditrequirementstatusRecord, Integer> REQUIREMENT_ID = createField("requirement_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.credit_creditrequirementstatus</code> table reference
     */
    public CreditCreditrequirementstatus() {
        this("credit_creditrequirementstatus", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.credit_creditrequirementstatus</code> table reference
     */
    public CreditCreditrequirementstatus(String alias) {
        this(alias, CREDIT_CREDITREQUIREMENTSTATUS);
    }

    private CreditCreditrequirementstatus(String alias, Table<CreditCreditrequirementstatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private CreditCreditrequirementstatus(String alias, Table<CreditCreditrequirementstatusRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CreditCreditrequirementstatusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CREDIT_CREDITREQUIREMENTSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CreditCreditrequirementstatusRecord> getPrimaryKey() {
        return Keys.KEY_CREDIT_CREDITREQUIREMENTSTATUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CreditCreditrequirementstatusRecord>> getKeys() {
        return Arrays.<UniqueKey<CreditCreditrequirementstatusRecord>>asList(Keys.KEY_CREDIT_CREDITREQUIREMENTSTATUS_PRIMARY, Keys.KEY_CREDIT_CREDITREQUIREMENTSTATUS_CREDIT_CREDITREQUIREMENTSTATUS_USERNAME_67DCB69EBF779E3B_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CreditCreditrequirementstatusRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CreditCreditrequirementstatusRecord, ?>>asList(Keys.C_REQUIREMENT_ID_3896AA6DB214F84A_FK_CREDIT_CREDITREQUIREMENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequirementstatus as(String alias) {
        return new CreditCreditrequirementstatus(alias, this);
    }

    /**
     * Rename this table
     */
    public CreditCreditrequirementstatus rename(String name) {
        return new CreditCreditrequirementstatus(name, null);
    }
}
