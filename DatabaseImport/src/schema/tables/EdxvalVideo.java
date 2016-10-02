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
import schema.tables.records.EdxvalVideoRecord;


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
public class EdxvalVideo extends TableImpl<EdxvalVideoRecord> {

    private static final long serialVersionUID = 1902456451;

    /**
     * The reference instance of <code>bitnami_edx.edxval_video</code>
     */
    public static final EdxvalVideo EDXVAL_VIDEO = new EdxvalVideo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EdxvalVideoRecord> getRecordType() {
        return EdxvalVideoRecord.class;
    }

    /**
     * The column <code>bitnami_edx.edxval_video.id</code>.
     */
    public final TableField<EdxvalVideoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.edxval_video.created</code>.
     */
    public final TableField<EdxvalVideoRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.edxval_video.edx_video_id</code>.
     */
    public final TableField<EdxvalVideoRecord, String> EDX_VIDEO_ID = createField("edx_video_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.edxval_video.client_video_id</code>.
     */
    public final TableField<EdxvalVideoRecord, String> CLIENT_VIDEO_ID = createField("client_video_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.edxval_video.duration</code>.
     */
    public final TableField<EdxvalVideoRecord, Double> DURATION = createField("duration", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.edxval_video.status</code>.
     */
    public final TableField<EdxvalVideoRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.edxval_video</code> table reference
     */
    public EdxvalVideo() {
        this("edxval_video", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.edxval_video</code> table reference
     */
    public EdxvalVideo(String alias) {
        this(alias, EDXVAL_VIDEO);
    }

    private EdxvalVideo(String alias, Table<EdxvalVideoRecord> aliased) {
        this(alias, aliased, null);
    }

    private EdxvalVideo(String alias, Table<EdxvalVideoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EdxvalVideoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EDXVAL_VIDEO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EdxvalVideoRecord> getPrimaryKey() {
        return Keys.KEY_EDXVAL_VIDEO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EdxvalVideoRecord>> getKeys() {
        return Arrays.<UniqueKey<EdxvalVideoRecord>>asList(Keys.KEY_EDXVAL_VIDEO_PRIMARY, Keys.KEY_EDXVAL_VIDEO_EDX_VIDEO_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EdxvalVideo as(String alias) {
        return new EdxvalVideo(alias, this);
    }

    /**
     * Rename this table
     */
    public EdxvalVideo rename(String name) {
        return new EdxvalVideo(name, null);
    }
}