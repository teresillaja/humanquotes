package com.human.tools.myquotes.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert

@Dao
interface TagDao {

    @Insert
    fun insert(tag: Tag)

}