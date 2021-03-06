/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CourseModesCoursemodesarchive;


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
public class CourseModesCoursemodesarchiveRecord extends UpdatableRecordImpl<CourseModesCoursemodesarchiveRecord> implements Record9<Integer, String, String, String, Integer, String, String, Date, Timestamp> {

    private static final long serialVersionUID = 402197032;

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.mode_slug</code>.
     */
    public void setModeSlug(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.mode_slug</code>.
     */
    public String getModeSlug() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.mode_display_name</code>.
     */
    public void setModeDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.mode_display_name</code>.
     */
    public String getModeDisplayName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.min_price</code>.
     */
    public void setMinPrice(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.min_price</code>.
     */
    public Integer getMinPrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.suggested_prices</code>.
     */
    public void setSuggestedPrices(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.suggested_prices</code>.
     */
    public String getSuggestedPrices() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.currency</code>.
     */
    public void setCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.currency</code>.
     */
    public String getCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.expiration_date</code>.
     */
    public void setExpirationDate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.expiration_date</code>.
     */
    public Date getExpirationDate() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemodesarchive.expiration_datetime</code>.
     */
    public void setExpirationDatetime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemodesarchive.expiration_datetime</code>.
     */
    public Timestamp getExpirationDatetime() {
        return (Timestamp) get(8);
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
    public Row9<Integer, String, String, String, Integer, String, String, Date, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, Integer, String, String, Date, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.MODE_SLUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.MODE_DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.MIN_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.SUGGESTED_PRICES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.EXPIRATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE.EXPIRATION_DATETIME;
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
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModeSlug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getModeDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getMinPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSuggestedPrices();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getExpirationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getExpirationDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value3(String value) {
        setModeSlug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value4(String value) {
        setModeDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value5(Integer value) {
        setMinPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value6(String value) {
        setSuggestedPrices(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value7(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value8(Date value) {
        setExpirationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord value9(Timestamp value) {
        setExpirationDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodesarchiveRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, String value7, Date value8, Timestamp value9) {
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
     * Create a detached CourseModesCoursemodesarchiveRecord
     */
    public CourseModesCoursemodesarchiveRecord() {
        super(CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE);
    }

    /**
     * Create a detached, initialised CourseModesCoursemodesarchiveRecord
     */
    public CourseModesCoursemodesarchiveRecord(Integer id, String courseId, String modeSlug, String modeDisplayName, Integer minPrice, String suggestedPrices, String currency, Date expirationDate, Timestamp expirationDatetime) {
        super(CourseModesCoursemodesarchive.COURSE_MODES_COURSEMODESARCHIVE);

        set(0, id);
        set(1, courseId);
        set(2, modeSlug);
        set(3, modeDisplayName);
        set(4, minPrice);
        set(5, suggestedPrices);
        set(6, currency);
        set(7, expirationDate);
        set(8, expirationDatetime);
    }
}
