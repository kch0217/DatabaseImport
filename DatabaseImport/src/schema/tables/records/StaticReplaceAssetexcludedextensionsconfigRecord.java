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

import schema.tables.StaticReplaceAssetexcludedextensionsconfig;


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
public class StaticReplaceAssetexcludedextensionsconfigRecord extends UpdatableRecordImpl<StaticReplaceAssetexcludedextensionsconfigRecord> implements Record5<Integer, Timestamp, Byte, String, Integer> {

    private static final long serialVersionUID = 1895160015;

    /**
     * Setter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.excluded_extensions</code>.
     */
    public void setExcludedExtensions(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.excluded_extensions</code>.
     */
    public String getExcludedExtensions() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.static_replace_assetexcludedextensionsconfig.changed_by_id</code>.
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
        return StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG.EXCLUDED_EXTENSIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG.CHANGED_BY_ID;
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
        return getExcludedExtensions();
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
    public StaticReplaceAssetexcludedextensionsconfigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticReplaceAssetexcludedextensionsconfigRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticReplaceAssetexcludedextensionsconfigRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticReplaceAssetexcludedextensionsconfigRecord value4(String value) {
        setExcludedExtensions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticReplaceAssetexcludedextensionsconfigRecord value5(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticReplaceAssetexcludedextensionsconfigRecord values(Integer value1, Timestamp value2, Byte value3, String value4, Integer value5) {
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
     * Create a detached StaticReplaceAssetexcludedextensionsconfigRecord
     */
    public StaticReplaceAssetexcludedextensionsconfigRecord() {
        super(StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG);
    }

    /**
     * Create a detached, initialised StaticReplaceAssetexcludedextensionsconfigRecord
     */
    public StaticReplaceAssetexcludedextensionsconfigRecord(Integer id, Timestamp changeDate, Byte enabled, String excludedExtensions, Integer changedById) {
        super(StaticReplaceAssetexcludedextensionsconfig.STATIC_REPLACE_ASSETEXCLUDEDEXTENSIONSCONFIG);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, excludedExtensions);
        set(4, changedById);
    }
}