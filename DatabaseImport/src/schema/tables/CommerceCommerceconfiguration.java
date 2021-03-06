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
import schema.tables.records.CommerceCommerceconfigurationRecord;


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
public class CommerceCommerceconfiguration extends TableImpl<CommerceCommerceconfigurationRecord> {

    private static final long serialVersionUID = -1904721172;

    /**
     * The reference instance of <code>bitnami_edx.commerce_commerceconfiguration</code>
     */
    public static final CommerceCommerceconfiguration COMMERCE_COMMERCECONFIGURATION = new CommerceCommerceconfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommerceCommerceconfigurationRecord> getRecordType() {
        return CommerceCommerceconfigurationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.commerce_commerceconfiguration.id</code>.
     */
    public final TableField<CommerceCommerceconfigurationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.commerce_commerceconfiguration.change_date</code>.
     */
    public final TableField<CommerceCommerceconfigurationRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.commerce_commerceconfiguration.enabled</code>.
     */
    public final TableField<CommerceCommerceconfigurationRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.commerce_commerceconfiguration.checkout_on_ecommerce_service</code>.
     */
    public final TableField<CommerceCommerceconfigurationRecord, Byte> CHECKOUT_ON_ECOMMERCE_SERVICE = createField("checkout_on_ecommerce_service", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.commerce_commerceconfiguration.single_course_checkout_page</code>.
     */
    public final TableField<CommerceCommerceconfigurationRecord, String> SINGLE_COURSE_CHECKOUT_PAGE = createField("single_course_checkout_page", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.commerce_commerceconfiguration.changed_by_id</code>.
     */
    public final TableField<CommerceCommerceconfigurationRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.commerce_commerceconfiguration</code> table reference
     */
    public CommerceCommerceconfiguration() {
        this("commerce_commerceconfiguration", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.commerce_commerceconfiguration</code> table reference
     */
    public CommerceCommerceconfiguration(String alias) {
        this(alias, COMMERCE_COMMERCECONFIGURATION);
    }

    private CommerceCommerceconfiguration(String alias, Table<CommerceCommerceconfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommerceCommerceconfiguration(String alias, Table<CommerceCommerceconfigurationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CommerceCommerceconfigurationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMERCE_COMMERCECONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommerceCommerceconfigurationRecord> getPrimaryKey() {
        return Keys.KEY_COMMERCE_COMMERCECONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommerceCommerceconfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<CommerceCommerceconfigurationRecord>>asList(Keys.KEY_COMMERCE_COMMERCECONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CommerceCommerceconfigurationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CommerceCommerceconfigurationRecord, ?>>asList(Keys.COMMERCE_COMMERCE_CHANGED_BY_ID_7441951D1C97C1D7_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommerceCommerceconfiguration as(String alias) {
        return new CommerceCommerceconfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    public CommerceCommerceconfiguration rename(String name) {
        return new CommerceCommerceconfiguration(name, null);
    }
}
