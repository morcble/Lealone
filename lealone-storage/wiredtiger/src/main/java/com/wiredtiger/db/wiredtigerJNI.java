/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wiredtiger.db;

public class wiredtigerJNI {

    static {
        try {
            System.loadLibrary("wiredtiger_java");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load. \n" + e);
            System.exit(1);
        }
    }

    public final static native long Cursor_session_get(long jarg1, Cursor jarg1_);

    public final static native String Cursor_uri_get(long jarg1, Cursor jarg1_);

    public final static native String Cursor_key_format_get(long jarg1, Cursor jarg1_);

    public final static native String Cursor_value_format_get(long jarg1, Cursor jarg1_);

    public final static native int Cursor_next_wrap(long jarg1, Cursor jarg1_)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Cursor_prev_wrap(long jarg1, Cursor jarg1_)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Cursor_reset(long jarg1, Cursor jarg1_) throws com.wiredtiger.db.WiredTigerException;

    public final static native int Cursor_close(long jarg1, Cursor jarg1_) throws com.wiredtiger.db.WiredTigerException;

    public final static native int Cursor_reconfigure(long jarg1, Cursor jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native byte[] Cursor_get_key_wrap(long jarg1, Cursor jarg1_);

    public final static native byte[] Cursor_get_value_wrap(long jarg1, Cursor jarg1_);

    public final static native int Cursor_insert_wrap(long jarg1, Cursor jarg1_, byte[] jarg2, byte[] jarg3);

    public final static native int Cursor_remove_wrap(long jarg1, Cursor jarg1_, byte[] jarg2);

    public final static native int Cursor_search_wrap(long jarg1, Cursor jarg1_, byte[] jarg2);

    public final static native int Cursor_search_near_wrap(long jarg1, Cursor jarg1_, byte[] jarg3);

    public final static native int Cursor_update_wrap(long jarg1, Cursor jarg1_, byte[] jarg2, byte[] jarg3);

    public final static native int Cursor_compare_wrap(long jarg1, Cursor jarg1_, long jarg3, Cursor jarg3_);

    public final static native int Cursor_equals_wrap(long jarg1, Cursor jarg1_, long jarg3, Cursor jarg3_);

    public final static native int Cursor_java_init(long jarg1, Cursor jarg1_, Object jarg2);

    public final static native long AsyncOp_connection_get(long jarg1, AsyncOp jarg1_);

    public final static native String AsyncOp_key_format_get(long jarg1, AsyncOp jarg1_);

    public final static native String AsyncOp_value_format_get(long jarg1, AsyncOp jarg1_);

    public final static native int AsyncOp_compact(long jarg1, AsyncOp jarg1_)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int AsyncOp_getType(long jarg1, AsyncOp jarg1_);

    public final static native byte[] AsyncOp_get_key_wrap(long jarg1, AsyncOp jarg1_);

    public final static native byte[] AsyncOp_get_value_wrap(long jarg1, AsyncOp jarg1_);

    public final static native int AsyncOp_insert_wrap(long jarg1, AsyncOp jarg1_, byte[] jarg2, byte[] jarg3);

    public final static native int AsyncOp_remove_wrap(long jarg1, AsyncOp jarg1_, byte[] jarg2);

    public final static native int AsyncOp_search_wrap(long jarg1, AsyncOp jarg1_, byte[] jarg2);

    public final static native int AsyncOp_update_wrap(long jarg1, AsyncOp jarg1_, byte[] jarg2, byte[] jarg3);

    public final static native int AsyncOp_java_init(long jarg1, AsyncOp jarg1_, Object jarg2);

    public final static native int AsyncOp_getId(long jarg1, AsyncOp jarg1_)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native long Session_connection_get(long jarg1, Session jarg1_);

    public final static native int Session_close(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_reconfigure(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native String Session_strerror(long jarg1, Session jarg1_, int jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_create(long jarg1, Session jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_compact(long jarg1, Session jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_drop(long jarg1, Session jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_log_printf(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_rename(long jarg1, Session jarg1_, String jarg3, String jarg4, String jarg5)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_salvage(long jarg1, Session jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_truncate(long jarg1, Session jarg1_, String jarg3, long jarg4,
            Cursor jarg4_, long jarg5, Cursor jarg5_, String jarg6) throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_upgrade(long jarg1, Session jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_verify(long jarg1, Session jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_begin_transaction(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_commit_transaction(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_rollback_transaction(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_checkpoint(long jarg1, Session jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_java_init(long jarg1, Session jarg1_, Object jarg2);

    public final static native long Session_open_cursor(long jarg1, Session jarg1_, String jarg3, long jarg4,
            Cursor jarg4_, String jarg5) throws com.wiredtiger.db.WiredTigerException;

    public final static native int Session_transaction_pinned_range(long jarg1, Session jarg1_)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Connection_async_flush(long jarg1, Connection jarg1_)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Connection_close(long jarg1, Connection jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Connection_reconfigure(long jarg1, Connection jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native String Connection_get_home(long jarg1, Connection jarg1_);

    public final static native int Connection_configure_method(long jarg1, Connection jarg1_, String jarg3,
            String jarg4, String jarg5, String jarg6, String jarg7) throws com.wiredtiger.db.WiredTigerException;

    public final static native int Connection_is_new(long jarg1, Connection jarg1_);

    public final static native int Connection_load_extension(long jarg1, Connection jarg1_, String jarg3, String jarg4)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native int Connection_java_init(long jarg1, Connection jarg1_, Object jarg2);

    public final static native long Connection_async_new_op(long jarg1, Connection jarg1_, String jarg3, String jarg4,
            Object jarg5) throws com.wiredtiger.db.WiredTigerException;

    public final static native long Connection_open_session(long jarg1, Connection jarg1_, String jarg3)
            throws com.wiredtiger.db.WiredTigerException;

    public final static native String wiredtiger_strerror(int jarg1);

    public final static native long open(String jarg2, String jarg3) throws com.wiredtiger.db.WiredTigerException;
}