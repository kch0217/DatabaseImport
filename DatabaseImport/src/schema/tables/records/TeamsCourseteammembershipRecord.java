/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.TeamsCourseteammembership;


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
public class TeamsCourseteammembershipRecord extends UpdatableRecordImpl<TeamsCourseteammembershipRecord> implements Record5<Integer, Timestamp, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 1495963968;

    /**
     * Setter for <code>bitnami_edx.teams_courseteammembership.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.teams_courseteammembership.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.teams_courseteammembership.date_joined</code>.
     */
    public void setDateJoined(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.teams_courseteammembership.date_joined</code>.
     */
    public Timestamp getDateJoined() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.teams_courseteammembership.last_activity_at</code>.
     */
    public void setLastActivityAt(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.teams_courseteammembership.last_activity_at</code>.
     */
    public Timestamp getLastActivityAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.teams_courseteammembership.team_id</code>.
     */
    public void setTeamId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.teams_courseteammembership.team_id</code>.
     */
    public Integer getTeamId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.teams_courseteammembership.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.teams_courseteammembership.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Timestamp, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP.DATE_JOINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP.LAST_ACTIVITY_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP.TEAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getDateJoined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastActivityAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTeamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsCourseteammembershipRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsCourseteammembershipRecord value2(Timestamp value) {
        setDateJoined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsCourseteammembershipRecord value3(Timestamp value) {
        setLastActivityAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsCourseteammembershipRecord value4(Integer value) {
        setTeamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsCourseteammembershipRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsCourseteammembershipRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeamsCourseteammembershipRecord
     */
    public TeamsCourseteammembershipRecord() {
        super(TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP);
    }

    /**
     * Create a detached, initialised TeamsCourseteammembershipRecord
     */
    public TeamsCourseteammembershipRecord(Integer id, Timestamp dateJoined, Timestamp lastActivityAt, Integer teamId, Integer userId) {
        super(TeamsCourseteammembership.TEAMS_COURSETEAMMEMBERSHIP);

        set(0, id);
        set(1, dateJoined);
        set(2, lastActivityAt);
        set(3, teamId);
        set(4, userId);
    }
}