package ejemplo.com.guia14;

import android.provider.BaseColumns;

/**
 * Created by Janis on 9/10/2017.
 */

public final class DataBaseContract {
    private DataBaseContract() {} // make non-creatable

    public static final class UsuarioEntry implements BaseColumns {
        public static final String TABLE_NAME = "usuario";
        public static final String COLUMN_USER_ID = "id";
        public static final String COLUMN_USER_NAME = "nombre";
        //CREATE TABLE
        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE "+ TABLE_NAME + " ("+
                        COLUMN_USER_ID + " INTEGER PRIMARY KEY, "+
                        COLUMN_USER_NAME + " TEXT NOT NULL)";
    }
}

