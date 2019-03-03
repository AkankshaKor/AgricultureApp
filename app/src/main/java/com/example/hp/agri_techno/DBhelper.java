package com.example.hp.agri_techno;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

public class DBhelper extends SQLiteOpenHelper {
    public static final int DB_ver = 1;
    public static final String DB_name = "SB1Database.db";
    public static final String Table = "BuySellRecord";
    public static final String phn = "PhoneNo";
    public static final String add = "Address";
    public static final String nm = "Name";
    public static final String type= "Type";
    public static final String quant = "Quantity";
    int re = 1;

    public DBhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_name, factory, DB_ver);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Create_table = " CREATE TABLE " + Table + "(" + phn + " INTEGER PRIMARY KEY," + add + " TEXT," + nm + " TEXT ,"+ type +" TEXT ,"+ quant +" TEXT " + ")";
        db.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public int Insert_v(BuySell s) {
        //t.show();
        ContentValues v = new ContentValues();
        v.put(phn, s.getPhno());
        v.put(add, s.getAddress());
        v.put(nm, s.getName());
        v.put(type,s.getType());
        v.put(quant,s.getQty());
        SQLiteDatabase db = this.getWritableDatabase();
        re = (int) db.insert(Table, null, v);
        db.close();
        return re;
    }


    public String Display(){
        SQLiteDatabase db= this.getReadableDatabase();
        String u = " SELECT * FROM " + Table + " ; ";
        String res="";
        Cursor r=db.rawQuery(u,null);
        while (r.moveToNext()){
            int r1=r.getInt(0);
            String addre=r.getString(1);
            String nme=r.getString(2);
            String typ=r.getString(3);
            String qua=r.getString(4);
            res += String.valueOf(r1) +  "         \t" + addre + "         \t" + nme +"         \t"+typ +"         \t"+qua+"         \t"+ System.getProperty("line.separator");
        }
        //db.
        db.close();
        r.close();
        return res;
    }


}
