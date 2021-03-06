/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.ShoppingcartPaidcourseregistrationannotationRecord;


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
public class ShoppingcartPaidcourseregistrationannotation extends TableImpl<ShoppingcartPaidcourseregistrationannotationRecord> {

    private static final long serialVersionUID = 839758569;

    /**
     * The reference instance of <code>bitnami_edx.shoppingcart_paidcourseregistrationannotation</code>
     */
    public static final ShoppingcartPaidcourseregistrationannotation SHOPPINGCART_PAIDCOURSEREGISTRATIONANNOTATION = new ShoppingcartPaidcourseregistrationannotation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingcartPaidcourseregistrationannotationRecord> getRecordType() {
        return ShoppingcartPaidcourseregistrationannotationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistrationannotation.id</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationannotationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistrationannotation.course_id</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationannotationRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_paidcourseregistrationannotation.annotation</code>.
     */
    public final TableField<ShoppingcartPaidcourseregistrationannotationRecord, String> ANNOTATION = createField("annotation", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>bitnami_edx.shoppingcart_paidcourseregistrationannotation</code> table reference
     */
    public ShoppingcartPaidcourseregistrationannotation() {
        this("shoppingcart_paidcourseregistrationannotation", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.shoppingcart_paidcourseregistrationannotation</code> table reference
     */
    public ShoppingcartPaidcourseregistrationannotation(String alias) {
        this(alias, SHOPPINGCART_PAIDCOURSEREGISTRATIONANNOTATION);
    }

    private ShoppingcartPaidcourseregistrationannotation(String alias, Table<ShoppingcartPaidcourseregistrationannotationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingcartPaidcourseregistrationannotation(String alias, Table<ShoppingcartPaidcourseregistrationannotationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ShoppingcartPaidcourseregistrationannotationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOPPINGCART_PAIDCOURSEREGISTRATIONANNOTATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShoppingcartPaidcourseregistrationannotationRecord> getPrimaryKey() {
        return Keys.KEY_SHOPPINGCART_PAIDCOURSEREGISTRATIONANNOTATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShoppingcartPaidcourseregistrationannotationRecord>> getKeys() {
        return Arrays.<UniqueKey<ShoppingcartPaidcourseregistrationannotationRecord>>asList(Keys.KEY_SHOPPINGCART_PAIDCOURSEREGISTRATIONANNOTATION_PRIMARY, Keys.KEY_SHOPPINGCART_PAIDCOURSEREGISTRATIONANNOTATION_COURSE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartPaidcourseregistrationannotation as(String alias) {
        return new ShoppingcartPaidcourseregistrationannotation(alias, this);
    }

    /**
     * Rename this table
     */
    public ShoppingcartPaidcourseregistrationannotation rename(String name) {
        return new ShoppingcartPaidcourseregistrationannotation(name, null);
    }
}
