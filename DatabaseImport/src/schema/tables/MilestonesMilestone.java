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
import schema.tables.records.MilestonesMilestoneRecord;


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
public class MilestonesMilestone extends TableImpl<MilestonesMilestoneRecord> {

    private static final long serialVersionUID = -2144458328;

    /**
     * The reference instance of <code>bitnami_edx.milestones_milestone</code>
     */
    public static final MilestonesMilestone MILESTONES_MILESTONE = new MilestonesMilestone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilestonesMilestoneRecord> getRecordType() {
        return MilestonesMilestoneRecord.class;
    }

    /**
     * The column <code>bitnami_edx.milestones_milestone.id</code>.
     */
    public final TableField<MilestonesMilestoneRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.created</code>.
     */
    public final TableField<MilestonesMilestoneRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.modified</code>.
     */
    public final TableField<MilestonesMilestoneRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.namespace</code>.
     */
    public final TableField<MilestonesMilestoneRecord, String> NAMESPACE = createField("namespace", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.name</code>.
     */
    public final TableField<MilestonesMilestoneRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.display_name</code>.
     */
    public final TableField<MilestonesMilestoneRecord, String> DISPLAY_NAME = createField("display_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.description</code>.
     */
    public final TableField<MilestonesMilestoneRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.milestones_milestone.active</code>.
     */
    public final TableField<MilestonesMilestoneRecord, Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.milestones_milestone</code> table reference
     */
    public MilestonesMilestone() {
        this("milestones_milestone", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.milestones_milestone</code> table reference
     */
    public MilestonesMilestone(String alias) {
        this(alias, MILESTONES_MILESTONE);
    }

    private MilestonesMilestone(String alias, Table<MilestonesMilestoneRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilestonesMilestone(String alias, Table<MilestonesMilestoneRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MilestonesMilestoneRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MILESTONES_MILESTONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MilestonesMilestoneRecord> getPrimaryKey() {
        return Keys.KEY_MILESTONES_MILESTONE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MilestonesMilestoneRecord>> getKeys() {
        return Arrays.<UniqueKey<MilestonesMilestoneRecord>>asList(Keys.KEY_MILESTONES_MILESTONE_PRIMARY, Keys.KEY_MILESTONES_MILESTONE_MILESTONES_MILESTONE_NAMESPACE_460A2F6943016C0B_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesMilestone as(String alias) {
        return new MilestonesMilestone(alias, this);
    }

    /**
     * Rename this table
     */
    public MilestonesMilestone rename(String name) {
        return new MilestonesMilestone(name, null);
    }
}
