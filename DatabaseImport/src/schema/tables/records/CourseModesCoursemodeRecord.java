/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CourseModesCoursemode;


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
public class CourseModesCoursemodeRecord extends UpdatableRecordImpl<CourseModesCoursemodeRecord> implements Record12<Integer, String, String, String, Integer, String, Timestamp, Date, String, String, String, Byte> {

    private static final long serialVersionUID = -2063335078;

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.mode_slug</code>.
     */
    public void setModeSlug(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.mode_slug</code>.
     */
    public String getModeSlug() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.mode_display_name</code>.
     */
    public void setModeDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.mode_display_name</code>.
     */
    public String getModeDisplayName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.min_price</code>.
     */
    public void setMinPrice(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.min_price</code>.
     */
    public Integer getMinPrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.currency</code>.
     */
    public void setCurrency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.currency</code>.
     */
    public String getCurrency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.expiration_datetime</code>.
     */
    public void setExpirationDatetime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.expiration_datetime</code>.
     */
    public Timestamp getExpirationDatetime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.expiration_date</code>.
     */
    public void setExpirationDate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.expiration_date</code>.
     */
    public Date getExpirationDate() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.suggested_prices</code>.
     */
    public void setSuggestedPrices(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.suggested_prices</code>.
     */
    public String getSuggestedPrices() {
        return (String) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.sku</code>.
     */
    public void setSku(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.sku</code>.
     */
    public String getSku() {
        return (String) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.course_modes_coursemode.expiration_datetime_is_explicit</code>.
     */
    public void setExpirationDatetimeIsExplicit(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_modes_coursemode.expiration_datetime_is_explicit</code>.
     */
    public Byte getExpirationDatetimeIsExplicit() {
        return (Byte) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Integer, String, Timestamp, Date, String, String, String, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Integer, String, Timestamp, Date, String, String, String, Byte> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.MODE_SLUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.MODE_DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.MIN_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.EXPIRATION_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.EXPIRATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.SUGGESTED_PRICES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.SKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return CourseModesCoursemode.COURSE_MODES_COURSEMODE.EXPIRATION_DATETIME_IS_EXPLICIT;
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
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getExpirationDatetime();
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
    public String value9() {
        return getSuggestedPrices();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getExpirationDatetimeIsExplicit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value3(String value) {
        setModeSlug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value4(String value) {
        setModeDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value5(Integer value) {
        setMinPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value6(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value7(Timestamp value) {
        setExpirationDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value8(Date value) {
        setExpirationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value9(String value) {
        setSuggestedPrices(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value10(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value11(String value) {
        setSku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord value12(Byte value) {
        setExpirationDatetimeIsExplicit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemodeRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, Timestamp value7, Date value8, String value9, String value10, String value11, Byte value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CourseModesCoursemodeRecord
     */
    public CourseModesCoursemodeRecord() {
        super(CourseModesCoursemode.COURSE_MODES_COURSEMODE);
    }

    /**
     * Create a detached, initialised CourseModesCoursemodeRecord
     */
    public CourseModesCoursemodeRecord(Integer id, String courseId, String modeSlug, String modeDisplayName, Integer minPrice, String currency, Timestamp expirationDatetime, Date expirationDate, String suggestedPrices, String description, String sku, Byte expirationDatetimeIsExplicit) {
        super(CourseModesCoursemode.COURSE_MODES_COURSEMODE);

        set(0, id);
        set(1, courseId);
        set(2, modeSlug);
        set(3, modeDisplayName);
        set(4, minPrice);
        set(5, currency);
        set(6, expirationDatetime);
        set(7, expirationDate);
        set(8, suggestedPrices);
        set(9, description);
        set(10, sku);
        set(11, expirationDatetimeIsExplicit);
    }
}
