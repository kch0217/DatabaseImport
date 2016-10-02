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
import schema.tables.records.MilestonesCoursemilestoneRecord;


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
public class MilestonesCoursemilestone extends TableImpl<MilestonesCoursemilestoneRecord> {

    private static final long serialVersionUID = 1402404625;

    /**
     * The reference instance of <code>bitnami_edx.milestones_coursemilestone</code>
     */
    public static final MilestonesCoursemilestone MILESTONES_COURSEMILESTONE = new MilestonesCoursemilestone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilestonesCoursemilestoneRecord> getRecordType() {
        return MilestonesCoursemilestoneRecord.class;
    }

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.id</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.created</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.modified</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.course_id</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.active</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.milestone_id</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, Integer> MILESTONE_ID = createField("milestone_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_coursemilestone.milestone_relationship_type_id</code>.
     */
    public final TableField<MilestonesCoursemilestoneRecord, Integer> MILESTONE_RELATIONSHIP_TYPE_ID = createField("milestone_relationship_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.milestones_coursemilestone</code> table reference
     */
    public MilestonesCoursemilestone() {
        this("milestones_coursemilestone", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.milestones_coursemilestone</code> table reference
     */
    public MilestonesCoursemilestone(String alias) {
        this(alias, MILESTONES_COURSEMILESTONE);
    }

    private MilestonesCoursemilestone(String alias, Table<MilestonesCoursemilestoneRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilestonesCoursemilestone(String alias, Table<MilestonesCoursemilestoneRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MilestonesCoursemilestoneRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MILESTONES_COURSEMILESTONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MilestonesCoursemilestoneRecord> getPrimaryKey() {
        return Keys.KEY_MILESTONES_COURSEMILESTONE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MilestonesCoursemilestoneRecord>> getKeys() {
        return Arrays.<UniqueKey<MilestonesCoursemilestoneRecord>>asList(Keys.KEY_MILESTONES_COURSEMILESTONE_PRIMARY, Keys.KEY_MILESTONES_COURSEMILESTONE_MILESTONES_COURSEMILESTONE_COURSE_ID_5A06E10579EAB3B7_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MilestonesCoursemilestoneRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MilestonesCoursemilestoneRecord, ?>>asList(Keys.MILESTO_MILESTONE_ID_284153799C54D7D8_FK_MILESTONES_MILESTONE_ID, Keys.D69536D0D313008147C5DAF5341090E1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestone as(String alias) {
        return new MilestonesCoursemilestone(alias, this);
    }

    /**
     * Rename this table
     */
    public MilestonesCoursemilestone rename(String name) {
        return new MilestonesCoursemilestone(name, null);
    }
}
