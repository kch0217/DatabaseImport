/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.WikiArticle;


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
public class WikiArticleRecord extends UpdatableRecordImpl<WikiArticleRecord> implements Record10<Integer, Timestamp, Timestamp, Byte, Byte, Byte, Byte, Integer, Integer, Integer> {

    private static final long serialVersionUID = 733635846;

    /**
     * Setter for <code>bitnami_edx.wiki_article.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.group_read</code>.
     */
    public void setGroupRead(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.group_read</code>.
     */
    public Byte getGroupRead() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.group_write</code>.
     */
    public void setGroupWrite(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.group_write</code>.
     */
    public Byte getGroupWrite() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.other_read</code>.
     */
    public void setOtherRead(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.other_read</code>.
     */
    public Byte getOtherRead() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.other_write</code>.
     */
    public void setOtherWrite(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.other_write</code>.
     */
    public Byte getOtherWrite() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.current_revision_id</code>.
     */
    public void setCurrentRevisionId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.current_revision_id</code>.
     */
    public Integer getCurrentRevisionId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_article.owner_id</code>.
     */
    public void setOwnerId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_article.owner_id</code>.
     */
    public Integer getOwnerId() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, Byte, Byte, Byte, Byte, Integer, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, Byte, Byte, Byte, Byte, Integer, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WikiArticle.WIKI_ARTICLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return WikiArticle.WIKI_ARTICLE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return WikiArticle.WIKI_ARTICLE.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return WikiArticle.WIKI_ARTICLE.GROUP_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return WikiArticle.WIKI_ARTICLE.GROUP_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return WikiArticle.WIKI_ARTICLE.OTHER_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return WikiArticle.WIKI_ARTICLE.OTHER_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return WikiArticle.WIKI_ARTICLE.CURRENT_REVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return WikiArticle.WIKI_ARTICLE.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return WikiArticle.WIKI_ARTICLE.OWNER_ID;
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
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getGroupRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getGroupWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getOtherRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getOtherWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCurrentRevisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value4(Byte value) {
        setGroupRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value5(Byte value) {
        setGroupWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value6(Byte value) {
        setOtherRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value7(Byte value) {
        setOtherWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value8(Integer value) {
        setCurrentRevisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value9(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord value10(Integer value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleRecord values(Integer value1, Timestamp value2, Timestamp value3, Byte value4, Byte value5, Byte value6, Byte value7, Integer value8, Integer value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WikiArticleRecord
     */
    public WikiArticleRecord() {
        super(WikiArticle.WIKI_ARTICLE);
    }

    /**
     * Create a detached, initialised WikiArticleRecord
     */
    public WikiArticleRecord(Integer id, Timestamp created, Timestamp modified, Byte groupRead, Byte groupWrite, Byte otherRead, Byte otherWrite, Integer currentRevisionId, Integer groupId, Integer ownerId) {
        super(WikiArticle.WIKI_ARTICLE);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, groupRead);
        set(4, groupWrite);
        set(5, otherRead);
        set(6, otherWrite);
        set(7, currentRevisionId);
        set(8, groupId);
        set(9, ownerId);
    }
}
