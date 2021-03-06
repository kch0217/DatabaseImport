/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.BadgesCoursecompleteimageconfiguration;


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
public class BadgesCoursecompleteimageconfigurationRecord extends UpdatableRecordImpl<BadgesCoursecompleteimageconfigurationRecord> implements Record4<Integer, String, String, Byte> {

    private static final long serialVersionUID = -546987640;

    /**
     * Setter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.mode</code>.
     */
    public void setMode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.mode</code>.
     */
    public String getMode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.icon</code>.
     */
    public void setIcon(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.icon</code>.
     */
    public String getIcon() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.default</code>.
     */
    public void setDefault(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_coursecompleteimageconfiguration.default</code>.
     */
    public Byte getDefault() {
        return (Byte) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BadgesCoursecompleteimageconfiguration.BADGES_COURSECOMPLETEIMAGECONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BadgesCoursecompleteimageconfiguration.BADGES_COURSECOMPLETEIMAGECONFIGURATION.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BadgesCoursecompleteimageconfiguration.BADGES_COURSECOMPLETEIMAGECONFIGURATION.ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return BadgesCoursecompleteimageconfiguration.BADGES_COURSECOMPLETEIMAGECONFIGURATION.DEFAULT;
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
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesCoursecompleteimageconfigurationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesCoursecompleteimageconfigurationRecord value2(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesCoursecompleteimageconfigurationRecord value3(String value) {
        setIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesCoursecompleteimageconfigurationRecord value4(Byte value) {
        setDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesCoursecompleteimageconfigurationRecord values(Integer value1, String value2, String value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BadgesCoursecompleteimageconfigurationRecord
     */
    public BadgesCoursecompleteimageconfigurationRecord() {
        super(BadgesCoursecompleteimageconfiguration.BADGES_COURSECOMPLETEIMAGECONFIGURATION);
    }

    /**
     * Create a detached, initialised BadgesCoursecompleteimageconfigurationRecord
     */
    public BadgesCoursecompleteimageconfigurationRecord(Integer id, String mode, String icon, Byte default_) {
        super(BadgesCoursecompleteimageconfiguration.BADGES_COURSECOMPLETEIMAGECONFIGURATION);

        set(0, id);
        set(1, mode);
        set(2, icon);
        set(3, default_);
    }
}
