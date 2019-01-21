package com.human.tools.myquotes.db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "quotes_table")
class Quote(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val text: String,
    val timeStamp: Long
)