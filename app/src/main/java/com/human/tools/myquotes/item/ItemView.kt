package com.human.tools.myquotes.item

import android.view.View
import android.widget.TextView
import com.human.tools.myquotes.R
import javax.inject.Inject

class ItemView @Inject constructor(private val view: View) : ItemContract.View {

    val textView = view.findViewById<TextView>(R.id.quote_textView)

    override fun setText(text: String) {
        textView.setText(text)
    }
}