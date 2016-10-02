/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.NotesNote;


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
public class NotesNoteRecord extends UpdatableRecordImpl<NotesNoteRecord> implements Record13<Integer, String, String, String, String, String, Integer, String, Integer, String, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 53968722;

    /**
     * Setter for <code>bitnami_edx.notes_note.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.uri</code>.
     */
    public void setUri(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.uri</code>.
     */
    public String getUri() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.text</code>.
     */
    public void setText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.text</code>.
     */
    public String getText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.quote</code>.
     */
    public void setQuote(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.quote</code>.
     */
    public String getQuote() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.range_start</code>.
     */
    public void setRangeStart(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.range_start</code>.
     */
    public String getRangeStart() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.range_start_offset</code>.
     */
    public void setRangeStartOffset(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.range_start_offset</code>.
     */
    public Integer getRangeStartOffset() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.range_end</code>.
     */
    public void setRangeEnd(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.range_end</code>.
     */
    public String getRangeEnd() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.range_end_offset</code>.
     */
    public void setRangeEndOffset(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.range_end_offset</code>.
     */
    public Integer getRangeEndOffset() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.tags</code>.
     */
    public void setTags(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.tags</code>.
     */
    public String getTags() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>bitnami_edx.notes_note.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>bitnami_edx.notes_note.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, Integer, String, Integer, String, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, Integer, String, Integer, String, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NotesNote.NOTES_NOTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NotesNote.NOTES_NOTE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return NotesNote.NOTES_NOTE.URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NotesNote.NOTES_NOTE.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return NotesNote.NOTES_NOTE.QUOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return NotesNote.NOTES_NOTE.RANGE_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return NotesNote.NOTES_NOTE.RANGE_START_OFFSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return NotesNote.NOTES_NOTE.RANGE_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return NotesNote.NOTES_NOTE.RANGE_END_OFFSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return NotesNote.NOTES_NOTE.TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return NotesNote.NOTES_NOTE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return NotesNote.NOTES_NOTE.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return NotesNote.NOTES_NOTE.USER_ID;
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
    public String value2() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getQuote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRangeStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRangeStartOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRangeEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRangeEndOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value3(String value) {
        setUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value4(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value5(String value) {
        setQuote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value6(String value) {
        setRangeStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value7(Integer value) {
        setRangeStartOffset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value8(String value) {
        setRangeEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value9(Integer value) {
        setRangeEndOffset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value10(String value) {
        setTags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value11(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value12(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord value13(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNoteRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8, Integer value9, String value10, Timestamp value11, Timestamp value12, Integer value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotesNoteRecord
     */
    public NotesNoteRecord() {
        super(NotesNote.NOTES_NOTE);
    }

    /**
     * Create a detached, initialised NotesNoteRecord
     */
    public NotesNoteRecord(Integer id, String courseId, String uri, String text, String quote, String rangeStart, Integer rangeStartOffset, String rangeEnd, Integer rangeEndOffset, String tags, Timestamp created, Timestamp updated, Integer userId) {
        super(NotesNote.NOTES_NOTE);

        set(0, id);
        set(1, courseId);
        set(2, uri);
        set(3, text);
        set(4, quote);
        set(5, rangeStart);
        set(6, rangeStartOffset);
        set(7, rangeEnd);
        set(8, rangeEndOffset);
        set(9, tags);
        set(10, created);
        set(11, updated);
        set(12, userId);
    }
}
