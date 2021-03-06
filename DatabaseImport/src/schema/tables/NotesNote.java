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
import schema.tables.records.NotesNoteRecord;


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
public class NotesNote extends TableImpl<NotesNoteRecord> {

    private static final long serialVersionUID = -1022306501;

    /**
     * The reference instance of <code>bitnami_edx.notes_note</code>
     */
    public static final NotesNote NOTES_NOTE = new NotesNote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotesNoteRecord> getRecordType() {
        return NotesNoteRecord.class;
    }

    /**
     * The column <code>bitnami_edx.notes_note.id</code>.
     */
    public final TableField<NotesNoteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.course_id</code>.
     */
    public final TableField<NotesNoteRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.uri</code>.
     */
    public final TableField<NotesNoteRecord, String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.text</code>.
     */
    public final TableField<NotesNoteRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.quote</code>.
     */
    public final TableField<NotesNoteRecord, String> QUOTE = createField("quote", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.range_start</code>.
     */
    public final TableField<NotesNoteRecord, String> RANGE_START = createField("range_start", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.range_start_offset</code>.
     */
    public final TableField<NotesNoteRecord, Integer> RANGE_START_OFFSET = createField("range_start_offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.range_end</code>.
     */
    public final TableField<NotesNoteRecord, String> RANGE_END = createField("range_end", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.range_end_offset</code>.
     */
    public final TableField<NotesNoteRecord, Integer> RANGE_END_OFFSET = createField("range_end_offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.tags</code>.
     */
    public final TableField<NotesNoteRecord, String> TAGS = createField("tags", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.created</code>.
     */
    public final TableField<NotesNoteRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.notes_note.updated</code>.
     */
    public final TableField<NotesNoteRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.notes_note.user_id</code>.
     */
    public final TableField<NotesNoteRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.notes_note</code> table reference
     */
    public NotesNote() {
        this("notes_note", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.notes_note</code> table reference
     */
    public NotesNote(String alias) {
        this(alias, NOTES_NOTE);
    }

    private NotesNote(String alias, Table<NotesNoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotesNote(String alias, Table<NotesNoteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<NotesNoteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NOTES_NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NotesNoteRecord> getPrimaryKey() {
        return Keys.KEY_NOTES_NOTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NotesNoteRecord>> getKeys() {
        return Arrays.<UniqueKey<NotesNoteRecord>>asList(Keys.KEY_NOTES_NOTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NotesNoteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NotesNoteRecord, ?>>asList(Keys.NOTES_NOTE_USER_ID_2AA1FF88FD937CB3_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotesNote as(String alias) {
        return new NotesNote(alias, this);
    }

    /**
     * Rename this table
     */
    public NotesNote rename(String name) {
        return new NotesNote(name, null);
    }
}
