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

import schema.tables.ShoppingcartCouponredemption;


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
public class ShoppingcartCouponredemptionRecord extends UpdatableRecordImpl<ShoppingcartCouponredemptionRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 409807960;

    /**
     * Setter for <code>bitnami_edx.shoppingcart_couponredemption.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_couponredemption.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_couponredemption.coupon_id</code>.
     */
    public void setCouponId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_couponredemption.coupon_id</code>.
     */
    public Integer getCouponId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_couponredemption.order_id</code>.
     */
    public void setOrderId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_couponredemption.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_couponredemption.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_couponredemption.user_id</code>.
     */
    public Integer getUserId() {
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
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShoppingcartCouponredemption.SHOPPINGCART_COUPONREDEMPTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShoppingcartCouponredemption.SHOPPINGCART_COUPONREDEMPTION.COUPON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ShoppingcartCouponredemption.SHOPPINGCART_COUPONREDEMPTION.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShoppingcartCouponredemption.SHOPPINGCART_COUPONREDEMPTION.USER_ID;
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
    public Integer value2() {
        return getCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCouponredemptionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCouponredemptionRecord value2(Integer value) {
        setCouponId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCouponredemptionRecord value3(Integer value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCouponredemptionRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCouponredemptionRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached ShoppingcartCouponredemptionRecord
     */
    public ShoppingcartCouponredemptionRecord() {
        super(ShoppingcartCouponredemption.SHOPPINGCART_COUPONREDEMPTION);
    }

    /**
     * Create a detached, initialised ShoppingcartCouponredemptionRecord
     */
    public ShoppingcartCouponredemptionRecord(Integer id, Integer couponId, Integer orderId, Integer userId) {
        super(ShoppingcartCouponredemption.SHOPPINGCART_COUPONREDEMPTION);

        set(0, id);
        set(1, couponId);
        set(2, orderId);
        set(3, userId);
    }
}
