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
import schema.tables.records.ShoppingcartCertificateitemRecord;


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
public class ShoppingcartCertificateitem extends TableImpl<ShoppingcartCertificateitemRecord> {

    private static final long serialVersionUID = -1508553369;

    /**
     * The reference instance of <code>bitnami_edx.shoppingcart_certificateitem</code>
     */
    public static final ShoppingcartCertificateitem SHOPPINGCART_CERTIFICATEITEM = new ShoppingcartCertificateitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingcartCertificateitemRecord> getRecordType() {
        return ShoppingcartCertificateitemRecord.class;
    }

    /**
     * The column <code>bitnami_edx.shoppingcart_certificateitem.orderitem_ptr_id</code>.
     */
    public final TableField<ShoppingcartCertificateitemRecord, Integer> ORDERITEM_PTR_ID = createField("orderitem_ptr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_certificateitem.course_id</code>.
     */
    public final TableField<ShoppingcartCertificateitemRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_certificateitem.mode</code>.
     */
    public final TableField<ShoppingcartCertificateitemRecord, String> MODE = createField("mode", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_certificateitem.course_enrollment_id</code>.
     */
    public final TableField<ShoppingcartCertificateitemRecord, Integer> COURSE_ENROLLMENT_ID = createField("course_enrollment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.shoppingcart_certificateitem</code> table reference
     */
    public ShoppingcartCertificateitem() {
        this("shoppingcart_certificateitem", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.shoppingcart_certificateitem</code> table reference
     */
    public ShoppingcartCertificateitem(String alias) {
        this(alias, SHOPPINGCART_CERTIFICATEITEM);
    }

    private ShoppingcartCertificateitem(String alias, Table<ShoppingcartCertificateitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingcartCertificateitem(String alias, Table<ShoppingcartCertificateitemRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ShoppingcartCertificateitemRecord> getPrimaryKey() {
        return Keys.KEY_SHOPPINGCART_CERTIFICATEITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShoppingcartCertificateitemRecord>> getKeys() {
        return Arrays.<UniqueKey<ShoppingcartCertificateitemRecord>>asList(Keys.KEY_SHOPPINGCART_CERTIFICATEITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShoppingcartCertificateitemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShoppingcartCertificateitemRecord, ?>>asList(Keys.S_ORDERITEM_PTR_ID_5127313BC5A09762_FK_SHOPPINGCART_ORDERITEM_ID, Keys.D231CB871868CB92E6ED1EE8E53A1BEE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartCertificateitem as(String alias) {
        return new ShoppingcartCertificateitem(alias, this);
    }

    /**
     * Rename this table
     */
    public ShoppingcartCertificateitem rename(String name) {
        return new ShoppingcartCertificateitem(name, null);
    }
}
