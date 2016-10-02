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
import schema.tables.records.NotifySubscriptionRecord;


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
public class NotifySubscription extends TableImpl<NotifySubscriptionRecord> {

    private static final long serialVersionUID = 728600;

    /**
     * The reference instance of <code>bitnami_edx.notify_subscription</code>
     */
    public static final NotifySubscription NOTIFY_SUBSCRIPTION = new NotifySubscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotifySubscriptionRecord> getRecordType() {
        return NotifySubscriptionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.notify_subscription.subscription_id</code>.
     */
    public final TableField<NotifySubscriptionRecord, Integer> SUBSCRIPTION_ID = createField("subscription_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notify_subscription.object_id</code>.
     */
    public final TableField<NotifySubscriptionRecord, String> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>bitnami_edx.notify_subscription.send_emails</code>.
     */
    public final TableField<NotifySubscriptionRecord, Byte> SEND_EMAILS = createField("send_emails", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notify_subscription.notification_type_id</code>.
     */
    public final TableField<NotifySubscriptionRecord, String> NOTIFICATION_TYPE_ID = createField("notification_type_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notify_subscription.settings_id</code>.
     */
    public final TableField<NotifySubscriptionRecord, Integer> SETTINGS_ID = createField("settings_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.notify_subscription</code> table reference
     */
    public NotifySubscription() {
        this("notify_subscription", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.notify_subscription</code> table reference
     */
    public NotifySubscription(String alias) {
        this(alias, NOTIFY_SUBSCRIPTION);
    }

    private NotifySubscription(String alias, Table<NotifySubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotifySubscription(String alias, Table<NotifySubscriptionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<NotifySubscriptionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NOTIFY_SUBSCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NotifySubscriptionRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFY_SUBSCRIPTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NotifySubscriptionRecord>> getKeys() {
        return Arrays.<UniqueKey<NotifySubscriptionRecord>>asList(Keys.KEY_NOTIFY_SUBSCRIPTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NotifySubscriptionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NotifySubscriptionRecord, ?>>asList(Keys.A2462650BBEFC26547210B80DEC61069, Keys.NOTIFY_SUBSCR_SETTINGS_ID_64D594D127E8CA95_FK_NOTIFY_SETTINGS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotifySubscription as(String alias) {
        return new NotifySubscription(alias, this);
    }

    /**
     * Rename this table
     */
    public NotifySubscription rename(String name) {
        return new NotifySubscription(name, null);
    }
}