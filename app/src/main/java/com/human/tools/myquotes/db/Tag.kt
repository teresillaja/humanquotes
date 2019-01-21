package com.human.tools.myquotes.db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(
    tableName = "tag_table", foreignKeys = arrayOf(
        ForeignKey(
            entity = Quote::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("quoteId"),
            onDelete = ForeignKey.CASCADE
        )
    )
)
class Tag(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val tag: String,
    val quoteId: Long
)