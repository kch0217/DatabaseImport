/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.BadgesBadgeclass;


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
public class BadgesBadgeclassRecord extends UpdatableRecordImpl<BadgesBadgeclassRecord> implements Record9<Integer, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -48229830;

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.slug</code>.
     */
    public void setSlug(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.slug</code>.
     */
    public String getSlug() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.issuing_component</code>.
     */
    public void setIssuingComponent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.issuing_component</code>.
     */
    public String getIssuingComponent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.display_name</code>.
     */
    public void setDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.display_name</code>.
     */
    public String getDisplayName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.course_id</code>.
     */
    public void setCourseId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.criteria</code>.
     */
    public void setCriteria(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.criteria</code>.
     */
    public String getCriteria() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.mode</code>.
     */
    public void setMode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.mode</code>.
     */
    public String getMode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeclass.image</code>.
     */
    public void setImage(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeclass.image</code>.
     */
    public String getImage() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BadgesBadgeclass.BADGES_BADGECLASS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BadgesBadgeclass.BADGES_BADGECLASS.SLUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BadgesBadgeclass.BADGES_BADGECLASS.ISSUING_COMPONENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BadgesBadgeclass.BADGES_BADGECLASS.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BadgesBadgeclass.BADGES_BADGECLASS.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BadgesBadgeclass.BADGES_BADGECLASS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BadgesBadgeclass.BADGES_BADGECLASS.CRITERIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return BadgesBadgeclass.BADGES_BADGECLASS.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return BadgesBadgeclass.BADGES_BADGECLASS.IMAGE;
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
        return getSlug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIssuingComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCriteria();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value2(String value) {
        setSlug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value3(String value) {
        setIssuingComponent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value4(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value5(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value7(String value) {
        setCriteria(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value8(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord value9(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeclassRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BadgesBadgeclassRecord
     */
    public BadgesBadgeclassRecord() {
        super(BadgesBadgeclass.BADGES_BADGECLASS);
    }

    /**
     * Create a detached, initialised BadgesBadgeclassRecord
     */
    public BadgesBadgeclassRecord(Integer id, String slug, String issuingComponent, String displayName, String courseId, String description, String criteria, String mode, String image) {
        super(BadgesBadgeclass.BADGES_BADGECLASS);

        set(0, id);
        set(1, slug);
        set(2, issuingComponent);
        set(3, displayName);
        set(4, courseId);
        set(5, description);
        set(6, criteria);
        set(7, mode);
        set(8, image);
    }
}
