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
import schema.tables.records.StaticReplaceAssetbaseurlconfigRecord;


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
public class StaticReplaceAssetbaseurlconfig extends TableImpl<StaticReplaceAssetbaseurlconfigRecord> {

    private static final long serialVersionUID = 2073717293;

    /**
     * The reference instance of <code>bitnami_edx.static_replace_assetbaseurlconfig</code>
     */
    public static final StaticReplaceAssetbaseurlconfig STATIC_REPLACE_ASSETBASEURLCONFIG = new StaticReplaceAssetbaseurlconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaticReplaceAssetbaseurlconfigRecord> getRecordType() {
        return StaticReplaceAssetbaseurlconfigRecord.class;
    }

    /**
     * The column <code>bitnami_edx.static_replace_assetbaseurlconfig.id</code>.
     */
    public final TableField<StaticReplaceAssetbaseurlconfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.static_replace_assetbaseurlconfig.change_date</code>.
     */
    public final TableField<StaticReplaceAssetbaseurlconfigRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.static_replace_assetbaseurlconfig.enabled</code>.
     */
    public final TableField<StaticReplaceAssetbaseurlconfigRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.static_replace_assetbaseurlconfig.base_url</code>.
     */
    public final TableField<StaticReplaceAssetbaseurlconfigRecord, String> BASE_URL = createField("base_url", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.static_replace_assetbaseurlconfig.changed_by_id</code>.
     */
    public final TableField<StaticReplaceAssetbaseurlconfigRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.static_replace_assetbaseurlconfig</code> table reference
     */
    public StaticReplaceAssetbaseurlconfig() {
        this("static_replace_assetbaseurlconfig", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.static_replace_assetbaseurlconfig</code> table reference
     */
    public StaticReplaceAssetbaseurlconfig(String alias) {
        this(alias, STATIC_REPLACE_ASSETBASEURLCONFIG);
    }

    private StaticReplaceAssetbaseurlconfig(String alias, Table<StaticReplaceAssetbaseurlconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private StaticReplaceAssetbaseurlconfig(String alias, Table<StaticReplaceAssetbaseurlconfigRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StaticReplaceAssetbaseurlconfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STATIC_REPLACE_ASSETBASEURLCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StaticReplaceAssetbaseurlconfigRecord> getPrimaryKey() {
        return Keys.KEY_STATIC_REPLACE_ASSETBASEURLCONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StaticReplaceAssetbaseurlconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<StaticReplaceAssetbaseurlconfigRecord>>asList(Keys.KEY_STATIC_REPLACE_ASSETBASEURLCONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StaticReplaceAssetbaseurlconfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StaticReplaceAssetbaseurlconfigRecord, ?>>asList(Keys.STATIC_REPLACE_AS_CHANGED_BY_ID_796C2E5B1BEE7027_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticReplaceAssetbaseurlconfig as(String alias) {
        return new StaticReplaceAssetbaseurlconfig(alias, this);
    }

    /**
     * Rename this table
     */
    public StaticReplaceAssetbaseurlconfig rename(String name) {
        return new StaticReplaceAssetbaseurlconfig(name, null);
    }
}
