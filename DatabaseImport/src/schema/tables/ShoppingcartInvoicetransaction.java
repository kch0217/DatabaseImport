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
import schema.tables.records.ShoppingcartInvoicetransactionRecord;


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
public class ShoppingcartInvoicetransaction extends TableImpl<ShoppingcartInvoicetransactionRecord> {

    private static final long serialVersionUID = -5676565;

    /**
     * The reference instance of <code>bitnami_edx.shoppingcart_invoicetransaction</code>
     */
    public static final ShoppingcartInvoicetransaction SHOPPINGCART_INVOICETRANSACTION = new ShoppingcartInvoicetransaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingcartInvoicetransactionRecord> getRecordType() {
        return ShoppingcartInvoicetransactionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.id</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.created</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.modified</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.amount</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(30, 2).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.currency</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.comments</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.status</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.created_by_id</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, Integer> CREATED_BY_ID = createField("created_by_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.invoice_id</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, Integer> INVOICE_ID = createField("invoice_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.shoppingcart_invoicetransaction.last_modified_by_id</code>.
     */
    public final TableField<ShoppingcartInvoicetransactionRecord, Integer> LAST_MODIFIED_BY_ID = createField("last_modified_by_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.shoppingcart_invoicetransaction</code> table reference
     */
    public ShoppingcartInvoicetransaction() {
        this("shoppingcart_invoicetransaction", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.shoppingcart_invoicetransaction</code> table reference
     */
    public ShoppingcartInvoicetransaction(String alias) {
        this(alias, SHOPPINGCART_INVOICETRANSACTION);
    }

    private ShoppingcartInvoicetransaction(String alias, Table<ShoppingcartInvoicetransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingcartInvoicetransaction(String alias, Table<ShoppingcartInvoicetransactionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ShoppingcartInvoicetransactionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOPPINGCART_INVOICETRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShoppingcartInvoicetransactionRecord> getPrimaryKey() {
        return Keys.KEY_SHOPPINGCART_INVOICETRANSACTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShoppingcartInvoicetransactionRecord>> getKeys() {
        return Arrays.<UniqueKey<ShoppingcartInvoicetransactionRecord>>asList(Keys.KEY_SHOPPINGCART_INVOICETRANSACTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShoppingcartInvoicetransactionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShoppingcartInvoicetransactionRecord, ?>>asList(Keys.SHOPPINGCART_INVOI_CREATED_BY_ID_F5F3D90CE55A145_FK_AUTH_USER_ID, Keys.SHOPPINGC_INVOICE_ID_66BDBFA6F029288B_FK_SHOPPINGCART_INVOICE_ID, Keys.SHOPPINGCAR_LAST_MODIFIED_BY_ID_5E10E433F9576D91_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartInvoicetransaction as(String alias) {
        return new ShoppingcartInvoicetransaction(alias, this);
    }

    /**
     * Rename this table
     */
    public ShoppingcartInvoicetransaction rename(String name) {
        return new ShoppingcartInvoicetransaction(name, null);
    }
}
