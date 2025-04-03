package com.onesignal.session.internal.outcomes.impl;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import db.l;
import t9.c;

public final class m {
    public final void upgradeCacheOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        String str = "_id,name" + ",notification_id";
        String str2 = "_id,name" + ",channel_influence_id";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + str2 + ") SELECT " + str + " FROM " + "cached_unique_outcome_notification" + ';');
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE cached_unique_outcome SET channel_type = '");
            sb2.append(c.NOTIFICATION);
            sb2.append("';");
            sQLiteDatabase.execSQL(sb2.toString());
            sQLiteDatabase.execSQL("DROP TABLE " + "cached_unique_outcome_notification" + ';');
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    public final void upgradeOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(" + "_id,session,notification_ids,name,timestamp" + ");");
            sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT " + "_id,session,notification_ids,name,timestamp" + " FROM outcome;");
            sQLiteDatabase.execSQL("DROP TABLE outcome;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome (" + "_id,session,notification_ids,name,timestamp" + ", weight) SELECT " + "_id,session,notification_ids,name,timestamp" + ", 0 FROM outcome_backup;");
            sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    public final void upgradeOutcomeTableRevision2To3(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        String str = "_id,name,timestamp,notification_ids,weight" + ",session";
        String str2 = "_id,name,timestamp,notification_ids,weight" + ",notification_influence_type";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO " + "outcome_aux" + ';');
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome(" + str2 + ") SELECT " + str + " FROM " + "outcome_aux" + ';');
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DROP TABLE ");
            sb2.append("outcome_aux");
            sb2.append(';');
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    public final void upgradeOutcomeTableRevision3To4(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome ADD COLUMN session_time INTEGER DEFAULT 1;");
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }
}
