/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.DjangoSite;


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
public class DjangoSiteRecord extends UpdatableRecordImpl<DjangoSiteRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1383043040;

    /**
     * Setter for <code>bitnami_edx.django_site.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_site.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.django_site.domain</code>.
     */
    public void setDomain(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_site.domain</code>.
     */
    public String getDomain() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.django_site.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_site.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DjangoSite.DJANGO_SITE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DjangoSite.DJANGO_SITE.DOMAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DjangoSite.DJANGO_SITE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoSiteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoSiteRecord value2(String value) {
        setDomain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoSiteRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoSiteRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjangoSiteRecord
     */
    public DjangoSiteRecord() {
        super(DjangoSite.DJANGO_SITE);
    }

    /**
     * Create a detached, initialised DjangoSiteRecord
     */
    public DjangoSiteRecord(Integer id, String domain, String name) {
        super(DjangoSite.DJANGO_SITE);

        set(0, id);
        set(1, domain);
        set(2, name);
    }
}