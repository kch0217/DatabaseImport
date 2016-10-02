/**
 * This class is generated by jOOQ
 */
package schema.tables;


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
import schema.tables.records.MilestonesCoursecontentmilestoneRecord;


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
public class MilestonesCoursecontentmilestone extends TableImpl<MilestonesCoursecontentmilestoneRecord> {

    private static final long serialVersionUID = 309574290;

    /**
     * The reference instance of <code>bitnami_edx.milestones_coursecontentmilestone</code>
     */
    public static final MilestonesCoursecontentmilestone MILESTONES_COURSECONTENTMILESTONE = new MilestonesCoursecontentmilestone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilestonesCoursecontentmilestoneRecord> getRecordType() {
        return MilestonesCoursecontentmilestoneRecord.class;
    }

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.id</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.created</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.modified</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.course_id</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.content_id</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, String> CONTENT_ID = createField("content_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.active</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.milestone_id</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, Integer> MILESTONE_ID = createField("milestone_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.milestone_relationship_type_id</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, Integer> MILESTONE_RELATIONSHIP_TYPE_ID = createField("milestone_relationship_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursecontentmilestone.requirements</code>.
     */
    public final TableField<MilestonesCoursecontentmilestoneRecord, String> REQUIREMENTS = createField("requirements", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>bitnami_edx.milestones_coursecontentmilestone</code> table reference
     */
    public MilestonesCoursecontentmilestone() {
        this("milestones_coursecontentmilestone", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.milestones_coursecontentmilestone</code> table reference
     */
    public MilestonesCoursecontentmilestone(String alias) {
        this(alias, MILESTONES_COURSECONTENTMILESTONE);
    }

    private MilestonesCoursecontentmilestone(String alias, Table<MilestonesCoursecontentmilestoneRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilestonesCoursecontentmilestone(String alias, Table<MilestonesCoursecontentmilestoneRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MilestonesCoursecontentmilestoneRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MILESTONES_COURSECONTENTMILESTONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MilestonesCoursecontentmilestoneRecord> getPrimaryKey() {
        return Keys.KEY_MILESTONES_COURSECONTENTMILESTONE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MilestonesCoursecontentmilestoneRecord>> getKeys() {
        return Arrays.<UniqueKey<MilestonesCoursecontentmilestoneRecord>>asList(Keys.KEY_MILESTONES_COURSECONTENTMILESTONE_PRIMARY, Keys.KEY_MILESTONES_COURSECONTENTMILESTONE_MILESTONES_COURSECONTENTMILESTON_COURSE_ID_68D1457CD52D6DFF_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MilestonesCoursecontentmilestoneRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MilestonesCoursecontentmilestoneRecord, ?>>asList(Keys.MILESTO_MILESTONE_ID_73B6EDDDE5B205A8_FK_MILESTONES_MILESTONE_ID, Keys.D84E404851BC6D6B9FE0D60955E8729C);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestone as(String alias) {
        return new MilestonesCoursecontentmilestone(alias, this);
    }

    /**
     * Rename this table
     */
    public MilestonesCoursecontentmilestone rename(String name) {
        return new MilestonesCoursecontentmilestone(name, null);
    }
}
