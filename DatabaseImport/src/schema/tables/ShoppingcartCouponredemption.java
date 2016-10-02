/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.ShoppingcartCouponredemptionRecord;


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
public class ShoppingcartCouponredemption extends TableImpl<ShoppingcartCouponredemptionRecord> {

    private static final long serialVersionUID = -1215716588;

    /**
     * The reference instance of <code>bitnami_edx.shoppingcart_couponredemption</code>
     */
    public static final ShoppingcartCouponredemption SHOPPINGCART_COUPONREDEMPTION = new ShoppingcartCouponredemption();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingcartCouponredemptionRecord> getRecordType() {
        return ShoppingcartCouponredemptionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.shoppingcart_couponredemption.id</code>.
     */
    public final TableField<ShoppingcartCouponredemptionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_couponredemption.coupon_id</code>.
     */
    public final TableField<ShoppingcartCouponredemptionRecord, Integer> COUPON_ID = createField("coupon_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_couponredemption.order_id</code>.
     */
    public final TableField<ShoppingcartCouponredemptionRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_couponredemption.user_id</code>.
     */
    public final TableField<ShoppingcartCouponredemptionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.shoppingcart_couponredemption</code> table reference
     */
    public ShoppingcartCouponredemption() {
        this("shoppingcart_couponredemption", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.shoppingcart_couponredemption</code> table reference
     */
    public ShoppingcartCouponredemption(String alias) {
        this(alias, SHOPPINGCART_COUPONREDEMPTION);
    }

    private ShoppingcartCouponredemption(String alias, Table<ShoppingcartCouponredemptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingcartCouponredemption(String alias, Table<ShoppingcartCouponredemptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BitnamiEdx.BITNAMI_EDX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShoppingcartCouponredemptionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOPPINGCART_COUPONREDEMPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShoppingcartCouponredemptionRecord> getPrimaryKey() {
        return Keys.KEY_SHOPPINGCART_COUPONREDEMPTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShoppingcartCouponredemptionRecord>> getKeys() {
        return Arrays.<UniqueKey<ShoppingcartCouponredemptionRecord>>asList(Keys.KEY_SHOPPINGCART_COUPONREDEMPTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShoppingcartCouponredemptionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShoppingcartCouponredemptionRecord, ?>>asList(Keys.SHOPPINGCAR_COUPON_ID_1AFA016627AC44BB_FK_SHOPPINGCART_COUPON_ID, Keys.SHOPPINGCART__ORDER_ID_5BA031C3BFAF643A_FK_SHOPPINGCART_ORDER_ID, Keys.SHOPPINGCART_COUPONREDEMP_USER_ID_F5B814B7D92666_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCouponredemption as(String alias) {
        return new ShoppingcartCouponredemption(alias, this);
    }

    /**
     * Rename this table
     */
    public ShoppingcartCouponredemption rename(String name) {
        return new ShoppingcartCouponredemption(name, null);
    }
}