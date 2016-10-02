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

import schema.tables.ShoppingcartCourseregcodeitemannotation;


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
public class ShoppingcartCourseregcodeitemannotationRecord extends UpdatableRecordImpl<ShoppingcartCourseregcodeitemannotationRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1238947553;

    /**
     * Setter for <code>bitnami_edx.shoppingcart_courseregcodeitemannotation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_courseregcodeitemannotation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_courseregcodeitemannotation.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_courseregcodeitemannotation.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_courseregcodeitemannotation.annotation</code>.
     */
    public void setAnnotation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_courseregcodeitemannotation.annotation</code>.
     */
    public String getAnnotation() {
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
        return ShoppingcartCourseregcodeitemannotation.SHOPPINGCART_COURSEREGCODEITEMANNOTATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ShoppingcartCourseregcodeitemannotation.SHOPPINGCART_COURSEREGCODEITEMANNOTATION.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ShoppingcartCourseregcodeitemannotation.SHOPPINGCART_COURSEREGCODEITEMANNOTATION.ANNOTATION;
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
        return getAnnotation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCourseregcodeitemannotationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCourseregcodeitemannotationRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCourseregcodeitemannotationRecord value3(String value) {
        setAnnotation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCourseregcodeitemannotationRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShoppingcartCourseregcodeitemannotationRecord
     */
    public ShoppingcartCourseregcodeitemannotationRecord() {
        super(ShoppingcartCourseregcodeitemannotation.SHOPPINGCART_COURSEREGCODEITEMANNOTATION);
    }

    /**
     * Create a detached, initialised ShoppingcartCourseregcodeitemannotationRecord
     */
    public ShoppingcartCourseregcodeitemannotationRecord(Integer id, String courseId, String annotation) {
        super(ShoppingcartCourseregcodeitemannotation.SHOPPINGCART_COURSEREGCODEITEMANNOTATION);

        set(0, id);
        set(1, courseId);
        set(2, annotation);
    }
}
