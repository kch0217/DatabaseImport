/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.WikiRevisionpluginrevision;


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
public class WikiRevisionpluginrevisionRecord extends UpdatableRecordImpl<WikiRevisionpluginrevisionRecord> implements Record12<Integer, Integer, String, String, String, Timestamp, Timestamp, Byte, Byte, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1328288717;

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.revision_number</code>.
     */
    public void setRevisionNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.revision_number</code>.
     */
    public Integer getRevisionNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.user_message</code>.
     */
    public void setUserMessage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.user_message</code>.
     */
    public String getUserMessage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.automatic_log</code>.
     */
    public void setAutomaticLog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.automatic_log</code>.
     */
    public String getAutomaticLog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.ip_address</code>.
     */
    public void setIpAddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.ip_address</code>.
     */
    public String getIpAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.locked</code>.
     */
    public void setLocked(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.locked</code>.
     */
    public Byte getLocked() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.plugin_id</code>.
     */
    public void setPluginId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.plugin_id</code>.
     */
    public Integer getPluginId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.previous_revision_id</code>.
     */
    public void setPreviousRevisionId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.previous_revision_id</code>.
     */
    public Integer getPreviousRevisionId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_revisionpluginrevision.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_revisionpluginrevision.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, Timestamp, Timestamp, Byte, Byte, Integer, Integer, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, Timestamp, Timestamp, Byte, Byte, Integer, Integer, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.REVISION_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.USER_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.AUTOMATIC_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.IP_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.LOCKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.PLUGIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.PREVIOUS_REVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION.USER_ID;
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
    public Integer value2() {
        return getRevisionNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAutomaticLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIpAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getLocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPluginId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPreviousRevisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value2(Integer value) {
        setRevisionNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value3(String value) {
        setUserMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value4(String value) {
        setAutomaticLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value5(String value) {
        setIpAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value6(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value7(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value9(Byte value) {
        setLocked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value10(Integer value) {
        setPluginId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value11(Integer value) {
        setPreviousRevisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord value12(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiRevisionpluginrevisionRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Byte value8, Byte value9, Integer value10, Integer value11, Integer value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WikiRevisionpluginrevisionRecord
     */
    public WikiRevisionpluginrevisionRecord() {
        super(WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION);
    }

    /**
     * Create a detached, initialised WikiRevisionpluginrevisionRecord
     */
    public WikiRevisionpluginrevisionRecord(Integer id, Integer revisionNumber, String userMessage, String automaticLog, String ipAddress, Timestamp modified, Timestamp created, Byte deleted, Byte locked, Integer pluginId, Integer previousRevisionId, Integer userId) {
        super(WikiRevisionpluginrevision.WIKI_REVISIONPLUGINREVISION);

        set(0, id);
        set(1, revisionNumber);
        set(2, userMessage);
        set(3, automaticLog);
        set(4, ipAddress);
        set(5, modified);
        set(6, created);
        set(7, deleted);
        set(8, locked);
        set(9, pluginId);
        set(10, previousRevisionId);
        set(11, userId);
    }
}