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
import schema.tables.records.CourseStructuresCoursestructureRecord;


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
public class CourseStructuresCoursestructure extends TableImpl<CourseStructuresCoursestructureRecord> {

    private static final long serialVersionUID = -943359014;

    /**
     * The reference instance of <code>bitnami_edx.course_structures_coursestructure</code>
     */
    public static final CourseStructuresCoursestructure COURSE_STRUCTURES_COURSESTRUCTURE = new CourseStructuresCoursestructure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CourseStructuresCoursestructureRecord> getRecordType() {
        return CourseStructuresCoursestructureRecord.class;
    }

    /**
     * The column <code>bitnami_edx.course_structures_coursestructure.id</code>.
     */
    public final TableField<CourseStructuresCoursestructureRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_structures_coursestructure.created</code>.
     */
    public final TableField<CourseStructuresCoursestructureRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_structures_coursestructure.modified</code>.
     */
    public final TableField<CourseStructuresCoursestructureRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_structures_coursestructure.course_id</code>.
     */
    public final TableField<CourseStructuresCoursestructureRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_structures_coursestructure.structure_json</code>.
     */
    public final TableField<CourseStructuresCoursestructureRecord, String> STRUCTURE_JSON = createField("structure_json", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.course_structures_coursestructure.discussion_id_map_json</code>.
     */
    public final TableField<CourseStructuresCoursestructureRecord, String> DISCUSSION_ID_MAP_JSON = createField("discussion_id_map_json", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>bitnami_edx.course_structures_coursestructure</code> table reference
     */
    public CourseStructuresCoursestructure() {
        this("course_structures_coursestructure", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.course_structures_coursestructure</code> table reference
     */
    public CourseStructuresCoursestructure(String alias) {
        this(alias, COURSE_STRUCTURES_COURSESTRUCTURE);
    }

    private CourseStructuresCoursestructure(String alias, Table<CourseStructuresCoursestructureRecord> aliased) {
        this(alias, aliased, null);
    }

    private CourseStructuresCoursestructure(String alias, Table<CourseStructuresCoursestructureRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CourseStructuresCoursestructureRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSE_STRUCTURES_COURSESTRUCTURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CourseStructuresCoursestructureRecord> getPrimaryKey() {
        return Keys.KEY_COURSE_STRUCTURES_COURSESTRUCTURE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CourseStructuresCoursestructureRecord>> getKeys() {
        return Arrays.<UniqueKey<CourseStructuresCoursestructureRecord>>asList(Keys.KEY_COURSE_STRUCTURES_COURSESTRUCTURE_PRIMARY, Keys.KEY_COURSE_STRUCTURES_COURSESTRUCTURE_COURSE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseStructuresCoursestructure as(String alias) {
        return new CourseStructuresCoursestructure(alias, this);
    }

    /**
     * Rename this table
     */
    public CourseStructuresCoursestructure rename(String name) {
        return new CourseStructuresCoursestructure(name, null);
    }
}
