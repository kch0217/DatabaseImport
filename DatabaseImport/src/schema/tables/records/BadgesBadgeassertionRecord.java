/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.BadgesBadgeassertion;


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
public class BadgesBadgeassertionRecord extends UpdatableRecordImpl<BadgesBadgeassertionRecord> implements Record9<Integer, String, String, String, String, Timestamp, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 174495688;

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.data</code>.
     */
    public void setData(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.data</code>.
     */
    public String getData() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.backend</code>.
     */
    public void setBackend(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.backend</code>.
     */
    public String getBackend() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.image_url</code>.
     */
    public void setImageUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.image_url</code>.
     */
    public String getImageUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.assertion_url</code>.
     */
    public void setAssertionUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.assertion_url</code>.
     */
    public String getAssertionUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.badge_class_id</code>.
     */
    public void setBadgeClassId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.badge_class_id</code>.
     */
    public Integer getBadgeClassId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.badges_badgeassertion.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.badges_badgeassertion.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(8);
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
    public Row9<Integer, String, String, String, String, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Timestamp, Timestamp, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.BACKEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.ASSERTION_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.BADGE_CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return BadgesBadgeassertion.BADGES_BADGEASSERTION.USER_ID;
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
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBackend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAssertionUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getBadgeClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value2(String value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value3(String value) {
        setBackend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value4(String value) {
        setImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value5(String value) {
        setAssertionUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value6(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value7(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value8(Integer value) {
        setBadgeClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord value9(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertionRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Integer value8, Integer value9) {
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
     * Create a detached BadgesBadgeassertionRecord
     */
    public BadgesBadgeassertionRecord() {
        super(BadgesBadgeassertion.BADGES_BADGEASSERTION);
    }

    /**
     * Create a detached, initialised BadgesBadgeassertionRecord
     */
    public BadgesBadgeassertionRecord(Integer id, String data, String backend, String imageUrl, String assertionUrl, Timestamp modified, Timestamp created, Integer badgeClassId, Integer userId) {
        super(BadgesBadgeassertion.BADGES_BADGEASSERTION);

        set(0, id);
        set(1, data);
        set(2, backend);
        set(3, imageUrl);
        set(4, assertionUrl);
        set(5, modified);
        set(6, created);
        set(7, badgeClassId);
        set(8, userId);
    }
}