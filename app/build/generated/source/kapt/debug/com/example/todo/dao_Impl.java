package com.example.todo;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class dao_Impl implements dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TableTo_Do> __insertionAdapterOfTableTo_Do;

  private final EntityDeletionOrUpdateAdapter<TableTo_Do> __deletionAdapterOfTableTo_Do;

  public dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTableTo_Do = new EntityInsertionAdapter<TableTo_Do>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `To_Do` (`id`,`title`,`priority`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TableTo_Do value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPriority());
        }
      }
    };
    this.__deletionAdapterOfTableTo_Do = new EntityDeletionOrUpdateAdapter<TableTo_Do>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `To_Do` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TableTo_Do value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object inserObject(final TableTo_Do tableToDo, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTableTo_Do.insert(tableToDo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object CompleteObject(final TableTo_Do tableToDo, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTableTo_Do.handle(tableToDo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getObject(final Continuation<? super List<ObjectInfo>> p0) {
    final String _sql = "Select * from to_do";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ObjectInfo>>() {
      @Override
      public List<ObjectInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final List<ObjectInfo> _result = new ArrayList<ObjectInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ObjectInfo _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpPriority;
            if (_cursor.isNull(_cursorIndexOfPriority)) {
              _tmpPriority = null;
            } else {
              _tmpPriority = _cursor.getString(_cursorIndexOfPriority);
            }
            _item = new ObjectInfo(_tmpTitle,_tmpPriority);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
