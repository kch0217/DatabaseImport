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

import schema.tables.ShoppingcartCertificateitem;


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
public class ShoppingcartCertificateitemRecord extends UpdatableRecordImpl<ShoppingcartCertificateitemRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = 1885136888;

    /**
     * Setter for <code>bitnami_edx.shoppingcart_certificateitem.orderitem_ptr_id</code>.
     */
    public void setOrderitemPtrId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_certificateitem.orderitem_ptr_id</code>.
     */
    public Integer getOrderitemPtrId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_certificateitem.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_certificateitem.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_certificateitem.mode</code>.
     */
    public void setMode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_certificateitem.mode</code>.
     */
    public String getMode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_certificateitem.course_enrollment_id</code>.
     */
    public void setCourseEnrollmentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_certificateitem.course_enrollment_id</code>.
     */
    public Integer getCourseEnrollmentId() {
        return (Integer) get(3);
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
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShoppingcartCertificateitem.SHOPPINGCART_CERTIFICATEITEM.ORDERITEM_PTR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ShoppingcartCertificateitem.SHOPPINGCART_CERTIFICATEITEM.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ShoppingcartCertificateitem.SHOPPINGCART_CERTIFICATEITEM.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShoppingcartCertificateitem.SHOPPINGCART_CERTIFICATEITEM.COURSE_ENROLLMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrderitemPtrId();
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
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCourseEnrollmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCertificateitemRecord value1(Integer value) {
        setOrderitemPtrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCertificateitemRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCertificateitemRecord value3(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCertificateitemRecord value4(Integer value) {
        setCourseEnrollmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCertificateitemRecord values(Integer value1, String value2, String value3, Integer value4) {
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
     * Create a detached ShoppingcartCertificateitemRecord
     */
    public ShoppingcartCertificateitemRecord() {
        super(ShoppingcartCertificateitem.SHOPPINGCART_CERTIFICATEITEM);
    }

    /**
     * Create a detached, initialised ShoppingcartCertificateitemRecord
     */
    public ShoppingcartCertificateitemRecord(Integer orderitemPtrId, String courseId, String mode, Integer courseEnrollmentId) {
        super(ShoppingcartCertificateitem.SHOPPINGCART_CERTIFICATEITEM);

        set(0, orderitemPtrId);
        set(1, courseId);
        set(2, mode);
        set(3, courseEnrollmentId);
    }
}