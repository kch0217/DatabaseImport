/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.ShoppingcartPaidcourseregistrationRecord;


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
public class ShoppingcartPaidcourseregistration extends TableImpl<ShoppingcartPaidcourseregistrationRecord> {

    private static final long serialVersionUID = 1716696160;

    /**
     * The reference instance of <code>bitnami_edx.shoppingcart_paidcourseregistration</code>
     */
    public static final ShoppingcartPaidcourseregistration SHOPPINGCART_PAIDCOURSEREGISTRATION = new ShoppingcartPaidcourseregistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingcartPaidcourseregistrationRecord> getRecordType() {
        return ShoppingcartPaidcourseregistrationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistration.orderitem_ptr_id</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationRecord, Integer> ORDERITEM_PTR_ID = createField("orderitem_ptr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistration.course_id</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistration.mode</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationRecord, String> MODE = createField("mode", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistration.course_enrollment_id</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationRecord, Integer> COURSE_ENROLLMENT_ID = createField("course_enrollment_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.shoppingcart_paidcourseregistration</code> table reference
     */
    public ShoppingcartPaidcourseregistration() {
        this("shoppingcart_paidcourseregistration", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.shoppingcart_paidcourseregistration</code> table reference
     */
    public ShoppingcartPaidcourseregistration(String alias) {
        this(alias, SHOPPINGCART_PAIDCOURSEREGISTRATION);
    }

    private ShoppingcartPaidcourseregistration(String alias, Table<ShoppingcartPaidcourseregistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingcartPaidcourseregistration(String alias, Table<ShoppingcartPaidcourseregistrationRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ShoppingcartPaidcourseregistrationRecord> getPrimaryKey() {
        return Keys.KEY_SHOPPINGCART_PAIDCOURSEREGISTRATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShoppingcartPaidcourseregistrationRecord>> getKeys() {
        return Arrays.<UniqueKey<ShoppingcartPaidcourseregistrationRecord>>asList(Keys.KEY_SHOPPINGCART_PAIDCOURSEREGISTRATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShoppingcartPaidcourseregistrationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShoppingcartPaidcourseregistrationRecord, ?>>asList(Keys.S_ORDERITEM_PTR_ID_3C991ACC5D644F13_FK_SHOPPINGCART_ORDERITEM_ID, Keys.D8D681D7E59C2DCF2EA55E7E5E06553D);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartPaidcourseregistration as(String alias) {
        return new ShoppingcartPaidcourseregistration(alias, this);
    }

    /**
     * Rename this table
     */
    public ShoppingcartPaidcourseregistration rename(String name) {
        return new ShoppingcartPaidcourseregistration(name, null);
    }
}
