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
import schema.tables.records.CorsCsrfXdomainproxyconfigurationRecord;


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
public class CorsCsrfXdomainproxyconfiguration extends TableImpl<CorsCsrfXdomainproxyconfigurationRecord> {

    private static final long serialVersionUID = -1513283876;

    /**
     * The reference instance of <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration</code>
     */
    public static final CorsCsrfXdomainproxyconfiguration CORS_CSRF_XDOMAINPROXYCONFIGURATION = new CorsCsrfXdomainproxyconfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CorsCsrfXdomainproxyconfigurationRecord> getRecordType() {
        return CorsCsrfXdomainproxyconfigurationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration.id</code>.
     */
    public final TableField<CorsCsrfXdomainproxyconfigurationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration.change_date</code>.
     */
    public final TableField<CorsCsrfXdomainproxyconfigurationRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration.enabled</code>.
     */
    public final TableField<CorsCsrfXdomainproxyconfigurationRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration.whitelist</code>.
     */
    public final TableField<CorsCsrfXdomainproxyconfigurationRecord, String> WHITELIST = createField("whitelist", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration.changed_by_id</code>.
     */
    public final TableField<CorsCsrfXdomainproxyconfigurationRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration</code> table reference
     */
    public CorsCsrfXdomainproxyconfiguration() {
        this("cors_csrf_xdomainproxyconfiguration", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.cors_csrf_xdomainproxyconfiguration</code> table reference
     */
    public CorsCsrfXdomainproxyconfiguration(String alias) {
        this(alias, CORS_CSRF_XDOMAINPROXYCONFIGURATION);
    }

    private CorsCsrfXdomainproxyconfiguration(String alias, Table<CorsCsrfXdomainproxyconfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private CorsCsrfXdomainproxyconfiguration(String alias, Table<CorsCsrfXdomainproxyconfigurationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CorsCsrfXdomainproxyconfigurationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CORS_CSRF_XDOMAINPROXYCONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CorsCsrfXdomainproxyconfigurationRecord> getPrimaryKey() {
        return Keys.KEY_CORS_CSRF_XDOMAINPROXYCONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CorsCsrfXdomainproxyconfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<CorsCsrfXdomainproxyconfigurationRecord>>asList(Keys.KEY_CORS_CSRF_XDOMAINPROXYCONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CorsCsrfXdomainproxyconfigurationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CorsCsrfXdomainproxyconfigurationRecord, ?>>asList(Keys.CORS_CSRF_XDOMAIN_CHANGED_BY_ID_31E52CD1BCEF52C4_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CorsCsrfXdomainproxyconfiguration as(String alias) {
        return new CorsCsrfXdomainproxyconfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    public CorsCsrfXdomainproxyconfiguration rename(String name) {
        return new CorsCsrfXdomainproxyconfiguration(name, null);
    }
}