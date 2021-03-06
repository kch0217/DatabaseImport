/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.DjangoSiteRecord;


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
public class DjangoSite extends TableImpl<DjangoSiteRecord> {

    private static final long serialVersionUID = 91016094;

    /**
     * The reference instance of <code>bitnami_edx.django_site</code>
     */
    public static final DjangoSite DJANGO_SITE = new DjangoSite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjangoSiteRecord> getRecordType() {
        return DjangoSiteRecord.class;
    }

    /**
     * The column <code>bitnami_edx.django_site.id</code>.
     */
    public final TableField<DjangoSiteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_site.domain</code>.
     */
    public final TableField<DjangoSiteRecord, String> DOMAIN = createField("domain", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_site.name</code>.
     */
    public final TableField<DjangoSiteRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.django_site</code> table reference
     */
    public DjangoSite() {
        this("django_site", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.django_site</code> table reference
     */
    public DjangoSite(String alias) {
        this(alias, DJANGO_SITE);
    }

    private DjangoSite(String alias, Table<DjangoSiteRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjangoSite(String alias, Table<DjangoSiteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DjangoSiteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DJANGO_SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjangoSiteRecord> getPrimaryKey() {
        return Keys.KEY_DJANGO_SITE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjangoSiteRecord>> getKeys() {
        return Arrays.<UniqueKey<DjangoSiteRecord>>asList(Keys.KEY_DJANGO_SITE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoSite as(String alias) {
        return new DjangoSite(alias, this);
    }

    /**
     * Rename this table
     */
    public DjangoSite rename(String name) {
        return new DjangoSite(name, null);
    }
}
