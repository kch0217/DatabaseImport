/**
 * This class is generated by jOOQ
 */
package schema.tables;


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
import schema.tables.records.BulkEmailOptoutRecord;


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
public class BulkEmailOptout extends TableImpl<BulkEmailOptoutRecord> {

    private static final long serialVersionUID = 360784039;

    /**
     * The reference instance of <code>bitnami_edx.bulk_email_optout</code>
     */
    public static final BulkEmailOptout BULK_EMAIL_OPTOUT = new BulkEmailOptout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BulkEmailOptoutRecord> getRecordType() {
        return BulkEmailOptoutRecord.class;
    }

    /**
     * The column <code>bitnami_edx.bulk_email_optout.id</code>.
     */
    public final TableField<BulkEmailOptoutRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_optout.course_id</code>.
     */
    public final TableField<BulkEmailOptoutRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_optout.user_id</code>.
     */
    public final TableField<BulkEmailOptoutRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.bulk_email_optout</code> table reference
     */
    public BulkEmailOptout() {
        this("bulk_email_optout", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.bulk_email_optout</code> table reference
     */
    public BulkEmailOptout(String alias) {
        this(alias, BULK_EMAIL_OPTOUT);
    }

    private BulkEmailOptout(String alias, Table<BulkEmailOptoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private BulkEmailOptout(String alias, Table<BulkEmailOptoutRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BulkEmailOptoutRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BULK_EMAIL_OPTOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BulkEmailOptoutRecord> getPrimaryKey() {
        return Keys.KEY_BULK_EMAIL_OPTOUT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BulkEmailOptoutRecord>> getKeys() {
        return Arrays.<UniqueKey<BulkEmailOptoutRecord>>asList(Keys.KEY_BULK_EMAIL_OPTOUT_PRIMARY, Keys.KEY_BULK_EMAIL_OPTOUT_BULK_EMAIL_OPTOUT_USER_ID_7710CB544AAFA8A_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BulkEmailOptoutRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BulkEmailOptoutRecord, ?>>asList(Keys.BULK_EMAIL_OPTOUT_USER_ID_5D6E4A037BCF14BD_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailOptout as(String alias) {
        return new BulkEmailOptout(alias, this);
    }

    /**
     * Rename this table
     */
    public BulkEmailOptout rename(String name) {
        return new BulkEmailOptout(name, null);
    }
}
