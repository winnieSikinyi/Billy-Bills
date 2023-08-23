package com.henriette.bill.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.henriette.bill.model.Bill

@Database(entities = [Bill::class], version = 1)

abstract class BillDb: RoomDatabase(){
    abstract fun billDao():BillDao

    companion object{
        var database : BillDb? = null
        fun getDatabase(context: Context):BillDb{
            if (database==null){
                database=Room
                    .databaseBuilder(context, BillDb::class.java, "BillDb")
                    .fallbackToDestructiveMigration()
                    .build()
        }

        return database as BillDb
    }

}
}
