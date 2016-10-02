/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.ContentstoreVideouploadconfig;


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
public class ContentstoreVideouploadconfigRecord extends UpdatableRecordImpl<ContentstoreVideouploadconfigRecord> implements Record5<Integer, Timestamp, Byte, String, Integer> {

    private static final long serialVersionUID = -1249812642;

    /**
     * Setter for <code>bitnami_edx.contentstore_videouploadconfig.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.contentstore_videouploadconfig.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.contentstore_videouploadconfig.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.contentstore_videouploadconfig.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.contentstore_videouploadconfig.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.contentstore_videouploadconfig.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.contentstore_videouploadconfig.profile_whitelist</code>.
     */
    public void setProfileWhitelist(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.contentstore_videouploadconfig.profile_whitelist</code>.
     */
    public String getProfileWhitelist() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.contentstore_videouploadconfig.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.contentstore_videouploadconfig.changed_by_id</code>.
     */
    public Integer getChangedById() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Byte, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Byte, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG.PROFILE_WHITELIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG.CHANGED_BY_ID;
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
    public Timestamp value2() {
        return getChangeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProfileWhitelist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getChangedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentstoreVideouploadconfigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentstoreVideouploadconfigRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentstoreVideouploadconfigRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentstoreVideouploadconfigRecord value4(String value) {
        setProfileWhitelist(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentstoreVideouploadconfigRecord value5(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentstoreVideouploadconfigRecord values(Integer value1, Timestamp value2, Byte value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentstoreVideouploadconfigRecord
     */
    public ContentstoreVideouploadconfigRecord() {
        super(ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG);
    }

    /**
     * Create a detached, initialised ContentstoreVideouploadconfigRecord
     */
    public ContentstoreVideouploadconfigRecord(Integer id, Timestamp changeDate, Byte enabled, String profileWhitelist, Integer changedById) {
        super(ContentstoreVideouploadconfig.CONTENTSTORE_VIDEOUPLOADCONFIG);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, profileWhitelist);
        set(4, changedById);
    }
}
