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
import schema.tables.records.XblockDjangoXblockdisableconfigRecord;


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
public class XblockDjangoXblockdisableconfig extends TableImpl<XblockDjangoXblockdisableconfigRecord> {

    private static final long serialVersionUID = 1876598399;

    /**
     * The reference instance of <code>bitnami_edx.xblock_django_xblockdisableconfig</code>
     */
    public static final XblockDjangoXblockdisableconfig XBLOCK_DJANGO_XBLOCKDISABLECONFIG = new XblockDjangoXblockdisableconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XblockDjangoXblockdisableconfigRecord> getRecordType() {
        return XblockDjangoXblockdisableconfigRecord.class;
    }

    /**
     * The column <code>bitnami_edx.xblock_django_xblockdisableconfig.id</code>.
     */
    public final TableField<XblockDjangoXblockdisableconfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.xblock_django_xblockdisableconfig.change_date</code>.
     */
    public final TableField<XblockDjangoXblockdisableconfigRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.xblock_django_xblockdisableconfig.enabled</code>.
     */
    public final TableField<XblockDjangoXblockdisableconfigRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.xblock_django_xblockdisableconfig.disabled_blocks</code>.
     */
    public final TableField<XblockDjangoXblockdisableconfigRecord, String> DISABLED_BLOCKS = createField("disabled_blocks", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.xblock_django_xblockdisableconfig.changed_by_id</code>.
     */
    public final TableField<XblockDjangoXblockdisableconfigRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.xblock_django_xblockdisableconfig.disabled_create_blocks</code>.
     */
    public final TableField<XblockDjangoXblockdisableconfigRecord, String> DISABLED_CREATE_BLOCKS = createField("disabled_create_blocks", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.xblock_django_xblockdisableconfig</code> table reference
     */
    public XblockDjangoXblockdisableconfig() {
        this("xblock_django_xblockdisableconfig", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.xblock_django_xblockdisableconfig</code> table reference
     */
    public XblockDjangoXblockdisableconfig(String alias) {
        this(alias, XBLOCK_DJANGO_XBLOCKDISABLECONFIG);
    }

    private XblockDjangoXblockdisableconfig(String alias, Table<XblockDjangoXblockdisableconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private XblockDjangoXblockdisableconfig(String alias, Table<XblockDjangoXblockdisableconfigRecord> aliased, Field<?>[] parameters) {
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
    public Identity<XblockDjangoXblockdisableconfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_XBLOCK_DJANGO_XBLOCKDISABLECONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XblockDjangoXblockdisableconfigRecord> getPrimaryKey() {
        return Keys.KEY_XBLOCK_DJANGO_XBLOCKDISABLECONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XblockDjangoXblockdisableconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<XblockDjangoXblockdisableconfigRecord>>asList(Keys.KEY_XBLOCK_DJANGO_XBLOCKDISABLECONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<XblockDjangoXblockdisableconfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<XblockDjangoXblockdisableconfigRecord, ?>>asList(Keys.XBLOCK_DJANGO_XBL_CHANGED_BY_ID_429BDCCB9201831C_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XblockDjangoXblockdisableconfig as(String alias) {
        return new XblockDjangoXblockdisableconfig(alias, this);
    }

    /**
     * Rename this table
     */
    public XblockDjangoXblockdisableconfig rename(String name) {
        return new XblockDjangoXblockdisableconfig(name, null);
    }
}
