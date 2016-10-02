/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Timestamp;
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
import schema.tables.records.TrackTrackinglogRecord;


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
public class TrackTrackinglog extends TableImpl<TrackTrackinglogRecord> {

    private static final long serialVersionUID = -171304287;

    /**
     * The reference instance of <code>bitnami_edx.track_trackinglog</code>
     */
    public static final TrackTrackinglog TRACK_TRACKINGLOG = new TrackTrackinglog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackTrackinglogRecord> getRecordType() {
        return TrackTrackinglogRecord.class;
    }

    /**
     * The column <code>bitnami_edx.track_trackinglog.id</code>.
     */
    public final TableField<TrackTrackinglogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.dtcreated</code>.
     */
    public final TableField<TrackTrackinglogRecord, Timestamp> DTCREATED = createField("dtcreated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.username</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.ip</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.event_source</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> EVENT_SOURCE = createField("event_source", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.event_type</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> EVENT_TYPE = createField("event_type", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.event</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> EVENT = createField("event", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.agent</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> AGENT = createField("agent", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.page</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> PAGE = createField("page", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.time</code>.
     */
    public final TableField<TrackTrackinglogRecord, Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.track_trackinglog.host</code>.
     */
    public final TableField<TrackTrackinglogRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.track_trackinglog</code> table reference
     */
    public TrackTrackinglog() {
        this("track_trackinglog", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.track_trackinglog</code> table reference
     */
    public TrackTrackinglog(String alias) {
        this(alias, TRACK_TRACKINGLOG);
    }

    private TrackTrackinglog(String alias, Table<TrackTrackinglogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrackTrackinglog(String alias, Table<TrackTrackinglogRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TrackTrackinglogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRACK_TRACKINGLOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrackTrackinglogRecord> getPrimaryKey() {
        return Keys.KEY_TRACK_TRACKINGLOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrackTrackinglogRecord>> getKeys() {
        return Arrays.<UniqueKey<TrackTrackinglogRecord>>asList(Keys.KEY_TRACK_TRACKINGLOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackTrackinglog as(String alias) {
        return new TrackTrackinglog(alias, this);
    }

    /**
     * Rename this table
     */
    public TrackTrackinglog rename(String name) {
        return new TrackTrackinglog(name, null);
    }
}
