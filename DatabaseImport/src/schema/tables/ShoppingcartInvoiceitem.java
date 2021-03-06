/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
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
import schema.tables.records.ShoppingcartInvoiceitemRecord;


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
public class ShoppingcartInvoiceitem extends TableImpl<ShoppingcartInvoiceitemRecord> {

    private static final long serialVersionUID = 1646698658;

    /**
     * The reference instance of <code>bitnami_edx.shoppingcart_invoiceitem</code>
     */
    public static final ShoppingcartInvoiceitem SHOPPINGCART_INVOICEITEM = new ShoppingcartInvoiceitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingcartInvoiceitemRecord> getRecordType() {
        return ShoppingcartInvoiceitemRecord.class;
    }

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.id</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.created</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.modified</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.qty</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, Integer> QTY = createField("qty", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.unit_price</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, BigDecimal> UNIT_PRICE = createField("unit_price", org.jooq.impl.SQLDataType.DECIMAL.precision(30, 2).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.currency</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoiceitem.invoice_id</code>.
     */
    public final TableField<ShoppingcartInvoiceitemRecord, Integer> INVOICE_ID = createField("invoice_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.shoppingcart_invoiceitem</code> table reference
     */
    public ShoppingcartInvoiceitem() {
        this("shoppingcart_invoiceitem", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.shoppingcart_invoiceitem</code> table reference
     */
    public ShoppingcartInvoiceitem(String alias) {
        this(alias, SHOPPINGCART_INVOICEITEM);
    }

    private ShoppingcartInvoiceitem(String alias, Table<ShoppingcartInvoiceitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingcartInvoiceitem(String alias, Table<ShoppingcartInvoiceitemRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ShoppingcartInvoiceitemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOPPINGCART_INVOICEITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShoppingcartInvoiceitemRecord> getPrimaryKey() {
        return Keys.KEY_SHOPPINGCART_INVOICEITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShoppingcartInvoiceitemRecord>> getKeys() {
        return Arrays.<UniqueKey<ShoppingcartInvoiceitemRecord>>asList(Keys.KEY_SHOPPINGCART_INVOICEITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShoppingcartInvoiceitemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShoppingcartInvoiceitemRecord, ?>>asList(Keys.SHOPPINGC_INVOICE_ID_35828791C8405D01_FK_SHOPPINGCART_INVOICE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartInvoiceitem as(String alias) {
        return new ShoppingcartInvoiceitem(alias, this);
    }

    /**
     * Rename this table
     */
    public ShoppingcartInvoiceitem rename(String name) {
        return new ShoppingcartInvoiceitem(name, null);
    }
}
