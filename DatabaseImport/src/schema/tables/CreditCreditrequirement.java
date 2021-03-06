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
import org.jooq.types.UInteger;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.CreditCreditrequirementRecord;


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
public class CreditCreditrequirement extends TableImpl<CreditCreditrequirementRecord> {

    private static final long serialVersionUID = 1994824886;

    /**
     * The reference instance of <code>bitnami_edx.credit_creditrequirement</code>
     */
    public static final CreditCreditrequirement CREDIT_CREDITREQUIREMENT = new CreditCreditrequirement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CreditCreditrequirementRecord> getRecordType() {
        return CreditCreditrequirementRecord.class;
    }

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.id</code>.
     */
    public final TableField<CreditCreditrequirementRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.created</code>.
     */
    public final TableField<CreditCreditrequirementRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.modified</code>.
     */
    public final TableField<CreditCreditrequirementRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.namespace</code>.
     */
    public final TableField<CreditCreditrequirementRecord, String> NAMESPACE = createField("namespace", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.name</code>.
     */
    public final TableField<CreditCreditrequirementRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.display_name</code>.
     */
    public final TableField<CreditCreditrequirementRecord, String> DISPLAY_NAME = createField("display_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.order</code>.
     */
    public final TableField<CreditCreditrequirementRecord, UInteger> ORDER = createField("order", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.criteria</code>.
     */
    public final TableField<CreditCreditrequirementRecord, String> CRITERIA = createField("criteria", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.active</code>.
     */
    public final TableField<CreditCreditrequirementRecord, Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.credit_creditrequirement.course_id</code>.
     */
    public final TableField<CreditCreditrequirementRecord, Integer> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.credit_creditrequirement</code> table reference
     */
    public CreditCreditrequirement() {
        this("credit_creditrequirement", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.credit_creditrequirement</code> table reference
     */
    public CreditCreditrequirement(String alias) {
        this(alias, CREDIT_CREDITREQUIREMENT);
    }

    private CreditCreditrequirement(String alias, Table<CreditCreditrequirementRecord> aliased) {
        this(alias, aliased, null);
    }

    private CreditCreditrequirement(String alias, Table<CreditCreditrequirementRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CreditCreditrequirementRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CREDIT_CREDITREQUIREMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CreditCreditrequirementRecord> getPrimaryKey() {
        return Keys.KEY_CREDIT_CREDITREQUIREMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CreditCreditrequirementRecord>> getKeys() {
        return Arrays.<UniqueKey<CreditCreditrequirementRecord>>asList(Keys.KEY_CREDIT_CREDITREQUIREMENT_PRIMARY, Keys.KEY_CREDIT_CREDITREQUIREMENT_CREDIT_CREDITREQUIREMENT_NAMESPACE_33039C83B3E69B8_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CreditCreditrequirementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CreditCreditrequirementRecord, ?>>asList(Keys.CREDIT_CRED_COURSE_ID_1C8FB9EBD295AE19_FK_CREDIT_CREDITCOURSE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequirement as(String alias) {
        return new CreditCreditrequirement(alias, this);
    }

    /**
     * Rename this table
     */
    public CreditCreditrequirement rename(String name) {
        return new CreditCreditrequirement(name, null);
    }
}
