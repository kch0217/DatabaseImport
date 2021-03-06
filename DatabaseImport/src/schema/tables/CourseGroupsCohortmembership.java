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
import schema.tables.records.CourseGroupsCohortmembershipRecord;


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
public class CourseGroupsCohortmembership extends TableImpl<CourseGroupsCohortmembershipRecord> {

    private static final long serialVersionUID = 918571460;

    /**
     * The reference instance of <code>bitnami_edx.course_groups_cohortmembership</code>
     */
    public static final CourseGroupsCohortmembership COURSE_GROUPS_COHORTMEMBERSHIP = new CourseGroupsCohortmembership();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CourseGroupsCohortmembershipRecord> getRecordType() {
        return CourseGroupsCohortmembershipRecord.class;
    }

    /**
     * The column <code>bitnami_edx.course_groups_cohortmembership.id</code>.
     */
    public final TableField<CourseGroupsCohortmembershipRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_groups_cohortmembership.course_id</code>.
     */
    public final TableField<CourseGroupsCohortmembershipRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_groups_cohortmembership.course_user_group_id</code>.
     */
    public final TableField<CourseGroupsCohortmembershipRecord, Integer> COURSE_USER_GROUP_ID = createField("course_user_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_groups_cohortmembership.user_id</code>.
     */
    public final TableField<CourseGroupsCohortmembershipRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.course_groups_cohortmembership</code> table reference
     */
    public CourseGroupsCohortmembership() {
        this("course_groups_cohortmembership", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.course_groups_cohortmembership</code> table reference
     */
    public CourseGroupsCohortmembership(String alias) {
        this(alias, COURSE_GROUPS_COHORTMEMBERSHIP);
    }

    private CourseGroupsCohortmembership(String alias, Table<CourseGroupsCohortmembershipRecord> aliased) {
        this(alias, aliased, null);
    }

    private CourseGroupsCohortmembership(String alias, Table<CourseGroupsCohortmembershipRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CourseGroupsCohortmembershipRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSE_GROUPS_COHORTMEMBERSHIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CourseGroupsCohortmembershipRecord> getPrimaryKey() {
        return Keys.KEY_COURSE_GROUPS_COHORTMEMBERSHIP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CourseGroupsCohortmembershipRecord>> getKeys() {
        return Arrays.<UniqueKey<CourseGroupsCohortmembershipRecord>>asList(Keys.KEY_COURSE_GROUPS_COHORTMEMBERSHIP_PRIMARY, Keys.KEY_COURSE_GROUPS_COHORTMEMBERSHIP_COURSE_GROUPS_COHORTMEMBERSHIP_USER_ID_395BDDD0389ED7DA_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CourseGroupsCohortmembershipRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CourseGroupsCohortmembershipRecord, ?>>asList(Keys.D004E77C965054D46217A8BD48BCAEC8, Keys.COURSE_GROUPS_COHORTMEM_USER_ID_15D408BF736398BF_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCohortmembership as(String alias) {
        return new CourseGroupsCohortmembership(alias, this);
    }

    /**
     * Rename this table
     */
    public CourseGroupsCohortmembership rename(String name) {
        return new CourseGroupsCohortmembership(name, null);
    }
}
